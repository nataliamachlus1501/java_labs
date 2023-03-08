package lab_inheritance;

import lab_inheritance.ItalianBasic;

public class ItalianAdvanced extends ItalianBasic {
    static String[] numPL = {"jeden","dwa","trzy"};
    static String[] numIT = {"uno","due","tre"};

    public static String noTOpl(String nI){
        int size_numlist = numIT.length;
        for(int i=0;i<size_numlist;i++) {
            if (nI.equals(numIT[i])) {
                return numPL[i];
            }
        }
        return "There is no such number in the dictionary";
    }

    public static String noTOit(String nP){
            int size_numlist = numPL.length;
            for(int i=0;i<size_numlist;i++) {
                if (nP.equals(numPL[i])) {
                    return numIT[i];
                }
        }
        return "There is no such number in the dictionary";
    }
}

