BEGIN;

DROP TABLE IF EXISTS products CASCADE;
CREATE TABLE products (id serial PRIMARY KEY, title VARCHAR(255), price VARCHAR(255));
INSERT INTO products (title, price) VALUES
('Milk', '0.80 Euro'),
('Bread', '0.67 Euro'),
('Tomato', '1.22 Euro'),
('Cucumber', '1.13 Euro'),
('Butter', '1.89 Euro');

DROP TABLE IF EXISTS customers CASCADE;
CREATE TABLE customers (id serial PRIMARY KEY, name VARCHAR(255));
INSERT INTO customers (name) VALUES
('Ivan'),
('Bob'),
('Bill'),
('John'),
('Mike');
DROP TABLE IF EXISTS orders CASCADE;
CREATE TABLE orders (id serial PRIMARY KEY, price VARCHAR(255), customer_id bigint, product_id bigint);
INSERT INTO orders (price, customer_id, product_id) VALUES
('0.80 Euro', 1, 1),
('0.80 Euro', 3, 1),
('0.67 Euro', 3, 2),
('0.67 Euro', 1, 2),
('1.22 Euro', 5, 3),
('1.22 Euro', 4, 3),
('1.13 Euro', 2, 4),
('1.13 Euro', 4, 4),
('1.89 Euro', 2, 5),
('1.89 Euro', 5, 5);