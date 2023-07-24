-- CREATE TABLE todo (
--                       id INT PRIMARY KEY,
--                       description VARCHAR(255) NOT NULL,
--                       done BOOLEAN NOT NULL,
--                       target_date DATE NOT NULL,
--                       username VARCHAR(255) NOT NULL
-- );

insert into todo(id, description, done, target_date, username)
values(10001, 'Learn Ethical hacking', false, CURRENT_DATE, 'Developer Joseph');

insert into todo(id, description, done, target_date, username)
values(10002, 'Learn Spring Boot', false, CURRENT_DATE, 'Developer Joseph');

insert into todo(id, description, done, target_date, username)
values(10003, 'Learn Cyber Security', false, CURRENT_DATE, 'Developer Joseph');

insert into todo(id, description, done, target_date, username)
values(10004, 'Learn Android Development', false, CURRENT_DATE, 'Developer Joseph');