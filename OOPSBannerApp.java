import java.util.HashMap;

public class OOPSBannerApp {
    static class BannerUtil {
        public static HashMap<Character, String[]> createCharacterPatternMap() {
            HashMap<Character, String[]> charMap = new HashMap<>();

            charMap.put('O', new String[] {
                "  ****   ",
                " **   ** ",
                " **   ** ",
                " **   ** ",
                "  ****   "
            });

            charMap.put('P', new String[] {
                " ******  ",
                " **   ** ",
                " ******  ",
                " **      ",
                " **      "
            });

            charMap.put('S', new String[] {
                " ******  ",
                " **      ",
                "  ****   ",
                "     **  ",
                " ******  "
            });

            return charMap;
        }
        public static void printMessage(String message, HashMap<Character, String[]> charMap) {
            StringBuilder[] output = new StringBuilder[5];

            for (int i = 0; i < 5; i++) {
                output[i] = new StringBuilder();
            }

            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.get(ch);

                if (pattern != null) {
                    for (int i = 0; i < 5; i++) {
                        output[i].append(pattern[i]).append("  ");
                    }
                }
            }

            for (StringBuilder line : output) {
                System.out.println(line.toString());
            }
        }
    }

    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = BannerUtil.createCharacterPatternMap();
        String message = "OOPS";
        BannerUtil.printMessage(message, charMap);
    }
}