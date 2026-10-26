/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Uq_1;
import celestial.Uy_1;
import celestial.dQ_2;
import celestial.eX_2;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rhf_3;
import celestial.rpr_3;
import celestial.rrEm_1;

public abstract class ed_3
extends Uy_1 {
    protected float id_byte() {
        return 1.1f;
    }

    protected abstract rhf_3 id_class(rYB var1, eX_2 var2, rdn_3 var3);

    @Override
    public rdn_3 id_class(Uq_1 uq_1, rdn_3 rdn_32) {
        rrEm_1 rrEm_12 = uq_1.id_catch();
        eX_2 eX_22 = dQ_2.id_class(uq_1);
        rpr_3 rpr_32 = uq_1.id_throws().id_byte(dQ_2.id_volatile);
        rhf_3 rhf_32 = this.id_class(rrEm_12, eX_22, rdn_32);
        rhf_32.id_byte(rpr_32.id_implements(), (float)rpr_32.id_finally() + 0.1f, rpr_32.id_extends(), this.id_byte(), this.id_break());
        rrEm_12.a_(rhf_32);
        rdn_32.id_catch(1);
        return rdn_32;
    }

    @Override
    protected void id_class(Uq_1 uq_1) {
        uq_1.id_catch().id_byte(1002, uq_1.id_protected(), 0);
    }

    protected float id_break() {
        return 6.0f;
    }
}

