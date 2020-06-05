use toan_demo_furama;
select name, ifnull(number_of_contracts, 0) as number_of_contracts
from months
         left join (select month(created_date) as month, count(month(created_date)) as number_of_contracts
                    from contracts
                    where year(created_date) = 2019
                    group by month(created_date)) as sub on sub.month = value;