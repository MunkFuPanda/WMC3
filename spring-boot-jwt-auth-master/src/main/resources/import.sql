--Password alex123
insert into user (id, firstname, lastname, username, password, salary, age)
values (-1, 'Alex', 'Knr', 'alex123', '$2a$04$4vwa/ugGbBVDvbWaKUVZBuJbjyQyj6tqntjSmG8q.hi97.xSdhj/2', 3456, 33);
insert into user (id, firstname, lastname, username, password, salary, age)
values (-2, 'Tom', 'Asr', 'tom234', '$2a$04$QED4arFwM1AtQWkR3JkQx.hXxeAk/G45NiRd3Q4ElgZdzGYCYKZOW', 7823, 23);
insert into user (id, firstname, lastname, username, password, salary, age)
values (-3, 'Adam', 'Psr', 'adam', '$2a$04$WeT1SvJaGjmvQj34QG8VgO9qdXecKOYKEDZtCPeeIBSTxxEhazNla', 4234, 45);

--Tipps: 1) Vergib ids mit negativen Zahlen
--       2) Datum im Format '2022-10-10'
insert into product (name, description, price, stock, image_name, valid_from, valid_to)
values ('Product 1', 'Description 1', 10.0, 100, 'image1.jpg', '2020-01-01', '2025-12-31'),
       ('Product 2', 'Description 2', 20.0, 200, 'image2.jpg', '2020-01-01', '2025-12-31'),
       ('Product 3', 'Description 3', 30.0, 300, 'image3.jpg', '2020-01-01', '2025-12-31');
