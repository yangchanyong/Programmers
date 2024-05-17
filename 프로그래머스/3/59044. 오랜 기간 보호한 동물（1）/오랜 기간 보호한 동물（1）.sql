-- 코드를 입력하세요
SELECT ai.name, ai.datetime
from ANIMAL_INS as ai
left join ANIMAL_OUTS as ao on ai.animal_id = ao.animal_id
where ai.datetime
and ao.datetime is null
order by ai.datetime
limit 3