package com.gmail.lenkahedz;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);
        while( true ) {
            model.setValue(inputIntValueWithScannerAndDiapason(sc));
            if (model.isOurNumber()){
                break;
            }
            continue ;
        }
        view.printMessage(View.OUR_INT + model.getValue());
        view.printMessage(View.OUR_ATTEMPTS + model.printArray());
    }

    public int inputIntValueWithScannerAndDiapason(Scanner sc) {
        int res=0;
        view.printMessage(view.INPUT_INT_DATA + model.getMinBarrier() + view.OUR_DELIMETER + model.getMaxBarrier());

        while( true ) {
            // check int - value
            while (!sc.hasNextInt()) {
                view.printMessage(view.WRONG_INPUT_DATA + view.INPUT_INT_DATA);
                sc.next();
            }
            // check value in diapason
            if ((res = sc.nextInt()) <= model.getMinBarrier() || res >= model.getMaxBarrier()) {
                view.printMessage(view.WRONG_RANGE_DATA + View.INPUT_INT_DATA + model.getMinBarrier() + view.OUR_DELIMETER + model.getMaxBarrier());
                continue ;
            }
            break;
        }
        return res;
    }

}
