# 📝 Note Taking Application

A simple **console-based Note Taking Application** written in Java. This program allows users to create, write, read, delete, and list text notes using basic file handling.

---

## 📁 Features

- ✅ Create a new note
- 🖊️ Write content to an existing note
- 📖 Read and display a note
- 🗑️ Delete a note
- 📋 List all notes in a folder
- 🚪 Exit the application
---
## 🆕 New Feature: Text Highlighting in Notes

A new feature has been added to enhance your reading experience!

### 🔍 What it does:
- After reading a note, the program will ask if you want to **search for a word**.
- If you say **Yes**, it highlights all the occurrences of that word in the note.
- Highlighting is done in a simple and visible format:  
  `***highlighted_word***`

### ✨ Features of this addition:
- ✅ Case-insensitive search
- ✅ Works on the entire note content
- ✅ Enhances readability for long notes

### Example:
If your note contains:
Java is powerful. I love java.

And you search for: `java`

Then it will be displayed as:
**Java** is powerful. I love **java**.
---

## 🧰 Technologies Used

- Java 17+
- IntelliJ IDEA (recommended IDE)
- File Handling (Java I/O)

---

## ▶️ How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/roshan-mahananda/NoteTakingApplication.git
   cd NoteTakingApplication
