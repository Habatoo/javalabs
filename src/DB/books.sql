DROP TABLE IF EXISTS Book

CREATE TABLE IF NOT EXISTS Book (bookId serial PRIMARY KEY, name VARCHAR(30) NOT NULL, price REAL);

INSERT INTO Book (name, price) VALUES ('Inferno', 45.0);
INSERT INTO Book (name, price) VALUES ('Harry Potter', 45.5);
INSERT INTO Book (name, price) VALUES ('It', 25.0);
INSERT INTO Book (name, price) VALUES ('Spartacus', 55.0);
INSERT INTO Book (name, price) VALUES ('Green mile', 20.6);
INSERT INTO Book (name, price) VALUES ('Solomon day', 5.0);