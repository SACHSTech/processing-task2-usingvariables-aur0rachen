import processing.core.PApplet;

  /**
  * Description: Prints out a flower that works with all dimensions
  * @author: Aurora Chen
  */

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    // light blue background
    background(158, 221, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    // stem
    stroke(1, 71, 14);
    fill(14, 110, 32);
    rect((float) (width/2.01), (float) (height/1.43), (width/200), (float) (height/4.44), (width/400)); 
    
    // leaf
    line((float) (width/2.01), (float) (height/1.27), (float) (width/2.52), (float) (height/1.27));
    
    fill(14, 110, 32);
    beginShape();
    curveVertex((float) (width/2.01), (float) (height/1.27));
    curveVertex((float) (width/2.01), (float) (height/1.27));
    curveVertex((float) (width/2.22), (float) (height/1.3));
    curveVertex((float) (width/2.52), (float) (height/1.27));
    curveVertex((float) (width/2.52), (float) (height/1.27));
    endShape();

    beginShape();
    curveVertex((float) (width/2.01), (float) (height/1.27));
    curveVertex((float) (width/2.01), (float) (height/1.27));
    curveVertex((float) (width/2.22), (float) (height/1.24));
    curveVertex((float) (width/2.52), (float) (height/1.27));
    curveVertex((float) (width/2.52), (float) (height/1.27));
    endShape();

    line((float) (width/1.99), (float) (height/1.21), (float) (width/1.66), (float) (height/1.21));
    beginShape();
    curveVertex((float) (width/1.99), (float) (height/1.21));
    curveVertex((float) (width/1.99), (float) (height/1.21));
    curveVertex((float) (width/1.82), (float) (height/1.24));
    curveVertex((float) (width/1.66), (float) (height/1.21));
    curveVertex((float) (width/1.66), (float) (height/1.21));
    endShape();

    beginShape();
    curveVertex((float) (width/1.99), (float) (height/1.21));
    curveVertex((float) (width/1.99), (float) (height/1.21));
    curveVertex((float) (width/1.82), (float) (height/1.19));
    curveVertex((float) (width/1.66), (float) (height/1.21));
    curveVertex((float) (width/1.66), (float) (height/1.21));
    endShape();

    // grass
    fill(210, 255, 173);
    rect(0, (float) (height/1.08), (width), (float) (height/13.33));
    
    // petals
    stroke(240, 89, 229);
    fill(255, 201, 251);
    ellipse((width/2), (float) (height/1.79), (float) (width/11.43), (float) (height/11.43));  
    ellipse((float) (width/1.78), (float) (height/1.63), (float) (width/11.43), (float) (height/11.43)); 
    ellipse((float) (width/2.29), (float) (height/1.63), (float) (width/11.43), (float) (height/11.43)); 
    ellipse((float) (width/1.86), (float) (height/1.45), (float) (width/11.43), (float) (height/11.43)); 
    ellipse((float) (width/2.16), (float) (height/1.45), (float) (width/11.43), (float) (height/11.43));

    // center of flower
    stroke(255, 202, 25);
    fill(255, 236, 173);
    ellipse((width/2), (float) (height/1.6), (float) (width/13.3), (float) (height/13.3));

    // sun
    noStroke();
    fill(255, 234, 0);
    ellipse((width), (height/height), (float) (width/3.33), (float) (height/3.33));

    // clouds
    stroke(237, 244, 255);
    fill(237, 244, 255);
    ellipse((float) (width/6.66), (float) (height/3.33), (float) (width/11.43), (float) (height/11.43));
    ellipse((float) (width/4.44), (float) (height/3.81), (width/8), (height/8));
    ellipse((float) (width/3.33), (float) (height/3.33), (float) (width/11.43), (float) (height/11.43));
    rect((float) (width/6.66), (float) (height/3.2), (float) (width/6.66), (float) (height/33.33), (width/80));
    
    rect((float) (width/1.33), (float) (height/2.58), (float) (width/4.44), (float) (height/11.43), (float) (width/2.5));
    ellipse((float) (width/1.16), (float) (height/2.58), (width/8), (height/8));
    ellipse((float) (width/1.27), (float) (height/2.31), (float) (width/11.43), (float) (height/11.43));
    ellipse((float) (width/1.07), (float) (height/2.31), (float) (width/11.43), (float) (height/11.43));
  }
  
  // define other methods down here.
}