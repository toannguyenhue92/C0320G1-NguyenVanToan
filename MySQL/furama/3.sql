use toan_demo_furama;
select concat(last_name, ' ', middle_name)         as last_and_middle_name,
       first_name,
       birthday,
       address,
       timestampdiff(year, birthday, current_date) as ages
from customers
where address in ('Đà Nẵng', 'Quảng Trị')
  and (timestampdiff(year, birthday, current_date) between 18 and 50)
order by id;