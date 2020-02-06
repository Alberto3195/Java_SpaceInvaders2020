/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Image;
import javax.imageio.ImageIO;

/**
 *
 * @author Alberto Sanz
 */
public class Disparo {

    Image imagen = null;
    int posX = 0;
    int posY = 0;

    public Disparo() { //el constructor es el metodo de igual nombre que la clase
        //pero no devuelve nada por ello es public asecas
        try {//Siempre que se hace una lectura con algo que hay en el disco, se 
            //ejecuta un try, catch, esto hace que proteja lo que se encuentra
            //en el disco.
            imagen = ImageIO.read(getClass().getResource("/imagenes/disparo.png"));
        } //En caso de no poner IO en el catch se transforma en un Exception generico
        //con errores genericos
        catch (Exception e) {

        }
    }

    public void mueve() { //Chequea las variables que tiene internas
        posY--;
    }

    public void posDisp(Nave _nave) {
        posX = _nave.posX
                + _nave.imagen.getWidth(null) / 2
                - imagen.getWidth(null) / 2;
        posY = _nave.posY - _nave.imagen.getHeight(null) / 2;
    }
}
