#include <CoDrone.h>
unsigned long startTime;
int step;

void setup() {
  CoDrone.begin(115200);

  byte droneAddress[6] = {0x3E, 0xAE, 0x61, 0x78, 0xD5, 0xA4};

  CoDrone.AutoConnect(AddressInputDrone, droneAddress);

  CoDrone.LedColor(ArmDimming, 0 , 0 , 0 , 7);


}

void loop() {
  // put your main code here, to run repeatedly:
  byte left = digitalRead (11);
  byte middle = digitalRead (14);
  byte right = digitalRead (18);
  if (left == 1) {
    CoDrone.FlightEvent(Stop);
    step = 0;
  }
  else if (right == 1) {
    
    step = step + 1;
    if (step  > 4) {
      step = 0;
    }
     CoDrone.Buzz( 5000 , 10);
     delay(200);
  }

  else if (middle == 1) {
    CoDrone.FlightEvent(Landing);

  }
  if (step == 1) {
    THROTTLE = 100;
    CoDrone.Control();
  }
  else if (step == 2) {
    PITCH = 50;
    THROTTLE = 0;
    CoDrone.Control();
  }
  else if (step == 3) {
    ROLL = -80;
    CoDrone.Control();
  }
  else if (step == 4) {
    PITCH = 100;
    CoDrone.Control();
  }
  else {
    CoDrone.FlightEvent(Landing);
  }
}









































