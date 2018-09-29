public class MyClass {
    private String myString;

    protected void setMyStringProtected(String myString) {
        this.myString = myString;
    }

    private void setMyStringPrivate(String myString) {
        this.myString = myString;
    }

    public String getMyString() {
        return myString;
    }
}
