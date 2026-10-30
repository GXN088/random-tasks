public interface Sendable<T> {
    String getFrom();
    String getTo();
    T getContent();
}

public static class MailMessage implements Sendable<String> {
    private final String from;
    private final String to;
    private final String content;

    public MailMessage(String from, String to, String content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    public String getFrom() { return from; }
    public String getTo() { return to; }
    public String getContent() { return content; }
}

public static class Salary implements Sendable<Integer> {
    private final String from;
    private final String to;
    private final Integer content;

    public Salary(String from, String to, Integer content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    public String getFrom() { return from; }
    public String getTo() { return to; }
    public Integer getContent() { return content; }
}

public static class MailService<T> implements Consumer<Sendable<T>> {
    private final Map<String, List<T>> mailBox = new HashMap<String, List<T>>() {
        @Override
        public List<T> get(Object key) {
            List<T> value = super.get(key);
            return value == null ? Collections.<T>emptyList() : value;
        }
    };

    @Override
    public void accept(Sendable<T> sendable) {
        String to = sendable.getTo();
        List<T> list = mailBox.get(to);
        if (list.isEmpty()) {
            list = new ArrayList<>();
            mailBox.put(to, list);
        }
        list.add(sendable.getContent());
    }

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }
  }
