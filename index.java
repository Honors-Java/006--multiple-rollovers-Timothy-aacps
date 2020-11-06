void setup() {
	size(400, 400);
}

void draw() {
	background(255);
	stroke(0);

  //start creating the lines
  line(00,200,400,200);
  line(200,00,200,400);

  //Fill a black color

  //Build your conditional statement 
	if (mouseX < 200 && mouseY < 200){
    fill(0);
    rectMode(CENTER);
    rect(100,100,200,200);
  } else if (mouseX < 200 && mouseY > 200){
    fill(0);
    rectMode(CENTER);
    rect(100,300,200,200);
  } else if (mouseX > 200 && mouseY < 200){
    fill(0);
    rectMode(CENTER);
    rect(300,100,200,200);
  } else if (mouseX > 200 && mouseY > 200){
    fill(0);
    rectMode(CENTER);
    rect(300,300,200,200);
  }

}