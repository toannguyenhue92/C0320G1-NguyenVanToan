use toan_demo_furama;

#1
select distinct first_name
from customers;

#2
select first_name, count(id) as times
from customers
group by first_name;

#3
select first_name
from customers
union
select first_name
from customers;