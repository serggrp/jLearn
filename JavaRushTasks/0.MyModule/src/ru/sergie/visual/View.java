package ru.sergie.visual;

import ru.sergie.visual.listeners.FrameListener;
import ru.sergie.visual.listeners.TabbedPaneChangeListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {
    private Controller controller;
    private JTabbedPane tabbedPane = new JTabbedPane();
    private JTextPane htmlTextPane = new JTextPane();
    private JEditorPane plainTextPane = new JEditorPane();

    public Controller getController() {
        return controller;
    }

    public View(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            ExceptionHandler.log(e);
        }

    }
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void init(){
        initGui();
        FrameListener fl = new FrameListener(this);
        addWindowListener(fl);
        setVisible(true);
    }
    public void exit(){controller.exit();}
    public void initMenuBar(){
    }
    public void initEditor(){
        htmlTextPane.setContentType("text/html");
        JScrollPane scrollHtmlPane = new JScrollPane(htmlTextPane);
        tabbedPane.add("HTML", scrollHtmlPane);
        JScrollPane scrollTextPane = new JScrollPane(plainTextPane);
        tabbedPane.add("Текст", scrollTextPane);
        tabbedPane.setPreferredSize(new Dimension(400, 400));
        tabbedPane.addChangeListener(new TabbedPaneChangeListener(this));
        getContentPane().add(tabbedPane, BorderLayout.CENTER);
    }
    public void initGui(){
        initMenuBar();
        initEditor();
        pack();
    }
    public void selectedTabChanged(){}

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
