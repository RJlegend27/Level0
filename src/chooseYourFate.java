import javax.swing.JOptionPane;

public class chooseYourFate {
	public static void main(String[] args) {
		String userInput = JOptionPane.showInputDialog("You see a BASKETBALL and a PEN AND PAPER what do you choose?");
		if (userInput.equalsIgnoreCase("basketball")) {
			String weirdBounce = JOptionPane.showInputDialog(
					"You start bouncing the ball it takes a werid bounce and it rolls off do you FOLLOW THE BALL or GET THE PEN AND PAPER");
			if (weirdBounce.equalsIgnoreCase("pen and paper")) {
				JOptionPane.showInputDialog("");
			} else if (weirdBounce.equalsIgnoreCase("Follow the ball")) {
				String cliff = JOptionPane.showInputDialog(
						"You are behind the ball so you start running, you then see the ball go off a cliff do you either TAKE THE LONG WAY DOWN or JUMP OFF");

				if (cliff.equalsIgnoreCase("take the long way down")) {
					String fishPeople = JOptionPane
							.showInputDialog("You meet three fish people, do you FIGHT THEM or TALK TO THEM");
				} else if (cliff.equalsIgnoreCase("jump off")) {
					String waterJump = JOptionPane.showInputDialog(
							"You jump off the cliff and see a body of water the basketball goes in a underwater cave, do you SWIM IN THE CAVE or get out and INVESTIGATE");

					if (waterJump.equalsIgnoreCase("Investigate")) {
						String hikingGem = JOptionPane.showInputDialog(
								"You start hiking and you spot a yellow glowing gem, do you TAKE IT or THROW A ROCK AT IT");
					} else if (waterJump.equalsIgnoreCase("Swim in the Cave")) {
						String runOxygen = JOptionPane.showInputDialog(
								"You swim in the cave but, you run out of oxygen, do you HOLD YOUR BREATH LONGER or TRY AND FIND A AIRPOCKET ");
					}
				}
			}

		} else if (userInput.equalsIgnoreCase("pen and paper")) {
			String flyBothering = JOptionPane
					.showInputDialog("You start drawing and a fly starts bothering you do you IGNORE IT or KILL IT");
			if (flyBothering.equalsIgnoreCase("Ignore it")) {
				String earFly = JOptionPane.showInputDialog(
						"you ignore the fly it then starts going in your ear (you can't do anything becuase you ignored it so) you start to blanking out, do you either WAKE YOURSELF UP or GO TO SLEEP");
			} else if (flyBothering.equalsIgnoreCase("kill it")) {
				String lifeBlood = JOptionPane.showInputDialog(
						"you stab the fly with your pen, then you see the blood of the fly make plants and animals. You then take the fly and GROW PLANTS AND ANIMALS or DRINK THE BLOOD");
				if (lifeBlood.equalsIgnoreCase("Grow plants and animals")) {
					JOptionPane.showInputDialog(
							"You make this place all bright and green with plants and animals do you TRAIN THE ANIMALS or MAKE POTIONS WITH THE PlANTS");

				} else if (lifeBlood.equalsIgnoreCase("drink the blood")) {
					String dietBlood = JOptionPane.showInputDialog(
							"You drink the blood and nothing happens do you wait for the effect to happen by SLEEP or do you EAT THE FLY");

					if (dietBlood.equalsIgnoreCase("SLEEP")){
						JOptionPane.showInputDialog("When you sleep you grow wings, multiple eyes, and eight legs! You start to see someone using a pen and paper, do you BOTHER THEM or LEAVE THEM BE");
					}

				}
			}
		}

	}

}
