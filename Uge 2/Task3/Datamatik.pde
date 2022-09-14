//3.i
Teacher jeff;

Student jack;
Student bjarke;

void setup(){
 jeff= new Teacher("Jeff", 78, false);
 
 jack= new Student("Jack",45, true, 'b');
 bjarke= new Student("Bjark", 19, false, 'a');
 
 println(jeff.name);
 
 println(bjarke.name,jack.name);
 //println(jack.name);
  
}
