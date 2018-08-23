/* Trouver le titre et l’année des films de science-fiction
dont le budget dépasse 5.000.000 $.*/

-- affiche toutes les valeurs des champs titre et annee
SELECT titre, annee
-- de la table film
FROM film
/*où la valeur du champ genre est égale à 'Science-fiction'
et la valeur du champ budget est supérieure à 5 millions*/
WHERE genre = 'Science-fiction' AND budget > 5;

