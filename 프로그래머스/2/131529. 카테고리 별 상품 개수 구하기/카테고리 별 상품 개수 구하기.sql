-- 코드를 입력하세요
SELECT left(product_code, 2) as category, count(product_id) as product
from product
group by category