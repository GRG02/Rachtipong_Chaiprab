package com.sau.dti.d;

//Encapsulation ห่อหุ้ม data = data ทุกตัวเป็น private

public class Test06 {
    //data
    private int scoreTotal;
    private String empName;
    private double proPrice;
    
    //method -> getter เอาค่า data ไปใช้, setter กำหนดค่าให้กับ data
    public int getScoreTotal(){
        return scoreTotal;
    }
    
    public void setScoreTotal(){
        this.scoreTotal = scoreTotal;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getProPrice() {
        return proPrice;
    }

    public void setProPrice(double proPrice) {
        this.proPrice = proPrice;
    }
    
    
}

