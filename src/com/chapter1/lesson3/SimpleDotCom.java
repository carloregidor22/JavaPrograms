package com.chapter1.lesson3;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;
    
    public void setLocationCells(int[] locs)
    {
        locationCells = locs;
    }
    
    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for (int cell: locationCells)
        {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits > 0)
        {
            result = "kill";
        }
        return result;
    }
}
