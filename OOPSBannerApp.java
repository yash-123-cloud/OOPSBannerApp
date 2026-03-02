/**
 * @author [v yeswanth reddy]
 * @version 1.0
 */
public class OOPSBannerApp {
    public static String[] getOPattern(){
        return new String[]{
            "   ***   ",
            "**     **",
            "**     **",
            "**     **",
            "   ***   ",
        };
    }
    public static String[] getO2Pattern(){
        return new String[]{
            "   ***   ",
            "**     **",
            "**     **",
            "**     **",
            "   ***   ",
        };
    }
    public static String[] getPPattern(){
        return new String[]{
            "******",
            "**    *",
            "*     * ",
            "****** ",
            "**      ",
            "**      ",
        };
    }  
    public static String[] getSPattern(){
        return new String[]{
            "   ***** ",
            " **      ",
            "  *****   ",
            "       ** ",
            "  *****   ",
        };
    }
    public static void main(String[] args) {
        String[] oPattern = getOPattern();
        String[] o2Pattern = getO2Pattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + " " + o2Pattern[i] + " " +  pPattern[i] + " " + sPattern[i]);
        }
   };
}