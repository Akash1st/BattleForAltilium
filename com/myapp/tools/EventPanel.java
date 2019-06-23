package com.myapp.tools;

public class EventPanel {

    private String[] eventGame;

    public EventPanel() {
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

    public final int getX() {
        return 0;
    }

    public final int getY() {
        return 550;
    }

    public final int getWidth() {
        return 900;
    }

    public final int getHeight() {
        return 116;
    }
}
