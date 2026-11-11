import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Чтение входных данных
        String deviceName = scanner.nextLine();
        String assistantName = scanner.nextLine();
        String songName = scanner.nextLine();
        
        // Создайте SmartSpeaker с deviceName и assistantName
        SmartSpeaker speaker = new SmartSpeaker(deviceName, assistantName);
        
        // Установите песню с помощью setSong()
        speaker.setSong(songName);
        
        // Вызовите getFullInfo()
        speaker.getFullInfo();
        
        // Вызовите playSound()
        speaker.playSound();
        
        // Вызовите voiceCommand("skip to next")
        speaker.voiceCommand("skip to next");
    }
}
