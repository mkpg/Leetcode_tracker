-- Last updated: 7/8/2026, 4:46:53 PM
# Write your MySQL query statement below
select e.name , m.unique_id from Employees as e left join  EmployeeUNI as m on e.id = m.id 