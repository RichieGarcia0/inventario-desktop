/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Richie
 * Created: 22/01/2019
 */

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