create table products
(
    id          serial
        constraint products_pk
            primary key,
    serial      varchar,
    number      integer not null,
    create_date timestamp,
    saled_date  timestamp
);

alter table products
    owner to passportpguser;

create unique index products_id_uindex
    on products (id);

create unique index products_number_uindex
    on products (number);

create table reglaments
(
    id              serial
        constraint reglaments_pk
            primary key,
    reglament_name  varchar,
    number_ingineer integer,
    reglament_date  timestamp
);

alter table reglaments
    owner to passportpguser;



create table works
(
    id           serial
        constraint works_pk
            primary key,
    product_id   integer
        constraint works_products_id_fk
            references products,
    reglament_id integer
        constraint works_reglaments_id_fk
            references reglaments
);

alter table works
    owner to passportpguser;

create unique index works_id_uindex
    on works (id);





