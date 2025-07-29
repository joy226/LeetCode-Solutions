# Write your MySQL query statement below
SELECT e1.NAME as Employee
FROM EMPLOYEE e1, EMPLOYEE e2
WHERE e1.managerId = e2.id
AND E1.SALARY > E2.SALARY;