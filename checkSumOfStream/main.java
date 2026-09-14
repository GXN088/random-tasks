import java.io.IOException;
import java.io.InputStream;

public class Main {
    //テスト用のメインメソッド（必要に応じて使用してください）
    public static void main(String[] args) {
        //テスト用の実装などをここに書くことができます
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        //空のデータセットのコントロールサムは0
        int checkSum = 0; 
        int b;

        //ストリームから1バイトずつ終端（-1）になるまで読み込む
        while ((b = inputStream.read()) != -1) {
            //C_{n+1} = rotateLeft(C_n) xor b_{n+1}
            checkSum = Integer.rotateLeft(checkSum, 1) ^ b;
        }

        return checkSum;
    }
}
