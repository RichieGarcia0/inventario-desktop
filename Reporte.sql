SELECT
     gacetas.`id` AS Id,
     gacetas.`numeroGaceta` AS Gaceta,
     gacetas.`paginasEjemplar` AS Páginas,
     gacetas.`tipo` AS Tipo,
     gacetas.`fechaEjemplar` AS Fecha,
     gacetas.`numeroTomo` AS Tomo,
     gacetas.`numeroEjemplares` AS Tiraje,
     gacetas.`ejemplaresHemeroteca` AS Existencia
FROM
     `gacetas` gacetas