import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;
import edu.fcps.karel2.WorldFrame;
  
public class L9ShiftingPiles {
   
   // declare and initialize array of map choices for the dialogue drop-down options
   public static final String[] choices = {"pile1", "pile2", "pile3" };   

   public static void main(String[] args) 
   {
      // open dialogue box and request user input of map choices
      String mapChoice = (String)JOptionPane.showInputDialog(null,"Choose an map.", "Map Choices", JOptionPane.PLAIN_MESSAGE, null, choices, choices[0]);
         
      // open selected map and set size and speed
      Display.openWorld("maps/"+ mapChoice +".map");
      Display.setSize(10, 10);
      Display.setSpeed(6);
      //make frame pop up in top left corner of computer screen
      WorldFrame.getCurrent().setLocation(0, 0);
      Athlete jo = new Athlete(1,1, Display.EAST, 0);
      for(int i=0; i<6;i++)
      {
         jo.move();
      }
      jo.turnAround();
      jo.move();
      for(int i=0; i<5;i++) {
         jo.pickBeeper();
      }
      
         
      for(int i=0; i<1;i++){
         jo.turnAround();
      }
      jo.move();
      for(int i=0; i<5;i++){
         jo.putBeeper();
      }
      for(int i=0; i<1;i++){
         jo.turnAround();
      }
      jo.move();
      jo.move();
      jo.move();
      for(int i=0; i<2;i++){
         jo.pickBeeper();
      }
      for(int i=0; i<1;i++){
         jo.turnAround();
      }
      jo.move();
      for(int i=0; i<2;i++){
         jo.putBeeper();
      }
      for(int i=0; i<1;i++){
         jo.turnAround();
      }
      jo.move();
      jo.move();
      for(int i=0; i<8;i++){
         jo.pickBeeper();
      }
      for(int i=0; i<1;i++){
         jo.turnAround();
      }
      jo.move();
      for(int i=0; i<8;i++){
         jo.putBeeper();
      }
      for(int i=0; i<1;i++){
         jo.turnAround();
      }
      jo.move();
      jo.move();
      for(int i=0; i<6;i++){
         jo.pickBeeper();
      }
      for(int i=0; i<1;i++){
         jo.turnAround();
      }
      jo.move();
      for(int i=0; i<6;i++){
         jo.putBeeper();
      }
      for(int i=0; i<1;i++){
         jo.turnAround();
      }
      for(int i=0; i<1;i++){
         jo.move();
      }



   }

   

}