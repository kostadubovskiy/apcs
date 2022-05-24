float x;
float y;
float dx = .3;
float dy = .3;
int rad;

void setup() {
  size(1000, 1000);
  background(0);
  x = 50;
  y = 50;
}

void draw() {
  background(0);
  ellipse(x, y, rad, rad);
  stroke(256);
}

void keyPressed() {
  if(keyCode == UP) y-=dy;
  if(keyCode == DOWN) y+=dy;
  if(keyCode == RIGHT) x+=dx;
  if(keyCode == LEFT) x-=dx;
  if((key == 'x' || key == 'X') && (dx <= 5)) dx++;
  if((key == 'y' || key == 'Y') && (dy <= 5)) dy++;
  if(key == ' ') rad++;
}
