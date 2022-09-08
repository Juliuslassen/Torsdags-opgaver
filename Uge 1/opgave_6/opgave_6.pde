/*int a=(int)random(15);
 int b=(int)random(15);
 
 if (a+b==10 || a==10 || b==10){
 println("Succes!");
 println(a ,b);
 } else {
 println("Failure!");
 println(a ,b);
 }
 
 */


int x=(int)random(30);
int y=(int)random(30);
int z=(int)random(30);

if (x+y+z==30 && x!=10 && x!=20 && x!=30 && y!=10 && y!=20 && y!=30 && z!=10 && z!=20 && z!=30 ) {
  println("Succes!");
  println(x, y,z,x+y+z);
} else {
  println("Failure!");
  println(x,y,z,  x+y+z);
}
