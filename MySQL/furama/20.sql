use toan_demo_furama;
select id,
       concat(last_name, ' ', middle_name, ' ', first_name) as full_name,
       email,
       phone,
       birthday,
       address
from customers
union all
select id,
       concat(last_name, ' ', middle_name, ' ', first_name) as full_name,
       email,
       phone,
       birthday,
       address
from employees;