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
public class Nave {

    Image imagen = null;
    int posX = 0;
    int posY = 0;
    private boolean derecha = false;
    private boolean izquierda = false;

    public Nave() { //el constructor es el metodo de igual nombre que la clase
        //pero no devuelve nada por ello es public asecas
        try {//Siempre que se hace una lectura con algo que hay en el disco, se 
            //ejecuta un try, catch, esto hace que proteja lo que se encuentra
            //en el disco.
            imagen = ImageIO.read(getClass().getResource("/imagenes/nave.png"));
        } //En caso de no poner IO en el catch se transforma en un Exception generico
        //con errores genericos
        catch (Exception e) {

        }
    }

    public void mueve() { //Chequea las variables que tiene internas
        if (izquierda && posX > 0) {
            posX -= 3;
        }
        if (derecha && posX < VentanaJuego.ANCHOPANTALLA - (imagen.getWidth(null) + (imagen.getWidth(null) / 2))) {
            posX += 3;
        }
    }

    public boolean isDerecha() {
        return derecha;
    }

    public void setDerecha(boolean derecha) {
        this.derecha = derecha;
        this.izquierda = false;
    }

    public boolean isIzquierda() {
        return izquierda;
    }

    public void setIzquierda(boolean izquierda) {
        this.izquierda = izquierda;
        this.derecha = false;
    }
}
