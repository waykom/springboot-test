create table user
(
    user_id  int auto_increment
        primary key,
    username varchar(255) not null,
    password varchar(255) not null
) charset = utf8mb3;

INSERT INTO lang.user (user_id, username, password)
VALUES (1001, 'admin', '123456');
