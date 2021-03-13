package artillery;


public class ArtillerySimulation {
    private Structure[] buildings;
    private int numOfShells;

    /*the constructor create an array of the shells in size of the amount of shells
     needed for the specific simulation*/
    public ArtillerySimulation(int NumOfShells, Structure[] buildings) {
        this.numOfShells = NumOfShells;
        this.buildings = buildings;
    }

    /*The method creates one common strike point and N shells according to the quantity
      received from the constructor,
      for each shell created, the method checks whether it hit one of the structures
      that have not yet been damaged in this simulation.
      At the end of each inner loop (for each shell) the method checks if the three
      structures were damaged, if so then the method returns "1" and after the outer
      loop returns "0" (a case where not all buildings were damaged after checking all the shells)
      */
    public int AllDamaged() {
        //create new common strike point for this specific simulation
        ComStrikePoint csp = new ComStrikePoint();
        //count the amount of damaged buildings
        int damagedBuildings = 0;
		/*a Boolean array as the size of the amount of buildings,
		which keeps for each building whether damaged or not*/
        Boolean[] flagChanged = new Boolean[buildings.length];
        for (int j = 0; j < buildings.length; j++)
            flagChanged[j] = false;//initialize the array

        for (int i = 0; i < numOfShells; i++) {
            for (int j = 0; j < buildings.length; j++)
				/*if the current shell hit the building in place j,
				  and the building has not yet been damaged, then increase
				  the amount of buildings damaged and mark the current building as damaged*/
                if (!flagChanged[j] && buildings[j].isDamaged(new ShellStrike(csp))) {
                    damagedBuildings++;
                    flagChanged[j] = true;
					/*if a specific shell hit a building, it cannot hit
					  another one and we can stop checking for other buildings*/
                    break;
                }
            if (damagedBuildings == buildings.length)
                return 1;
        }
        return 0;
    }

}
