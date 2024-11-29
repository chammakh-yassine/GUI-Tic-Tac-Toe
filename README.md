
# Tic Tac Toe Game

A simple **Tic Tac Toe** game built in Java with a graphical user interface (GUI) using `JFrame` and `JButton`. The game allows two players to play alternately, with the option to play again after a match ends.

## Features

- **Two-player gameplay**: Players take turns to place X and O on the board.
- **Graphical interface**: The game board is displayed using buttons for each cell.
- **Automatic winner detection**: The game detects when a player wins or when there is a draw.
- **Play again**: After a match, players can click the "Play Again" button to restart the game.

## Requirements

- Java 8 or higher
- Any IDE that supports Java (e.g., IntelliJ IDEA, Eclipse, or NetBeans)

## How to Run

1. Clone this repository to your local machine:
   ```bash
   git clone https://github.com/yourusername/tic-tac-toe.git
   ```

2. Navigate to the project directory:
   ```bash
   cd tic-tac-toe
   ```

3. Compile and run the project:
   - If you are using an IDE, simply open the project and run the `XO_Game.java` class.
   - Alternatively, you can compile and run the project using the command line:
     ```bash
     javac XO_GAME/XO_Game.java
     java XO_GAME.XO_Game
     ```

## How to Play

1. The game is played between two players (Player X and Player O).
2. The board is a 3x3 grid of buttons. Players click on the empty cells to place their mark (X or O).
3. After every move, the game will check if there’s a winner. If a player wins, a message will appear indicating the winner.
4. If all the cells are filled without a winner, a "Draw" message will be displayed.
5. Players can click the "Play Again" button to restart the game.

## Game Rules

- The game is played on a 3x3 grid.
- Player X always goes first.
- Players alternate turns to place their marks (X or O).
- A player wins when they have three of their marks in a row, either horizontally, vertically, or diagonally.
- If the grid is full and no player has won, the game ends in a draw.


## Contributing

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Commit your changes.
4. Push your changes to your fork.
5. Open a pull request with a description of your changes.

## License

This project is licensed under the MIT License.
