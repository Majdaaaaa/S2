%% exo 1
>show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| ifagnot            |
| monitIO2           |
| test               |
+--------------------+
>use ifagnot
>show tables;
+-------------------+
| Tables_in_ifagnot |
+-------------------+
| cities            |
| departements      |
| groups            |
| regions           |
| users             |
| users_groups      |
+-------------------+
6 rows in set (0,00 sec)

>describe cities;
+----------------+-----------------+------+-----+---------+----------------+
| Field          | Type            | Null | Key | Default | Extra          |
+----------------+-----------------+------+-----+---------+----------------+
| id             | int(2) unsigned | NO   | PRI | NULL    | auto_increment |
| name           | varchar(256)    | NO   |     |         |                |
| departement_id | char(3)         | NO   | MUL | NULL    |                |
+----------------+-----------------+------+-----+---------+----------------+
3 rows in set (0,02 sec)

>describe regions;
+-------+---------------------+------+-----+---------+-------+
| Field | Type                | Null | Key | Default | Extra |
+-------+---------------------+------+-----+---------+-------+
| id    | tinyint(2) unsigned | NO   | PRI | NULL    |       |
| name  | varchar(256)        | NO   |     |         |       |
+-------+---------------------+------+-----+---------+-------+
2 rows in set (0,00 sec)

>describe departements;
+-----------+---------------------+------+-----+---------+-------+
| Field     | Type                | Null | Key | Default | Extra |
+-----------+---------------------+------+-----+---------+-------+
| id        | char(3)             | NO   | PRI | NULL    |       |
| name      | varchar(256)        | NO   |     |         |       |
| region_id | tinyint(2) unsigned | NO   | MUL | NULL    |       |
+-----------+---------------------+------+-----+---------+-------+
3 rows in set (0,00 sec)

%%exo 2

>select * from regions;
>select name, departement_id from cities;
>select name from cities where departement_id = '93';

%% exo 3
>delete from cities where name = 'Paris';
>delete from cities where departements = '88';
Query OK, 13 rows affected (0,00 sec)
>update regions set name = 'Breizh' where name = 'Bretagne';
Query OK, 1 row affected (0,01 sec)
Rows matched: 1  Changed: 1  Warnings: 0
>insert into departements values(96, 'Paradis', 16);
>update cities set departement_id = '96' where id = '88';
>insert into cities values (200, 'Enfer', 96);
