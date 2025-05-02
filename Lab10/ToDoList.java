package Lab10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ToDoList extends JFrame implements ActionListener {
    private DefaultListModel<String> taskListModel;
    private JList<String> taskList;
    private JTextField taskField;
    private JButton addButton, removeButton;

    public ToDoList() {
        setTitle("To-Do List");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // Components
        taskField = new JTextField(20);
        addButton = new JButton("Add");
        removeButton = new JButton("Remove");

        taskListModel = new DefaultListModel<>();
        taskList = new JList<>(taskListModel);
        JScrollPane listScrollPane = new JScrollPane(taskList);

        // Panel for input and buttons
        JPanel inputPanel = new JPanel();
        inputPanel.add(taskField);
        inputPanel.add(addButton);
        inputPanel.add(removeButton);

        // Add listeners
        addButton.addActionListener(this);
        removeButton.addActionListener(this);

        // Layout
        add(inputPanel, BorderLayout.NORTH);
        add(listScrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String task = taskField.getText().trim();
            if (!task.isEmpty()) {
                taskListModel.addElement(task);
                taskField.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Task cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == removeButton) {
            int selectedIndex = taskList.getSelectedIndex();
            if (selectedIndex != -1) {
                taskListModel.remove(selectedIndex);
            } else {
                JOptionPane.showMessageDialog(this, "Select a task to remove.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ToDoList());
    }
}

