package exceptions;

import java.io.Closeable;
public class FinishingOrder implements Closeable {

    @Override
    public void close() {
        System.out.println("Order is finished");
    }
}
