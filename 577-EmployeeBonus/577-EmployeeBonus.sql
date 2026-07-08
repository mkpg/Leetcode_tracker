-- Last updated: 7/8/2026, 4:47:38 PM
# Write your MySQL query statement below
select e.name,b.bonus from Employee as e left join Bonus as b on e.empId = b.empId where b.bonus < 1000 or b.bonus is Null;