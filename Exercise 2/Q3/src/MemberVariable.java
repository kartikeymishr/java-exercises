public class MemberVariable {
    public static void main(String[] args) {
        Member member = new Member("Harry Potter", 30, 2500.3);

        System.out.println("Member's name: " + member.getName());
        System.out.println("Member's age: " + member.getAge());
        System.out.println("Member's salary: " + member.getSalary());
    }
}
