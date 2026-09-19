public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
    StringBuilder sb = new StringBuilder();
    try (Reader reader = new InputStreamReader(inputStream, charset)) {
        int c;
        while ((c = reader.read()) != -1) {
            sb.append((char) c);
        }
    }
    return sb.toString();
}
