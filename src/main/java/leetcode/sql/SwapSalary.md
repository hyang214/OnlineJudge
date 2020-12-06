# Swap Salary

## Question

https://leetcode.com/problems/swap-salary/

## Answer

### Approach

使用```case when```语句实现条件取值

### Solution

```
update 
    salary
set
    sex = (
        case sex
            when 'f' then 'm'
            else 'f'
        end
    )
```