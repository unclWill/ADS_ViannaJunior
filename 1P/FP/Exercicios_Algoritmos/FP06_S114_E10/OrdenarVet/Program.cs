﻿/* Objetivo : Ordenar um vetor de valores inteiros.
 * Autor    : William Silva (https://github.com/unclWill)
 * Data     : 14/10/2023
 * Material : FP06 (Vetores)
 * Slide    : 114
 * Exercício: 10
 */

/* 10) Faça um programa que leia um vetor de valores inteiros e imprima-o na ordem crescente.
 * O vetor deve ter tamanho N (declare e utilize uma constante N).
 */

using System;

namespace OrdenarVet
{
    internal class Program
    {
        const int n = 7;

        internal static void Main(string[] args)
        {
            int[] vet = new int[n];

            for (int i = 0, j = 1; i < vet.Length; i++, j++)
            {
                Console.Write($"[{j} de {n}] Digite o {j}º elemento: ");
                vet[i] = Convert.ToInt32(Console.ReadLine());
            }

            OrdenarValores(vet);

            for (int i = 0; i < vet.Length; i++)
            {
                Console.Write($"{vet[i]} ");
            }

            Console.Write("\nPressione qualquer tecla para finalizar...");
            Console.ReadKey();
        }

        private static void OrdenarValores(int[] vet)
        {
            int alt = 0;

            for (int i = vet.Length - 1; i >= 0; i--)
            {
                for (int j = 0; j < i; j++)
                {
                    int moverValor;
                    int valorAtual = vet[j], proxValor = vet[j + 1];

                    if (valorAtual > proxValor)
                    {
                        moverValor = vet[j];
                        vet[j] = vet[j + 1];
                        vet[j + 1] = moverValor;
                        // Verifica quantas alterações foram feitas na útima passagem, SE alt == 0, interrompe o laço e evita iterações desnecessárias.
                        alt++;
                    }
                }

                if (alt == 0)
                {
                    break;
                }
            }
        }
    }
}
