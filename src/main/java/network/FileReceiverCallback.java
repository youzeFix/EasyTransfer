package network;

public interface FileReceiverCallback {
    void ready(int port);
    void currentProgress(int progress);
}
