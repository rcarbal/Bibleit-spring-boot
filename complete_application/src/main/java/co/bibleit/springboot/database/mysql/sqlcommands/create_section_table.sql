CREATE TABLE bible_section (
      	id int NOT NULL AUTO_INCREMENT,
        name varchar(45) NOT NULL,
        PRIMARY KEY (id),
        UNIQUE KEY NAME_UNIQUE (name)
      );