/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.rMA;
import celestial.rSO;
import celestial.rkg_3;

public class rMC
extends rSO {
    private final rMA id_byte;

    public rMC(rMA rMA2, double d, rkg_3 rkg_32, boolean bl) {
        super((aA_2)rMA2, d, rkg_32, bl);
        this.id_byte = rMA2;
    }

    @Override
    protected boolean id_catch() {
        return super.id_catch() && !this.id_byte.sJ();
    }
}

