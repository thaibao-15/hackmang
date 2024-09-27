package lop;

public class hinhtron {
    private double getR();
    public void setR(double R){
        this.R=R;
    }
    public hinhtron(){

    }
    public hinhtron(double R)
    {
        this.R=R;
    }
    public hinhtron(hinhtron t){
        this.R=t.R;
    }
    public double tinhchuvi(){
        return 2*this.R*Math.PI;
    }
    public double tinhdientich()
    {
        return this.R*this.R*Math.PI;
    }
    public
}
