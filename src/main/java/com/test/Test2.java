package com.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.SimpleTimeZone;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Test2 {

    public static void main(String args[]) {
        Test2 obj1 = new Test2();
        try {
            System.out.println("start");
            Employee emp = new Employee();
            System.out.println(emp);
            List<CompletableFuture<Void>> ls = new ArrayList<>();

            ls.add(obj1.getApiInfo1(emp));
            ls.add(obj1.getApiInfo2(emp));
            ls.add(obj1.getApiInfo3(emp));
//            ls.forEach(CompletableFuture::join);
            System.out.println("end");
            System.out.println(emp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    CompletableFuture<Void> getApiInfo1(Employee emp) {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("inside getApiInfo1");
            emp.setEmpId(1);
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.println("inside getApiInfo1 after sleep");
            } catch (Exception e) {
                e.printStackTrace();
            }

        });
        return future;
    }

    CompletableFuture<Void> getApiInfo2(Employee emp) {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("inside getApiInfo2");
            emp.setDept("CSE");
        });
        return future;
    }

    CompletableFuture<Void> getApiInfo3(Employee emp) {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("inside getApiInfo3");
            emp.setDept("CSE");
        });
        return future;
    }

    public String snackReady() {
        System.out.println("inside snackReady" + new Date().getTime());
        return "Order is ready - Enjoy your movie snacks";
    }


}
