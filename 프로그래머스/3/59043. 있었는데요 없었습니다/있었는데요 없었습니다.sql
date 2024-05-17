-- 코드를 입력하세요
SELECT ai.ANIMAL_ID, ai.NAME
from ANIMAL_INS as ai
join animal_outs as ao on ai.ANIMAL_ID = ao.ANIMAL_ID
where ai.DATETIME > ao.DATETIME
order by ai.datetime