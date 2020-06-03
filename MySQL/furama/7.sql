use toan_demo_furama;
select services.id, service_name, area, max_guest, rental_fee, type
from services
         join service_types st on services.service_type_id = st.id
where services.id in (select service_id
                      from contracts
                      where year(created_date) = 2018)
  and services.id not in (select service_id
                          from contracts
                          where year(created_date) = 2019);