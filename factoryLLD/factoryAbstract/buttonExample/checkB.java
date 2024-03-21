package buttonExample;

class checkB implements button{
    private String type;
    public checkB(String m){
        type = m;
    }
    @Override
    public void display(){
        System.out.println(this.type+" check");
    }
}
