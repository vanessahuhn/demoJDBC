USE bd_spectacles;
CREATE TABLE spectacle (
	Spectacle_ID INT NOT NULL AUTO_INCREMENT,
    Titre VARCHAR(40),
    DateDeb DATE,
    Duree INT,
    Chanteur VARCHAR(40),
    Salle_ID INT,
    PRIMARY KEY(Spectacle_ID),
    FOREIGN KEY(Salle_ID) REFERENCES salle(Salle_ID)
);