package student;

/**
 * This class is a place holder which you will fully implement based on the javadoc
 * 
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 * 
 */
public class Greeting {
    private int localityID;
    private String localityName;
    private String asciiGreeting;
    private String unicodeGreeting;
    private String formatStr;

    /**
     * Default greeting that creates "Hello, {name}!".
     * @param localityID ID of the locality
     * @param localityName Name of the locality
     */
    public Greeting(int localityID, String localityName){
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = "Hello";
        this.unicodeGreeting = "Hello";
        this.formatStr = "%s, %s!";

    }

    /**
     * Greeting that creates a greeting with ascii and unicode characters assuming the language is already using ascii letters only., "{greeting}, {name}!"
     * @param localityID id of the locality
     * @param localityName name of the locality
     * @param greeting greeting using ascii characters
     */
    public Greeting(int localityID, String localityName, String greeting){
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = greeting;
        this.unicodeGreeting = greeting;
        this.formatStr = "%s, %s!";
    }

    /**
     * Greeting that creates a greeting with ascii and unicode characters.
     * @param localityID id of the locality
     * @param localityName name of the locality
     * @param asciiGreeting greeting using ascii characters
     * @param unicodeGreeting greeting using unicode characters
     * @param formatStr format string for the greeting
     */
    public Greeting(int localityID, String localityName, String asciiGreeting, String unicodeGreeting, String formatStr){
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    /**
     * Returns the ASCII greeting.
     * @return the ascii greeting
     */
    public String getAsciiGreeting() {
        return asciiGreeting;
    }

    /**
     * Returns the unicode greeting. Just the greeting, no formatting.
     * @return the unicode greeting
     */
    public String getUnicodeGreeting() {
        return unicodeGreeting;
    }

    public String getFormatStr() {
        return getFormatStr(false);
    }

    /**
     * Returns the format string with the greeting inserted into the format. This string will have a %s, so that the name can be inserted into the greeting in the correct location.
     * @param asciiOnly  if true, only ascii characters will be used
     * @return the format string with the greeting inserted into the format
     */
    public String getFormatStr(boolean asciiOnly) {
        String greeting = asciiOnly ? asciiGreeting : unicodeGreeting;
        return String.format(this.formatStr, greeting,"%s");
    }

    /**
     * Returns the locality id number.
     * @return the locality id number
     */
    public int getLocalityID() {
        return localityID;
    }

    /**
     * Returns the locality name.
     * @return  the locality name
     */
    public String getLocalityName() {
        return localityName;
    }

    /**
     * Returns the full greeting details as a string. Primarily for debugging purposes. Example string format:
     *  {localityID:1, localityName:"Hawaii", asciiGreeting:"Aloha", unicodeGreeting:"Aloha"}
     * @return
     */
    @Override
    public String toString() {
        return String.format(
                "{localityID:%d, localityName:\"%s\", asciiGreeting:\"%s\", unicodeGreeting:\"%s\"}",
                localityID, localityName, asciiGreeting, unicodeGreeting
        );
    }
}
