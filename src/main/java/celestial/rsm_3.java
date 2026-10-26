/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rrEy_1;
import celestial.rsJ_2;
import celestial.rsZ_2;
import celestial.rsd_3;
import celestial.xc_3;
import celestial.xu_3;

public class rsm_3
extends rsJ_2 {
    private final rrEy_1 id_class = new rsZ_2(this);

    @Override
    public xc_3 id_int() {
        return xu_3.rD.id_continue();
    }

    public rsm_3(aI_2<? extends rsm_3> aI_22, rYB rYB2) {
        super(aI_22, rYB2);
    }

    public rsm_3(rYB rYB2, double d, double d2, double d3) {
        super(aI_2.s, rYB2, d, d2, d3);
    }

    @Override
    public void id_this() {
        super.id_this();
        this.id_class.id_byte();
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        this.id_class.id_break(rcd_32);
    }

    @Override
    public void id_class(byte by) {
        this.id_class.id_break(by);
    }

    @Override
    public boolean o() {
        return true;
    }

    @Override
    protected void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_class.id_class(rcd_32);
    }

    @Override
    public rsd_3 id_final() {
        return rsd_3.SPAWNER;
    }
}

