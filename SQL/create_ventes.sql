USE formation;
CREATE TABLE VENTES (
	NR INTEGER REFERENCES REPRESENTANTS(NR),
    NP INTEGER REFERENCES REPRESENTANTS(NP),
    NC INTEGER REFERENCES REPRESENTANTS(NC),
    QT INTEGER,
    PRIMARY KEY (NR, NP, NC)
);