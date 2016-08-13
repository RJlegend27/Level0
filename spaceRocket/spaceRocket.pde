/* 1. Change the code below to make the rocket ship take off. */
/* 2. Add a moon and stars to the sky. */

int x = 400;
int y = 600;
int planetSize = 640;
void setup() {
  background(0, 0, 40);
  size(800, 800);
}

void draw() {
  
  y --;
  fill(random(255), 0, 0);
  ellipse(x, y + 130, 90, 90);
  fill(248, 128, 0);
  ellipse(x, y + 115, 70, 70);
  fill(255, 153, 0);
  ellipse(x, y + 95, 35, 35);
  fill(100, 100, 100);
  triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100);
  fill(68,0,153);
  ellipse(0,500,planetSize,planetSize);
  fill(51,255,136);
  ellipse(750,40,70,70);
  fill(95,0,34);
  ellipse(750,750,50,50);
  
}


