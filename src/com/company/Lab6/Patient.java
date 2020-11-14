package com.company.Lab6;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends Person{
    ArrayList<OperationStaff> operationStaffs;

    private String id;
    private FullName name;
    private Gender gender;
    private Date birthDate;
    private int age;
    private Date accepted;
    private String[] sickness;
    private String[] prescriptions;
    private String[] allergies;
    private String[] specialReqs;
}
