package edu.avans.library.presentation;
import javax.swing.*;
import java.awt.*;

public class CalendarPanel extends JPanel {
    private Integer calendarPanelWidth, calendarPanelHeight;
    private MainFrame mainFrame; // for now private
    public MainPanel mainPanel; // for now private
    private MonthPanel monthPanel; // for now private

    public CalendarPanel(MainPanel mainPanel) {
        this.mainFrame = mainPanel.mainFrame;
        this.mainPanel = mainPanel;
        setCalendarPanelDimensions();
        initCalendarPanel();
    }

    private void initCalendarPanel() {
        setLayout(null);
        setBackground(Color.GREEN);
        setBorder(BorderFactory.createLineBorder(Color.RED));
        setCalendarPanelBounds();
        drawMonthPanel();
        // TODO: init day blocks
    }

    public void resizeCalendarPanel() {
        setCalendarPanelDimensions();
        setCalendarPanelBounds();
        monthPanel.resizeMonthPanel();
    }

    private void setCalendarPanelDimensions() {
        calendarPanelWidth = mainFrame.getMainFrameWidth() - mainPanel.getSidePanelWidth();
        calendarPanelHeight = mainFrame.getMainFrameHeight() - mainPanel.getTopPanelHeight();
    }

    private void setCalendarPanelBounds() {
        setBounds(mainPanel.getSidePanelWidth(), mainPanel.getTopPanelHeight(), calendarPanelWidth, calendarPanelHeight);
    }

    public Integer getCalendarPanelWidth() {
        return calendarPanelWidth;
    }

    public Integer getCalendarPanelHeight() {
        return calendarPanelHeight;
    }

    public void drawMonthPanel() {
        monthPanel = new MonthPanel(CalendarPanel.this);
        add(monthPanel);
    }

    // hier moet nu month panel komen
}