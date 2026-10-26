/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.ap_3;
import celestial.iM_2;
import celestial.rSu_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.ruS_2;
import celestial.rye_3;

public class rSm_1
extends an_3 {
    public final rSu_1 id_class;
    public final String id_break;
    private final ap_3 id_protected;

    public rSm_1(rSu_1 rSu_12, String string, float f, float f2) {
        super(rSu_12.BC(), (rYB)rSu_12.id_throws[7]);
        this.id_protected = ap_3.id_break(f, f2);
        this.q_();
        this.id_class = rSu_12;
        this.id_break = string;
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        return this.id_class(rye_32) ? false : this.id_class.id_class(this, rye_32, f);
    }

    @Override
    protected void id_break(rcd_3 rcd_32) {
    }

    @Override
    public boolean id_continue(an_3 an_32) {
        return this == an_32 || this.id_class == an_32;
    }

    @Override
    public boolean rY() {
        return true;
    }

    @Override
    public ap_3 a_(iM_2 iM_22) {
        return this.id_protected;
    }

    @Override
    protected void m_() {
    }

    @Override
    public ruS_2<?> p_() {
        throw new UnsupportedOperationException();
    }
}

