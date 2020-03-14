CREATE TABLE chapters (
      	id int NOT NULL,
          number int NOT NULL,
          book_id INT NOT NULL,
          PRIMARY KEY (id),
          FOREIGN KEY (book_id) REFERENCES book(id)
      );