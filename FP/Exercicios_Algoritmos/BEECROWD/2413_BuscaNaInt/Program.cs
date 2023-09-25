﻿/* Objetivo : Determinar a quantdade de cliques que um link recebe com base nos demais.
 * Autor    : William Silva (https://github.com/unclWill)
 * Data     : 24/09/2023
 * Tipo     : 2 (AD-HOC)
 * ID       : 2413
 * Nome     : Busca na Internet
 * Link     : https://www.beecrowd.com.br/judge/pt/problems/view/2413
 */

using System;
public static class URI
{
    public static void Main()
    {
        int t = int.Parse(Console.ReadLine());
        // O mesmo que t * 2 * 2
        int result = t * 4;
        // Quantidade de cliques no primeiro link
        Console.WriteLine(result);
    }
}