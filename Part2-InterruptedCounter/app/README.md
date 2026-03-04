# Part 2: The Interrupted Counter

## Bug Fix Explanation
The sabotage code crashed because we made a TextView variable
but never actually connected it to anything on the screen 
it was like trying to write on a piece of paper that doesn't exist yet.
When the app tried to put text on it, it panicked and crashed
because there was nothing there. The fix was to use findViewById()
to properly grab the real TextView from the screen first.

## State Preservation
When you rotate your phone, Android completely destroys and
rebuilds the app like closing and reopening it fast.
Without saving, the counter forgets its number and resets to 0.
onSaveInstanceState() is like quickly writing the number on a
sticky note before the app closes, and onRestoreInstanceState()
reads that sticky note when the app comes back.