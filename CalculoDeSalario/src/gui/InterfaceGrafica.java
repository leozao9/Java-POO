package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import model.CalculadoraSalario;

public class InterfaceGrafica extends JFrame implements ActionListener {

    private JTextField matriculaField, nomeField, salarioField;
    private JRadioButton horistaButton, mensalistaButton, grupoCriticoButton, grupoEspecialButton;
    private JLabel matriculaLabel, nomeLabel, salarioLabel, contratoLabel, grupoLabel;
    private JButton calcularButton;
    private ResultadoFrame resultadoFrame;
    private CalculadoraSalario calculadoraSalario;

    public InterfaceGrafica() {
        super("Folha de Pagamento");
        setLayout(null);
        setResizable(false);
        setMaximizedBounds(null);

        calculadoraSalario = new CalculadoraSalario();
        resultadoFrame = new ResultadoFrame();

        Dimension labelSize = new Dimension(150, 25);
        Dimension textFieldSize = new Dimension(300, 25);
        Dimension buttonSize = new Dimension(300, 30);
        Dimension panelSize = new Dimension(260, 30);

        matriculaLabel = new JLabel("Matrícula do funcionário:");
        matriculaLabel.setBounds(20, 20, labelSize.width, labelSize.height);
        add(matriculaLabel);

        nomeLabel = new JLabel("Nome completo:");
        nomeLabel.setBounds(20, 60, labelSize.width, labelSize.height);
        add(nomeLabel);

        contratoLabel = new JLabel("Tipo de contrato:");
        contratoLabel.setBounds(20, 100, labelSize.width, labelSize.height);
        add(contratoLabel);

        salarioLabel = new JLabel("Salário R$:");
        salarioLabel.setBounds(20, 140, labelSize.width, labelSize.height);
        add(salarioLabel);

        grupoLabel = new JLabel("Grupo de trabalho:");
        grupoLabel.setBounds(20, 180, labelSize.width, labelSize.height);
        add(grupoLabel);

        matriculaField = new JTextField();
        matriculaField.setBounds(320, 20, textFieldSize.width, textFieldSize.height);
        add(matriculaField);

        nomeField = new JTextField();
        nomeField.setBounds(320, 60, textFieldSize.width, textFieldSize.height);
        add(nomeField);

        salarioField = new JTextField();
        salarioField.setBounds(320, 140, textFieldSize.width, textFieldSize.height);
        add(salarioField);

        ButtonGroup contratoButtonGroup = new ButtonGroup();
        JPanel contratoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        contratoPanel.setBounds(320, 100, panelSize.width, panelSize.height);
        horistaButton = new JRadioButton("Horista");
        contratoButtonGroup.add(horistaButton);
        contratoPanel.add(horistaButton);

        mensalistaButton = new JRadioButton("Mensalista");
        contratoButtonGroup.add(mensalistaButton);
        contratoPanel.add(mensalistaButton);
        add(contratoPanel);

        ButtonGroup grupoButtonGroup = new ButtonGroup();
        JPanel grupoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        grupoPanel.setBounds(320, 180, panelSize.width, panelSize.height);
        grupoCriticoButton = new JRadioButton("Grupo Crítico");
        grupoButtonGroup.add(grupoCriticoButton);
        grupoPanel.add(grupoCriticoButton);

        grupoEspecialButton = new JRadioButton("Grupo Especial");
        grupoButtonGroup.add(grupoEspecialButton);
        grupoPanel.add(grupoEspecialButton);
        add(grupoPanel);

        calcularButton = new JButton("Calcular");
        calcularButton.setBounds(320, 240, buttonSize.width, buttonSize.height);
        calcularButton.addActionListener(this);
        calcularButton.setBackground(Color.WHITE);
        add(calcularButton);

        Dimension frameSize = new Dimension(650, 330);
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

        double acrescimo = calculadoraSalario.calcularAcrescimo(salarioBase, grupoCriticoButton.isSelected(), grupoEspecialButton.isSelected());
        double salarioFinal = calculadoraSalario.calcularSalarioFinal(salarioBase, acrescimo);

        resultadoFrame.exibirResultados(nome, acrescimo, salarioFinal);
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