WITH ranked_employees AS (
    SELECT
        e.name,
        e.salary,
        e.departmentId,
        DENSE_RANK() OVER (
            PARTITION BY e.departmentId
            ORDER BY e.salary DESC
        ) AS salary_rank
    FROM Employee e
)

SELECT
    d.name AS Department,
    r.name AS Employee,
    r.salary AS Salary
FROM ranked_employees r
JOIN Department d
    ON r.departmentId = d.id
WHERE r.salary_rank <= 3;