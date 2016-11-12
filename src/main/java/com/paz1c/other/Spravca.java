
package com.paz1c.other;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class Spravca extends Osoba{
    private String email;
    private String salt;
    private String passwordHash;

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
    
    public void setPassword(String password) {
        if (salt == null) {
            salt = BCrypt.gensalt();
        }
        this.passwordHash = BCrypt.hashpw(password, salt);
    }
    
    public void setSalt(String salt) {
        this.salt = salt;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean checkPassword(String password) {
        String result = BCrypt.hashpw(password, salt);
        return result.equals(passwordHash);
    }

    public String getSalt() {
        return salt;
    }
    
     public String getEmail() {
        return email;
    }
    
    public String getPasswordHash() {
        return passwordHash;
    }
    
      /**toString vracia retazec "'meno','priezvisko',id_firma"*/
    @Override
    public String toString() {
        return super.toString()+",'"+email+"','"+passwordHash+"','"+salt+"'";
    }
    
}
