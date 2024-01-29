create table employee
(
    id             int auto_increment
        primary key,
    departmentName varchar(255) null
) charset = utf8mb3;

INSERT INTO lang.employee (id, departmentName)
VALUES (3, '人事部');
INSERT INTO lang.employee (id, departmentName)
VALUES (15, '设计部');
INSERT INTO lang.employee (id, departmentName)
VALUES (18, '开发部');
INSERT INTO lang.employee (id, departmentName)
VALUES (19, '前端开发部');
