package dev;

import java.util.ResourceBundle;


import com.github.lalyos.jfiglet.FigletFont;
public class App 
{
    public static void main( String[] args )
    {
    	try {
    		String titre = ResourceBundle.getBundle("application").getString("titre");
    		String asciiArt = FigletFont.convertOneLine(titre);
    		System.out.println(asciiArt);
    		String titre2 = ResourceBundle.getBundle("application").getString("environnement");
    		System.out.println("environnement" + titre2);
    	}catch(Exception e){
    		System.err.println(e.getMessage());
    	}
       
    }
}
