package test;
public class Auto{
    String modelo;
    int precio;
    Asiento[] asiento;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    public int cantidadAsientos(){
        count=0;
        for(int i=0; i < this.asiento.length(); i++){
            if(this.asiento[i]!=null){
                count++;
            }
        }
        return count;
    }

    public String verificarIntegridad(){
        if(this.registro!=this.motor.registro){
            return "Las piezas no son originales";
        }
        for(i=0; i<this.asiento.length; i++){
            if(this.asiento[i]!=null){
                if(this.asiento.registro!=this.registro){
                    return "Las piezas no son originales";
                }
            }
        }
        return "Auto original";
    }
}