package com.myapp.tools;

public class EventPanel {
    private int x;
    private int y;
    private int width;
    private int height;

    private String[] eventGame;

    EventPanel() {
        eventGame = new String[10];
        for (int i = 0; i < eventGame.length; i++) {
            eventGame[i] = "";
        }
    }

    public String getEventGame(int i) {
        return eventGame[i];
    }

    public void addEvent(String event) {
        if (!eventGame[10].equals("")) {
            for (int i = 0; i < eventGame.length - 2; i++) {
                eventGame[i] = eventGame[i + 1];
            }
            eventGame[10] = event;
        } else {
            for (int i = 0; i < eventGame.length; i++) {
                if (eventGame[i].equals("")) {
                    eventGame[i] = event;
                    break;
                }
            }
        }
    }
}
