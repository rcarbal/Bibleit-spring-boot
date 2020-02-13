DROP TABLE IF EXISTS verses;

CREATE TABLE verses (
	id int NOT NULL AUTO_INCREMENT,
    number int NOT NULL default NULL,
    chapter_id INT default NUll,
    PRIMARY KEY (id),
    FOREIGN KEY (chapter_id) REFERENCES chapters(id)
);