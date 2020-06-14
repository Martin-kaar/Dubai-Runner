package com.company;
import java.util.Timer;
import java.util.TimerTask;
public class ItemsKollision {
    Timer kollision;
    private int temp = 0;


    public ItemsKollision() {
        kollision = new Timer();
        kollision.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                for (int i = 0; i < 1; i++) {
                    if (temp == 0) {
                        if ((Var.px < Var.shoeX[i] + 75 && Var.px > Var.shoeX[i] || Var.px + 95 > Var.shoeX[i] && Var.px + 95 < Var.shoeX[i] + 75) && (Var.py > Var.shoeY[i] && Var.py < Var.shoeY[i] + 75 || Var.py + 145 > Var.shoeY[i] && Var.py + 145 < Var.shoeY[i] + 75) || (Var.py + 72 > Var.shoeY[i] && Var.py + 72 < Var.shoeY[i] + 75) && (Var.px < Var.shoeX[i] + 75 && Var.px > Var.shoeX[i] || Var.px + 95 > Var.shoeX[i] && Var.px + 95 < Var.shoeX[i] + 75)) {

                            Var.kollidiert = true;
                            if (i < 3) {

                                Var.shoeX[i] = Var.screenWidth + (int) (Math.random() * (100 - 1) + 1);
                            }
                            if(Var.kollidiert){
                                System.out.println("Wobbin");
                            }
                            temp++;

                        }
                    }
                }
                if (temp >= 1 && temp <= 65) {
                    temp++;
                } else if (temp == 66) {
                    temp = 0;
                }

            }
        }, 0, 5);
    }

}
