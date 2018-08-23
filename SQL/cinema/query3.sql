-- Requête 3 : Donner la liste de tous les genres de film.

-- affiche toutes les valeurs du champ genre
SELECT genre
-- de la table film
FROM film
-- regroupées par genre (s'il y a plusieurs genres identique, une seule occurrence sera affichée)
GROUP BY genre;

