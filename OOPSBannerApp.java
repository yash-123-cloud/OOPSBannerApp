/**
 * @author [yeswanth reddy]
 * @version 1.0
 */
public class OOPSBannerApp {

    static class CharacterPatternMap {
        Character character;
        String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
            for (CharacterPatternMap charMap : charMaps) {
                if (charMap.character == ch) {
                    return charMap.pattern;
                }
            }
            return null;
        }

        public static void printMessage(String message, CharacterPatternMap[] charMaps) {
            StringBuilder[] output = new StringBuilder[5];

            for (int i = 0; i < 5; i++) {
                output[i] = new StringBuilder();
            }

            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);

                if (pattern != null) {
                    for (int i = 0; i < 5; i++) {
                        output[i].append(pattern[i]).append("   "); // equal spacing
                    }
                }
            }

            for (StringBuilder line : output) {
                System.out.println(line);
            }
        }

        public static CharacterPatternMap[] createCharacterPatternMaps() {
            return new CharacterPatternMap[] {

                // Each letter width = 10 characters

                new CharacterPatternMap('O', new String[] {
                    "  ******  ",
                    " **    ** ",
                    " **    ** ",
                    " **    ** ",
                    "  ******  "
                }),

                new CharacterPatternMap('P', new String[] {
                    " ******   ",
                    " **    ** ",
                    " ******   ",
                    " **        ",
                    " **        "
                }),

                new CharacterPatternMap('S', new String[] {
                    "  ******  ",
                    " **        ",
                    "  ******  ",
                    "      **  ",
                    " ******   "
                })
            };
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] charmaps =
                CharacterPatternMap.createCharacterPatternMaps();

        String message = "OOPS";
        CharacterPatternMap.printMessage(message, charmaps);
    }
}