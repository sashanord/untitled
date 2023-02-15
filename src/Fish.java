public class Fish implements Swimable{
    @Override
    public void swim() {
        eat();
        System.out.println("Рыбка плывёт. Буль-буль");
    }

    private void eat(){
        System.out.println("ЧТобы плавать, надо кушат");
    }
}
