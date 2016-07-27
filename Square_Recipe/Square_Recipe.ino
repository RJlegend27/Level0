#include <CoDrone.h>

void setup () {
  CoDrone.begin(115200);

  byte droneAddress[6] = {0x3E, 0xAE, 0x61, 0x78, 0xD5, 0xA4};

  CoDrone.AutoConnect(AddressInputDrone, droneAddress);

  CoDrone.LedColor(ArmDimming, 238, 119, 0 , 7);
  //   4. Set up the thread - HINT: 115200
  //   5. Create a byte array that holds your specific drone address
  //   6. Connect to your drone using the address - HINT: It functions as an AddressInputDrone
}
// 2. Add the method that runs repeatedly once the program starts
void loop () {
  byte left = digitalRead (11);
  byte middle = digitalRead (14);
  byte right = digitalRead (18);
  if (left == 1) {
    CoDrone.FlightEvent(Stop);
  }
  else if (right == 1) {
    CoDrone.FlightEvent(TakeOff);
    THROTTLE = 100;
    //        13. Go forward (80) and keep going up with a speed of 80
    //        Send the command
    CoDrone.Control();
    delay(2000);
    //        Wait for half a second
    PITCH = 100;

    CoDrone.Control();
    delay(2000);

    YAW = 100;

    CoDrone.Control();
    delay(2000);

    ROLL = 80;
    CoDrone.Control();
    delay(2000);

    ROLL = -80;
    CoDrone.Control();
    delay(2000);
  }
  else if (middle == 1) {
    CoDrone.FlightEvent(Landing);

    //    7. Create a variable to hold each sensor value
    //    HINT: You can name them left, middle, and right (despite being digital sensors 11, 14, and 18)

    //    8. Check to see if the left sensor is triggered
    //        10. Kill the drone - HINT: Stop the drone with a FlightEvent

    //    9. If not, check to see if the right sensor is triggered
    //        11. TakeOff
  }
  //        12. Go up with a speed of 100
  //        Send the command - HINT: Use .Control()
  //        Wait for one second - HINT: Use delay(____);

  //        14. Go right (80) and keep going up with a speed of 80
  //        Send the command
  //        Wait for half a second

  //        15. Go back (80) and keep going up with a speed of 80
  //        Send the command
  //        Wait for half a second

  //        16. Go left (80) and keep going up with a speed of 80
  //        Send the command
  //        Wait for half a second

  //        17. Land
}
