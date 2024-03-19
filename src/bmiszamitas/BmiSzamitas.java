package bmiszamitas;

import java.util.Scanner;

public class BmiSzamitas {

        static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {
        bmiFeladat();
    }

    private static void bmiFeladat() {
        kiir("BMI kiszámítása");
        int m = beker("Test magasság",100,200);
        int t = beker("Test tömeg:",40,150);
        double bmi = bmiSzamit(t,m);
        ertekeles(bmi);
    }

    private static void kiir(String bmi_kiszámítása) {
        System.out.println("Ön");
    }

    private static int beker(String kerdes,int also,int felso) {
            kiir(kerdes);
            int adat = 0;
            
            
            return adat;
        
    }

    private static double bmiSzamit(int t, int m) {
        return t/Math.pow(m/100.0,2);
    }

    private static void ertekeles(double bmi) {
        
    }
    
}
