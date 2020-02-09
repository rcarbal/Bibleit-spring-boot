CREATE TABLE book (
      	id int NOT NULL AUTO_INCREMENT,
        name VARCHAR(24),
        section_id INT,
        PRIMARY KEY (id),
        FOREIGN KEY (section_id) REFERENCES bible_section(id),
        UNIQUE (name)
     );