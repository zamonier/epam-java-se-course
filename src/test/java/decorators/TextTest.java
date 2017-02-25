package decorators;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TextTest {

    @Test
    public void testThatTextClassStoreText() throws Exception {

        // 1. Given + When
        Text text = new Text().withText("Hello world");

        // 3. Then
        assertThat(text.getText(), is("Hello world"));
    }

    @Test
    public void testThatWeCanCreateBoldedText(){

        // 1. Given
        Text text = new Text().withText("Hello world");
        BoldedText bolded = new BoldedText(text);

        // 3. Then
        assertThat(bolded.getText(), is("*Hello world*"));

    }

    @Test
    public void testThatWeCanCreateItalicText(){

        // 1. Given
        Text text = new Text().withText("Hello world");
        ItalicText italic = new ItalicText(text);

        // 3. Then
        assertThat(italic.getText(), is("_Hello world_"));

    }

    @Test
    public void testThatWeCanCreateItalicAndBoldText(){

        // 1. Given
        Text text = new Text().withText("Hello world");
        BoldedText bolded = new BoldedText(text);
        ItalicText italic = new ItalicText(bolded);

        // 3. Then
        assertThat(italic.getText(), is("_*Hello world*_"));

    }
}