package vue;

import java.awt.Graphics;
import modele.Tortue;

public class Carre implements Forme {

    @Override
    public void drawForme(Graphics g, Tortue tortue) {
        g.setColor(TortueDessin.decodeColor(tortue.getColInt()));
        g.drawRect(tortue.getX(), tortue.getY(),10,10);
    }   
}