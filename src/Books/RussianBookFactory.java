/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Books;

/**
 *
 * @author Dmitry
 */
public class RussianBookFactory implements BookFactory{

    @Override
    public Textbook createTextbook() {
        return new RussianTextbook();
    }

    @Override
    public Fiction createFiction() {
        return new RussianFiction();
    }
    
}
