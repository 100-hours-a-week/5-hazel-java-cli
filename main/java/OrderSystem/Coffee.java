package OrderSystem;

//카페메뉴가 커피를 상속함
public class Coffee extends CafeMenu {
    private boolean isHot;

    public Coffee(String name, double price) {
        super(name, price);
        this.isHot = false; //차갑게
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("온도: " + (isHot ? "뜨겁게" : "차갑게"));
    }

}