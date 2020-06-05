use toan_demo_furama;
update addition_services
set service_fee = service_fee * 2
where id in (
    select addition_service_id
    from contract_addition_services
    where contract_id in (
        select id
        from contracts
        where year(created_date) = 2019)
    group by addition_service_id
    having count(*) > 10);