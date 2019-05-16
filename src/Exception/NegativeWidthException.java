package Exception;

public class NegativeWidthException extends Throwable {
    private int width;

    public NegativeWidthException(int width){
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}
