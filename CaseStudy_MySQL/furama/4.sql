use toan_demo_furama;
select concat(last_name, ' ', middle_name) as last_and_middle_name,
       first_name,
       count(contracts.id)                 as booking_times,
       customer_types.type
from customers
         join contracts on customers.id = contracts.customer_id
         join customer_types on customers.type_id = customer_types.id
where customer_types.type = 'Diamond'
group by (customers.id)
order by count(contracts.id);