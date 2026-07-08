-- Last updated: 7/8/2026, 4:48:53 PM
# Write your MySQL query statement below
Select p.firstName,p.lastName,a.city,a.state from Person as p Left join Address as a on p.personId = a.personId;