USE employees;

SELECT * from employees
WHERE first_name
IN ('Irena', 'Vidya', 'Maya');

SELECT * from employees
WHERE last_name
LIKE 'E%';

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

SELECT * from employees
WHERE last_name
LIKE 'E%'
OR last_name LIKE '%e';

SELECT * from employees
WHERE last_name
LIKE 'E%e';

SELECT * from employees
WHERE birth_date
LIKE '%12-25'
AND hire_date
LIKE '199%';

SELECT * from employees
WHERE last_name like '%q%'
  AND last_name not like '%qu%';
