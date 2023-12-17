package com.designpatterns.behavioral.observer_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ObserverDesignPatternMain {
    public static void main(String[] args) {
        EventSource eventSource = new EventSource();

        ResponseHandler1 responseHandler1 = new ResponseHandler1(eventSource);
        ResponseHandler2 responseHandler2 = new ResponseHandler2(eventSource);

        int index = 0;

        while (index <= 5) {
            try {
                final InputStreamReader inputStreamReader = new InputStreamReader(System.in);
                final BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                while (index <= 5) {
                    String message = bufferedReader.readLine();
                    eventSource.setMessage(message);

                    index++;
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
