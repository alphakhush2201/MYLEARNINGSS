import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TypeAndReturn {
    private static final String TEXT_TO_TYPE = "Bhag bsdk"; // Replace with your desired text

    public static void main(String[] args) {
        JFrame frame = new JFrame("Type and Return");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 100);

        JButton startButton = new JButton("Start");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startTyping();
            }
        });

        frame.getContentPane().add(startButton);
        frame.setVisible(true);
    }

    private static void startTyping() {
        try {
            Robot robot = new Robot();

            // Delay for a few seconds to give time to focus on the input field
            robot.delay(3000);

            // Type the text repeatedly
            while (true) {
                // Type the text
                for (char c : TEXT_TO_TYPE.toCharArray()) {
                    robot.delay(50); // Delay between key presses (adjust as needed)
                    typeCharacter(robot, c);
                }

                // Press the return key
                robot.delay(50); // Delay before pressing return (adjust as needed)
                pressKey(robot, KeyEvent.VK_ENTER);

                // Delay before typing the text again (adjust as needed)
                robot.delay(1000);
            }
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    private static void typeCharacter(Robot robot, char character) {
        int keyCode = KeyEvent.getExtendedKeyCodeForChar(character);
        pressKey(robot, keyCode);
    }

    private static void pressKey(Robot robot, int keyCode) {
        robot.keyPress(keyCode);
        robot.keyRelease(keyCode);
    }
}
