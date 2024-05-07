-- 코드를 작성해주세요
# select sum(rarity) as total_price
# from item_info
# where rarity = 'legend'

select sum(price) as total_price
from item_info
where rarity = 'legend'
