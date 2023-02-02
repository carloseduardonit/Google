/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.brqautomatize.google;

import com.brqautomatize.google.drive.Drive;
import java.time.Duration;
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

    static WebDriver navegador = Drive.getDriver();
    static WebElement pesquisar;

    public static void main(String[] args) {
        navegador.get("https://www.google.com/");
        pesquisar = navegador.findElement(By.name("q"));
        pesquisarConteudo(pesquisar, "Carlos eduardo dos Santos Figueiredo");
        System.out.println("Hello World!");
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
                //navegador.quit();
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
}
