package com.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class Test3 {




    public static void main(String args[]) {
        Test3 obj1 = new Test3();
        try {
            System.out.println("start");
            Employee emp = new Employee();
            System.out.println(emp);
            List<CompletableFuture<Void>> ls = new ArrayList<>();

            ls.add(obj1.getApiInfo1(emp));
            ls.add(obj1.getApiInfo2(emp));
            ls.add(obj1.getApiInfo3(emp));
            ls.forEach(CompletableFuture::join);
            System.out.println("end");
            System.out.println(emp);
    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    CompletableFuture<Void> getApiInfo1(Employee emp) {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("inside getApiInfo1:" + new Date());
            emp.setEmpId(1);
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.println("inside getApiInfo1 after sleep:" + new Date());
            } catch (Exception e) {
                e.printStackTrace();
            }

        });
        return future;
    }

    CompletableFuture<Void> getApiInfo2(Employee emp) {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("inside getApiInfo2:" + new Date());
            emp.setDept("CSE");
        });
        return future;
    }

    CompletableFuture<Void> getApiInfo3(Employee emp) {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("inside getApiInfo3:" + new Date());
            emp.setName("AKHIL DORNALA");
        });
        return future;
    }


}
