-- afficher les représentants ayant vendu au moins un produit
SELECT nomr
FROM representants
INNER JOIN ventes
ON representants.nr = ventes.nr
WHERE qt >= 1
GROUP BY nomr;