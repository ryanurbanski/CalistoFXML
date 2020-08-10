
Read Me
------------------------------------------------------------------------------

In this version of our Calisto Financial mFinance App we first addressed
the greatest need in our refactoring plan which was to improve the interface
design to make the application easier to use.  We accomplished this by 
re-writing the program in JavaFX to include a login screen (first use case)
and then all of the visual elements in our dashboard (second use case).

We further have added a new Profile view that will allow users to see their 
app account information and to make changes.  

Currently the login screen allows any user to see the template dashboard using
any credentials but in our next revision we will implement our authentication
method we created previously to check against a persistent data file to grant
access.

The other refactored elements were to unify the style of our application in the
code as well as to eliminate unnecessary files in our data package.
