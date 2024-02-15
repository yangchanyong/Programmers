-- 코드를 입력하세요
SELECT p.product_code, sum(sales_amount) * p.price as sales
from product p
join offline_sale o using(product_id)
group by product_code
order by sales desc, product_code