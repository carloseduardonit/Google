/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.brqautomatize.google;

import com.brqautomatize.google.drive.Drive;
import com.brqautomatize.google.view.TelaPesquisador;
import java.time.Duration;
import javax.swing.JOptionPane;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author carlosfigueiredo
 */
public class Google {

    static WebDriver navegador;
    static WebElement pesquisar;

    public static void main(String[] args) {
        TelaPesquisador telaPesquisa = new TelaPesquisador();
        telaPesquisa.setVisible(true);

        System.out.println("Hello World!");
    }

    public static void getGoogle() {
        navegador = Drive.getDriver();
        navegador.get("https://www.google.com/");
        pesquisar = navegador.findElement(By.name("q"));
    }

    public static void pesquisarComum(String conteudo) {
        pesquisarConteudo(pesquisar, conteudo);
    }

    public static void pesquisarTermoExato(String conteudo) {
        pesquisarConteudo(pesquisar, "\"" + conteudo + "\"");
    }

    public static void pesquisarExcluirUmaPalavra(String conteudo, String apoio) {
        conteudo = conteudo +" -"+apoio;
        pesquisarConteudo(pesquisar, conteudo);
    }

    public static void pesquisarConteudo(WebElement elemento, String conteudo) {
        if (isActive()) {
            try {
                elemento.sendKeys(conteudo);
                //pause();
                elemento.sendKeys(Keys.ENTER);
                pause();
            } catch (Exception ex) {
                System.err.println(Google.class.getName() + " " + ex);
            } finally {
                Drive.fecharDriver();
            }
        }
    }

    @SuppressWarnings("WaitWhileNotSynced")
    public static void pause() throws InterruptedException {
        WebDriverWait tempo = new WebDriverWait(navegador, Duration.ofMinutes(2));
        navegador.wait(1000l);
    }

    public static boolean isActive() {
        return navegador != null;
    }

    public static void pesquisar(int opção, String conteudo, String apoio) {
        switch (opção) {
           
            case 1:
                getGoogle();
                pesquisarComum(conteudo);
                break;
            case 2:
                getGoogle();
                pesquisarTermoExato(conteudo);
                break;
            case 3:
                getGoogle();
                pesquisarExcluirUmaPalavra(conteudo, apoio);
                break;
            case 4:
                getGoogle();
                pesquisartermosNãolembra(conteudo);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Preencher o campo [Tipo de Pesquisa]");
        }

    }

    private static void pesquisartermosNãolembra(String conteudo) {
        pesquisarComum("*"+conteudo);
    }
}
