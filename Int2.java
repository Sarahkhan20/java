class N implements C,D{


    public void p() {
        System.out.println("I am p");
    }

    public void q() {
        System.out.println("I am q");
    }
    public void r() {
        System.out.println("I am r");
    }
    public void s() {
        System.out.println("I am s");
    }
}

class Int2{
    public static void main(String args[]){
        N p=new N();
        p.p();
        p.q();
        p.r();
        p.s();
    }
}
