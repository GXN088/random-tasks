# Project - Unique Word Counter

A robust Java-based tool designed to process text, count word frequencies, and provide advanced linguistic statistics.

## Project Overview
This project is divided into four core tasks that handle the complete lifecycle of text processing—from raw input to detailed data analysis.

## Features & Task Breakdown

### 1. Text Input and Storage
*   **Purpose:** Handles the loading of text from various sources.
*   **Functionality:** Supports reading data from files and console input, ensuring reliable data persistence in memory.

### 2. Word Processing
*   **Purpose:** Sanitizes and prepares raw text for analysis.
*   **Functionality:** 
    *   Removes punctuation and special characters.
    *   Converts text to lowercase for case-insensitive counting.
    *   Tokenizes strings into individual words.

### 3. Word Counting
*   **Purpose:** The core engine of the application.
*   **Functionality:** 
    *   Identifies unique words within the text.
    *   Calculates the exact frequency of each word using efficient data structures (e.g., `HashMap`).

### 4. Advanced Statistics
*   **Purpose:** Provides deeper insights into the analyzed text.
*   **Functionality:** 
    *   Calculates total word count and unique word count.
    *   Identifies the most frequent and least frequent words.
    *   Generates distribution reports (e.g., average word length).

## Tech Stack
*   **Language:** Java (JDK 11 or higher)
*   **Tools:** Standard Java Collections API, File I/O.

## Installation & Usage

1. **Clone the repository:**
   ```bash
   git clone https://github.com/GXN088/project-unique-word-counter/blob/main/README.md
   ```
2. **Compile the project:**
   ```bash
   javac Main.java
   ```
3. **Run the application:**
   ```bash
   java Main
   ```

## 📄 License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
