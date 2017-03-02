package unit5;

/**
 * Created by Eugene on 02.03.17.
 */
public class BrokenClosable implements AutoCloseable {

    @Override
    public void close() throws Exception {
        throw new RuntimeException();
    }
}
