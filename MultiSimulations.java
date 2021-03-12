package artillery;


public class MultiSimulations {
	private int Scenarios;
	private Structure[] buildings = { new Structure(-50, 40, 30, 20), new Structure(50, 0, 30, 20),
			new Structure(0, -30, 30, 20) };

	public MultiSimulations(int Scenarios) {
		this.Scenarios = Scenarios;
	}

	public int ShellsNeeded() {
		int shellsCount = 3;
		while (true) {
			int success = 0;
			/*
			 * Internal loop, MonteCarlo statistical validity - Try same number of shells
			 * with X random CSP. What should be X? The larger the X, the more accurate the
			 * statistics will be. In this case we will choose X big as possible for getting
			 * an answer in a reasonable time
			 */
			for (int i = 1; i <= Scenarios; i++) {
				ArtillarySimulation s = new ArtillarySimulation(shellsCount, buildings);
				success += s.AllDamaged();
			}
			System.out.println(shellsCount + " " + ((double) success / Scenarios) + " success: " + success);
			if (((double) success / Scenarios) >= 0.8)
				break;
			shellsCount++;
		}

		return shellsCount;
	}

	public static void main(String[] args) {
		/*
		 * The larger the number sent to MultiSimulations, the more accurate the amount
		 * of shells required will be.
		 */
		 MultiSimulations m = new MultiSimulations(1000000);
		 System.out.println(m.ShellsNeeded());
	}

}
