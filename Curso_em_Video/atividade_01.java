package Curso_em_Video;

import java.util.Date;
import java.util.Locale;
import java.awt.Toolkit;
import java.awt.Dimension;

public class atividade_01 {

    public static void main(String[] args) {
        
        Date relogio = new Date(); // NEW PARA NOVO OBJETO
        System.out.println("A hora do sistema é ");
        System.out.println(relogio.toString());

        Locale loc = Locale.getDefault();
        System.out.println("O idioma do sistema é ");
        System.out.println(loc.getDisplayLanguage()); // IMPRIME O IDIOMA

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução do seu sistema é: " + d.width +" X " + d.height);
    }
}