/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.iX_2;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rjU_2;
import java.util.EnumSet;

public class rBT
extends rBk_1 {
    private final aA_2 id_class;
    private double id_break;
    private double id_byte;
    private double id_protected;
    private final double id_throws;

    @Override
    public void id_byte() {
        this.id_class.id_public().id_class(this.id_break, this.id_byte, this.id_protected, this.id_throws);
    }

    public rBT(aA_2 aA_22, double d) {
        this.id_class = aA_22;
        this.id_throws = d;
        this.id_class(EnumSet.of(rBW.MOVE));
    }

    @Override
    public boolean id_class() {
        if (this.id_class.X()) {
            return false;
        }
        rjU_2 rjU_22 = iX_2.id_break(this.id_class, 16, 7, rjU_2.id_protected(this.id_class.J()));
        if (rjU_22 == null) {
            return false;
        }
        this.id_break = rjU_22.id_break;
        this.id_byte = rjU_22.id_byte;
        this.id_protected = rjU_22.id_protected;
        return true;
    }

    @Override
    public boolean id_break() {
        return !this.id_class.id_public().id_native();
    }
}

