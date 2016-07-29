#include <CoDrone.h>
void setup() {
  
  // put your setup code here, to run once:
  CoDrone.begin(115200);

  byte droneAddress[6] = {0x3E, 0xAE, 0x61, 0x78, 0xD5, 0xA4};

  CoDrone.AutoConnect(AddressInputDrone, droneAddress);

  CoDrone.LedColor(ArmDimming, 136, 255, 0, 7);

  CoDrone.BattleBegin(TEAM_YELLOW); 
}

void loop() {
  // put your main code here, to run repeatedly:
  byte left = digitalRead (11);
  byte middle = digitalRead (14);
  byte right = digitalRead (18);
  if (left == 1) {
    CoDrone.FlightEvent(Stop);
    CoDrone.Buzz(2000,7);
  }
  else if (middle == 1) {
    CoDrone.FlightEvent(Landing);
    CoDrone.Buzz(4000,7);
    }
  else if (right == 1) {
    CoDrone.BattleShooting();
    CoDrone.ButtonPreesHoldWait(18);
    CoDrone.Buzz(1000,7);
    }
  THROTTLE = CoDrone.AnalogScaleChange(analogRead(A4));
  PITCH = CoDrone.AnalogScaleChange(analogRead(A6));
  ROLL = -1 * CoDrone.AnalogScaleChange(analogRead(A5));
  YAW = -1 * CoDrone.AnalogScaleChange(analogRead(A3));
  CoDrone.Control();     
}
