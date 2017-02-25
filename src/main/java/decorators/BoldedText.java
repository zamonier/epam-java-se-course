package decorators;

/**
 * Created by Eugene on 25.02.17.
 */
public class BoldedText extends Text {

    private Text decoratedText;

    @Override
    public String getText() {
        return "*" + decoratedText.getText() + "*";
    }

    public BoldedText() {
    }

    public BoldedText(Text text) {
        this.decoratedText = text;
    }
}
