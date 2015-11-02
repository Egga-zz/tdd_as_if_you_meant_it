package de.egga.mock;

public class Application {

    private MessageQueue messageQueue;

    public Application(MessageQueue messageQueue) {
        this.messageQueue = messageQueue;
    }

    public void send(String value) {
        messageQueue.send(value);
    }

    public String receive() {
        return messageQueue.receive();
    }
}
