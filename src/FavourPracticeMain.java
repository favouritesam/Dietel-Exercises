public class FavourPracticeMain {
    public static void main(String[] args) {
      FavourPractice favourPractice = new FavourPractice("Favour","Ebere",12345);
        System.out.println(favourPractice.getFirstName() + favourPractice.getLastName());
        favourPractice.getAccountNumber();
        favourPractice.setFirstName(favourPractice.getFirstName());

    }
}
