-- les nom des clients de Lyon ayant acheté un produit pour une quantité supérieure à 180
SELECT nomc
FROM clients
INNER JOIN ventes
ON clients.nc = ventes.nc
WHERE ville = 'Lyon' AND qt > 180
GROUP BY nomc;