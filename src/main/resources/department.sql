create table department
(
    id       int auto_increment
        primary key,
    lastName varchar(255) null,
    email    varchar(255) null,
    gender   int null,
    d_id     int null
) charset = utf8mb3;

INSERT INTO lang.department (id, lastName, email, gender, d_id)
VALUES (1, 'lang', 'honglang.wei@ur.com.cn', 1, 1001);
