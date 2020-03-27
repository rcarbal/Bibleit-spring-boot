DROP TABLE IF EXISTS answers;

CREATE TABLE answers(
	id int NOT NULL AUTO_INCREMENT,
	answer varchar(200) NOT NULL,
	PRIMARY KEY (id)
);

DROP TABLE IF EXISTS questions;

CREATE TABLE questions (
	id int NOT NULL AUTO_INCREMENT,
	question varchar(200) NOT NULL,
    answer_id int,
	PRIMARY KEY (id),
	UNIQUE KEY QUESTION_UNIQUE (question),
    FOREIGN KEY (answer_id) REFERENCES answers(id)
);