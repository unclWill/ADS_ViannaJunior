/* Objetivo : Ler dados de restaurantes e exibir o endereço do mais bem avaliado.
 * Autor    : William Silva (https://github.com/unclWill)
 * Data     : 13/11/2023
 * Material : FP09 (Classes)
 * Slide    : 43
 * Exercício: 09
 */

/* 9) Faça um programa que armazene informações de restaurantes. 
 * Cada restaurante é identificado pelo nome, endereço, o tipo de comida (brasileira, chinesa, francesa, italiana, japonesa, etc.) e uma nota para a cozinha (entre 0 e 5). 
 * O programa deverá ler todas as informações e imprimir ao final a lista de todos os restaurantes, e o endereço do restaurante com maior nota para a cozinha.
 */

using System;

namespace LerRestaurantes
{
    public class Endereco
    {
        private string rua;
        private int numero;
        private string bairro;
        private int cep;

        public string Rua
        {
            get { return rua; }
            set { rua = value; }
        }

        public int Numero
        {
            get { return numero; }
            set { numero = value; }
        }

        public string Bairro
        {
            get { return bairro; }
            set { bairro = value; }
        }

        public int Cep
        {
            get { return cep; }
            set { cep = value; }
        }
    }
}