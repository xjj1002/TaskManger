package com.example.taskmanager;

public class ServicesClass {
   private int PID;
   private String Name;
   private String Description;
   private String Status;

    public ServicesClass(int PID, String Name, String Description, String Status) {
        this.PID = PID;
        this.Name = Name;
        this.Description = Description;
        this.Status = Status;
    }

    public int getPID() {
        return PID;
    }

    public String getDescription() {
        return Description;
    }

    public String getName() {
        return Name;
    }

    public String getStatus() {
        return Status;
    }
}
