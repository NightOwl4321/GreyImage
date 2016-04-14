package project;

import java.util.Random;

public class GreyImage
{
 public static final int BLACK = 0;
 public static final int WHITE = 255;
 /** The 2-dimensional representation of this image. Guaranteed not to be null.
 * All values in the array are within the range [BLACK, WHITE], inclusive.
 */
 static int[][] pixelValues;
 public static void main(String[] args) {
	 pixelValues = new int[2][2];

	 for (int i = 0; i < pixelValues.length; i++){
	     for (int j = 0; j < pixelValues[i].length; j++){
	    	 Random r = new Random();
	    	 pixelValues[i][j] = r.nextInt(256);
	     } 
	 }
	 
	 processImage();
}
 

 /** @return the total number of white pixels in this image.
 * Postcondition: this image has not been changed.
 */
 public static int countWhitePixels()
 { /* to be implemented in part (a) */ 
	 int whiteNum = 0;
	 for (int i = 0; i < pixelValues.length; i++){
	     for (int j = 0; j < pixelValues[i].length; j++){
	    	 if(pixelValues[i][j] == 255) {
	    		 whiteNum++;
	    	 }
	     } 
	 }
	 System.out.println("iran");
	 System.out.println(whiteNum);
	 return whiteNum;
 }
 /** Processes this image in row-major order and decreases the value of each pixel at
 * position (row, col) by the value of the pixel at position (row + 2, col + 2) if it exists.
 * Resulting values that would be less than BLACK are replaced by BLACK.
 * Pixels for which there is no pixel at position (row + 2, col + 2) are unchanged.
 */
 public static void processImage() {
	 
//
	 for (int i = 0; i < pixelValues.length-2; i++){
	     for (int j = 0; j < pixelValues[i].length-2; j++){
	    	 System.out.println(pixelValues[i][j]);
	     } 
	 }
	 
	 //
	 for (int i = 0; i < pixelValues.length-2; i++){
	     for (int j = 0; j < pixelValues[i].length-2; j++){
	    	 if(pixelValues[i][j] != 0) {
	    		 pixelValues[i][j] =- pixelValues[i+2][j+2];
	    	 }
	     } 
	 }
	 
	 ///
	 //
	 for (int i = 0; i < pixelValues.length-2; i++){
	     for (int j = 0; j < pixelValues[i].length-2; j++){
	    	 System.out.println(pixelValues[i][j]);
	     } 
	 }
	 
	 //
	 ///
	 
 }
} 