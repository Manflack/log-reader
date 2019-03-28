package resources.model;

public class Dir {
    private String ruta;
    private Integer pos;

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }
    
    public Dir() {
        super();
    }
   
    public Dir(String ruta, Integer pos) {
        super();
        this.ruta = ruta;
        this.pos = pos;
    }

}
