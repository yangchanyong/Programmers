-- 코드를 입력하세요
SELECT date_format(DATETIME, "%H")AS HOUR, count(ANIMAL_ID) AS COUNT
from ANIMAL_OUTS
group by HOUR
having HOUR >= 09 and HOUR <= 19
order by HOUR
-- where DATETIME