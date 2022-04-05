package main.java.ru.barinov.hw2.entity;

public class Notebook {
    private Integer price;
    private Integer memory;
    private String producer;

    public Notebook(Integer price, Integer memory, String producer){
        this.price = price;
        this.memory = memory;
        this.producer = producer;
    }

    public Integer getPrice(){
        return this.price;
    }

    public void setPrice(Integer price){
        this.price = price;
    }

    public Integer getMemory(){
        return this.memory;
    }

    public void setMemory(Integer price){
        this.memory = memory;
    }

    public String getProducer(){
        return this.producer;
    }

    public void setProducer(String producer){
        this.producer = producer;
    }
}
