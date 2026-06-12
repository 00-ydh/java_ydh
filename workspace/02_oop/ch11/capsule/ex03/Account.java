package ch11.capsule.ex03;

public class Account {
    private int balance;//잔고

    public int getBalance() {
        return balance;
    }

    //입금
    public void deposit(int amount){
        if(amount>0){
            this.balance += amount;
            System.out.println(amount+"이 입금되었습니다. 잔고는 "+balance+"입니다.");
        }else{
            System.out.println("입금액이 잘못 되었습니다.");
        }

    }
    //출금
    public void withdraw(int amount){
        if(amount > balance){
            System.out.println("잔고가 부족합니다.");
        }else{
            this.balance -= amount;
            System.out.println(amount+"이 출금되었습니다. 잔고는 "+balance+"입니다.");
        }

    }
}
