## FATE_Dice_Roller

My goal for this project is to create a dice roller-app for the pen&paper roleplay-system FATE.


# The basics: Rolling dice in FATE

Like most other role playing games, FATE uses dice rolls combined with modifiers to determine the outcome of actions performed by the characters ingame.
The FATE-system utilizes special dice, also called "Fudge Dice", that have only three possible outcomes: 
Two sides are marked with a +, two sides show a - and the last two sides are blank, therefore generating the values of -1, 0 and +1.
In FATE, the player always rolls four dice, which means the result of the lies between -4 and +4. 
Added to (or subtracted from) the dice roll are modifiers, which are determined accoirding to several game rules before the roll is made.
The combination of the modifiers and the roll is the value that determines the outcome of the performed ingame action.
But: If the player isn't content with the outcome, he may spend ingame resources to either add +2 to the outcome or perform a re-roll (with the modifiers remaining the same).

# What the app is supposed to do (when finished...):

The FATE dice roller is supposed to do the following things:
- On the starting screen, the player may enter a modifier (default: 0) and then press a button to roll the four dice.
- The individual dice are displayed as images.
- The outcome is calculated from the entered modifier and the dice roll and displayed within a text view.
- Afer performing the initial roll, the player has three options (buttons):
  -> Add +2: The outcome is raised by 2 and the new outcome is displayed. The dice don't change.
  -> Re-roll: The dice are rolled anew, while the modifier stays the same. The new outcome is displayed.
  -> New Roll: Set everything back to default.
