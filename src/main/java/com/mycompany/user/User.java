/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.user;

/**
 *
 * @author minh
 */
public class User {

    private String userId;
    private String email;

    public User(String userId, String email) {
        this.userId = userId;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void updateEmail(String newEmail) {
        this.email = newEmail;
    }
    // Thêm phương thức main
    public static void main(String[] args) {
        System.out.println("Hello!");
        
        // Kiểm tra tạo đối tượng User
        User user = new User("123", "momonhi@gmail.com");
        System.out.println("User Email: " + user.getEmail());
    }
}
