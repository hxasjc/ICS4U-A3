# Animal Competition - Assignment

In this document:
* Objectives
* Synopsis
* Requirements
* Instructions
* Rubric
* How to meet expectations

## Objectives
The goal for you to complete this assignment is for you to:
1. Practice Object Oriented Programming (OOP) and implement the pillars of OOP.
2. General programming best practices:
   1. Naming conventions
   2. Documentation
   3. DRY principle
3. Optional: Practice using Version Control Systems (VCS) like Git

## Synopsis
In role-playing games (RPG) like Dungeon and Dragons and Pokemon, a common scenario is for two entities to compete in a head-to-head battle.  The general requirement for this assignment is to **build on the *OOP with Animals* templates** and **create a game** that pits 2 animals in (friendly) competition and determine a winner based on your own creative algorithm.

## Requirements
1. As the **game designer**, I want the algorithm (that will determine the winner/score) to be **secret**, so that **players will be challenged** in trying to figure out which features and circumstances would make one animal better than another

2. As the **game designer**, I want the algorithm to take into account the **environment**, so that **players will be challenged** in trying to figure out which features and circumstances would make one animal better than another
   
   1. For example, in a “night-time” environment, vision and hearing may be more important traits than speed; in a “desert” environment, animals that require less water may be stronger than animals that require more water; etc.
   
3. As a **player**, I want to **play by myself** to configure 2 animals and have them face-off to see the winners (and scores), so that I can **iteratively try to figure out the optimal animal features**.

   1. Get started: Make a default opponent that is always the same. Allow the player to configure their animal quickly and easily.
   
      1. This can be by clicking on a window/GUI
      
      2. This can be typing in letters or numbers that correspond to a trait
      
      3. It can be choosing pre-defined traits or giving the option to fully customise.
      
   2. Extend: As a **player**, I want to **play the next level** to go up against a more challenging opponent and be given a chance to build up my own level/traits.
   
4. As a **player**, I want to **configure an animal as easily as possible**, with very little typing or no typing at all, so that I can quickly try different combinations to see which features make an animal stronger.

## Instructions
1. This assignment can be completed **individually** or in **pairs**.

2. Your source code and documentation should be stored in a public project/repository on GitHub.com (or equivalent).

   1. I didn’t teach git. We will see if we want to do this before the coding starts.
   
3. Add your teacher to the project as a team member

4. Do all your work in a new branch called “assignment”

5. Advice: start small, then build up.  Eg. start by including only 1 or 2 features and 1 or 2 environments in your game/algorithm

   1. Make an animal class for the parent class
   
   2. Ie. make a dog animal class-> to be able to make dog objects
   
   3. Decide on an environment and the strength your animal will have in that environment
   
   4. Check that it is working as you go.
   
   5. Continue adding features and commit and push.
   
6. Whenever you are ready to have your code reviewed by the teacher create a pull-request from the “assignment” branch into the “main” branch and assign the pull-request to the teacher

   1. Your teachers will give you feedback using comments in the pull-request
   
   2. You can update the pull-requests or create new pull-requests as often as you like until the assignment deadline
   
   3. If working in a group, each member must submit at least one pull-request

EDIT: We have not learned git. If you know it (Jacob) please use it. I will try to teach this so we can use it for version control.

Evaluation
The following rubric will be used to evaluate this assignment.


Approaching
Meeting Expectation
Extending
Complexity


Comparison algorithm includes some animal properties.
Comparison algorithm includes 5-8 animal properties and 1-2 environmental conditions.
Comparison algorithm includes more than 8 animal properties/traits and more than 2 environmental conditions.
Functionality
Input is not accepted from players.  Values are hard-coded.
Players can configure animals using the console with text input.

Players can configure 2 animals to challenge.
Players can configure animals using mouse input with visual UI.

Players can advance to the next level and build on their traits
Code Quality
Variable and function names are sometimes accurate and self-explanatory.

Few in-line comments are used to describe functionality.

Submit 1 pull request for review and feedback.

Includes a README document that vaguely describes the project.

Documentation has some grammatical and spelling errors.


Variable and function names are often accurate and self-explanatory.

Some in-line comments are used to describe functionality.

Submit 2-3 pull requests for review and feedback.

Includes a README document that accurately describes what the project is about.

Documentation is mostly grammatically correct with few spelling errors.
Variable and function names are always or almost always accurate and self-explanatory.

Many in-line comments are used to describe functionality.

Submit more than 3 pull requests for review and feedback.

Includes a README document that is detailed and includes instructions on maintaining the project.

Documentation is expressive, accurate and by-and-large free from grammatical and spelling errors.


How to meet Expectations:
Start with planning. Work on the thinking and show evidence of it by filling out the plan worksheet.
You can create Classes to represent entities (things like cars, animals, books, people, etc.) and define properties and methods for the classes.
You can create objects by instantiating classes and assigning them to variables.
You can use inheritance (extend classes) to derive more specialized classes from more generalized classes.  Eg. FamilyDoctor extends Doctor, SUV extends Car, Tiger extends Cat, etc.
You understand that when A extends B, we say an A is a B.  Eg. A FamilyDoctor is a Doctor; an SUV is a Car; a Tiger is a Cat, etc.
