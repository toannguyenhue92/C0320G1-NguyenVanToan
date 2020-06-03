use toan_demo_furama;
select customers.id,
       concat(last_name, ' ', middle_name) as last_and_middle_name,
       first_name,
       ct.type,
       b.id                                as contract_id,
       b.service_name,
       created_date,
       check_out_date,
       total_fee
from customers
         left join (select contracts.id,
                           customer_id,
                           s.service_name,
                           created_date,
                           check_out_date,
                           rental_fee + if(isnull(addition_fee), 0, addition_fee) as total_fee
                    from contracts
                             join services s on contracts.service_id = s.id
                             join (select contracts.id, sum(quantity * service_fee) as addition_fee
                                   from contracts
                                            left join contract_addition_services cas on contracts.id = cas.contract_id
                                            left join addition_services c on cas.addition_service_id = c.id
                                   group by contracts.id) as a on a.id = contracts.id) as b
                   on b.customer_id = customers.id
         join customer_types ct on customers.type_id = ct.id;