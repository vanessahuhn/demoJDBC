USE bd_spectacles;
CREATE TABLE vente (
	Vente_ID INT NOT NULL AUTO_INCREMENT,
    Date_Vente DATE,
    MoyenPaiement VARCHAR(40),
    Billet_ID INT,
    PRIMARY KEY(Vente_ID),
    FOREIGN KEY(Billet_ID) REFERENCES billet(Billet_ID)
);