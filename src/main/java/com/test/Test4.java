package com.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class Test4 {

    public static void main(String args[]) {
        Test4 obj1 = new Test4();
        try {
            System.out.println("start");
            Employee emp = new Employee();
            System.out.println(emp);
            obj1.getApiInfo1(emp);
            obj1.getApiInfo2(emp);
            obj1.getApiInfo3(emp);
            System.out.println("end");
            System.out.println(emp);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public void getApiInfo1(Employee emp) {
        System.out.println("inside getApiInfo1:" + new Date());
        emp.setEmpId(1);
        try {
            
            TimeUnit.SECONDS.sleep(5);
            System.out.println("inside getApiInfo1 after sleep:" + new Date());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getApiInfo2(Employee emp) {
        System.out.println("inside getApiInfo2");
        emp.setDept("CSE");
    }

    public void getApiInfo3(Employee emp) {
        System.out.println("inside getApiInfo3");
        emp.setDept("CSE");
    }


    public String snackReady() {
        System.out.println("inside snackReady" + new Date().getTime());
        return "Order is ready - Enjoy your movie snacks";
    }
}
