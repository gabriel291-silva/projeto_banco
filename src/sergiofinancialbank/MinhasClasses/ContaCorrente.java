/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sergiofinancialbank.MinhasClasses;

import javax.swing.JOptionPane;
import static sergiofinancialbank.JBanco.jLblCorrentista;
import static sergiofinancialbank.JBanco.jLblSaldo;

/**
 *
 * @author Professor
 */
public class ContaCorrente {
    
    public double saldo;
    public String nome; 
    
    public void Cadastro(String nome, int CPF, String endereco, String telefone)
    {
        
        jLblCorrentista.setText(nome);

        JOptionPane.showMessageDialog(null, nome + " cadastrado com sucesso!");
        
        // JOption com botões de SIM ou NÃO
        int resposta = JOptionPane.showConfirmDialog(null, 
                            "Deseja fazer um depósito inicial?", 
                            "Importante!", 
                            JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
          this.Deposito();
        }

        
    }
    
    public void Deposito()
    {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor:"));
        saldo = saldo + valor;
        this.saldo();
    }
    
    public void Saque(){
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor:"));
        saldo = saldo - valor;
        this.saldo();
    }
    
    public void saldo(){
        
        /* 
            Caso queira converter o double para string usando o estilo Sergio/Katia, use:
            String.valueOf(saldo);        
        */
        
        
        if (saldo >= 0) jLblSaldo.setText("<html><span style=color:black>" + saldo + "</span></html>");  
        if (saldo < 0) jLblSaldo.setText("<html><span style=color:red>" + saldo + "</span></html>");
        
        /* ou, se preferir, faça assim: */
        /*
        if (saldo >= 0) 
        {
            jLblSaldo.setText("" + saldo);  
            jLblSaldo.setForeground(Color.black);
        }
        if (saldo < 0)
        {
            jLblSaldo.setText("" + saldo);
            jLblSaldo.setForeground(Color.red);
        }
        */
        
        
    }
}
