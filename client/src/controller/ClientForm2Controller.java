
package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientForm2Controller {
    static Socket socket = null;
    static DataInputStream dataInputStream;
    static DataOutputStream dataOutputStream;
    public TextArea txtClientArea1;
    public TextField txtClientOne;

    String messageIn = "";

    public void initialize() {
        new Thread(() -> {
            try {
                socket = new Socket("localhost", 5000);
                dataInputStream = new DataInputStream(socket.getInputStream());
                dataOutputStream = new DataOutputStream(socket.getOutputStream());

                while (!messageIn.equals("end")) {
                    messageIn = dataInputStream.readUTF();
                    txtClientArea1.appendText("\nServer :" + messageIn.trim() + "\n");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }

    public void sendOnAction(ActionEvent actionEvent) throws IOException {
        String reply = "";
        reply = txtClientOne.getText();
        txtClientArea1.appendText(("\t\t\t\t\t\t\t\t ClientTwo:" + reply.trim()));

        dataOutputStream.writeUTF(reply);
        txtClientOne.setText("");
    }

    public void getPhoto(MouseEvent mouseEvent) throws IOException {

    }
}
