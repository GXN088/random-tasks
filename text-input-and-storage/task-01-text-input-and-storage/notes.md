Create a program that reads text from the user and stores it in a 2D array. The text may contain multiple sentences separated by periods. Print each word in the format "Word[row,col]: word".To store words in a 2D array, we need to split each sentence into words:
String[][] textArray = new String[sentences.length][];
for (int i = 0; i < sentences.length; i++) {
   textArray[i] = sentences[i].trim().split(" ");
}
