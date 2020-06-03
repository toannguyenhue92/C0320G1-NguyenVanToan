use toan_demo_furama;
update customers
set status = 0
where id in (select distinct customer_id
             from contracts
             where year(created_date) < 2016);