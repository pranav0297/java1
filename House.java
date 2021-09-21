public enum House {
    OneBHK(500000),TwoBHK(1000000),ThreeBHK(1500000),FourBHK(2000000);

    private int price;

    House(int p){
        price =p;
    }

    int getPrice(){
        return price;
    }
}


