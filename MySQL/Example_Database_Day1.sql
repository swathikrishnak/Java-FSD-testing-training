/* 1. created a database and used it*/
create database example;
use example;

create table addresses(
id int,
house_no int,
city varchar(20),
postalcode varchar(6)
);
/* adding primary key and delete it*/
alter table addresses
add primary key (id);
describe  addresses;
alter table  addresses
drop primary key ;
describe  addresses;

create table people(
id int,
first_name varchar(20),
last_name varchar(20),
address_id int
);
alter table people
add primary key(id);
describe people;

create table pets(
id int,
name varchar(20),
species varchar(20),
owner_id int
);
/*3 .added unique constraint */
describe pets;
alter table pets
add constraint  u_species unique (species);

/* 4. to see the properties - SHOW CREATE TABLE people */
show create table people;

/*5. added and deleted foreign keys*/
alter table people
drop foreign key swathi;
alter table people
add constraint swathi
foreign key(address_id) references addresses(id)

/*6. changed the column_name of a particular table */
describe pets;
select * from pets;
alter table pets change `species` `type`varchar(20);
describe pets;
/*7. changed the data_type of a column. */
alter table addresses modify city varchar(30);
describe addresses;


