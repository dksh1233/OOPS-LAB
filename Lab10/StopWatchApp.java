package Lab10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StopWatchApp extends JFrame implements ActionListener {
    private JLabel timeLabel;
    private JButton startButton, stopButton, resetButton;
    private Timer timer;
    private int elapsedTime = 0; // in seconds

    public StopWatchApp() {
        setTitle("Stopwatch");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center the frame

        // Create components
        timeLabel = new JLabel("0", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 40));

        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        resetButton = new JButton("Reset");

        // Add action listeners
        startButton.addActionListener(this);
        stopButton.addActionListener(this);
        resetButton.addActionListener(this);

        // Timer to update every 1000 ms (1 second)
        timer = new Timer(1000, e -> {
            elapsedTime++;
            timeLabel.setText(String.valueOf(elapsedTime));
        });

        // Layout setup
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        buttonPanel.add(resetButton);

        add(timeLabel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == startButton) {
            if (!timer.isRunning()) {
                timer.start();
            }
        } else if (source == stopButton) {
            if (timer.isRunning()) {
                timer.stop();
            }
        } else if (source == resetButton) {
            timer.stop();
            elapsedTime = 0;
            timeLabel.setText("0");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StopWatchApp());
    }
}

