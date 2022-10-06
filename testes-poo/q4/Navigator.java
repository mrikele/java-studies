package q4;

public class Navigator {
    private RouteStrategy rs;

    public Navigator(RouteStrategy rs){
        this.rs=rs;
    }

    public RouteStrategy getRota(){
        return this.rs;
    }
    public void setRota(RouteStrategy newrota){
        rs=newrota;
    }
    public void buildRote(RotaA rotaa, RotaB rotaB) {
        rs.buildRote(rotaa, rotaB);
    }
}
