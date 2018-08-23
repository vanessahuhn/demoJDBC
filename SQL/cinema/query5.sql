-- Donner le nombre de films par genre.

/*affiche toutes les valeurs du champ genre
et le nombre de films*/
SELECT genre, COUNT(numf)
-- de la table film
FROM film
/* regroupés par genre (s'il y a plusieurs genres identiques,
une seule occurrence sera affichée)*/
GROUP BY genre;

