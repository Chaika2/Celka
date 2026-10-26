/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.rBW;
import celestial.rBp_1;
import celestial.rRR;
import celestial.rbf_3;
import celestial.rfH_2;
import celestial.rls_3;
import java.util.EnumSet;

public class rBB
extends rBp_1 {
    private final rbf_3 id_catch;

    @Override
    public void id_byte() {
        super.id_byte();
        this.id_catch.id_public(false);
    }

    public rBB(rbf_3 rbf_32, double d, int n) {
        super(rbf_32, d, n, 6);
        this.id_catch = rbf_32;
        this.id_case = -2;
        this.id_class(EnumSet.of(rBW.JUMP, rBW.MOVE));
    }

    @Override
    protected boolean id_class(rRR rRR2, rfH_2 rfH_22) {
        return rRR2.id_finally(rfH_22.id_final()) && rRR2.id_byte(rfH_22).id_break().id_class(rls_3.id_short);
    }

    @Override
    protected int id_class(aA_2 aA_22) {
        return 40;
    }

    @Override
    public boolean id_class() {
        return this.id_catch.sZ() && !this.id_catch.sL() && !this.id_catch.sJ() && super.id_class();
    }

    @Override
    public void id_throws() {
        super.id_throws();
        this.id_catch.id_public(false);
        if (!this.id_native()) {
            this.id_catch.id_this(false);
        } else if (!this.id_catch.sJ()) {
            this.id_catch.id_this(true);
        }
    }

    @Override
    public void id_protected() {
        super.id_protected();
        this.id_catch.id_this(false);
    }
}

