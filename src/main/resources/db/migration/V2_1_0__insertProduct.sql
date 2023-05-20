insert into products (id, serial, number, create_date, saled_date) values (1,'2B4H',45637,'2022-08-12 12:54:11','2022-12-23 15:36:17');
insert into products (id, serial, number, create_date, saled_date) values (2,'36YF',93728,'2022-06-28 22:14:31','2022-09-11 08:27:09');
insert into products (id, serial, number, create_date, saled_date) values (3,'RU51',81495,'2021-02-15 11:11:53','2022-11-05 21:10:24');

insert into reglaments (id, reglament_name, number_ingineer, reglament_date) VALUES (1,'Сертификация',1,'2022-08-14 09:21:00');
insert into reglaments (id, reglament_name, number_ingineer, reglament_date) VALUES (2,'Документирование',2,'2021-03-25 10:31:00');
insert into reglaments (id, reglament_name, number_ingineer, reglament_date) VALUES (3,'Лицензирование',3,'2022-06-30 12:44:00');

insert into works (id, product_id, reglament_id) VALUES (1,1,3);
insert into works (id, product_id, reglament_id) VALUES (2,1,1);
insert into works (id, product_id, reglament_id) VALUES (3,2,3);
insert into works (id, product_id, reglament_id) VALUES (4,3,2);

