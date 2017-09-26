/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 * Finds the longest common substring of characters.
 */
public class ReclamationProject {
    /**
     *Finds out what the longest substring is among two strings.
     * @param firstInput the first string
     * @param secondInput the second string
     * @return r
     */
    static String doit(final String firstInput, final String secondInput) {
        String firstString = firstInput;
        String secondString = secondInput;
        if (firstString.length() > secondString.length()) {
            String tempString = firstString;
            firstString = secondString;
            secondString = tempString;
            }
        String r = "";
        /*
         * For loop with i
         */
        for (int i = 0; i < firstString.length(); i++) {
            for (int j = firstString.length() - i; j > 0; j--) {
                for (int k = 0; k < secondString.length() - j; k++) {
                    if (firstString.regionMatches(i, secondString, k, j) && j > r.length()) {
                        r = firstString.substring(i, i + j);
                        }
                    }
                        }
                }
        return r;
        }
}
