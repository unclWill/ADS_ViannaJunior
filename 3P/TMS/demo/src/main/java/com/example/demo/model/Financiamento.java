package com.example.demo.model;

import com.example.demo.service.EmailService;
import com.example.demo.service.Mock.EmailServiceMock01;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Financiamento {
    private double valorFinanciado,taxaJuros,numeroParcelas,valorEntrada;
    private EmailService em;

    public double valorParcela() throws Exception{
        if(valorFinanciado == 0){
            throw new Exception("Valor financiado não pode ser 0");
        }
        double montante = valorFinanciado * ( 1 +(taxaJuros * numeroParcelas) / 100);
        double parcela = montante / numeroParcelas;

        //String valor = new DecimalFormat("#0.00").format(parcela);
        //double nParcela = Double.parseDouble(valor.replace);
        //return (nParcela > parcela)?nParcela:nParcela+0.01;

        return new BigDecimal(parcela).setScale(2, RoundingMode.UP).doubleValue();
    }

     public void fecharFinanciamento(String email, String nome) throws Exception {

        new EmailServiceMock01().sendEmail(email,
                "Confirmação dos dados do Financiamento",
                "Parabéns, Sr(a) "+ nome +", o seu financeamento no valor de R$ "
                        +valorFinanciado+
                        "foi aprovado. \n" + "Serão " +numeroParcelas+ "parcelas de R$ "
                        + valorParcela());
     }
}
