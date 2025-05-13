package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceGrafica extends JFrame implements ActionListener {

    private JTextField matriculaField, nomeField, salarioField;
    private JRadioButton horistaButton, mensalistaButton, grupoCriticoButton, grupoEspecialButton;
    private JLabel matriculaLabel, nomeLabel, salarioLabel, contratoLabel, grupoLabel;
    private JButton calcularButton;

    public InterfaceGrafica() {
        super("Folha de Pagamento");
        setLayout(null);
        setResizable(false);
        setMaximizedBounds(null);

        Dimension labelSize = new Dimension(150, 25);
        Dimension textFieldSize = new Dimension(250, 25);
        Dimension radioButtonSize = new Dimension(120, 25);
        Dimension buttonSize = new Dimension(120, 30);
        Dimension panelSize = new Dimension(260, 30);

        matriculaLabel = new JLabel("Matrícula do funcionário:");
        matriculaLabel.setBounds(30, 30, labelSize.width, labelSize.height);
        add(matriculaLabel);

        nomeLabel = new JLabel("Nome completo:");
        nomeLabel.setBounds(30, 70, labelSize.width, labelSize.height);
        add(nomeLabel);

        contratoLabel = new JLabel("Tipo de contrato:");
        contratoLabel.setBounds(30, 110, labelSize.width, labelSize.height);
        add(contratoLabel);

        salarioLabel = new JLabel("Salário R$:");
        salarioLabel.setBounds(30, 150, labelSize.width, labelSize.height);
        add(salarioLabel);

        grupoLabel = new JLabel("Grupo de trabalho:");
        grupoLabel.setBounds(30, 190, labelSize.width, labelSize.height);
        add(grupoLabel);

        matriculaField = new JTextField();
        matriculaField.setBounds(190, 30, textFieldSize.width, textFieldSize.height);
        add(matriculaField);

        nomeField = new JTextField();
        nomeField.setBounds(190, 70, textFieldSize.width, textFieldSize.height);
        add(nomeField);

        salarioField = new JTextField();
        salarioField.setBounds(190, 150, textFieldSize.width, textFieldSize.height);
        add(salarioField);

        JPanel contratoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        contratoPanel.setBounds(190, 110, panelSize.width, panelSize.height);
        horistaButton = new JRadioButton("Horista");
        mensalistaButton = new JRadioButton("Mensalista");
        ButtonGroup contratoButtonGroup = new ButtonGroup();
        contratoButtonGroup.add(horistaButton);
        contratoButtonGroup.add(mensalistaButton);
        contratoPanel.add(horistaButton);
        contratoPanel.add(mensalistaButton);
        add(contratoPanel);

        JPanel grupoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        grupoPanel.setBounds(190, 190, panelSize.width, panelSize.height);
        grupoCriticoButton = new JRadioButton("Grupo Crítico");
        grupoEspecialButton = new JRadioButton("Grupo Especial");
        ButtonGroup grupoButtonGroup = new ButtonGroup();
        grupoButtonGroup.add(grupoCriticoButton);
        grupoButtonGroup.add(grupoEspecialButton);
        grupoPanel.add(grupoCriticoButton);
        grupoPanel.add(grupoEspecialButton);
        add(grupoPanel);

        calcularButton = new JButton("Calcular");
        calcularButton.setBounds(250, 250, buttonSize.width, buttonSize.height); // Movi um pouco para a direita
        calcularButton.addActionListener(this);
        calcularButton.setBackground(Color.WHITE); // Define o fundo branco
        add(calcularButton);

        Dimension frameSize = new Dimension(500, 350);
        setSize(frameSize);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - frameSize.width) / 2;
        int y = (screenSize.height - frameSize.height) / 2;
        setLocation(x, y);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void exibirResultado() {
        String nome = nomeField.getText();
        double salarioBase = 0;
        try {
            salarioBase = Double.parseDouble(salarioField.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um valor numérico válido para o salário.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double acrescimo = 0;
        if (grupoCriticoButton.isSelected()) {
            acrescimo = salarioBase * 0.10;
        } else if (grupoEspecialButton.isSelected()) {
            acrescimo = salarioBase * 0.13;
        }

        double salarioFinal = salarioBase + acrescimo;

        JFrame resultadoFrame = new JFrame("Resultado");
        resultadoFrame.setLayout(null);
        resultadoFrame.setResizable(false);
        resultadoFrame.setMaximizedBounds(null);

        Dimension labelResultadoSize = new Dimension(150, 25);

        JLabel nomeLabelResultado = new JLabel("Nome:");
        nomeLabelResultado.setBounds(20, 20, labelResultadoSize.width, labelResultadoSize.height);
        resultadoFrame.add(nomeLabelResultado);

        JLabel nomeValorLabel = new JLabel(nome);
        nomeValorLabel.setBounds(180, 20, 150, labelResultadoSize.height);
        resultadoFrame.add(nomeValorLabel);

        JLabel acrescimoLabelResultado = new JLabel("Acréscimo de salário:");
        acrescimoLabelResultado.setBounds(20, 60, labelResultadoSize.width, labelResultadoSize.height);
        resultadoFrame.add(acrescimoLabelResultado);

        JLabel acrescimoValorLabel = new JLabel(String.format("R$ %.2f", acrescimo));
        acrescimoValorLabel.setBounds(180, 60, 150, labelResultadoSize.height);
        resultadoFrame.add(acrescimoValorLabel);

        JLabel salarioFinalLabelResultado = new JLabel("Salário final:");
        salarioFinalLabelResultado.setBounds(20, 100, labelResultadoSize.width, labelResultadoSize.height);
        resultadoFrame.add(salarioFinalLabelResultado);

        JLabel salarioFinalValorLabel = new JLabel(String.format("R$ %.2f", salarioFinal));
        salarioFinalValorLabel.setBounds(180, 100, 150, labelResultadoSize.height);
        resultadoFrame.add(salarioFinalValorLabel);

        Dimension resultadoFrameSize = new Dimension(350, 180);
        resultadoFrame.setSize(resultadoFrameSize);
        resultadoFrame.setLocationRelativeTo(this);
        resultadoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        resultadoFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calcularButton) {
            exibirResultado();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new InterfaceGrafica();
            }
        });
    }
}
