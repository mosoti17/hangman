## Hangman Game
**Authour Name**
* Elvis Mogaka

**Specs**
1. A word is picked at random and the lifes are 5
2.  Dashes equal to the length of word will be displayed.
3. User guesses a letter.
4. If letter is  in the word relevant dash is replaced with letter and displayed back to user.
5. If the letter is wrong the number of lifes reduces by 1.
6. The game ends if the word is guessed correctly or the number of lifes reduces to 0.

**Setup and installation**
Open terminal and type the following commands:
```
$ git clone https://github.com/mosoti17/hangman.git
$ cd hangman
$ gradle build
$ cd build/classes/java/main
$ java App
```
