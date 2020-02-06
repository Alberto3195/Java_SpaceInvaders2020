/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Alberto
 */
public class Marciano {

    public Image imagen1 = null;
    public Image imagen2 = null;
    private int anchoPantalla;
    public int vida = 50;

    public Marciano(int _anchoPantalla) {
        anchoPantalla = _anchoPantalla;
        try {//Siempre que se hace una lectura con algo que hay en el disco, se 
            //ejecuta un try, catch, esto hace que proteja lo que se encuentra
            //en el disco.
            imagen1 = ImageIO.read(getClass().getResource("/imagenes/marcianito1.png"));
            imagen2 = ImageIO.read(getClass().getResource("/imagenes/marcianito2.png"));
        } //En caso de no poner IO en el catch se transforma en un Exception generico
        //con errores genericos
        catch (Exception e) {

        }
    }
}
