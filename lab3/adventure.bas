
PRINT "There are two doors one left and one right."

start:
INPUT "Would you like to go through the left door or the right door.? (1 for the left door, 2 for the right door): ",n

IF n <> 1 THEN
  GOTO right
  GOTO left
END IF

left:
PRINT "There is a small key on the floor. You take it and head back."
i = 1
GOTO start

right:
PRINT "There is a locked box."
IF i <> 1 THEN
  GOTO nokey
END IF
GOTO end

nokey:
PRINT "You do not have a key."
GOTO start

end:
PRINT "Congratulations, you have found gotten a lifes worth of tressure."
