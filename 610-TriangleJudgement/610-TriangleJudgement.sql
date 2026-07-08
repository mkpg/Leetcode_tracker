-- Last updated: 7/8/2026, 4:47:34 PM
select x,y,z,case when x+y >z and x+z > y and z+y >x then "Yes" Else "No" END as triangle from Triangle ;


-- SELECT x, y, z,
-- CASE
--     WHEN x + y > z
--      AND x + z > y
--      AND y + z > x
--     THEN 'Yes'
--     ELSE 'No'
-- END AS triangle
-- FROM Triangle;