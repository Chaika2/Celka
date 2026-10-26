/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rFy_1;
import celestial.rHe_1;
import celestial.rHf_1;
import celestial.rcd_3;
import celestial.rrEy_1;
import celestial.ryO_2;
import celestial.ryW_2;
import celestial.xc_3;

public class rHU
extends ryO_2
implements rHf_1 {
    private final rrEy_1 id_class = new rHe_1(this);

    public rHU() {
        super(ryW_2.id_implements);
    }

    @Override
    public rcd_3 id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        this.id_class.id_break(rcd_32);
        return rcd_32;
    }

    @Override
    public void id_class(xc_3 xc_32, rcd_3 rcd_32) {
        super.id_class(xc_32, rcd_32);
        this.id_class.id_class(rcd_32);
    }

    @Override
    public void id_throws() {
        this.id_class.id_byte();
    }

    public rrEy_1 id_catch() {
        return this.id_class;
    }

    @Override
    public boolean ac_() {
        return true;
    }

    @Override
    public boolean a_(int n, int n2) {
        return this.id_class.id_break(n) ? true : super.a_(n, n2);
    }

    @Override
    public rFy_1 Y_() {
        return new rFy_1(this.id_native, 1, this.Z_());
    }

    @Override
    public rcd_3 Z_() {
        rcd_3 rcd_32 = this.id_class(new rcd_3());
        rcd_32.id_continue("SpawnPotentials");
        return rcd_32;
    }
}

