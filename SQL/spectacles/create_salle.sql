USE bd_spectacles;
CREATE TABLE salle (
	Salle_ID INT NOT NULL AUTO_INCREMENT,
    Nom VARCHAR(40),
    Adresse VARCHAR(40),
    Capacite INT,
    PRIMARY KEY(Salle_ID)
);