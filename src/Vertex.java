import java.util.Objects;

import java.util.List;
import java.util.LinkedList;


public class Vertex<T> {
    private T data;
    private Integer distance = -1;

    public Integer getDistance() {
        return distance;
    }

    public Vertex(T data, Integer distance) {
        super();
        this.data = data;
        this.distance = distance;
    }


    public void setData(T data) {
        this.data = data;
    }

    private boolean visited;
    private List<T> neighbors = new LinkedList<>();

    public T getData() {
        return data;
    }


    @Override
    public String toString() {
        return "Vertex [data=" + data + ", visites=" + visited + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, neighbors, visited);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vertex other = (Vertex) obj;
        return Objects.equals(data, other.data) && Objects.equals(neighbors, other.neighbors)
                && visited == other.visited;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visites) {
        this.visited = visites;
    }

    public List getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List neighbors) {
        this.neighbors = neighbors;
    }

}