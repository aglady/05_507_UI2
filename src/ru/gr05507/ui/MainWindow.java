package ru.gr05507.ui;
import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private final JCheckBox check1;
    private final JCheckBox check2;
    private final ButtonGroup btng;
    private final JRadioButton r1;
    private final JRadioButton r2;
    private final JRadioButton r3;
    private final JButton btn1;
    private final JButton btn2;
    private final JButton btnExit;
    private final JPanel mainPanel;
    private final JPanel controlPanel;

    public MainWindow(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(600,400));
        setTitle("privet");

        btng = new ButtonGroup();
        check1 = new JCheckBox();
        check2 = new JCheckBox();
        r1 = new JRadioButton();
        r2 = new JRadioButton();
        r3 = new JRadioButton();
        btn1 = new JButton();
        btn2 = new JButton();
        btnExit = new JButton();
        mainPanel = new JPanel();
        controlPanel = new JPanel();

        btng.add(r1);
        btng.add(r2);
        btng.add(r3);

        mainPanel.setBackground(Color.CYAN);

        add(controlPanel, BorderLayout.SOUTH);
        add(mainPanel, BorderLayout.CENTER);

        check1.setText("Опция 1");
        check2.setText("Опция 2");
        r1.setText("Вариант 1");
        r2.setText("Вариант 2");
        r3.setText("Вариант 3");
        btn1.setText("Кнопка 1");
        btn2.setText("Кнопка 2");
        btnExit.setText("Выход");

        btnExit.addActionListener(e -> {
            dispose();
        });

        var gl = new GroupLayout(controlPanel);
        controlPanel.setLayout(gl);

        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addGap(8)
                .addGroup(gl.createParallelGroup()
                        .addComponent(check1)
                        .addComponent(check2)
                )
                .addGap(8)
                .addGroup(gl.createParallelGroup()
                        .addComponent(r1)
                        .addComponent(r2)
                        .addComponent(r3)
                )
                .addGap(8, 8, Short.MAX_VALUE)
                .addGroup(gl.createParallelGroup()
                        .addComponent(btn1)
                        .addComponent(btn2)
                )
                .addGap(8)
                .addComponent(btnExit)
                .addGap(8)
        );
        gl.setVerticalGroup(gl.createSequentialGroup()
                .addGap(8)
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addGroup(GroupLayout.Alignment.LEADING, gl.createSequentialGroup()
                                .addComponent(check1)
                                .addComponent(check2)
                        )
                        .addGroup(gl.createSequentialGroup()
                                .addComponent(r1)
                                .addComponent(r2)
                                .addComponent(r3)
                        )
                        .addGroup(gl.createSequentialGroup()
                                .addComponent(btn1)
                                .addGap(8)
                                .addComponent(btn2)
                        )
                        .addComponent(btnExit)
                )
                .addGap(8)
        );
        pack();

        setLocationRelativeTo(null);



    }
}
