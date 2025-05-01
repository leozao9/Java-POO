package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.Calculadora;

public class TelaCalculadora extends JFrame implements ActionListener {
    private Dimension dFrame, dLabel, dTextField, dButton;
    private Label lblV1, lblV2, lblResult;
    private TextField txtV1, txtV2, txtResult;
    private Button cmdSomar, cmdSubtrair, cmdMultiplicar, cmdDividir;
    private Calculadora calculadora;

    public TelaCalculadora() {
        calculadora = new Calculadora();
        dFrame = new Dimension(350, 360);
        dLabel = new Dimension(80, 20);
        dTextField = new Dimension(150, 20);
        dButton = new Dimension(30, 30);

        setSize(dFrame);
        setTitle("Calculadora");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);

        lblV1 = new Label("Valor 1: ");
        lblV1.setSize(dLabel);
        lblV1.setLocation(25, 50);
        add(lblV1);

        lblV2 = new Label("Valor 2: ");
        lblV2.setSize(dLabel);
        lblV2.setLocation(25, 80);
        add(lblV2);

        lblResult = new Label("Resultado: ");
        lblResult.setSize(dLabel);
        lblResult.setLocation(25, 250);
        add(lblResult);

        txtV1 = new TextField(null);
        txtV1.setSize(dTextField);
        txtV1.setLocation(120, 50);
        add(txtV1);

        txtV2 = new TextField(null);
        txtV2.setSize(dTextField);
        txtV2.setLocation(120, 80);
        add(txtV2);

        txtResult = new TextField(null);
        txtResult.setSize(dTextField);
        txtResult.setLocation(120, 250);
        txtResult.setEnabled(false);
        add(txtResult);

        cmdSomar = new Button("+");
        cmdSomar.setSize(dButton);
        cmdSomar.setLocation(120, 110);
        cmdSomar.addActionListener(this);
        add(cmdSomar);

        cmdSubtrair = new Button("-");
        cmdSubtrair.setSize(dButton);
        cmdSubtrair.setLocation(160, 110);
        cmdSubtrair.addActionListener(this);
        add(cmdSubtrair);

        cmdMultiplicar = new Button("*");
        cmdMultiplicar.setSize(dButton);
        cmdMultiplicar.setLocation(200, 110);
        cmdMultiplicar.addActionListener(this);
        add(cmdMultiplicar);

        cmdDividir = new Button("/");
        cmdDividir.setSize(dButton);
        cmdDividir.setLocation(240, 110);
        cmdDividir.addActionListener(this);
        add(cmdDividir);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double vlr1 = Double.parseDouble(txtV1.getText());
        double vlr2 = Double.parseDouble(txtV2.getText());
        double result = 0;

        calculadora.setV1(vlr1);
        calculadora.setV2(vlr2);

        if (e.getSource() == cmdSomar) {
            calculadora.somar(vlr1, vlr2);
        } else if (e.getSource() == cmdSubtrair) {
            calculadora.subtrair(vlr1, vlr2);
        } else if (e.getSource() == cmdMultiplicar) {
            calculadora.multiplicar(vlr1, vlr2);
        } else if (e.getSource() == cmdDividir) {
            calculadora.dividir(vlr1, vlr2);
        }

        result = calculadora.getResult();
        txtResult.setText(String.valueOf(result));

        txtV1.setText("");
        txtV2.setText("");
        txtV1.requestFocus();
    }
}