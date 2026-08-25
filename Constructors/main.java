public class AsciiCharSequence implements java.lang.CharSequence {
    
    private final byte[] content;

    public AsciiCharSequence(byte[] content) {
        this.content = content.clone();
    }

    @Override
    public int length() {
        return content.length;
    }

    @Override
    public char charAt(int index) {
        return (char) (content[index] & 0xFF);
    }

    @Override
    public java.lang.CharSequence subSequence(int start, int end) {
        int length = end - start;
        byte[] subArray = new byte[length];
        System.arraycopy(content, start, subArray, 0, length);
        return new AsciiCharSequence(subArray);
    }

    @Override
    public String toString() {
        return new String(content);
    }
}
