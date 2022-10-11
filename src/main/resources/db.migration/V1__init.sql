create table products (
                       id                 bigserial primary key,
                       number             varchar(36) not null,
                       serial             varchar(80) not null,
                       created_at         timestamp default current_timestamp,
                       saled_at           timestamp default current_timestamp,
                       reglament_name     varchar(80) not null,
                       reglament_date     timestamp default current_timestamp,
                       number_ingineer    varchar(36) not null
);
insert into products (number, serial,created_at,saled_at,reglament_name,reglament_date,number_ingineer)
values ('bob', '$2a$04$Fx/SX9.BAvtPlMyIIqqFx.hLY2Xp8nnhpzvEEVINvVpwIPbA3v/.i', 'bob_johnson@gmail.com'),
       ('john', '$2a$04$Fx/SX9.BAvtPlMyIIqqFx.hLY2Xp8nnhpzvEEVINvVpwIPbA3v/.i', 'john_johnson@gmail.com');