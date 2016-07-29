/**
 * MegaMek -
 * Copyright (C) 2000,2001,2002,2003,2004,2005,2006,2007 Ben Mazur (bmazur@sev.org)
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

import megamek.common.AmmoType;
import megamek.common.EquipmentType;
import megamek.common.IGame;
import megamek.common.TechConstants;
import megamek.common.ToHitData;
import megamek.common.actions.WeaponAttackAction;
import megamek.server.Server;

/**
 * Deric "Netzilla" Page (deric dot page at usa dot net)
 */
public class ISAC5Primitive extends ACWeapon {
    /**
     *
     */
    private static final long serialVersionUID = 8826026540026351600L;

    public ISAC5Primitive() {
        super();

        name = "Primitive Prototype Autocannon/5";
        setInternalName("Autocannon/5 Primitive");
        addLookupName("IS Auto Cannon/5 Primitive");
        addLookupName("Auto Cannon/5 Primitive");
        addLookupName("AC/5p");
        addLookupName("AutoCannon/5 Primitive");
        addLookupName("ISAC5p");
        addLookupName("IS Autocannon/5 Primitive");
        ammoType = AmmoType.T_AC_PRIMITIVE;
        heat = 1;
        damage = 5;
        rackSize = 5;
        minimumRange = 3;
        shortRange = 6;
        mediumRange = 12;
        longRange = 18;
        extremeRange = 24;
        tonnage = 8.0f;
        criticals = 4;
        bv = 70;
        cost = 125000;
        shortAV = 5;
        medAV = 5;
        maxRange = RANGE_MED;
        explosionDamage = damage;
        //IO Doesn't strictly define when these weapons stop production so assigning a value of ten years.
        introDate = 2240;
        extinctDate = 2260;
        techLevel.put(2240, TechConstants.T_IS_EXPERIMENTAL);   ///EXP
        availRating = new int[] { RATING_F, RATING_X, RATING_X, RATING_X };
        techRating = RATING_C;
        rulesRefs = "217, IO";
    }

    @Override
    protected AttackHandler getCorrectHandler(ToHitData toHit,
                                              WeaponAttackAction waa, IGame game, Server server) {
        return new PrimitiveACWeaponHandler(toHit, waa, game, server);
    }
}
