create table location (location_address varchar(255), location_city varchar(255), location_name varchar(255), cashier_id integer not null, primary key (cashier_id)) engine=InnoDB
create table logged_user_details (address varchar(255), city varchar(255), email varchar(255), phone_number varchar(255), user_id integer not null, primary key (user_id)) engine=InnoDB
create table user (id integer not null auto_increment, first_name varchar(255), last_name varchar(255), password varchar(255), role varchar(255), username varchar(255), primary key (id)) engine=InnoDB
alter table location add constraint FKkti8xsypgsht231gbay20kc53 foreign key (cashier_id) references user (id)
alter table logged_user_details add constraint FKqr69avnsthll7t7smsejvdsdj foreign key (user_id) references user (id)
create table location (location_address varchar(255), location_city varchar(255), location_name varchar(255), cashier_id integer not null, primary key (cashier_id)) engine=InnoDB
create table logged_user_details (address varchar(255), city varchar(255), email varchar(255), phone_number varchar(255), user_id integer not null, primary key (user_id)) engine=InnoDB
create table user (id integer not null auto_increment, first_name varchar(255), last_name varchar(255), password varchar(255), role varchar(255), username varchar(255), primary key (id)) engine=InnoDB
alter table location add constraint FKkti8xsypgsht231gbay20kc53 foreign key (cashier_id) references user (id)
alter table logged_user_details add constraint FKqr69avnsthll7t7smsejvdsdj foreign key (user_id) references user (id)
create table location (location_address varchar(255), location_city varchar(255), location_name varchar(255), cashier_id integer not null, primary key (cashier_id)) engine=InnoDB
create table logged_user_details (address varchar(255), city varchar(255), email varchar(255), phone_number varchar(255), user_id integer not null, primary key (user_id)) engine=InnoDB
create table user (id integer not null auto_increment, first_name varchar(255), last_name varchar(255), password varchar(255), role varchar(255), username varchar(255), primary key (id)) engine=InnoDB
alter table location add constraint FKkti8xsypgsht231gbay20kc53 foreign key (cashier_id) references user (id)
alter table logged_user_details add constraint FKqr69avnsthll7t7smsejvdsdj foreign key (user_id) references user (id)
create table location (location_address varchar(255), location_city varchar(255), location_name varchar(255), cashier_id integer not null, primary key (cashier_id)) engine=InnoDB
create table logged_user_details (address varchar(255), city varchar(255), email varchar(255), phone_number varchar(255), user_id integer not null, primary key (user_id)) engine=InnoDB
create table user (id integer not null auto_increment, first_name varchar(255), last_name varchar(255), password varchar(255), role varchar(255), username varchar(255), primary key (id)) engine=InnoDB
alter table location add constraint FKkti8xsypgsht231gbay20kc53 foreign key (cashier_id) references user (id)
alter table logged_user_details add constraint FKqr69avnsthll7t7smsejvdsdj foreign key (user_id) references user (id)
