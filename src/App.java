public class App {
    public static void main(String[] args) throws Exception {
        Email em = new Email("Emma", "Roger");
        em.setAlternativeEmail("pink.pinky@sales.abc.com");
        em.changePassword("pinkpinkpink1234");
        System.out.println("Email Capacity: "+ em.getEmailCapacity()); 
    }
}
