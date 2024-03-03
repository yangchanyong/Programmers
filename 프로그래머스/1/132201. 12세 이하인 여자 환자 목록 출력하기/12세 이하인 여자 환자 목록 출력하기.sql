-- 코드를 입력하세요
SELECT pt_name
    , pt_no
    , gend_cd
    , age
    , ifnull(tlno, 'NONE') as tlno 
from patient 
where age <= 12 
and gend_cd = 'W'
order by AGE desc, pt_name