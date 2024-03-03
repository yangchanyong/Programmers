-- 코드를 입력하세요
SELECT flavor
from FIRST_HALF 
join ICECREAM_INFO using (flavor)
where total_order > 3000
and flavor in ("peach", "mango", "strawberry", "melon", "orange", "pineapple")
order by total_order desc
-- 상반기 주문 정보 테이블 FIRST_HALF 
-- 아이스크림 성분 테이블 ICECREAM_INFO