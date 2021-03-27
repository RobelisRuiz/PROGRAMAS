package Calculos;

import java.awt.Container;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.ActionListener;

public class Calculos extends JFrame implements ActionListener {

    private JTextField numero1,numero2,resultado;
    JLabel dato1,dato2;
    private JButton suma,resta,multiplicacion,division,borrar,salir;

    public void control(){

        Container x = getContentPane();
        x.setLayout( new FlowLayout());
        dato1 = new JLabel("Numero 1");
        x.add(dato1);
        numero1 = new JTextField(10);
        x.add(numero1);
        dato2 = new JLabel("Numero 2");
        x.add(dato2);
        numero2 = new JTextField(9);
        x.add(numero2);
        suma = new JButton("+");
        x.add(suma);
        suma.addActionListener(this);
        resta = new JButton("-");
        x.add(resta);
        resta.addActionListener(this);
        multiplicacion = new JButton("*");
        x.add(multiplicacion);
        multiplicacion.addActionListener(this);
        division = new JButton("/");
        division.addActionListener(this);
        x.add(division);

        resultado = new JTextField(9);
        x.add(resultado);
        borrar = new JButton("Borrar");
        x.add(borrar);
        borrar.setBackground(Color.red);
        borrar.addActionListener(this);
        salir=new JButton("Salir");
        salir.setBackground(Color.yellow);
        x.add(salir);
        salir.addActionListener(this);
    }

    //Constructor
    public Calculos(){

        super("Calculadora SUPER ROBELIS RUIZ");//Título de calculadora
        control();
        setSize(380,200);//tamaño de la calculadora
        setLocationRelativeTo(null);//Centrar ventana
        setVisible(true);
    }
    //Método main
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        Calculos calc = new Calculos();//Instanciamos la clase que creamos
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cerrar ventana
    }
    @Override
    //operaciones(funciones) de mi calculadora
    public void actionPerformed(ActionEvent e) {
        double  num1,num2,resu;
        String Resultado;
        if (e.getSource()==suma) {
            if(numero1.getText().equals("") || numero2.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Los datos no están completos",
                        "Error",JOptionPane.WARNING_MESSAGE);
            }
            else{
                num1=Double.parseDouble(numero1.getText());
                num2=Double.parseDouble(numero2.getText());
                resu=num1+num2;
                Resultado=String.valueOf(resu);
                resultado.setText(Resultado);
            }
        }
        if (e.getSource()==resta) {
            if(numero1.getText().equals("") || numero2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Los datos no están completos",
                        "Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                num1=Double.parseDouble(numero1.getText());
                num2=Double.parseDouble(numero2.getText());
                resu=num1-num2;
                Resultado=String.valueOf(resu);
                resultado.setText(Resultado);
            }
        }
        if (e.getSource()==multiplicacion) {
            if(numero1.getText().equals("") || numero2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Los datos no están completos",
                        "Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                num1=Double.parseDouble(numero1.getText());
                num2=Double.parseDouble(numero2.getText());
                resu=num1*num2;
                Resultado=String.valueOf(resu);
                resultado.setText(Resultado);
            }
        }
        if (e.getSource()==division) {
            if(numero1.getText().equals("") || numero2.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Los datos no están completos",
                        "Error",JOptionPane.ERROR_MESSAGE);
            }

            else{
                num1=Double.parseDouble(numero1.getText());
                num2=Double.parseDouble(numero2.getText());
                try{
                    resu=num1/num2;
                    Resultado=String.valueOf(resu);
                    resultado.setText(Resultado);
                }
                catch(ArithmeticException ex){
                    JOptionPane.showMessageDialog(null, "División entre cero NO PERMITIDA!",
                            "Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        if (e.getSource()==borrar){
            numero1.setText("");
            numero2.setText("");
            resultado.setText("");
        }
        if(e.getSource()==salir)
        {
            System.exit(0);
        }
    }
}

