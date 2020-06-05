use toan_demo_furama;
select distinct service_name
from contract_addition_services
         join addition_services on addition_service_id = addition_services.id
         join contracts on contract_id = contracts.id
where customer_id in (select customers.id
                      from customers
                               join customer_types on type_id = customer_types.id
                      where address in ('Vinh', 'Quảng Ngãi')
                        and type = 'Diamond');