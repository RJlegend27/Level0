void setup(){
  size(1000,1000);
  fill(238 , 204, 170);
  ellipse(560,460,550,550);
}
 void draw(){ 
   PImage pepperoni = loadImage("pepperoni.ppm.gif");
   pepperoni.resize(10,10);
   image(pepperoni, 50 , 50);
   PImage cheese =  loadImage("cheese.ppm.gif");
   cheese.resize(10,10);
   image(cheese, 50 , 50);
   PImage sausage = loadImage ("sausage.ppm.gif");
   sausage.resize(10,10);
   image(sausage, 50, 50);
   PImage olive = loadImage ("olive.ppm.gif");
   olive.resize(10,10);
   image(olive, 50, 50);
  
  
  
    
}
