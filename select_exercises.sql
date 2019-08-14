USE codeup_test_db;

SELECT 'The name of all albums by Pink Floyd' as '';
SELECT * FROM albums where artist='Pink Floyd';

SELECT 'The release date of Sgt. Pepper"s' as '';
select * from albums where name='Sgt. Pepper"s Lonely Hearts Club Band';

SELECT 'The genre of Nirvana"s Nevermind' as '';
select * from albums where name='Nevermind';

SELECT 'Albums released in the 90"s' as '';
select * from albums where release_date >= 1990 AND release_date <= 1999;

SELECT 'Albums with sales under 20 million' as '';
select * from albums where sales < 20.0;

SELECT 'Rock albums in list' as '';
select * from albums where genre = 'Rock';
