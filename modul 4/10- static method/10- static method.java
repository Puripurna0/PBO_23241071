import java.until.ArrayList;

class player{
    // variabel objek
    private String nama;
    // variabel static
    static int numberOfPlayer;
    // array variabel
    private static ArraList<Sring> namaList = new ArrayList<String>();

    // konstruktor
    player (String nama){
        this.nama = nama;
        player.numberOfPlayer++;
        player.namaList.add(this.nama);

    }

    // method static cetak numberOfPlayer
    static void showNumberOfplayer(){
        System.out.println("NumberOfPlayer : " + Player.numberOfPlayer );

    }

    // method cetak
    void cetak(){
        System.out.println("Player name : " + this.name);
    }

    //method static getter
    static ArrayList<String> getname(){
        return Player.nameList;
    }

}

public class App {
    public static void main (String [] args )throws Exception {
    // membuat objek
    Player player1 = new Player ("Jisoo");
    Player player2 = new Player("Jennie");
    Player player3 = new Player ("Lisa");
    Player player4 = new Player ("Rose");
    Player player5 = new player ("BLACKPINK");

    Player.showNumberOfPlayer();

    player1.cetak();

    // panggil array nama objek
    System.out.println("Nama : " + Player.getName());
    }
}

