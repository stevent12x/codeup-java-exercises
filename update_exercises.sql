USE codeup_test_db;

SELECT 'Album sales X10' as '';
SELECT * FROM albums;
UPDATE albums SET sales = sales * 10;
SELECT * FROM albums;

SELECT 'All albums released before 1980' as '';
SELECT * FROM albums
WHERE release_date < 1980;
UPDATE albums SET release_date = release_date - 100
WHERE  release_date < 1980;
SELECT * FROM albums
WHERE release_date < 1980;

SELECT 'Michael Jackson to Peter Jackson' as '';
SELECT name FROM albums WHERE artist = 'Michael Jackson';
UPDATE albums SET artist = 'Peter Jackson'
WHERE artist = 'Michael Jackson';
SELECT * FROM albums WHERE artist = 'Peter Jackson';
