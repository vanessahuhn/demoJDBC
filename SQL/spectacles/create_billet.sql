USE bd_spectacles;
CREATE TABLE billet (
	Billet_ID INT NOT NULL AUTO_INCREMENT,
    Num_Place INT,
    Categorie VARCHAR(40),
    Prix DOUBLE(4, 2),
    Concert_ID INT,
    PRIMARY KEY(Billet_ID),
    FOREIGN KEY(Concert_ID) REFERENCES concert(Concert_ID)
);