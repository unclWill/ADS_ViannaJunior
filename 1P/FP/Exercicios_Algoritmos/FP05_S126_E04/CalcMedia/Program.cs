﻿/* Objetivo : Calcular a média ponderada de 3 notas.
 * Autor    : William Silva (https://github.com/unclWill)
 * Data     : 06/09/2023
 * Material : FP05 (Comandos de Repetição)
 * Slide    : 126
 * Exercício: 04
 */

/* 4) Escreva um algoritmo que leia a matrícula de um aluno e suas três notas. 
 * Calcule a média ponderada do aluno, considerando que o peso para a maior 
 * nota seja 4 e para as duas restantes, 3. Mostre ao final a média calculada e 
 * uma mensagem "APROVADO" se a média for maior ou igual a 5 e "REPROVADO" se a média for menor que 5.
 * Repita a operação até que o código lido seja negativo. 
 */

using System;

namespace CalcMedia
{
    public class Program
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Calcular média das notas");
            LerDados();
            Console.Write("\nPressione qualquer tecla para finalizar...");
            Console.ReadKey();
        }

        private static void LerDados()
        {
            while (true)
            {
                Console.Write("\n[i] Digite a matrícula do aluno: ");
                int matricula = Convert.ToInt32(Console.ReadLine());

                if (matricula < 0)
                {
                    Console.WriteLine("Você escolheu sair...");
                    break;
                }

                Console.WriteLine("(i) A maior nota deve ser inserida na 3ª posição.");
                Console.Write("\n[Peso 3] Digite a 1ª nota: ");
                double nota1 = Convert.ToDouble(Console.ReadLine());
                Console.Write("\n[Peso 3] Digite a 2ª nota: ");
                double nota2 = Convert.ToDouble(Console.ReadLine());
                Console.Write("\n[Peso 4] Digite a 3ª nota: ");
                double nota3 = Convert.ToDouble(Console.ReadLine());

                double mediaAluno = CalcularMediaPond(nota1, nota2, nota3);

                if (mediaAluno >= 5.0)
                {
                    Console.WriteLine($"\n[>] Aprovado, com média: {mediaAluno:N2}");
                }
                else if (mediaAluno < 5.0)
                {
                    Console.WriteLine($"\n[>] Reprovado, com média: {mediaAluno:N2}");
                }
            }
        }

        private static double CalcularMediaPond(double n1, double n2, double n3)
        {
            return ((3.0 * n1) + (3.0 * n2) + (4.0 * n3)) / 10.0;
        }
    }
}