/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2java2;

/**
 *
 * @author farahaff
 */
import java.io.*;
import java.util.*;
public abstract class User implements Serializable, Comparable <User> {
    
    //instance variables
    private String username;
    private String password;
    private String fullName;
    private String email;
    private ArrayList<TrainingSession> userSessions;
    
    //private ArrayList<User> uList;
    
    /**
     * Constructor with arguments
     *
     * @param username if empty will set to "undefined"
     * @param password if empty will set to "undefined"
     * @param fullName if empty will set to "undefined"
     * @param email if empty will set to "undefined"
     */
    public User(String username, String password, String fullName, String email) {
        this.username = username.isEmpty() ? "undefined" : username;
        this.password = password.isEmpty() ? "undefined" : password;
        this.fullName = fullName.isEmpty() ? "undefined" : fullName;
        this.email = email.isEmpty() ? "undefined" : email;
        userSessions = new ArrayList<>();
    }
    

    /**
     * getter method
     * @return 
     */
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public String getFullName(){
        return fullName;
    }
    public String getEmail(){
        return email;
    }
    
    /**
     *  setter method
     * @param username
     */
    public void setUsername(String username){
        if(!username.isEmpty())
            this.username = username;
    }
    public void setPassword(String password){
        if(!password.isEmpty())
            this.password = password;
    }
    public void setFullName(String fullName){
        if(!fullName.isEmpty())
            this.fullName = fullName;
    }
    public void setEmail(String email){
        if(!email.isEmpty())
            this.email = email;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.username);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        return true;
    }
    
    /**
     * A method that returns the training sessions associated with this user
     *
     * @return
     */
    public ArrayList<TrainingSession> getTrainingSessions() {
        return userSessions;
    }

    /**
     * returns the number of training this user has
     *
     * @return number of training
     */
    public int getNumTrainings() {
        return userSessions.size();
    }
    
    /**
     * A method to find a Training Session based on ID
     *
     * @param sessionID
     * @return the Session that matches the sessionID
     */
    public TrainingSession findSession(String sessionID) {
        for (TrainingSession s : getTrainingSessions()) {
            if (s.getSessionID().equals(sessionID)) {
                return s;
            }
        }
        return null;
    }
    
    /**
     * A method to show all training sessions for this user
     *
     * @return String showing all upcoming sessions
     */
    public String showTrainingHistory() {
        if (userSessions.size() == 0) {
            return "No Trainings yet";
        }
        String trainList = "Training History";
        trainList += "\nID\t  Title  \t  Type  \tDate\tTime";
        trainList += "\n--\t---------\t--------\t----\t----";
        for (TrainingSession t : userSessions) {
            String type = "Personal";
            if (t instanceof GroupTraining) {
                type = ((GroupTraining) t).getClassType().toString();
            }

            trainList += '\n'+t.getSessionID() + '\t' + t.getTitle()
                    + '\t' + type + '\t' + t.getDate() + '\t' + t.getTime();

        }
        return trainList;
    }

    @Override
    public abstract String toString();

}

