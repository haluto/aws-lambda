package example;

public class ResponseClass {
    String greetings;

    public ResponseClass(String greetings) {
        this.greetings = greetings;
    }

    public ResponseClass(){

    }

    public void setGreetings(String greetings) {
        this.greetings = greetings;
    }

    public String getGreetings() {
        return greetings;
    }
}
