public class MemberVariableDisplay {


  public String memberName(String Name)
   {
            Member member=new Member();
            member.setName(Name);
            return member.getName();

   }
    public int memberAge(int Age)
    {
        Member member=new Member();
        member.setAge(Age);
        return member.getAge();

    }
    public String memberSalary(String Salary)
    {
        if( Salary == null )
        {
            return null;
        }
        Member member=new Member();
        Double salary=Double.valueOf(Salary);
        member.setSalary(salary);
        Salary=Double.toString(member.getSalary());
        return Salary;
    }
}
