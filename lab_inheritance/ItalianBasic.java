package lab_inheritance;

public class ItalianBasic {

    static String[] basicPL = {"cześć","dziękuję","tak","nie"};
    static String[] basicIT = {"ciao","grazie","si","no"};

    public static String plToit(String wP){
        int size_list = basicPL.length;
        for(int i=0;i<size_list;i++) {
            if (wP.equals(basicPL[i])) {
                return basicIT[i];
            }
        }
        return "There is no such word in the dictionary";

    }

    public static String itTopl(String wI){
        int size_list = basicIT.length;
        for(int i=0;i<size_list;i++) {
            if (wI.equals(basicIT[i])) {
                return basicPL[i];
            }
        }
        return "There is no such word in the dictionary";

    }

}
