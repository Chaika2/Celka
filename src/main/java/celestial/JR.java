/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Je_1;
import celestial.Jq_1;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Random;

public abstract class JR
extends xd_3 {
    protected final rpr_3 id_volatile;
    protected final boolean id_final;
    protected final rjC_2 id_package;

    protected JR(Jq_1 jq_1, rpr_3 rpr_32, rjC_2 rjC_22, boolean bl) {
        super(jq_1);
        this.id_volatile = rpr_32;
        this.id_package = rjC_22;
        this.id_final = bl;
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        rfH_2 rfH_23 = rfH_22.id_break(this.id_volatile.id_case());
        xc_3 xc_33 = rRR2.id_byte(rfH_23);
        xd_3 xd_32 = xc_33.id_break();
        if (!this.id_class(xd_32)) {
            return false;
        }
        return xd_32 == this.id_implements() || xd_32 == this.id_break() || xc_33.id_protected(rRR2, rfH_23, this.id_volatile);
    }

    protected boolean id_class(xd_3 xd_32) {
        return true;
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return this.id_package;
    }

    public xc_3 id_class(rRg_1 rRg_12) {
        return this.id_continue();
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        xc_3 xc_32 = rxx_32.id_int().id_byte(rxx_32.id_class().id_break(this.id_volatile));
        return !xc_32.id_class(this.id_implements()) && !xc_32.id_class(this.id_break()) ? this.id_class(rxx_32.id_int()) : this.id_break().id_continue();
    }

    protected abstract xd_3 id_break();

    @Override
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        if (!xc_32.id_class((rRR)rrEm_12, rfH_22)) {
            rrEm_12.id_break(rfH_22, true);
        }
    }

    protected abstract Je_1 id_implements();
}

