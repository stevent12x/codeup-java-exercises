use employees;

-- for each dept_manager, find the emp number associated with the department number that
-- has a to_date of 9999-01-01; cross reference that emp number with those stored in employees and voila --
SELECT d.dept_name as 'Department', CONCAT(e.first_name, ' ', e.last_name) as 'Manager'
FROM departments as d
    JOIN dept_manager dm on d.dept_no = dm.dept_no
JOIN employees e on dm.emp_no = e.emp_no
WHERE dm.to_date = '9999-01-01'
ORDER BY Department ASC;


-- Female Managers --
SELECT d.dept_name as 'Department', CONCAT(e.first_name, ' ', e.last_name) as 'Manager'
FROM departments as d
    JOIN dept_manager dm on d.dept_no = dm.dept_no
    JOIN employees e on dm.emp_no = e.emp_no
WHERE e.gender = 'F' and
dm.to_date = '9999-01-01'
ORDER BY Department ASC;


-- Distribution of Titles in Customer Service Department --
SELECT t.title, count(t.title)
from titles t
    JOIN dept_emp de on de.emp_no = t.emp_no
    JOIN departments d on de.dept_no = d.dept_no
WHERE t.to_date > curdate()
and d.dept_name = 'Customer Service'
GROUP BY t.title;


-- Current salaries for all managers --
SELECT d.dept_name as 'Department', CONCAT(e.first_name, ' ', e.last_name) as 'Manager', s.salary as 'Salary'
FROM departments as d
    JOIN dept_manager dm on d.dept_no = dm.dept_no
    JOIN salaries s on dm.emp_no = s.emp_no
    JOIN employees e on dm.emp_no = e.emp_no
WHERE dm.to_date = '9999-01-01' and s.to_date = '9999-01-01'
ORDER BY Salary DESC ;

