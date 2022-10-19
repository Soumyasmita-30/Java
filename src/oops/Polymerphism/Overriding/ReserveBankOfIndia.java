package oops.Polymerphism.Overriding;

import oops.Inheritance.MultiLevel.A;

public class ReserveBankOfIndia {
    int rateOfInterest(){
        return 5 ;
    }
}
class HDFC extends ReserveBankOfIndia{
    @Override
    int rateOfInterest() {
        return 6;
    }
}
class HSBC extends ReserveBankOfIndia{
    @Override
    int rateOfInterest() {
        return 7 ;
    }
}
class Axis extends ReserveBankOfIndia{
    @Override
    int rateOfInterest() {
        return 8;
    }
}
class Banking{
    public static void main(String[] args) {
        HDFC hdfc = new HDFC();
        HSBC hsbc = new HSBC();
        Axis axis = new Axis() ;
        System.out.println("The ROI of HDFC : " +hdfc.rateOfInterest());
        System.out.println("The ROI of HSBC : " +hsbc.rateOfInterest());
        System.out.println("The ROI of AXIS : " +axis.rateOfInterest());
    }
}
