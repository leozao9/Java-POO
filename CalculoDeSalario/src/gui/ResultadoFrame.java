package gui;

import java.awt.*;
import javax.swing.*;

public class ResultadoFrame extends JFrame {

    private JLabel nomeValorLabel, acrescimoValorLabel, salarioFinalValorLabel;

    public ResultadoFrame() {
        super("Resultado");
        setLayout(null);
        setResizable(false);
        setMaximizedBounds(null);

        Dimension labelResultadoSize = new Dimension(150, 25);

        JLabel nomeLabelResultado = new JLabel("Nome:");
        nomeLabelResultado.setBounds(20, 20, labelResultadoSize.width, labelResultadoSize.height);
        add(nomeLabelResultado);

        nomeValorLabel = new JLabel();
        nomeValorLabel.setBounds(180, 20, 150, labelResultadoSize.height);
        add(nomeValorLabel);

        JLabel acrescimoLabelResultado = new JLabel("Acréscimo de salário:");
        acrescimoLabelResultado.setBounds(20, 60, labelResultadoSize.width, labelResultadoSize.height);
        add(acrescimoLabelResultado);

        acrescimoValorLabel = new JLabel();
        acrescimoValorLabel.setBounds(180, 60, 150, labelResultadoSize.height);
        add(acrescimoValorLabel);

        JLabel salarioFinalLabelResultado = new JLabel("Salário final:");
        salarioFinalLabelResultado.setBounds(20, 100, labelResultadoSize.width, labelResultadoSize.height);
        add(salarioFinalLabelResultado);

        salarioFinalValorLabel = new JLabel();
        salarioFinalValorLabel.setBounds(180, 100, 150, labelResultadoSize.height);
        add(salarioFinalValorLabel);

        Dimension resultadoFrameSize = new Dimension(350, 180);
        setSize(resultadoFrameSize);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void exibirResultados(String nome, double acrescimo, double salarioFinal) {
        nomeValorLabel.setText(nome);
        acrescimoValorLabel.setText(String.format("R$ %.2f", acrescimo));
        salarioFinalValorLabel.setText(String.format("R$ %.2f", salarioFinal));
        setVisible(true);
    }
}