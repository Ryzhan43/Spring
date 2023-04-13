package com.mryzhan.springreviewproject.repository;

public class RegularHours implements HoursRepository {
    @Override
    public int getHours() {
        return 40;
    }
}
