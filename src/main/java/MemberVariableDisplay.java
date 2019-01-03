public class MemberVariableDisplay {
    public String memberName(String Name)
    {
        if( Name == null )
        {
            return null;
        }
        return Name;
    }
    public int memberAge(int Age)
    {
        if( Age == 0 )
        {
            return 0;
        }
        return Age;
    }
    public String memberSalary(String Salary)
    {
        if( Salary == null )
        {
            return null;
        }
        return Salary;
    }
    public void variableInitialise()
    {
        Member obj=new Member();
        obj.Name="Harry Potter";
        System.out.println(memberName(obj.Name));
        obj.Age=30;
        System.out.println(memberAge(obj.Age));
        obj.Salary=2500.0;
        System.out.println(memberSalary(Double.toString(obj.Salary)));
    }
}
