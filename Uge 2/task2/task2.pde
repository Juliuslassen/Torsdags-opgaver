boolean happy = true;

void setup() {
  if (iAmHappy())
  {
    println("I clap my hands");
  } else
  {
    println("I don't clap my hands");
  }
  println(total(20, 17));

  println(longString());
  
  println(isItUppercase());
}
//2.a
boolean iAmHappy() {
  //return happy;
  //Jack er meget smartere end mig
  if (happy=true) {
    return true;
  } else {
    return false;
  }
}

//2.b
int firstNumber;
int secondNumber;

int sum=0;

int total(int x, int y) {
  firstNumber=x;
  secondNumber=y;

  sum=x+y;
  return sum;
}

//2.c
String b="Dette er en String";

String longString() {
  return b.toUpperCase();
}

//2.d
String d_="Dette er en String";

boolean isItUppercase() {
  if (Character.isUpperCase(d_.charAt(0))) {
    return true;
    
  } else
  {
    return false;
    
  }
}
