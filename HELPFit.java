/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2java2;

import java.time.*;
import java.util.*;
import java.io.*;

/**
 *
 * @author farahaff
 */
//import java.util.*;
public class HELPFit implements Serializable {

    private ArrayList<User> uList;
    private ArrayList<TrainingSession> tList;
    
   
    public HELPFit(){
        uList = new ArrayList<>();
        tList = new ArrayList<>();
    }
    
    /**
     *
     * @return list of Users
     */
    public ArrayList<User> getUser(){
        return uList;
    }
    
    /**
     *
     * @return list of TrainingSessions
     */
    public ArrayList<TrainingSession> getTrainingSession(){
        return tList;
    }
    
    /**
     *
     * @return size of User
     */
    public int getNumUsers(){
        return uList.size();
    }
    
    public int getNumTrainingSession(){
        return tList.size();
    }
    
    /**
     *
     * @param username
     * @param password
     * @param fullName
     * @param email
     * @param spc
     * @return new Trainer
     */
    public Trainer addTrainer(String username, String password, String fullName, String email, Speciality spc){
        Trainer newT = new Trainer(username, password, fullName, email, spc);
        if(uList.contains(newT))
            return null;
        //assign to the ArrayList
        if(uList.add(newT))
            return newT;
        
        return null;
    }
    
    /**
     *
     * @param username
     * @param password
     * @param fullName
     * @param email
     * @param lvl
     * @return new Member
     */
    public Member addMember(String username, String password, String fullName, String email, Level lvl){
        Member newM = new Member(username, password, fullName, email, lvl);
        if(uList.contains(newM))
            return null;
        //assign to the ArrayList
        if(uList.add(newM))
            return newM;
        
        return null;
    }
    
     /**
     * A method to add a session to HELPFIT
     *
     * @param theSession
     * @return true if the session is added successfully
     */
    public boolean addTrainingSession(TrainingSession theSession){
        return (tList.add(theSession));
    }
    
    /**
     * findMember() method to find Member based on username and password
     * @param username
     * @param password
     * @return
     */
    public User findUser(String username){
        for (User u: uList){
            if(u.getUsername().equalsIgnoreCase(username))
                return u;
        }
        return null;
    }
        
    /**
     * A method to find a session in HELPFit
     * @param sessionID
     * @return the session that matches the ID
     */
     public TrainingSession findSession(String sessionID)
    {
        for (TrainingSession s: tList)
        {
            if (s.getSessionID().equals(sessionID))
                return s;
            }
        return null;
    }
     
     /**
     * A method to show all training sessions that are upcoming and
     * available
     * @return String showing all upcoming sessions
     */
    public ArrayList<TrainingSession> showUpcomingTrainingSessions() {
        ArrayList<TrainingSession> trainList = new ArrayList<>();
        
        for (TrainingSession t : tList) {
            if (!t.getDate().isBefore(LocalDate.now()) && t.getStatus() == SessionStatus.AVAILABLE) {
                trainList.add(t);
            }
        }
            return trainList;
    }

    boolean add(PersonalTraining newPT) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
