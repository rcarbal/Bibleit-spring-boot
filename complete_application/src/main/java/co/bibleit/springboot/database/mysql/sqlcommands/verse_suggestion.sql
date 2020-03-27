DROP TABLE IF EXISTS verse_suggestion;

      CREATE TABLE verse_suggestion (
      	verse_id int(11)  DEFAULT NULL,
        suggestion_id int(11) DEFAULT NULL,

        PRIMARY KEY (verse_id, suggestion_id),

        FOREIGN KEY (verse_id) REFERENCES verses(id),
        FOREIGN KEY (suggestion_id) REFERENCES suggestion(id)
      );