USE titles;

SELECT DISTINCT title
FROM titles;

SELECT DISTINCT last_name from employees
WHERE last_name LIKE 'E%e';

SELECT DISTINCT first_name, last_name from employees
WHERE last_name LIKE 'E%e';

SELECT DISTINCT last_name from employees
WHERE last_name LIKE '%q%'
AND last_name NOT LIKE '%qu%';

SELECT DISTINCT last_name, first_name, COUNT(last_name) from employees
WHERE last_name LIKE '%q%'
AND last_name NOT LIKE '%qu%'
GROUP BY last_name, first_name
ORDER BY COUNT(*) DESC ;

SELECT COUNT(*), gender from employees
WHERE first_name IN
('Irena','Vidya','Maya')
GROUP BY gender;
