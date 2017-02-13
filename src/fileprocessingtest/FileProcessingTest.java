/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileprocessingtest;

/**
 *
 * @author Mihir
 */
public class FileProcessingTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        WrtieTextFile appWrite = new WrtieTextFile();
//        
//        appWrite.openFile();
//        appWrite.addRecords();
//        appWrite.closeFile();
        
        
        ReadTextFile appRead = new ReadTextFile();
        
        appRead.openFile();
        appRead.readRecords();
        appRead.closeFile();
    }
    
}
