public class MyClass {
    private String myString;

    protected void protectedSetMyString(String myString) {
        this.myString = myString;
    }

    private void privateSetMyString(String myString) {
        this.myString = myString;
    }

    public String getMyString() {
        return myString;
    }
}
