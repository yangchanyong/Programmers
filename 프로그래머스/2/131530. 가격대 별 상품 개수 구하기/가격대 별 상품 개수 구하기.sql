-- 코드를 입력하세요
SELECT case
    when PRICE < 10000
    then '0'
    when PRICE between 10000 and 19999
    then '10000'
    when PRICE between 20000 and 29999
    then '20000'
    when PRICE between 30000 and 39999
    then '30000'
    when PRICE between 40000 and 49999
    then '40000'
    when PRICE between 50000 and 59999
    then '50000'
    when PRICE between 60000 and 69999
    then '60000'
    when PRICE between 70000 and 79999
    then '70000'
    when PRICE between 80000 and 89999
    then '80000'
    END AS PRICE_GROUP
    , count(*) AS PRODUCTS
from PRODUCT
group by PRICE_GROUP
order by price_group

# select * from product where price between 0 and 9999
