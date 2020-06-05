use toan_demo_furama;
drop temporary table if exists new_diamond_customer;
create temporary table new_diamond_customer as (
    select customer_id
    from contracts
             join services on services.id = service_id
             join (select contracts.id, sum(quantity * service_fee) as addition_fee
                   from contracts
                            left join contract_addition_services cas on contracts.id = cas.contract_id
                            left join addition_services c on cas.addition_service_id = c.id
                   where year(created_date) = 2019
                   group by contracts.id) as sub on sub.id = contracts.id
    where customer_id in (
        select customers.id
        from customers
                 join customer_types on customer_types.id = type_id
        where type = 'Platinum'
    )
    group by customer_id
    having sum(rental_fee + ifnull(addition_fee, 0)) >= 100);
update customers
set customers.type_id = 1
where id in (select customer_id from new_diamond_customer);



