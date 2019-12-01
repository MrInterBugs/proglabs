import festival

myAct1 = festival.Act(1, "Russel Howard", "Comedian", "O2 Arean")
myAct2 = festival.Act(10, "Dancing Team", "Dance", "O2 Academy Brixton")
myAct3 = festival.Act(1, "The Eden Project", "Music", None)

myFestival = festival.LineUp()

myFestival.add_act(myAct1)
myFestival.add_act(myAct2)
myFestival.add_act(myAct3)

print(myFestival)

i = 0

#while i < 28:
#    myFestival.add_act(myAct1)
#    i = i + 1

myFestival.numberOfActs()
myFestival.totalMembers()
myFestival.totalKinds()
