# Not Boring Movies

## Question

https://leetcode.com/problems/not-boring-movies/

## Answer

### Approach

id为奇数：id % 2 = 1;
描述不为'boring'：description <> 'boring'
按照评分排序：order by rating desc

### Solution

```
select
    *
from
    cinema
where
    id % 2 = 1
    and description <> 'boring'
order by rating desc;
```