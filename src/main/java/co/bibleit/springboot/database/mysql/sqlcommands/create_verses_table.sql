CREATE TABLE verses (
	VerseId int NOT NULL,
    VerseNumber int NOT NULL,
    ChapterId INT NOT NULL,
    PRIMARY KEY (VerseId),
    FOREIGN KEY (ChapterId) REFERENCES chapters(ChapterId)
);