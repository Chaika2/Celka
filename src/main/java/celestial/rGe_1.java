/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.is_3;
import celestial.rBW;
import celestial.rGD;
import celestial.rPi_1;
import java.util.EnumSet;

public class rGe_1
extends rPi_1 {
    @Override
    public void id_byte() {
        super.id_byte();
        this.id_protected.id_native(0);
    }

    public rGe_1(is_3 is_32) {
        super(is_32, 6, rGD.id_protected);
        this.id_class(EnumSet.of(rBW.MOVE));
    }

    @Override
    public boolean id_class() {
        rGD rGD2 = (rGD)this.id_protected;
        return rGD2.sd() && rGD.id_class(rGD2).nextInt(10) == 0 && super.id_class();
    }

    @Override
    public boolean id_break() {
        rGD rGD2 = (rGD)this.id_protected;
        return rGD2.sd() && super.id_break();
    }
}

