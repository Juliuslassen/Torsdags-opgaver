
Student[] børn= new Student[10];

void setup() {
  børn[0]= new Student ("Jack2", 20, true, 'a');
  børn[1]= new Student ("Madsen", 23, false, 'b');
  børn[2]= new Student ("Marcus", 21, false, 'b');
  børn[3]= new Student ("Marcussen", 25, false, 'a');
  børn[4]= new Student ("Seb", 19, true, 'b');
  børn[5]= new Student ("Julius", 23, false, 'b');
  børn[6]= new Student ("Tobias", 26, true, 'b');
  børn[7]= new Student ("Sander", 20, true, 'a');
  børn[8]= new Student ("Carsten", 36, false, 'b');
  børn[9]= new Student ("Felix", 30, false, 'a');

  børner(børn,4);
  
  børnenavne(børn, "Seb");
}

//5.b
void børner(Student[] børn, int k) {
  for (int i=0; i<k; i++) {
    println(i+" "+børn[i].name);
  }
}

//5.c

void børnenavne(Student[] børn, String n){
  for (int i=0; i<10; i++){
    if (børn[i].name==n){
      println(i+" "+børn[i].name);
    } 
  }
}

/*
String børnenavne(Student[] børn, String n){
  for (int i=0; i<10; i++){
    if (børn[i].name==n){
      return (børn[i]);
    } 
    else 
    {
      println("Name not found");
    }
  }
}*/
