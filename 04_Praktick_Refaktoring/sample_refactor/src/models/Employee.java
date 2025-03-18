package models;

public class Employee {
    private String employeeId;
    private PersonalInfo personalInfo;
    private JobInfo jobInfo;
    private EmergencyContact emergencyContact;

    public Employee(String employeeId, PersonalInfo personalInfo, JobInfo jobInfo, EmergencyContact emergencyContact) {
        this.employeeId = employeeId;
        this.personalInfo = personalInfo;
        this.jobInfo = jobInfo;
        this.emergencyContact = emergencyContact;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public JobInfo getJobInfo() {
        return jobInfo;
    }

    public void setJobInfo(JobInfo jobInfo) {
        this.jobInfo = jobInfo;
    }

    public EmergencyContact getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(EmergencyContact emergencyContact) {
        this.emergencyContact = emergencyContact;
    }
}
