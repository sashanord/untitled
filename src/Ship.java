public class Ship implements Swimable{
    @Override
    public void swim() {
        prepare();
        System.out.println("Кораблик плывёт. Буль-буль");
    }

    private void prepare(){
        System.out.println("Чтобы плавать, нужно заправиться");
    }
}
