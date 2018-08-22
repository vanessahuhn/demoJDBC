-- Quels sont les chanteurs n'ayant jamais réalisé de concert à la Cigale ?
SELECT Chanteur
FROM concert
INNER JOIN spectacle
ON concert.Spectacle_ID = spectacle.Spectacle_ID
INNER JOIN salle
ON spectacle.Salle_ID = salle.Salle_ID
WHERE Nom != 'La Cigale'
GROUP BY Chanteur;