create table reservation (
    reservation_id integer not null AUTO_INCREMENT,
    date_reserved date not null,
    time_reserved_start time not null,
    time_reserved_end time not null,
    primary key(reservation_id)
);