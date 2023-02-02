/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.brqautomatize.google.drive;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 *
 * @author carlosfigueiredo
 */
public abstract class Drive {

    public static WebDriver getDriverChorme() {
        ChromeDriver chrome = new ChromeDriver();
        return chrome;
    }

    public static WebDriver getDriver() {
        int resposta = 0;
        do {
            String escolherOpçãovalida = """
                                     Escolhar uma op\u00e7\u00e3o:
                                     Digite 1: Para  acessar com Chrome
                                     Digite 2: Para  acessar com Edge
                                     Digite 3: Para  acessar com Firefox
                                     Digite 4: Para  acessar com Internet Explorer""", respostaString;
            respostaString = JOptionPane.showInputDialog(null, escolherOpçãovalida, "Lista de Navegador", 1);
            if (!respostaString.isBlank()) {
                resposta = Integer.parseInt(respostaString);
            }
        } while (resposta == 0);
        return getDriver(resposta);
    }

    public static WebDriver getDriver(int opção) {
        WebDriver web = null;
        switch (opção) {
            case 1 -> {
                JOptionPane.showInternalMessageDialog(null, "Voce escoheu Chrome!!!");
                web = new ChromeDriver();
                return web;
            }
            case 2 -> {
                JOptionPane.showInternalMessageDialog(null, "Voce escoheu Edge!!!");
                web = new EdgeDriver();
                return web;
            }
            case 3 -> {
                JOptionPane.showInternalMessageDialog(null, "Voce escoheu Firefox!!!");
                web = new FirefoxDriver();
                return web;
            }
            case 4 -> {
                JOptionPane.showInternalMessageDialog(null, "Voce escoheu Internet Explorer!!!");
                web = new InternetExplorerDriver();
                return web;
            }

            default -> {
                int resposta = 0;
                do {
                    try {
                        String escolherOpçãovalida = """
                                                     Escolhar uma op\u00e7\u00e3o valida:
                                                     Digite 1: Para  acessar com Chrome
                                                     Digite 2: Para  acessar com Edge
                                                     Digite 3: Para  acessar com Firefox
                                                     Digite 4: Para  acessar com Internet Explorer""", respostaString;
                        respostaString = JOptionPane.showInputDialog(null, escolherOpçãovalida, "Erro", 0);
                        if (!respostaString.isBlank()) {
                            resposta = Integer.parseInt(respostaString);
                        }
                        System.out.println(resposta);
                        web = getDriver(resposta);
                        return web;
                    } catch (HeadlessException | NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                        return web;
                    }
                } while (web == null);
            }
        }
    }
}
