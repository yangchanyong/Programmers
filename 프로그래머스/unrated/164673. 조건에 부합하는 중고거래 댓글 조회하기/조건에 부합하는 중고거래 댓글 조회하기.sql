-- 게시글 제목, 게시글 id, 댓글id, 댓글 작성자 id, 댓글내용, 작성일 조회 / 조회
-- 게시글, 댓글 테이블에서 2022년 10월에 작성된  / 조건
-- 댓글 작성일 기준으로 오름차순 정렬 / 정렬
-- 댓글 작성일이 같다면 게시글 제목을 기준으로 오름차순 정렬 / 정렬
SELECT a.title
    , a.board_id
    , b.reply_id
    , b.writer_id
    , b.contents
    , date_format(b.created_date, '%Y-%m-%d') as created_date
from used_goods_board a
join used_goods_reply b
on a.board_id = b.board_id
where substr(a.created_date, 1, 7) = '2022-10'
order by b.created_date, a.title