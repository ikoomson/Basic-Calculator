package notePadPlus;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Calculator extends JFrame {

    static double firstNum;
    static double secondNum;
    static double numericResult;
    static String operator;


    public static void main(String args[]) {
        JFrame calcFrame = new JFrame("Calculator");
        calcFrame.setTitle("Calculator");
        calcFrame.setSize(340, 400);
        calcFrame.setResizable(false);

        JPanel calcPanel = new JPanel(new BorderLayout(5, 5));
        calcPanel.setBorder(new EmptyBorder(4, 4, 4, 4));

        JPanel calcButtonPanel = new JPanel(new GridLayout(6, 6));

        JTextField result = new JTextField();
        result.setHorizontalAlignment(SwingConstants.RIGHT);
        result.setEditable(false);

        calcPanel.add(result, BorderLayout.NORTH);

        JButton numOne = new JButton("1");
        JButton numTwo = new JButton("2");
        JButton numThree = new JButton("3");
        JButton numFour = new JButton("4");
        JButton numFive = new JButton("5");
        JButton numSix = new JButton("6");
        JButton numSeven = new JButton("7");
        JButton numEight = new JButton("8");
        JButton numNine = new JButton("9");
        JButton numZero = new JButton("0");

        JButton clearResult = new JButton("Clear");
        JButton addNum = new JButton("+");
        JButton minusNum = new JButton("-");
        JButton multiplyNum = new JButton("*");
        JButton divideNum = new JButton("/");
        JButton equals = new JButton("=");
        JButton decimal = new JButton(".");
        JButton plusMinus = new JButton("\u00B1");

        calcButtonPanel.add(numOne);
        calcButtonPanel.add(numTwo);
        calcButtonPanel.add(numThree);
        calcButtonPanel.add(numFour);
        calcButtonPanel.add(numFive);
        calcButtonPanel.add(numSix);
        calcButtonPanel.add(numSeven);
        calcButtonPanel.add(numEight);
        calcButtonPanel.add(numNine);
        calcButtonPanel.add(numZero);
        calcButtonPanel.add(addNum);
        calcButtonPanel.add(minusNum);
        calcButtonPanel.add(multiplyNum);
        calcButtonPanel.add(divideNum);
        calcButtonPanel.add(equals);
        calcButtonPanel.add(plusMinus);
        calcButtonPanel.add(decimal);
        calcButtonPanel.add(clearResult);

        numOne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "1");
            }
        });

        numTwo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "2");
            }
        });

        numThree.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "3");
            }
        });

        numFour.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "4");
            }
        });

        numFive.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "5");
            }
        });

        numSix.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "6");
            }
        });

        numSeven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "7");
            }
        });

        numEight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "8");
            }
        });

        numNine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "9");

            }
        });

        numZero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText(result.getText() + "0");
            }
        });

        addNum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstNum = Double.parseDouble(result.getText());
                result.setText(" ");
                operator = "+";
            }

        });

        minusNum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstNum = Double.parseDouble(result.getText());
                result.setText(" ");
                operator = "-";
            }

        });

        divideNum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstNum = Double.parseDouble(result.getText());
                result.setText(" ");
                operator = "/";
            }

        });

        multiplyNum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstNum = Double.parseDouble(result.getText());
                result.setText(" ");
                operator = "*";
            }

        });

        plusMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double value = Double.parseDouble(String.valueOf(result.getText()));
                value = value * (-1);
                result.setText(String.valueOf(value));
            }

        });

        decimal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!result.getText().contains(".")) {
                    result.setText(result.getText() + decimal.getText());
                }

            }

        });

        equals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String finalResult;
                secondNum = Double.parseDouble(result.getText());

                if (operator == "+") {
                    numericResult = firstNum + secondNum;
                    finalResult = String.format("%.2f", numericResult);
                    result.setText(finalResult);
                } else if (operator == "-") {
                    numericResult = firstNum - secondNum;
                    finalResult = String.format("%.2f", numericResult);
                    result.setText(finalResult);
                } else if (operator == "*") {
                    numericResult = firstNum * secondNum;

                    finalResult = String.format("%.2f", numericResult);

                    if (firstNum == 0 || secondNum == 0 && finalResult.contains("-")) {
                        String newFinalResult = finalResult.replace("-", " ");
                        result.setText(newFinalResult);
                    } else {
                        result.setText(finalResult);
                    }
                } else if (operator == "/") {
                    numericResult = firstNum / secondNum;
                    finalResult = String.format("%.2f", numericResult);
                    result.setText(finalResult);
                }

            }
        });

        clearResult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result.setText(" ");

            }
        });

        calcPanel.add(calcButtonPanel, BorderLayout.CENTER);
        calcFrame.getContentPane().add(calcPanel);
        calcFrame.setVisible(true);


    }
}
