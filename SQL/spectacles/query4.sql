-- Quels sont les dates et les identificateurs des concerts pour lesquels il ne reste aucun billet invendu ?
SELECT Date, concert.Concert_ID
FROM concert
INNER JOIN billet
ON concert.Concert_ID = billet.Concert_ID
INNER JOIN vente
ON billet.Billet_ID = vente.Billet_ID
INNER JOIN spectacle
ON concert.Spectacle_ID = spectacle.Spectacle_ID
INNER JOIN salle
ON spectacle.Salle_ID = salle.Salle_ID
WHERE salle.Capacite IN (SELECT COUNT(vente_ID) FROM vente)
GROUP BY concert_ID;