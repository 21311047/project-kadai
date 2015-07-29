-- データベース作成
-- ==============================================================
drop database if exists user_register;
GRANT USAGE ON *.* TO 'user_register'@'localhost';
DROP USER 'user_register'@'localhost';

create database user_register character set utf8mb4;
create user 'user_register'@'localhost' identified by 'user_register';
grant all privileges on user_register.* to 'user_register'@'localhost';
-- ==============================================================