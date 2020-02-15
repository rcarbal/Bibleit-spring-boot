DROP TABLE IF EXISTS suggestion;

CREATE TABLE suggestion (
	id int NOT NULL AUTO_INCREMENT,
    suggest varchar(256)  DEFAULT NULL,
    answer_id int(11) DEFAULT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (answer_id) REFERENCES answers(id)
);