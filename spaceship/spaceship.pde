void setup(){
   playSound();
  size(800,800);
}int x=50;
void draw(){
x++;

  background(0,0,180);
  fill(212,130,121);
 triangle(200,450-x,400,150-x,600,450-x);   
 fill(random(255),random(255),random(255));
 ellipse(400,612-x,322,322); 
 fill(random(255),random(255),random(255));
 ellipse(400,532-x,161,161);
 fill(240,240,240);
 rect(375,280-x,50,50);
stroke(155,155,155);

  }
 import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
  if (!soundPlayed) {// Copyright Wintriss Technical Schools 2013
    Minim minim = new Minim(this);        
    AudioSample sound = minim.loadSample("jay.wav");
    sound.trigger();
    soundPlayed = true;
  }
}

