package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
	public static void main (String[] args) {
		Robot[] robots = new Robot[5];
		for (int i = 0; i < 5; i++) {
			robots[i] = new Robot();
			robots[i].setX(200 + i * 100);
			robots[i].setY(500);
		}
		int min = 500;
		while (min > 50) {
			for (int i = 0; i < 5; i++) {
				Random random = new Random();
				int rand = random.nextInt(51);
				robots[i].move(rand);
				min = robots[0].getY();  
		        for (int j = 0; j < robots.length; j++) {  
		           if(robots[j].getY() < min)  
		               min = robots[j].getY();  
		        } 
			}	
		}
	}
        // 2. create an array of 5 robots.

        // 3. use a for loop to initialize the robots.

        // 4. make each robot start at the bottom of the screen, side by side, facing up
    
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
    
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
    
        // 7. declare that robot the winner and throw it a party!
    
        // 8. try different races with different amounts of robots.
    
        // 9. make the robots race around a circular track.

}
