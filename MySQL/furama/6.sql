use toan_demo_furama;
select services.id, service_name, area, rental_fee, type
from services
         join service_types st on services.service_type_id = st.id
where services.id not in (select service_id
                          from contracts
                          where YEAR(created_date) = 2019
                            and month(created_date) in (1, 2, 3));