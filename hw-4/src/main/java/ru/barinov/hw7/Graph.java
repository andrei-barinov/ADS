package main.java.ru.barinov.hw7;

import java.util.List;

public interface Graph {

    void addVertex(String label);

    boolean addEdge(String startLabel, String secondLabel, int destination);

    int getSize();
    void display();

    void dfs(String startLabel, String endLabel);

}
