public class Main {
    public static void main(String[] args) {
        Author ekkel = new Author("Брюс", "Борис");
        Author martin = new Author("Робкрт", "Николай");


        Book javaPhilosophy = new Book("Философия Java", ekkel, 2017);
        Book javaPhilosophy2 = new Book("Философия Java", ekkel, 2017);
        Book cleanCode = new Book("Чистый код", martin, 2012);

        System.out.println(javaPhilosophy.equals(javaPhilosophy2));
        System.out.println(javaPhilosophy.equals(cleanCode));

        System.out.println(javaPhilosophy);
        System.out.println(cleanCode);

        javaPhilosophy.setPublicationYear(2024);

        System.out.println(javaPhilosophy);

        System.out.print(javaPhilosophy.hashCode());

    }
}