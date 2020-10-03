package pl.sda.springquiz.service;

public class NotEnoughPoints extends Exception{
    @Override
    public String getMessage() {
        return "Points after transfer  are lower than zero!!!";
    }
}
