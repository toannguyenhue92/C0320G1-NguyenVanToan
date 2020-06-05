use toan_demo_furama;
select concat(last_name, ' ', middle_name) as last_and_middle_name, first_name
from employees
where (first_name like 'H%'
    or first_name like 'K%'
    or first_name like 'T%')
  and length(first_name) + length(middle_name) + length(last_name) <= 15
order by id;