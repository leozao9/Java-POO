package gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.Caixa;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCaixa extends JFrame implements ActionListener {
    private Dimension dFrame, dTextField, dLabel, dButton, dTextArea;
    private Label lblValor, lblSaldo;
    private TextField txtValor, txtSaldo;
    private Button cmdEntrada, cmdRetirada, cmdConsulta, cmdSair;
    private TextArea txtMsg;
    private Caixa caixa; // Objeto Caixa para manipulação de dados

    // construtor personalizado da janela
    public TelaCaixa() {
        // Inicializa o objeto Caixa
        caixa = new Caixa(); // Cria uma nova instância de Caixa
        // Dimensoes dos elementos
        dFrame = new Dimension(350, 400);
        dLabel = new Dimension(40, 20);
        dTextField = new Dimension(150, 20);
        dButton = new Dimension(92, 20);
        dTextArea = new Dimension(300, 140);
        // Definindo o tamanho e comportamento da janela
        setSize(dFrame);
        setTitle("Controle de Caixa");
        setLocationRelativeTo(null); // centraliza a janela na tela
        setDefaultCloseOperation(EXIT_ON_CLOSE); // fecha o programa ao fechar a janela
        setLayout(null);
        setResizable(false); // nao redimensionar janela
        // criando os componentes
        lblValor = new Label("Valor: ");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25, 50);
        add(lblValor);

        lblSaldo = new Label("Saldo: ");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25, 80);
        add(lblSaldo);

        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75, 50);
        add(txtValor);

        txtSaldo = new TextField(null);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75, 80);
        add(txtSaldo);

        cmdEntrada = new Button("Depositar");
        cmdEntrada.setSize(dButton);
        cmdEntrada.setLocation(25, 150);
        cmdEntrada.addActionListener(this); // Adiciona o listener de ação ao botão
        add(cmdEntrada);

        cmdConsulta = new Button("Consultar");
        cmdConsulta.setSize(dButton);
        cmdConsulta.setLocation(25, 185);
        cmdConsulta.addActionListener(this); // Adiciona o listener de ação ao botão
        add(cmdConsulta);

        cmdRetirada = new Button("Sacar");
        cmdRetirada.setSize(dButton);
        cmdRetirada.setLocation(180, 150);
        cmdRetirada.addActionListener(this); // Adiciona o listener de ação ao botão
        add(cmdRetirada);

        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(180, 185);
        cmdSair.addActionListener(this); // Adiciona o listener de ação ao botão
        add(cmdSair);

        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25, 220);
        add(txtMsg);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Objeto e: evento de acao
        // Verifica qual botão foi pressionado e executa a ação correspondente
        if (e.getSource() == cmdEntrada) {
            // rotina do depositar
            double valor = Double.parseDouble(txtValor.getText());
            boolean acaoOk = caixa.depositar(valor); // Chama o método depositar da classe Caixa
            if (acaoOk) {
                txtMsg.append("Deposito realizado com sucesso!\n");
            } else {
                txtMsg.append("Valor inválido para depósito!\n");
                return;
            }
            txtValor.setText(""); // Limpa o campo de valor após o depósito
            txtSaldo.setText(""); // Limpa o campo de saldo após o depósito
            txtValor.requestFocus();
            mostrarCaixaDeDialogo("Depósito de " + valor + " realizado com sucesso!");
            return;
        }
        if (e.getSource() == cmdRetirada) {
            // rotina do sacar
            double valor = Double.parseDouble(txtValor.getText());
            boolean acaoOk = caixa.sacar(valor); // Chama o método sacar da classe Caixa
            if (acaoOk) {
                txtMsg.append("Saque realizado com sucesso!\n");
            } else {
                txtMsg.append("Sem saldo disponível para o saque!\n");
                return;
            }
            txtValor.setText(""); // Limpa o campo de valor após o saque
            txtSaldo.setText(""); // Limpa o campo de saldo após o saque
            txtValor.requestFocus();
            mostrarCaixaDeDialogo("Saque de " + valor + " realizado com sucesso!");
            return;
        }
        if (e.getSource() == cmdConsulta) {
            // rotina do consultar
            String strSaldo = String.valueOf(caixa.getSaldo());
            txtSaldo.setText(strSaldo); // Atualiza o campo de saldo com o valor atual
            txtMsg.append("Consulta realizada com sucesso!\n");
            mostrarCaixaDeDialogo("Saldo atual R$ " + strSaldo);
            return;
        }
        if (e.getSource() == cmdSair) {
            // rotina do sair
            System.exit(0); // encerra o programa
        }
    }

    private void mostrarCaixaDeDialogo(String mensagem) {
        // Método para mostrar uma caixa de diálogo com a mensagem
        JOptionPane.showMessageDialog(null,
                mensagem, "Mensagem", JOptionPane.INFORMATION_MESSAGE);
    }
}