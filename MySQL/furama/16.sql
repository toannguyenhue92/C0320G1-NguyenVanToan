use toan_demo_furama;

update employees
set status = 0
where id not in (select distinct employee_id
             from contracts
             where year(created_date) >= 2017
               and year(created_date) <= 2019);