class Ball {
  final static int MOVING = 0;
  float x; float y; float rad; color c; int state;
  
  /*
    Ball(float initX, float initY, color initC, float initDX, float initDY)
    {
      x = initX;
      y = initT;
      r = 50;
      c = initC;
      dx = initDX;
      dy = initDY;
    }
  */
  
  Ball() {
    float r = random(256);
    float g = random(256);
    float b = random(256);
    c = color(r, g, b);
    rad = 10;
    x = random((width - r) + r/2);
    y = random((height - r) + r/2);
    dx = random(10) - 5;
    dy = random(10) - 5;
    state MOVING;
  }
  
  void move() {
    x = x + dx;
    y = y + dy;
    bounce();
  }
  
  void process() {
    if ( state == MOVING ) {
      move();
    }
  }
  
  void draw() {
    if ( state != DEAD ) {
      ellipse(RADIUS);
      fill(c);
      stroke(c);
      ellipse(x, y, rad, rad);
    }
  }
  
  void bounce() {
    if ( x < 0) {
      dx = abs(dx);
    }
    if ( x > width) {
      dx = -1 * abs(dx);
    }
    if ( y < 0 ) {
      dy = abs(dy);
    }
    if ( y > height ) {
      dy = -1 * abs(dy);
    }
  }
}
  
  void setup() {
    size(400, 400);
    stroke(255);
    background(192, 64,0);
  }
  
  void draw() {
    background(0);
    fill(255, 0, 0, 50);
    stroke(10, 255, 255);
    ellipse(200, 200, 80, 100);
    
  }
  
  void mouseClicked() {
    background(255);
  }
}
