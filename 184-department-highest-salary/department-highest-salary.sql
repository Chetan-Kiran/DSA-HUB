# Write your MySQL query statement below
select 
D.name as Department, 
e.name as Employee, 
e.salary as Salary 
from Employee e inner join Department d 
on e.departmentId = d.id 
where e.salary = (
    select max(salary)
    from employee
    WHERE departmentId = e.departmentId
)