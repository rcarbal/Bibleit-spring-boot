CREATE TABLE chapters (
	ChapterId int NOT NULL, 
    ChapterNumber int NOT NULL,
    BookId INT NOT NULL,
    PRIMARY KEY (ChapterId),
    FOREIGN KEY (BookId) REFERENCES books(BookId) 
);