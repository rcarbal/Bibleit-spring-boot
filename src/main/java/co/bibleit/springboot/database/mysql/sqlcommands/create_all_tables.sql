CREATE TABLE bible_section (
      	id int NOT NULL AUTO_INCREMENT,
        name varchar(45) NOT NULL,
        PRIMARY KEY (id),
        UNIQUE KEY NAME_UNIQUE (name)
      );
CREATE TABLE book (
      	id int NOT NULL AUTO_INCREMENT,
        name VARCHAR(24),
        section_id INT,
        PRIMARY KEY (id),
        FOREIGN KEY (section_id) REFERENCES bible_section(id),
        UNIQUE (name)
     );
     CREATE TABLE chapters (
      	id int NOT NULL,
          number int NOT NULL,
          book_id INT NOT NULL,
          PRIMARY KEY (id),
          FOREIGN KEY (book_id) REFERENCES book(id)
      );