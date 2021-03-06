package com.soft1841.controller;


import com.soft1841.service.SellerService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class LoginController {
    @FXML
        private TextField accoundField;
    @FXML
        private PasswordField passwordField;
    private SellerService sellerService = ServiceFactory.getSellerServiceInstance();
    public void login()throws Exception {
        String account = accoundField.getText().trim();
        String password = passwordField.getText().trim();
        //调用service的登录 功能
        boolean flag = sellerService.login(account,password);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("提示");
        if(flag){
            alert.setContentText("恭喜你登录成功!");
            alert.showAndWait();
            Stage mainStage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/main.fxml"));
            BorderPane root = fxmlLoader.load();
            Scene scene = new Scene(root);
            scene.getStylesheets().add("/css/style.css");
            mainStage.setTitle("超市收银系统");
            mainStage.setMaximized(true);
            mainStage.setScene(scene);
            mainStage.show();
            Stage loginStage = (Stage) accoundField.getScene().getWindow();
            loginStage.close();
        }else {
            alert.setContentText("账号或密码错误，登录失败!");
            alert.showAndWait();
        }
    }
}




