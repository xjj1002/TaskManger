// This a class that the information about each service will be held.
// The class allows for easier access and handling of data.

package com.example.taskmanager;

public class ServicesClass {

  //Information that is held by the class
   private int PID;
   private String Name;
   private String Description;
   private String Status;

   //Constructor, this constructor ensures that all the attributes of the class will be initialized when the object is created
    public ServicesClass(int PID, String Name, String Description, String Status) {
        this.PID = PID;
        this.Name = Name;
        this.Description = Description;
        this.Status = Status;
    }

    //function for retuning the PID for the service
    public int getPID() {
        return PID;
    }

    //function for returning the Description of the Service
    public String getDescription() {
        return Description;
    }

    //function for returning the Name of the Service
    public String getName() {
        return Name;
    }

    //function for returning the status of the function
    public String getStatus() {
        return Status;
    }
}
