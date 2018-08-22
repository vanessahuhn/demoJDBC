-- Quelles sont les dates du concert de Corneille au Zenith ?
SELECT Date
FROM concert
INNER JOIN spectacle
ON concert.Spectacle_ID = spectacle.Spectacle_ID
INNER JOIN salle
ON spectacle.Salle_ID = salle.Salle_ID
WHERE Chanteur = 'Corneille';