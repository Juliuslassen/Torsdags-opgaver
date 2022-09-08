color[] bColor = {#ABBCAC, #FAEE05, #FA0505, #05FA17};

int timer;

int lastTimeCheck;
int timeIntervalFlag = 3000;


int sec=1000;

void setup() {
  size(400, 400);
  background(255);
  int timer=floor(millis()/sec);
  rectMode(CENTER);
  fill(255);
  rect(200, 200, 50, 170);
  fill(0);
  rect(200, 200, 40, 150);
  fill(255);
  fill(bColor[0]);
  ellipse(200, 150, 40, 40);
  fill(bColor[0]);
  ellipse(200, 200, 40, 40);
  fill(bColor[0]);
  ellipse(200, 250, 40, 40);
  fill(0);
  rect(200, 345, 20, 120);
}

void draw() {
  
  if (millis()/sec-timer < 3) {
    fill(bColor[2]);
    ellipse(200, 150, 40, 40);
    fill(bColor[0]);
    ellipse(200, 200, 40, 40);
    ellipse(200, 250, 40, 40);
  } else if (millis()/sec-timer < 6) {
    fill(bColor[1]);
    ellipse(200, 200, 40, 40);
    fill(bColor[0]);
    ellipse(200, 150, 40, 40);
    ellipse(200, 250, 40, 40);
  } else if (millis()/sec-timer < 9) {
    fill(bColor[3]);
    ellipse(200, 250, 40, 40);
    fill(bColor[0]);
    ellipse(200, 150, 40, 40);
    ellipse(200, 200, 40, 40);
  } else if (millis()/sec-timer < 12){
    fill(bColor[1]);
    ellipse(200, 200, 40, 40);
    fill(bColor[0]);
    ellipse(200, 150, 40, 40);
    ellipse(200, 250, 40, 40);
  } 
  else {timer=floor(millis()/1000);
  println(floor(millis()/sec)-timer);
}
   
    
  
  
}
