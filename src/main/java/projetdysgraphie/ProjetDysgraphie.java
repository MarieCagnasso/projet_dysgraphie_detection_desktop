package projetdysgraphie;

import projetdysgraphie.views.PagePremiere;

import java.io.IOException;

public class ProjetDysgraphie {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException, Exception {
        PagePremiere p = new PagePremiere();
        p.setVisible(true);
    }
    
}
