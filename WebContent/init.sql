drop table if exists usr;

create table usr(
	username varchar(10) primary key,
	password varchar(10)
);

insert into usr values('admin', 'admin');
insert into usr values('test', 'test');

drop table if exists student;

create table student(
	id int(3) auto_increment primary key,
	name varchar(30) not null,
	grade decimal(5, 2)
);

insert into student(name, grade) values("张三", 67.98);
insert into student(name, grade) values("李四", 78.5);
insert into student(name, grade) values("王五", 82);
