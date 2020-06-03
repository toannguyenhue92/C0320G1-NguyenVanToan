use toan_demo_furama;
select id, created_date, check_in_date, check_out_date, deposit, ifnull(total_addition_services, 0)
from contracts
         left join (select contract_id, count(*) as total_addition_services
                    from contract_addition_services
                    group by contract_id) as s on contract_id = id;