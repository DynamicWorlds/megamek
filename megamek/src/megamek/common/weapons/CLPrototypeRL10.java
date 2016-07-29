/**
 * MegaMek - Copyright (C) 2005 Ben Mazur (bmazur@sev.org)
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the Free
 *  Software Foundation; either version 2 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 */
package megamek.common.weapons;

import megamek.common.TechConstants;

/**
 * @author Sebastian Brocks
 */
public class CLPrototypeRL10 extends PrototypeRLWeapon {

    /**
     *
     */
    private static final long serialVersionUID = -8226462713763738211L;

    /**
     *
     */
    public CLPrototypeRL10() {
        super();

        name = "Rocket Launcher 10 (PP)";
        setInternalName("CLRocketLauncher10Prototype");
        heat = 3;
        rackSize = 10;
        shortRange = 5;
        mediumRange = 11;
        longRange = 18;
        extremeRange = 22;
        tonnage = .5f;
        criticals = 1;
        bv = 17;
        cost = 15000;
        shortAV = 6;
        medAV = 6;
        maxRange = RANGE_MED;
        introDate = 2807;
        extinctDate = 2823;
        techLevel.put(2807, TechConstants.T_CLAN_EXPERIMENTAL);
        availRating = new int[] { RATING_X,RATING_B ,RATING_X ,RATING_X};
        techRating = RATING_B;
        rulesRefs = "229, TM";

    }
}
