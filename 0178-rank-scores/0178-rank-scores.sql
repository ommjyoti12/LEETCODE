-- SELECT score,
--        DENSE_RANK() OVER (ORDER BY score DESC) AS `rank`
-- FROM Scores;






select score,
    DENSE_RANK() OVER(order by score desc) as' rank'
 from Scores;