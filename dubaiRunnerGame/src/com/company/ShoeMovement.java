package com.company;
import java.util.Timer;
import java.util.TimerTask;
public class ShoeMovement {
    Timer movement, position;
    private int temp = 0;
    private boolean check =false;

    public ShoeMovement() {


        //rechts
        Var.shoeX[0] = Var.screenWidth + (int) (Math.random() * (100 - 1) + 1);
        Var.shoeY[0] = (int) (Math.random() * ((750) - 600) + 600);



        if (!check && (Var.score/10) > 500 && (Var.score/10) <= 1000) {
            for (int i = 0; i < 1; i++) {
                Var.shoeSpeed[i]++;
            }
            this.check = true;


        }

        if (check && (Var.score/10) > 1000 && (Var.score/10) <= 1500) {
            for (int i = 0; i < 1; i++) {
                Var.shoeSpeed[i]++;
            }
            this.check = false;


        }

        if (!check && (Var.score/10) > 1500 && (Var.score/10) <= 2000) {
            for (int i = 0; i < 1; i++) {
                Var.shoeSpeed[i]++;
            }
            this.check = true;


        }

        if (check && (Var.score/10) > 2000) {
            for (int i = 0; i < 1; i++) {
                Var.shoeSpeed[i]++;
            }
            this.check = false;


        }





        movement = new Timer();
        movement.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                for (int i = 0; i < 1; i++) {
                    Var.blick = true;
                    Var.shoeX[i] -= Var.shoeSpeed[i];
                    if (Var.shoeX[i] < 0) {

                        if (i == 0){
                            Var.shoeX[i] = Var.screenWidth + (int) (Math.random() * (100 - 1) + 1);
                            Var.shoeY[i] = (int) (Math.random() * ((750) - 600) + 600);
                        }else if (i == 2){
                            Var.shoeX[i] = Var.screenWidth + (int) (Math.random() * (100 - 1) + 1);
                            Var.shoeY[i] = (int) (Math.random() * ((599) - 300) + 300);
                        }else {
                            Var.shoeX[i] = Var.screenWidth + (int) (Math.random() * (100 - 1) + 1);
                            Var.shoeY[i] = (int) (Math.random() * ((299) - 0) + 0);
                        }


                    }
                }


            }
        }, 0, 9);


    }
}
