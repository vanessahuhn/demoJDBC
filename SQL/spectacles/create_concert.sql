USE bd_spectacles;
CREATE TABLE concert (
	Concert_ID INT NOT NULL AUTO_INCREMENT,
    Titre VARCHAR(40),
    DateDeb DATE,
    Heure TIME,
    Spectacle_ID INT,
    PRIMARY KEY(Concert_ID),
    FOREIGN KEY(Spectacle_ID) REFERENCES spectacle(Spectacle_ID)
);