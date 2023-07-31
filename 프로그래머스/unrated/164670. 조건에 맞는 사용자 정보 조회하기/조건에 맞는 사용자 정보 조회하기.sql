# 보드와 유저 테이블에서 / 조인
# 중고거래 게시물을 3건이상 등록한 사용자 / 조건
# id, 닉네임, 전체주소, 전화번호 / 조회
# 주소는 시, 도로명주소, 상세주소가 함께 출력
# 전화번호는 xxx-xxxx-xxxx하이픈을 삽입하여 출력
# id를 기준으로 내림차순 / 정렬
SELECT distinct 
user_id
, nickname
, concat_ws(
    " "
    , city
    , street_address1
    , street_address2) 전체주소
, concat_ws(
    "-"
    , substr(tlno, 1, 3)
    , substr(tlno, 4, 4)
    , substr(tlno, 8,4)) as 전화번호
from used_goods_board b
join used_goods_user a
on a.user_id = b.writer_id
where user_id in (
    select writer_id 
    from used_goods_board 
    group by writer_id 
    having count(*) >= 3)
order by user_id desc