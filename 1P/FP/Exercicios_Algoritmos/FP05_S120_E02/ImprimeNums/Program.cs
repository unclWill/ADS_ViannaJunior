﻿/* Objetivo : Imprimir os números de 1 a 100.
 * Autor    : William Silva (https://github.com/unclWill)
 * Data     : 30/08/2023
 * Material : FP05 (Comandos de Repetição)
 * Slide    : 120
 * Exercício: 02
 */

/* 2. Fazer um algoritmo que imprima todos os números de 1 até 100.
 */

using System;

namespace ImprimeNums
{
    public class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Imprimir números");
            ImprimirNumeros();
            Console.Write("\nPressione qualquer tecla para finalizar...");
            Console.ReadKey();
        }

        private static void ImprimirNumeros()
        {
            int contador = 100;

            while (contador >= 1)
            {
                Console.WriteLine(contador);
                contador--;
            }
        }
    }
}