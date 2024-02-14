package com.company.diamonds.logic;

import com.company.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    private String repeat(String str, int count) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < count; i++) {
            res.append(str);
        }
        return res.toString();
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {
//       TODO -- add your code here
        int a = 0;
        int count = 0;
        for (int i = 0; i < size * 2 + 1; i++) {
            String sym = i % 2 == 1 ? "=" : "-";
            if (i == 0 || i == size * 2) {
                mOut.println("+" + repeat("-", size*2) + "+");
            } else if (i == size) {
                mOut.println("|<" + repeat(sym, size * 2 - 2) + ">|");
                a += 2;
                count += 1;
            } else {
                String slash1 = i < size ? "/" : "\\";
                String slash2 = i < size ? "\\" : "/";
                a += i < size ? 2 : -2;
                count += i < size ? 1 : -1;
                mOut.println("|" + repeat(" ", size-count) + slash1 + repeat(sym, a -2) + slash2 + repeat(" ", size-count) + "|");
            }
        }
    }
}
