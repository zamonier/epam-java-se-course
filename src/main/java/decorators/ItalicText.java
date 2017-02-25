package decorators;

/**
 * Created by Eugene on 25.02.17.
 */
public class ItalicText extends Text {

    private Text decoratedText;

    @Override
    public String getText() {
        return "_" + decoratedText.getText() + "_";
    }

    public ItalicText(Text text) {
        this.decoratedText = text;
    }
}
