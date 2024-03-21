package furniture;

class woodChair implements chair {
    String type;

    public woodChair(String type) {
        this.type = type;
    }

    @Override
    public void typeOfChair() {
        System.out.println(type + " woodenChair");
    }

    @Override
    public void detailsOfChair() {
        System.out.println("DETAILS OF CHAIR PRINTED");
    }
}
