use toan_demo_furama;
select count(*) as times, service_name
from contract_addition_services
         join addition_services on addition_service_id = addition_services.id
group by addition_service_id
having times in (select max(used_times)
                 from (select addition_service_id, count(*) as used_times
                       from contract_addition_services
                       group by addition_service_id) as sub);