/**
 * a class named Member with Name, age, Salary as its variable,
 * write an other class named Member Variable that creates an instance of the Member class
 * initialises its member variables, and then displays the value of each member variable.
 * Output:
 * Members Name: Harry Potter
 * Members Age: 30
 * Members Salary: 2500.3
 */
package com.stackroute.PE2;

public class MemberVariableDisplay {

    /*Setting and Getting Member Name */
  public String memberName(String Name)
   {
            Member member=new Member();
            member.setName(Name);
            return member.getName();

   }
    /*Setting and Getting Member Age */
    public int memberAge(int Age)
    {
        Member member=new Member();
        member.setAge(Age);
        return member.getAge();

    }

    /*Setting and Getting Member Salary */
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
