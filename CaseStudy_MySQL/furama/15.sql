use toan_demo_furama;

select employees.id,
       concat(last_name, ' ', middle_name, ' ', first_name) as full_name,
       level,
       position,
       department,
       phone,
       address
from employees
         join employee_positions on employee_positions.id = position_id
         join employee_departments on employee_departments.id = department_id
         join employee_levels on employee_levels.id = level_id
where employees.id in (select employee_id
                       from contracts
                       where year(created_date) in (2018, 2019)
                       group by employee_id
                       having count(id) <= 3);