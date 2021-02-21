package com.edu4java.swing.tutrial3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.util.Scanner;
import java.awt.event.ActionListener;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;



import java.net.URL;



import java.io.IOException ;

public class Main
{


    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Login");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel)
    {


        panel.setLayout(null);

        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 10, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 10, 160, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 40, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 40, 160, 25);
        panel.add(passwordText);

        JButton loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);

        JButton registerButton = new JButton("register");
        registerButton.setBounds(100, 80, 80, 25);
        panel.add(registerButton);

        JButton salirButton= new JButton("salir");
        salirButton.setBounds(190, 80, 80, 25);
        panel.add(salirButton);


        ActionListener loginButtonListener = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {

                ///   INICIO



                ///  FINAL

            }

        };
        registerButton.addActionListener(loginButtonListener);
    }

    public static String datos()
        { //Funcion para tomar datos
          Scanner sc =new Scanner (System.in);

                    String result ="";
                    System.out.println("Ingrese su cambio de contraseña");
                    result += "contraseña: " + sc.nextLine() + "\n";
                    System.out.println("Ingrese su Direccion");
                    result += "Direccion: " + sc.nextLine() + "\n";
                    System.out.println("Ingrese su Numero de telefono");
                    result += "contraseña: " + sc.nextLine() + "\n";
                    System.out.println("Ingrese su DNI Nacionalidad");
                    result += "Nacinalidad: " + sc.nextLine() + "\n";
                     System.out.println("Ingrese su Numero de pedido");
                     result += "Numero de pedido: " + sc.nextLine() + "\n";

                     return result;


        }

    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root= FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Menu Inicio");
        stage.show();

    }



}