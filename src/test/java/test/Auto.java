package test;
public class Auto{
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    public int cantidadAsientos(){
        int count=0;
        for(int i=0; i < this.asientos.length; i++){
            if(this.asientos[i]!=null){
                count++;
            }
        }
        return count;
    }

    public String verificarIntegridad(){
        if(this.registro!=this.motor.registro){
            return "Las piezas no son originales";
        }
        for(int i=0; i<this.asientos.length; i++){
            if(this.asientos[i]!=null){
                if(this.asientos[i].registro!=this.registro){
                    return "Las piezas no son originales";
                }
            }
        }
        return "Auto original";
    }
}