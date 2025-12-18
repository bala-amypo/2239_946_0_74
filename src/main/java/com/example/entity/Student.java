pacakage.com.example.demo.entity;
@entity
public class Student{
    @id
    private int id;
    private string name;
    private string email;
    private float cgpa;
    public int getID(){
        return id;
    }
    public int setId(int id){
    this.id=id;
    }
    public String getName(){
        return name;
    }
    public String setName(String name){
        this.name=name;
    }
    Public String getEmail(){
        return Email;
    }
    Public void SetEmail(String email){
    This.email=email;
    }
    Public Float getCgpa(){
        return Cgpa;
    }
    Public Float setCgpa(Float Cgpa){
        this.Cgpa=Cgpa;
    }

    }
}