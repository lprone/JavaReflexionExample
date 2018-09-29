public class MyClass {
    private String myString;
    private int myInt;

    public String getMyString() {
        return myString;
    }

    public int getMyInt() {
        return myInt;
    }

    protected void protectedSetMyString(String myString) {
        this.myString = myString;
    }

    private void privateSetMyString(String myString) {
        this.myString = myString;
    }

    private boolean privateSetMyStringReturningBool(String myString) {
        this.myString = myString;
        return true;
    }

    private void privateSetMyInt(int myInt) {
        this.myInt = myInt;
    }

}
