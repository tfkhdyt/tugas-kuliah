SELECT account_id, total_amt_usd
FROM orders
WHERE total_amt_usd > (SELECT AVG(total_amt_usd) FROM orders);

with sales_reps_perform AS (
	SELECT 
		s.name AS sales_rep_name,
		SUM(o.total_amt_usd) AS total_revenue
	FROM orders o 
	JOIN accounts a ON o.account_id = a.id
	JOIN sales_reps s ON a.sales_rep_id = s.id
	GROUP BY sales_rep_name
	ORDER BY total_revenue DESC
)
SELECT * FROM sales_reps_perform;

CREATE OR REPLACE VIEW sales_reps_x_client AS
SELECT 
	sr.name AS sales_reps_name, 
	a.name AS company, 
	r.name AS region
FROM sales_reps sr 
JOIN region r ON sr.region_id = r.id
JOIN accounts a ON a.sales_rep_id = sr.id;

SELECT * FROM sales_reps_x_client;

SELECT 
	r.name AS region_name,
	MAX(total_amt_usd) AS max_total_amt_usd
FROM orders o 
JOIN accounts a ON a.id = o.account_id 
JOIN sales_reps sr ON sr.id = a.sales_rep_id 
JOIN region r ON r.id = sr.region_id
GROUP BY r.name
ORDER BY max_total_amt_usd DESC;

with total_sales AS (
	SELECT 
		r.name AS region_name,
		total_amt_usd
	FROM orders o 
	JOIN accounts a ON a.id = o.account_id 
	JOIN sales_reps sr ON sr.id = a.sales_rep_id 
	JOIN region r ON r.id = sr.region_id
	ORDER BY total_amt_usd DESC
)
SELECT region_name, MAX(total_amt_usd) FROM total_sales
GROUP BY region_name;