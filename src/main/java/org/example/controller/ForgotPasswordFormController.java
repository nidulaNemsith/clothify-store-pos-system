package org.example.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class ForgotPasswordFormController{
    public TextField txtEmail;
    public JFXButton btnSendOtp;
    public TextField txtNewPassword;
    public TextField txtOtpCode;
    public TextField txtReEnterPassword;
    public JFXButton btnReset;
    public JFXButton btnExit;


    public void btnSendOtpOnAction(ActionEvent actionEvent) {
    }

    public void btnResetOnAction(ActionEvent actionEvent) {
    }


    public void btnExitOnAction(ActionEvent actionEvent) {
        System.exit(0);
    }
}
