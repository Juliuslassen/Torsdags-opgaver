int[] arrNum={5, 1, 4};
String[] arrStr={"Julius", "Jack", "Bjarke", "Carsten", "Guf10"};
boolean[] arrBoo={false, true, false};

void setup() {
  printString(arrStr);
  printint(arrNum);
  arrNumAvg(arrNum);
  arrNumSort(arrNum);
}

//4.b
void printString(String[] arrStr) {
  //almindeligt loop
  /*
  for (int i=0; i< arrStr.length; i++){
   println(arrStr[i]);
   }*/

  //for each loop
  for (String str : arrStr) {
    println(str);
  }
}

//4.c
int sum;
void printint(int[] arrNum) {

  for (int i=0; i< arrNum.length; i++) {
    sum+=arrNum[i];
  }
  println(sum);
}

//4.d = ET HELT TAL hvis man bruger int
float avg;
float total;
void arrNumAvg(int[] arrNum) {

  for (int i=0; i< arrNum.length; i++) {
    total+=arrNum[i];
  }
  println(total);
  avg=total/arrNum.length;
  println(avg);
}


//4.E sort(), og der skal bruges samme navn åbenbart
void arrNumSort(int[] arrNum) {
  arrNum= sort(arrNum);
  println(arrNum);
}
