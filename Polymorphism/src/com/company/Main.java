package com.company;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName(){
        return name;
    }
}

class Jaws extends Movie{
    public Jaws() {
        super("Jaws");
    }
    public String plot(){
        return "Sharks eats people";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay() {
        super("Independence Day");
    }
    public String plot(){
        return "Aliens attempt to take over Earth";
    }
}

class MazeRunner extends Movie{
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids escape maze";
    }
}

class StarWars extends Movie{
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over universe";
    }
}

class ForgettableMovie extends Movie{
    public ForgettableMovie() {
        super("Forgettable");
    }
    //No plot method
}

public class Main {

    public static void main(String[] args) {
    	for(int i = 1;i<11;i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + "\n Name of the movie is " + movie.getName() + "\n Plot is " + movie.plot());
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) ((Math.random()*5)+1);//Math.random()(0~1) * 5 will be btw 0 to 4 thus plus 1 to make it 1 to 5
        System.out.println("Random Number Generated is " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new ForgettableMovie();
            default:
                return null;
        }
    }
}
