/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryexample;

import java.io.IOException;

/**
 *
 * @author Dmitry
 */
public class FactoryExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Frame frame = new Frame();
        frame.setVisible(true);
        DataManipulator DM = new DataManipulator();
        DM.initialize();
        DM.generateData();
        int a = 1;
    }
    
}
