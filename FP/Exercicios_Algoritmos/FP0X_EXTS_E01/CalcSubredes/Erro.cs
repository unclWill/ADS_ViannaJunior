/* Objetivo : Exibir mensagens de erro.
 * Autor    : William Silva (https://github.com/unclWill)
 * Data     : 14/09/2023
 */

using System;
using System.Threading.Tasks;

namespace CalcSubredes
{
    internal class Erro
    {
        #region // Mensagens de erro para entradas inválidas nas opções de menu.

        internal static void OpcaoDigitadaNoMenuInvalida()
        {
            Console.Write("[!] Opção inválida, tente novamente. \n[>] ", Console.ForegroundColor = ConsoleColor.Gray);
            Console.ForegroundColor = ConsoleColor.Gray;
        }

        #endregion

        #region // Mensagens de erro para entradas inválidas na leitura do endereço IP.

        internal static void QtdDigitosDoOctetoInvalida()
        {
            Console.Write("\n[!] Os octetos de um endereço IP não podem ter mais de 3 dígitos.", Console.ForegroundColor = ConsoleColor.DarkRed);
            Console.ForegroundColor = ConsoleColor.Gray;
            Thread.Sleep(2000);
        }

        internal static void CaractereDigitadoInvalido()
        {
            Console.Write("[!] Entrada inválida!\n" +
                          "[i] Apenas são aceitos dígitos numéricos separados por ponto.", Console.ForegroundColor = ConsoleColor.DarkRed);
            Console.ForegroundColor = ConsoleColor.Gray;
            Thread.Sleep(2500);
        }

        internal static void ValorDoOctetoInvalido()
        {
            Console.Write("[!] Valor do octeto inválido!\n" +
                          "[i] O valor para cada octeto deve estar entre 0 e 255.", Console.ForegroundColor = ConsoleColor.DarkRed);
            Console.ForegroundColor = ConsoleColor.Gray;
            Thread.Sleep(2500);
        }

        #endregion
    }
}