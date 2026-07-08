-- Last updated: 7/8/2026, 4:48:56 PM

# Write your MySQL query statement below
select max(salary) as SecondhighestSalary from Employee where salary < (select max(salary) from Employee )