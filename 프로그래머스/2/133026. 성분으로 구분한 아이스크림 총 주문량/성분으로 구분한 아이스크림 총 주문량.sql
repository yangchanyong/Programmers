-- 코드를 입력하세요
SELECT INGREDIENT_TYPE, sum(TOTAL_ORDER) AS TOTAL_ORDER
from FIRST_HALF 
left join ICECREAM_INFO using(flavor)
group by INGREDIENT_TYPE
order by TOTAL_ORDER 

