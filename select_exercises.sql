USE codeup_test_db;

SELECT name from albums where artist="Pink Floyd";
select release_date from albums where name="Sgt. Pepper's Lonely Hearts Club Band";
select genre from albums where name="Nevermind";
select artist,name from albums where release_date >= 1990 AND release_date <= 1999;
select artist,name from albums where sales < 20.0;
select artist, name from albums where genre = "Rock";
