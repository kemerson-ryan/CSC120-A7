Reflection on A7
Ryan Emerson
Nov 5, 2022

I've had fun going around changing my methods (fixing a few from when I submitted them to A6) and optimizing their abilities for what I needed from them. I think my most tricky things are not the general ideas but the very specific = vs == which, after so much time, I should have already known to write that down when anyone reminds me what the difference is. But I have it very prominently displayed in my notebook. I wasn't documenting what was failing before trying to fix the issue, and now that I am I will be able to look back and see how I fixed it last time. I think that'll be a great help to me in the future. 

Overloading documentation: 
In the Cafe class I overloaded the sellCoffee method to accept no input for creams, or sugars, if the customer wants just black coffee, they don't have to pass in 0 for sugar and cream. They could also pass in just nCoffeeOunces and nSugarPackets, and no nCream and have the nCreams set automatically to 0. I also overloaded the Cafe constructor to assign default values in inventory, or provided the option of passing in the nCoffeeOunces, which sets the other supplies at an established ratio. The option to enter each supply's value still exists. This gives the person who constructs the cafe to have as much control over their inventory as they want.

In the House class I overloaded the constructor, so that if no boolean for hasElevator is passed in, then it is false, and if there is one passed in, it is the boolean that is passed in. I overloaded the moveOut method so that if there is not one specific student identified, it moves out the entire house, such as would be needed at the end of the year.

In the Library class I overloaded the add title method and check out title method both to accept two titles at a time. I did these because I couldn't identify anything else to overload. All of my elevator behavior had been handled in building, and nothing else really had any parameters to change up.

One question I still have: if we are constructing a building in the main method of Campus Map, it doesn't have an instance name, so I can't refer to it to do anything later on, like enter or exit or anything. How do we change that when the building details are just being loaded into the arrayList?
What I've tried out and can do is constructing and then adding to myMap, but it's now two lines to construct then add to map, and I'm not sure if that's the most efficient way to do what I want.