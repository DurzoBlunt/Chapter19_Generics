public class Main {
    public static void main(String[] args) {
        Integer[] list = new Integer[25];
        LinearSearch search = new LinearSearch();

        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }

        for(int i = 0; i < list.length; i++){
            System.out.println(search.linearSearch(list, i)+"valid");
        }

        System.out.println(search.linearSearch(list, 26)+" invalid");

    }
}
