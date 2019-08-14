USE codeup_test_db;

SELECT 'The name of all albums by Pink Floyd' as '';
SELECT name FROM albums where artist='Pink Floyd';

SELECT 'The release date of Sgt. Pepper"s' as '';
select release_date from albums where name='Sgt. Pepper"s Lonely Hearts Club Band';

SELECT 'The genre of Nirvana"s Nevermind' as '';
select genre from albums where name='Nevermind';

select name from albums where release_date >= 1990 AND release_date <= 1999;
select name from albums where sales < 20.0;
select name from albums where genre = 'Rock';
