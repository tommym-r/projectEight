# projectEight
Number Guess in Java

## algorithms

### menu()
```
no parameters
print out menu
0) quit
1) human
2) computer
ask for user input
return input as string
```

### main()
```
make boolean keepGoing
set userInput to empty string
while keepGoing:
  call menu()
  if userInput == 0:
    keepGoing = false
  if userInput == 1:
    call humanGuesser()
  if userInput == 2:
    call computerGuesser()
  if else:
    tell user to type 0,1,2
```

### humanGuesser()
```
create int correct and set to random number between 1 and 100
create int turns and set to 0
create in guess and set to 0

while keepGoing is true:
  +1 to turns
  ask user for a number, put in guess
  if guess < answer:
    print "too low"
  else if guess > answer:
    print "too high"
  else:
    print "correct, you win"
    set keepGoing to false (0)

evaluate their performance
if turns < 7:
  print "great job, you performed above average"
else if turns > 7:
  print "you could do better, you performed below average"
else:
  print "good job, your performance was average"
```

### computerGuesser()
```
create int lower set to 1
create int upper set to 100
create int guess, set to (upper+lower)/2
create int turns set to 0
create boolean keepGoing
while keepGoing is true:
  print out guess
  +1 to turns
  ask user for if the guess is higher, lower, or correct
  if higher:
    set upper to guess
    set guess to (upper+lower)/2
  if lower:
    set lower to guess
    set guess to (upper+lower)/2
  if correct:
    print out how many turns computer used
    set keepGoing to false
  if else:
    prompt user to use the right inputs
```
