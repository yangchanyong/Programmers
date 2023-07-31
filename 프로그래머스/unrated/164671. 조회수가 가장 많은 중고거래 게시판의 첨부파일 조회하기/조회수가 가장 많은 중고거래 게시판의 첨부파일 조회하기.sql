-- 보드테이블과 파일테이블에서 // 조인
-- 조회수가 가장 높은 게시물 // 조건
-- 중고거래 게시물에 대한 첨부파일 경로 / 조회
-- 첨부파일 경로는 file_id를 기준으로 내림차순 / 정렬
-- 파일이름은 파일id, 이름, 확장자로 구성되도록 출력
-- 조회수가 가장 높은 단 하나의 게시물만 존재
SELECT concat('/home/grep/src/', a.board_id, '/', b.file_id, b.file_name, b.file_ext) file_path
from used_goods_board a
join used_goods_file b
using (board_id)
where views = (select max(views) from used_goods_board)
order by b.file_id desc
