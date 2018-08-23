-- Requête 2 : Retrouver la liste des films dont la longueur dépasse 180 min.

-- affiche toutes les valeurs du champ titre
SELECT titre
-- de la table film
FROM film
-- où la longueur est supérieure à 180 minutes
WHERE longueur > 180;

