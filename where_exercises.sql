USE employees;

select *
from employees
where last_name like '%q%'
and last_name not like '%qu%';
