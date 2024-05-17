-- 코드를 입력하세요
SELECT b.category, sum(bs.sales) as total_sales
from book as b
join book_sales as bs on b.book_id = bs.book_id
where left(bs.sales_date, 7) = "2022-01"
group by category
order by category

