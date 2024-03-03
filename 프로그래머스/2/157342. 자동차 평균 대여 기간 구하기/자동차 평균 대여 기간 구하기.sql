-- 코드를 입력하세요
SELECT car_id
    , round(avg(datediff(end_date, start_date)+1), 1) AS AVERAGE_DURATION
from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
group by car_id
having AVERAGE_DURATION > 6
order by AVERAGE_DURATION desc, car_id desc

# select car_id, end_date-start_date from CAR_RENTAL_COMPANY_RENTAL_HISTORY where car_id = 9