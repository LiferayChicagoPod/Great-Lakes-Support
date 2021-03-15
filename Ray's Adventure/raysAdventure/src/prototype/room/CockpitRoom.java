package prototype.room;
import java.util.ArrayList;

import prototype.being.Alloy;
import prototype.core.BasicBeing;
import prototype.core.BasicItem;
import prototype.core.BasicRoom;

public class CockpitRoom extends BasicRoom {

	//Constructor for CockpitRoom
	public CockpitRoom (BasicRoom room) {
		super("This appears to be the Cockpit","Cockpit", new ArrayList<BasicItem>(),
				new ArrayList<BasicBeing>(), new ArrayList<BasicRoom>());
		this.beings.add(new Alloy(this));
		this.doors.add(room);
	}

}