/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package raniel;

/**
 *
 * @author largo
 */
public class Raniel extends OhmsLawCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public Double res(String a,String b ){
      double voltage = Double.parseDouble(a);//voltageText
                double current = Double.parseDouble(b);//currentText
                double resistance = voltage / current;
    return resistance;
    }
    
    public Double cur(String a,String b){
    double voltage = Double.parseDouble(a);
                double resistance = Double.parseDouble(b);
                double current = voltage / resistance;
    return current;}
    public Double volt(String a, String b){
     double current = Double.parseDouble(a);
                double resistance = Double.parseDouble(b);
                double voltage = current * resistance;
    return voltage;}
}
