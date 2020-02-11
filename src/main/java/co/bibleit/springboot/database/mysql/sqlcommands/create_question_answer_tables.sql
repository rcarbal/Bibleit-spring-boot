DROP TABLE IF EXISTS questions;

CREATE TABLE questions (
	id int NOT NULL AUTO_INCREMENT,
	question varchar(200) NOT NULL,
	PRIMARY KEY (id),
	UNIQUE KEY QUESTION_UNIQUE (question)
);

	DROP TABLE IF EXISTS answers;

    CREATE TABLE answers(
		id int NOT NULL AUTO_INCREMENT,
        answer varchar(200) NOT NULL,
		question_id int NOT NULL,
		PRIMARY KEY (id),
        FOREIGN KEY (question_id) REFERENCES questions(id)
    );