import java.util.HashMap;

class WrongLoginException extends Exception{}
class WrongPasswordException extends Exception{}

class WrongLoginOrPasswordException extends Exception{}

class Account{

    static HashMap<String, String> logAndPass = new HashMap<>();

    String login;
    String password;

    void checkLogin(String s) throws WrongLoginException{
        if (s == null || s.length() <= 5 || s.length() >= 20){
            throw new  WrongLoginException();
        }
        this.login = s;

        logAndPass.put(s, this.password);
    }

    void checkPassword(String pas1, String pas2) throws WrongPasswordException{
        if (pas1 == null || pas1.length() < 8 || pas1.length() > 20 || ! pas1.equals(pas2)) {
            throw new WrongPasswordException();
        }
        this.password = pas1;

        logAndPass.put(this.login, pas1);
    }

    void checkLoginAndPassword(String login, String password) throws WrongLoginOrPasswordException {
        if (logAndPass.containsKey(login) && logAndPass.get(login).equals(password)){
            System.out.println("Вы успешно вошли в аккаунт!");
        } else {
            throw new WrongLoginOrPasswordException();
        }
    }
}


public class Main {
    public static void main(String[] args)  {
        Account.logAndPass.put("логин","пароль");

        Account account = new Account();
        try {
            account.checkLogin("ddd");
        } catch (WrongLoginException e) {
            System.out.println("Неправильный логин!");
        }

        try {
            account.checkPassword("pass", "pass1");
        } catch (WrongPasswordException e) {
            System.out.println("Неправильный пароль!");
        }

        try {
            account.checkLoginAndPassword("неправильный логин", "неправильный пароль");
        }
        catch (WrongLoginOrPasswordException e) {
            System.out.println("Неправильный логин или пароль");
        }

        try {
            account.checkLoginAndPassword("логин", "пароль");

        } catch (WrongLoginOrPasswordException e) {
            throw new RuntimeException(e);
        }

    }
}