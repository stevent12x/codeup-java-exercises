use employees;

# -- Show the first 20 employees
# SELECT *
# FROM employees
# ORDER BY emp_no ASC
# limit 20 offset 0;
#
# -- Show the 2nd batch of 20 employees
# SELECT *
# FROM employees
# ORDER BY emp_no ASC
# LIMIT 20 offset 20;

USE employees;

SELECT * from employees
WHERE first_name
          IN ('Irena', 'Vidya', 'Maya')
ORDER BY first_name ASC, last_name ASC;

SELECT * from employees
WHERE first_name
          IN ('Irena', 'Vidya', 'Maya')
ORDER BY last_name DESC , first_name DESC ;

SELECT * from employees
WHERE last_name
          LIKE 'E%'
ORDER BY emp_no DESC ;

SELECT * from employees
WHERE hire_date
          LIKE '199%';

SELECT * from employees
WHERE birth_date
          LIKE '%12-25';

SELECT * from employees
WHERE last_name
          LIKE '%q%';

SELECT * from employees
WHERE first_name
    LIKE 'Irena' or 'Vidya' or 'Maya';

SELECT * from employees
WHERE gender = 'M'
  AND (first_name
           LIKE 'Irena' or 'Vidya' or 'Maya');

SELECT CONCAT(first_name, ' ', last_name) from employees
WHERE first_name
    LIKE 'E%'
   AND last_name LIKE '%e';

SELECT * from employees
WHERE last_name
          LIKE 'E%e';

SELECT concat(first_name, ' ', last_name,'  ', datediff(curdate(), hire_date)) from employees
WHERE birth_date
    LIKE '%12-25'
  AND hire_date
    LIKE '199%'
ORDER BY birth_date ASC,
         hire_date DESC;


SELECT * from employees
WHERE last_name like '%q%'
  AND last_name not like '%qu%';
