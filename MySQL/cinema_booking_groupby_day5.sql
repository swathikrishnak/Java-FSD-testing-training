use cinema_booking_system;

select * from bookings;

select count(id) from bookings;
-- to select howmany bookings are made by each customer
select customer_id,count(id) from bookings
group by customer_id;
-- columns in the query which arent an aggregate function must be in a group by clause

/* howmany bookings are made by each customer on each screen
no need for join bcz of each field is selected from one table.customer_id,screening_id,count(id) is displayed
as output,that is only we select*/
select customer_id,screening_id,count(id) from bookings
group by customer_id,screening_id
order by customer_id;


/*how manny films  are booked(b.id) for each film by each customer (by name) for each show start time
here f,s,c,b we have to join,each field is selected from different table 
displys only the fields that we write using select*/
select f.name,s.start_time,c.first_name,c.last_name,count(b.id) from films f
join screenings s on f.id=s.film_id
join bookings b on s.id=b.screening_id
join customers c on b.customer_id=c.id
group by f.name,s.start_time,c.first_name,c.last_name
order by s.start_time;