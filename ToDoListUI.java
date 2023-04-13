package todolist;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class ToDoListApp {
    private DefaultTableModel tableModel;
    private JTable table;
    private JTextField titleField;
    private JTextArea descriptionArea;
    
    public ToDoListApp() {
        JFrame frame = new JFrame("To-Do List App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create table model with column names
        String[] columnNames = {"Title", "Description", "Status"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);
        
        // Create input components
        titleField = new JTextField(20);
        descriptionArea = new JTextArea(5, 20);
        JButton addButton = new JButton("Add");
        JButton deleteButton = new JButton("Delete");
        JButton updateButton = new JButton("Update");
        
        // Add action listeners for buttons
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String title = titleField.getText();
                String description = descriptionArea.getText();
                if (!title.isEmpty()) {
                    // Add task to table model
                    tableModel.addRow(new Object[]{title, description, "Incomplete"});
                    titleField.setText("");
                    descriptionArea.setText("");
                } else {
                    JOptionPane.showMessageDialog(frame, "Please enter a title.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    // Delete selected row from table model
                    tableModel.removeRow(selectedRow);
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a row to delete.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    // Update selected row in table model
                    String title = titleField.getText();
                    String description = descriptionArea.getText();
                    if (!title.isEmpty()) {
                        tableModel.setValueAt(title, selectedRow, 0);
                        tableModel.setValueAt(description, selectedRow, 1);
                    } else {
                        JOptionPane.showMessageDialog(frame, "Please enter a title.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a row to update.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        // Set layout manager
        frame.setLayout(new BorderLayout());
        
        // Add components to frame
        JScrollPane scrollPane = new JScrollPane(table);
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 1));
        inputPanel.add(new JLabel("Title:"));
        inputPanel.add(titleField);
        inputPanel.add(new JLabel("Description:"));
        inputPanel.add(new JScrollPane(descriptionArea));
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(inputPanel, BorderLayout.EAST);
        frame.add(addButton, BorderLayout.SOUTH);
        frame.add(deleteButton, BorderLayout.WEST);
        frame.add(updateButton, BorderLayout.NORTH);
        
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        Swing

