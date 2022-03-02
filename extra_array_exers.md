# Extra Array Exercises

1. Create a command line grocery list maker

    - before prompting the user to enter each item, ask how many items will be
      entered
    - for each item, the user should be prompted to enter in the name, quantity,
      and category of each grocery item
    - Create a `GroceryItem` class from which to instantiate `GroceryItem`
      objects to store in an array
    - once the user has entered all items, print out all items grouped by
      category and alphabetized in each group

1. Build a command line Tic Tac Toe game.

    - the game board should be a multi-dimensional array of Strings
    - be sure the board displays the column letter and row number:

                A   B   C
            1  -O- --- ---
            2  --- -X- ---
            3  --- --- ---

    - the "O" in the example above is at 1a and the "X" is at 2B
    - the winning three in a row should match should be drawn with stars instead
      of dashes:

                A   B   C
            1  *O* *O* *O*
            2  --- -X- ---
            3  -X- --- ---

    - player one and player two should alternate turns
    - be sure to display who's turn it is and who won
