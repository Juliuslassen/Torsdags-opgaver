void setup() {
  //MethodOne(); 
  MethodTwo(); 
}

/*
  The following method has an error in it. Fix the error and run it. 
*/

/*
void MethodOne()
{
  int i = 1000; // You are not allowed to change this line. 
   
  int max = 10;
  
  String output = "i is greater than "+max+"."; 
  if (i > max)
  {
    println(output);
  } 
}
*/

/* 
  Finish the following method so that we can change the number assigned 
  to the weekday and it prints the correct output.  
*/


void MethodTwo() 
{
  int[] weekDay = {0,1,2,3,4,5,6}; // 0 = Monday, 6 = Sunday. 
  boolean weekend = false;
  
  int index=int(random(weekDay.length));
  if (index < 5)
  {
    weekend = false;
   
  }
  else 
  {
    weekend = true;
    
  }
  
  
  // Print the name of the weekday here: 
  switch (index){
    case 0:
    println("Its Monday");
    println(index);
    break;
    case 1:
    println("Its Tuesday");
    println(index);
    break;
    case 2:
    println("Its Wenesday");
    println(index);
    break;
    case 3:
    println("Its Thursday");
    println(index);
    break;
    case 4:
    println("Its Friday");
    println(index);
    break;
    case 5:
    println("Its saturday");
    println(index); 
    break;
    case 6:
    println("Its SUNDAY");
    println(index);
    break;
    default:
    println("not valid input");
    break;
    
  }
    
    
  // Print if it is weekend here:
  if( weekend){
    println("Its weekend");
    
  }
}
