use toan_demo_furama;
select contract_id,
       sub.service_name               as service_name,
       addition_services.service_name as addition_service_name,
       count(*)                       as used_times
from contract_addition_services
         join (select contracts.id, service_name
               from contracts
                        join services on services.id = service_id) as sub on sub.id = contract_id
         join addition_services on addition_services.id = addition_service_id
where addition_service_id in (select addition_service_id
                              from contract_addition_services
                              group by addition_service_id
                              having count(*) = 1)
group by addition_service_id;