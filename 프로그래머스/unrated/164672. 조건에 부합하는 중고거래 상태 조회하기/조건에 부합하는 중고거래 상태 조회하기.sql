-- 게시글id, 작성자id, 게시글 제목, 가격, 거래상태 / 조회
-- 2022년 10월 5일에 등록된 중고거래 게시물 / 조건
-- 상태가 sale이면 판매중, reserved면 예약중, done이면 거래완료로 분류하여 출력 / 
-- 게시글id 기준으로 내림차순 정렬
SELECT 
    board_id
    , writer_id
    , title
    , price
    -- , replace(replace(replace(status, 'SALE', '판매중'), 'RESERVED', '예약중'), 'DONE', '거래완료') status
    , case when status = 'SALE' then '판매중'
        when status = 'RESERVED' then '예약중'
        when status = 'DONE' then '거래완료' end status
from used_goods_board
where created_date = '2022-10-05'
order by board_id desc