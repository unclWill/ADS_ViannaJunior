/*
 * Autor: William Silva
 * Data : 28/02/2024
 *
 * Excercício 06) Crie um programa que permita ao consumidor customizar a escolha de um carro
 * novo com seus opcionais, câmbio automático, vidro automático, alarme, teto solar, kit
 * multimídia, potência do motor, dentre outros opcionais. Ao final mostre os detalhes do
 * carro escolhido e o custo do carro conforme o cálculo a seguir:
 * O preço do carro depende do modelo, acrescido IPI, 20% do custo final do veículo, se for
 * importante ainda é taxado em 30% sobre o preço. Veículos com motores 1.0 o IPI é
 * reduzido a 10%.
 * Cada acessório opcional acrescenta seu custo ao veículo, segue a tabela de preço
 * abaixo:
 * Ar -> R$ 3.000,00, câmbio automático -> R$ 5.000,00, alarme -> R$ 800,00, pintura
 * especial, metálica ou comemorativa -> R$ 2.500,00, teto solar -> R$ 4.000,00 e kit
 * multimidia -> R$ 1.800,00
 */

import br.com.williamsilva.opcionaiscarro.Acessorios;
import br.com.williamsilva.opcionaiscarro.TiposDeAcessorios;
import br.com.williamsilva.veiculo.Carro;
import br.com.williamsilva.veiculo.Motor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Escolha dentre os modelos disponíveis abaixo e personalize o seu carro novo!");
        Carro carro = selecionarModelo();

        System.out.println(carro.exibeInformacoes());

        List<String> listaDeAcessorios = carro.listarAcessorios();
        System.out.println("\tAcessórios:");
        for (var acessorio : listaDeAcessorios) {
            System.out.println("\t" + acessorio);
        }
    }

    private static Carro selecionarModelo() {
        Scanner sc = new Scanner(System.in);
        Motor motor = new Motor();
        String modelo = "", marca = "";
        boolean ehImportado = false;
        double precoBase = 0;

        StringBuilder sb = new StringBuilder();
        sb.append("Modelos disponíveis:\n" +
                "[1] Volkswagen Gol\n" +
                "[2] Hyundai HB20\n" +
                "[3] Ford Mustang\n");

        System.out.println("Esolha entre os modelos disponíveis digitando o seu número correspondente: ");
        System.out.println(sb);
        int modeloSelecionado = opcaoEscolhida();

        switch (modeloSelecionado) {
            case 1:
                modelo = "Gol";
                marca = "Volkswagen";
                ehImportado = false;
                precoBase = 50000.00;
                motor.setCilindradas(1.0);
                motor.setConfiguracaoMotor("16V");
                break;
            case 2:
                modelo = "HB20";
                marca = "Hyundai";
                ehImportado = false;
                precoBase = 86000.00;
                motor.setCilindradas(1.0);
                motor.setConfiguracaoMotor("8V");
                break;
            case 3:
                modelo = "Mustang";
                marca = "Ford";
                ehImportado = true;
                precoBase = 500000.00;
                motor.setCilindradas(5.0);
                motor.setConfiguracaoMotor("V8");
                break;
        }

        motor = selecionarMotor();
        Acessorios acessorios = personalizarCarro();
        Carro carro = new Carro(modelo, marca, motor, acessorios, ehImportado, precoBase);

        return carro;
    }

    private static Motor selecionarMotor() {
        Motor motor = new Motor(1.0, "V8");

        return motor;
    }

    private static Acessorios personalizarCarro() {
        List<String> listaDeAcessorios = new ArrayList<>();
        List<TiposDeAcessorios> tiposDeAcessoriosDisponiveis = TiposDeAcessorios.getTiposAcessorios();

        for (TiposDeAcessorios acessorio : tiposDeAcessoriosDisponiveis) {
            listaDeAcessorios.add(acessorio.getTipoAcessorio() + " (R$ " + acessorio.getPrecoAcessorio() + ")");
        }

        System.out.println("Vamos escolher os acessórios do seu novo carro");
        System.out.println("(i) Para adicionar um acessório digite S");

        List<Boolean> acessoriosSelecionados = new ArrayList<>();
        for (int i = 0; i < listaDeAcessorios.size(); i++) {
            System.out.printf("Deseja que o seu carro tenha %s: ", listaDeAcessorios.get(i));
            boolean opcao = converterOpcao();
            acessoriosSelecionados.add(opcao);
        }

        Acessorios acessorios = new Acessorios();
        acessorios.setArCondicionado(acessoriosSelecionados.get(0));
        acessorios.setVidroAutomatico(acessoriosSelecionados.get(1));
        acessorios.setCambioAutomatico(acessoriosSelecionados.get(2));
        acessorios.setAlarme(acessoriosSelecionados.get(3));
        acessorios.setTipoDePintura(acessoriosSelecionados.get(4));
        acessorios.setTetoSolar(acessoriosSelecionados.get(5));
        acessorios.setKitMultimidia(acessoriosSelecionados.get(6));

        return acessorios;
    }

    private static String tipoPintura() {
        StringBuilder sb = new StringBuilder();
        String pintura;

        System.out.println("Selecione o tipo de pintura do seu carro: ");
        sb.append("[1] Pintura Especial (R$ 2.500,00)" +
                "[2] Pintura Metálica (R$ 2.500,00)" +
                "[3] Pintura Comemorativa (R$ 2.500,00)" +
                "[4] Pintura Padrão (Grátis)");
        int pinturaEscolhida = opcaoEscolhida();

        switch (pinturaEscolhida) {
            case 1:
                pintura = "Pintura Especial";
                break;
            case 2:
                pintura = "Pintura Metálica";
                break;
            case 3:
                pintura = "Pintura Comemorativa";
                break;
            default:
                pintura = "Pintura Padrão";
        }

        return pintura;
    }

    // Métodos auxiliares.
    private static int opcaoEscolhida() {
        Scanner sc = new Scanner(System.in);
        int opcaoEscolhida = 0;
        while (opcaoEscolhida == 0) {
            System.out.print("|>| ");
            opcaoEscolhida = sc.nextInt();
        }
        return opcaoEscolhida;
    }

    private static boolean converterOpcao(){
        Scanner sc = new Scanner(System.in);
        if (sc.next().toUpperCase().equals("S")) {
            return true;
        }
        return false;
    }
}