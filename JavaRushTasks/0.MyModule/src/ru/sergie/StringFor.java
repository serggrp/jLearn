package ru.sergie;

import java.text.ChoiceFormat;
import java.text.MessageFormat;
import java.util.Date;

public class StringFor {
    public static void main(String[] args) {
  /*      MessageFormat form = new MessageFormat("Я могу {1} {0}.");
        int count = 2;
        String exercise = "подтянуться";
        Object[] testArgs = {count, exercise};

        double[] filelimits = {0,2,5};
        String[] filepart = {"{0} раз","{0} раза","{0} раз"};
        ChoiceFormat fileform = new ChoiceFormat(filelimits, filepart);
        form.setFormatByArgumentIndex(0, fileform);

        System.out.println(form.format(testArgs));
*/
        MessageFormat mf = new MessageFormat("This is {0} point of {1} from {2}");
        Object[] arr = {"first", 1, 2, "TEST"};
        double[] pars = {1, 2};
        String[] svals = {"{3} again", "{3} secondly"};
        ChoiceFormat cf = new ChoiceFormat(pars, svals);
        mf.setFormatByArgumentIndex(1, cf);
        System.out.println(mf.format(arr));
    }
}
