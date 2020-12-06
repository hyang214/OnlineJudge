# Big Countries

## Question

https://leetcode.com/problems/big-countries/

## Answer

### Approach

简单的条件查询，只返回部分数据，通过``or```来实现多条件

### Solution

```
select
    name, population, area
from
    World
where
    area > 3000000
    or population > 25000000;
```