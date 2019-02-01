package chapter10;
public class MathHelper {
    public double Pi;
    public double PiOver2;
    public double PiOver4;
    public double TwoPi;
    public MathHelper(){
        this.Pi = 3.14D;
        this.PiOver2 = this.Pi / 2;
        this.PiOver4 = this.Pi / 4;
        this.TwoPi = this.Pi * 2;
    }
    public double max(double number1, double number2){
        if(number1 > number2){
            return number1;
        }
        else{
            return number2;
        }
    }
    public double min(double number1, double number2){
        if(number1 < number2){
            return number1;
        }
        else{
            return number2;
        }
    }
    public double toDegrees(double number1){
        return (number1 * 180) / this.Pi;
    }
    public double toRadians(double number1){
        return (number1 * this.Pi) / 180;
    }
}