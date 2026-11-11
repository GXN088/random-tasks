// SmartSpeaker наследует MusicPlayer — многоуровневая цепочка наследования
// AudioDevice -> MusicPlayer -> SmartSpeaker
public class SmartSpeaker extends MusicPlayer {
    private String assistantName;

    public SmartSpeaker(String deviceName, String assistantName) {
        super(deviceName);
        this.assistantName = assistantName;
    }

    public void voiceCommand(String command) {
        System.out.println(assistantName + ": Processing \"" + command + "\"");
    }

    public void getFullInfo() {
        System.out.println(getDeviceName() + " with " + assistantName + " assistant");
    }
}
