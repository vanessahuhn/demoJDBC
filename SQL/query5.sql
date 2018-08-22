/* afficher les noms des représentants et des clients à qui ces représentants
ont vendu un produit de couleur rouge pour une quantité supérieure à 100*/
SELECT r.nomr, c.nomc 
FROM representants r
INNER JOIN ventes ON r.nr = ventes.nr
INNER JOIN clients c ON c.nc = ventes.nc
INNER JOIN produits ON produits.np = ventes.np
WHERE  coul = 'rouge' AND qt > 100
GROUP BY nomc;