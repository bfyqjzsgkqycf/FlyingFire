# FlyingFire Game README

## 1. Introduction
FlyingFire is an exciting shooting game developed in Java. The game features a hero plane that can shoot bullets to destroy enemy planes and obtain rewards. Players can control the hero plane with the mouse, and the game has different states such as start, running, pause, and game over.

## 2. Features
- **Multiple Game States**: The game includes start, running, pause, and game over states, providing a complete gaming experience.
- **Enemy and Reward System**: There are enemy planes and bees in the game. Shooting down enemy planes earns points, while shooting down bees can provide rewards such as double fire or extra lives.
- **Mouse Control**: Players can control the movement of the hero plane by moving the mouse.
- **Score and Life Display**: The game displays the player's score and remaining lives in real - time.

## 3. Project Structure
### 3.1 Main Classes
- **ShootGame.java**: This is the main class of the game. It manages the game state, initializes game resources, and controls the main game loop. It also handles mouse events, including mouse movement, entry, exit, and click events.
- **Hero.java**: Represents the hero plane. It has attributes such as lives, double fire, and movement methods. It can shoot bullets and handle collisions with other flying objects.
- **Airplane.java**: Represents enemy planes. It has a certain speed and score value.
- **Bee.java**: Represents bees. Bees can provide rewards such as double fire or extra lives.
- **Bullet.java**: Represents bullets. Bullets move upwards and can hit flying objects.

### 3.2 Interfaces
- **Enemy.java**: An interface for enemy objects. It defines a method to get the score of the enemy.
- **Award.java**: An interface for reward objects. It defines two types of rewards (double fire and extra life) and a method to get the reward type.

### 3.3 Other Files
- **Configuration Files**: Files in the `.idea` and `.git` directories are mainly used for project configuration and version control.

## 4. How to Run
### 4.1 Prerequisites
- Java Development Kit (JDK) 17 or higher installed on your system.

### 4.2 Steps
1. Clone the project to your local machine.
2. Open the project in your Java IDE (e.g., IntelliJ IDEA).
3. Make sure the project is configured to use JDK 17.
4. Run the `main` method in the `ShootGame.java` class.

## 5. Gameplay
- **Start the Game**: Click the mouse when the game is in the start state to start the game.
- **Control the Hero Plane**: Move the mouse to control the movement of the hero plane.
- **Shoot**: The hero plane shoots bullets automatically at regular intervals.
- **Pause and Resume**: When the mouse exits the game window, the game pauses. When the mouse enters the game window again, the game resumes.
- **Game Over**: If the hero plane collides with an enemy object and has no remaining lives, the game ends. You can click the mouse to restart the game.

## 6. Code Explanation
### 6.1 `ShootGame.java`
- **Initialization**: In the static code block, it initializes all the necessary images for the game, such as the background, start screen, enemy planes, etc.
- **Game Loop**: The `action` method sets up a timer to execute the main game loop at regular intervals. In the loop, it performs actions such as flying object entry, movement, shooting, collision detection, and game over checking.
- **Mouse Events**: It uses a `MouseAdapter` to handle mouse movement, entry, exit, and click events.

### 6.2 `Hero.java`
- **Initialization**: The hero plane starts with 3 lives and no double fire.
- **Movement**: The `moveTo` method allows the hero plane to move according to the mouse position.
- **Shooting**: The `shoot` method determines whether to shoot single or double bullets based on the double fire status.
- **Collision Detection**: The `hit` method checks if the hero plane collides with other flying objects.

### 6.3 `Airplane.java` and `Bee.java`
- **Initialization**: Both classes initialize their positions randomly at the top of the screen.
- **Movement**: The `step` method in each class defines how they move. Enemy planes move straight down, while bees can move diagonally.

### 6.4 `Bullet.java`
- **Initialization**: Bullets are initialized with a specific position relative to the hero plane.
- **Movement**: The `step` method makes the bullets move upwards.

## 7. Contribution
If you want to contribute to this project, you can follow these steps:
1. Fork the project on GitHub.
2. Create a new branch for your feature or bug fix.
3. Make your changes and commit them with clear commit messages.
4. Push your changes to your forked repository.
5. Create a pull request on the original repository.

## 8. License
This project is released under the ```MIT License```. You are free to use, modify, and distribute the code.
