/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.rHm_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rhd_3;
import celestial.rmE_2;
import celestial.rpm_3;
import celestial.rsJ_2;
import celestial.rsd_3;
import celestial.rsz_3;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.ryZ_2;
import celestial.xc_3;
import celestial.xu_3;

public class rsW_2
extends rsJ_2 {
    public static final rut_3<String> id_class = rmE_2.id_class(rsW_2.class, ruw_3.id_protected);
    public static final rut_3<rgP_2> id_break = rmE_2.id_class(rsW_2.class, ruw_3.id_throws);
    private final rHm_1 id_protected = new rsz_3(this);
    private int id_catch;

    @Override
    public xc_3 id_int() {
        return xu_3.SZ.id_continue();
    }

    public rsW_2(aI_2<? extends rsW_2> aI_22, rYB rYB2) {
        super(aI_22, rYB2);
    }

    public rsW_2(rYB rYB2, double d, double d2, double d3) {
        super(aI_2.P, rYB2, d, d2, d3);
    }

    @Override
    public ryZ_2 id_class(rhd_3 rhd_32, rpm_3 rpm_32) {
        return this.id_protected.id_class(rhd_32);
    }

    @Override
    public void id_class(int n, int n2, int n3, boolean bl) {
        if (bl && (Integer)this.id_throws[41] - this.id_catch >= 4) {
            this.id_else().id_class((rYB)this.id_throws[7]);
            this.id_catch = (Integer)this.id_throws[41];
        }
    }

    @Override
    public void id_class(rut_3<?> rut_32) {
        super.id_class(rut_32);
        if (id_break.equals(rut_32)) {
            try {
                this.id_protected.id_break(this.BQ().id_class(id_break));
            }
            catch (Throwable throwable) {}
        } else if (id_class.equals(rut_32)) {
            this.id_protected.id_class(this.BQ().id_class(id_class));
        }
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        this.id_protected.id_class(rcd_32);
    }

    @Override
    public boolean o() {
        return true;
    }

    @Override
    protected void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_protected.id_break(rcd_32);
        this.BQ().id_break(id_class, this.id_else().id_private());
        this.BQ().id_break(id_break, this.id_else().id_catch());
    }

    public rHm_1 id_else() {
        return this.id_protected;
    }

    @Override
    public rsd_3 id_final() {
        return rsd_3.COMMAND_BLOCK;
    }

    @Override
    protected void m_() {
        super.m_();
        this.BQ().id_class(id_class, "");
        this.BQ().id_class(id_break, rgN_2.id_byte);
    }
}

