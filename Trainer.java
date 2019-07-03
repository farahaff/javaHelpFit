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
import java.time.*;
import java.util.*;
public class Trainer extends User{
    private Speciality spc;
    private ArrayList<Review> trainerReviews;
    
    /**
     * built constructor with arguments
     * @param username
     * @param password
     * @param fullName
     * @param email
     * @param spc
     */
    public Trainer(String username, String password, String fullName, String email, Speciality spc) {
        super(username, password, fullName, email);
        setSpc(spc);
        trainerReviews = new ArrayList<>();
    }

    public Speciality getSpc() {
        return spc;
    }

    public void setSpc(Speciality spc) {
        this.spc = spc;
    }
    
    public PersonalTraining addPersonalTraining(String title, LocalDate date, LocalTime time, double fee){
        PersonalTraining newPT = new PersonalTraining(title, date, time, fee, this);
        if (getTrainingSession().add(newPT))
            return newPT;
        else
            return null;
    }
    
    /**
     * This method creates a new Group Session for the Trainer
     *
     * @param title title of session.
     * @param date date of session.
     * @param time time of session.
     * @param fee fee of session.
     * @return PersonalTraining if the training is added successfully
     */
    public GroupTraining addGroupTraining(String title, LocalDate date, LocalTime time, double fee, TrainingType classType, int maxParticipants) {

        GroupTraining newGT = new GroupTraining(title, date, time, fee, classType, maxParticipants, this);
        if (getTrainingSessions().add(newGT))
            return newGT;
        else
            return null;
    }

    
    public boolean addReview(Review review) {
        return trainerReviews.add(review);
    }
    
    /**
     *
     * Returns all the reviews
     *
     * @return all available review from review list.
     */
    public ArrayList<Review> getTrainerReviews() {
        return trainerReviews;
    }
    
    /**
     * calculates the average rating for the trainer from total reviews based on
     * number of reviews given. If no reviews return 0
     */
    public double getAverageRating() {
        double totalRating = 0;
        int numReviews = 0;
        for (Review r : trainerReviews) {
            if (r.getRating() != 0) {
                numReviews++;
                totalRating += r.getRating();
            }
        }
        if (numReviews != 0) 
            return (totalRating / numReviews);
         else 
            return 0;
        
    }
    
    /**
 +     * Returns a string showing information about all reviews received
 +     * @return information about reviews including the member
 +     */
   public String showAllReviews(){
       if (trainerReviews.size()==0)
           return "No reviews yet";
       String allInfo = "\nTimestamp\tWritten By\tRating\tComments";
       allInfo+=        "\n---------\t----------\t------\t--------";
       for (Review r:trainerReviews)
       {
           allInfo+="\n"+ r.getTimestamp()+'\t' + r.getWrittenBy().getUsername()+'\t'+ r.getRating() +'\t' + r.getComments();
       }
       return allInfo;
               
       
   }
    
    public String toString(){
        String info =  "Trainer : " + this.getFullName() + "\nSpeciality : " + this.getSpc();
        double rating = this.getAverageRating();
        if (rating == 0)
            return info;
        else
            return info + "\nAverage rating : " + rating;
    }

    @Override
    public int compareTo(User o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private HELPFit getTrainingSession() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}

