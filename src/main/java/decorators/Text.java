package decorators;

public class Text {

    protected String text;

    public Text() {
    }

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Text withText(String text) {
        this.text = text;
        return this;
    }
}
