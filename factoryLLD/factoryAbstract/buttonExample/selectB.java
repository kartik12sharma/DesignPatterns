package buttonExample;

class selectB implements button{
    private String type;
    public selectB(String m){
        type = m;
    }
    @Override
    public void display(){
        System.out.println(this.type + " select");
    }
}
