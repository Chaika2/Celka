/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rjU_2;
import celestial.rpB_2;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rxx_3;

public class rxv_3
extends rxx_3 {
    private final rpr_3 id_break;

    @Override
    public boolean id_byte() {
        return this.id_break();
    }

    public rxv_3(rYB rYB2, rfH_2 rfH_22, rpr_3 rpr_32, rdn_3 rdn_32, rpr_3 rpr_33) {
        super(rYB2, null, rpm_3.MAIN_HAND, rdn_32, new rff_3(rjU_2.id_protected(rfH_22), rpr_33, rfH_22, false));
        this.id_break = rpr_32;
    }

    @Override
    public rfH_2 id_class() {
        return this.id_implements().id_class();
    }

    @Override
    public boolean id_break() {
        return this.id_int().id_byte(this.id_implements().id_class()).id_class(this);
    }

    @Override
    public rpr_3[] id_throws() {
        switch (this.id_break) {
            default: {
                return new rpr_3[]{rpr_3.DOWN, rpr_3.NORTH, rpr_3.EAST, rpr_3.SOUTH, rpr_3.WEST, rpr_3.UP};
            }
            case UP: {
                return new rpr_3[]{rpr_3.DOWN, rpr_3.UP, rpr_3.NORTH, rpr_3.EAST, rpr_3.SOUTH, rpr_3.WEST};
            }
            case NORTH: {
                return new rpr_3[]{rpr_3.DOWN, rpr_3.NORTH, rpr_3.EAST, rpr_3.WEST, rpr_3.UP, rpr_3.SOUTH};
            }
            case SOUTH: {
                return new rpr_3[]{rpr_3.DOWN, rpr_3.SOUTH, rpr_3.EAST, rpr_3.WEST, rpr_3.UP, rpr_3.NORTH};
            }
            case WEST: {
                return new rpr_3[]{rpr_3.DOWN, rpr_3.WEST, rpr_3.SOUTH, rpr_3.UP, rpr_3.NORTH, rpr_3.EAST};
            }
            case EAST: 
        }
        return new rpr_3[]{rpr_3.DOWN, rpr_3.EAST, rpr_3.SOUTH, rpr_3.UP, rpr_3.NORTH, rpr_3.WEST};
    }

    @Override
    public boolean id_catch() {
        return false;
    }

    @Override
    public rpr_3 id_case() {
        return this.id_break.id_final() == rpB_2.Y ? rpr_3.NORTH : this.id_break;
    }

    @Override
    public rpr_3 id_protected() {
        return rpr_3.DOWN;
    }

    @Override
    public float id_private() {
        return this.id_break.id_protected() * 90;
    }
}

