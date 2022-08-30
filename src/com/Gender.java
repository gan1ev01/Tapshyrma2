package com;

public enum Gender {
    Male("I am Male"),
    Female("I am Female");

    private String deviz;

    Gender(String deviz) {
        this.deviz = deviz;
    }
    @Override
    public String toString() {
        return "Gender{" +
                "deviz='" + deviz +'\'' +
                '}';
    }


}
