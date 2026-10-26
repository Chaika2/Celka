/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rRR;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rXs_1;
import celestial.rdb_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjU_2;
import celestial.rjw_3;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xu_3;

public class rXP
extends rXs_1 {
    @Override
    protected float id_byte() {
        return 0.0f;
    }

    @Override
    public boolean id_byte(rXE rXE2) {
        return false;
    }

    @Override
    public boolean id_class(rXE rXE2, rRq_1 rRq_12, rfH_2 rfH_22, rXs_1 rXs_12, rpr_3 rpr_32) {
        return true;
    }

    @Override
    public float id_class(rXE rXE2, rRq_1 rRq_12, rfH_2 rfH_22) {
        return 0.0f;
    }

    @Override
    public float id_class(rXE rXE2) {
        return 0.0f;
    }

    @Override
    public rdb_3 id_class() {
        return rdy_3.id_class;
    }

    @Override
    public rjU_2 id_class(rRq_1 rRq_12, rfH_2 rfH_22, rXE rXE2) {
        return rjU_2.id_class;
    }

    @Override
    public int id_class(rRR rRR2) {
        return 0;
    }

    @Override
    protected boolean id_break() {
        return true;
    }

    @Override
    public rjC_2 id_break(rXE rXE2, rRq_1 rRq_12, rfH_2 rfH_22) {
        return rjw_3.id_class();
    }

    @Override
    protected xc_3 id_break(rXE rXE2) {
        return xu_3.id_class.id_continue();
    }

    @Override
    public int id_protected(rXE rXE2) {
        return 0;
    }
}

