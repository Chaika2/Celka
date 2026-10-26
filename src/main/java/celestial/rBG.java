/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rBm_1;
import celestial.rXE;
import celestial.rYB;
import celestial.rbo_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rjU_2;
import celestial.rlG_2;
import celestial.rpr_3;
import celestial.rqn_3;

public class rBG
extends rBm_1 {
    private static final int[] id_class = new int[]{0, 1, 4, 5, 6, 7};
    private final rbo_3 id_break;
    private final int id_byte;
    private boolean id_protected;

    @Override
    public void id_byte() {
        rpr_3 rpr_32 = this.id_break.rS();
        this.id_break.id_byte(this.id_break.rv().id_break((double)rpr_32.id_implements() * 0.6, 0.7, (double)rpr_32.id_extends() * 0.6));
        this.id_break.id_public().id_final();
    }

    public rBG(rbo_3 rbo_32, int n) {
        this.id_break = rbo_32;
        this.id_byte = n;
    }

    @Override
    public boolean id_class() {
        if (this.id_break.Sa().nextInt(this.id_byte) != 0) {
            return false;
        }
        rpr_3 rpr_32 = this.id_break.rS();
        int n = rpr_32.id_implements();
        int n2 = rpr_32.id_extends();
        rfH_2 rfH_22 = this.id_break.Bs();
        for (int n3 : id_class) {
            if (this.id_class(rfH_22, n, n2, n3) && this.id_break(rfH_22, n, n2, n3)) continue;
            return false;
        }
        return true;
    }

    private boolean id_class(rfH_2 rfH_22, int n, int n2, int n3) {
        rfH_2 rfH_23 = rfH_22.id_break(n * n3, 0, n2 * n3);
        return ((rYB)this.id_break.id_throws[7]).id_break(rfH_23).id_class(rlG_2.id_break) && !((rYB)this.id_break.id_throws[7]).id_byte(rfH_23).id_byte().id_byte();
    }

    private boolean id_break(rfH_2 rfH_22, int n, int n2, int n3) {
        return ((rYB)this.id_break.id_throws[7]).id_byte(rfH_22.id_break(n * n3, 1, n2 * n3)).id_catch() && ((rYB)this.id_break.id_throws[7]).id_byte(rfH_22.id_break(n * n3, 2, n2 * n3)).id_catch();
    }

    @Override
    public boolean id_break() {
        double d = this.id_break.rv().id_byte;
        return !(d * d < (double)0.03f && ((Float)this.id_break.id_throws[16]).floatValue() != 0.0f && Math.abs(((Float)this.id_break.id_throws[16]).floatValue()) < 10.0f && this.id_break.rT() || this.id_break.BL());
    }

    @Override
    public void id_throws() {
        Object object;
        boolean bl = this.id_protected;
        if (!bl) {
            object = ((rYB)this.id_break.id_throws[7]).id_break(this.id_break.Bs());
            this.id_protected = ((rXE)object).id_class(rlG_2.id_break);
        }
        if (this.id_protected && !bl) {
            this.id_break.id_class(rqn_3.PV, 1.0f, 1.0f);
        }
        object = this.id_break.rv();
        if (((rjU_2)object).id_byte * ((rjU_2)object).id_byte < (double)0.03f && ((Float)this.id_break.id_throws[16]).floatValue() != 0.0f) {
            Float f = Float.valueOf(rfU_2.id_implements(((Float)this.id_break.id_throws[16]).floatValue(), 0.0f, 0.2f));
            this.id_break.id_throws[16] = f;
        } else {
            double d = Math.sqrt(an_3.id_case((rjU_2)object));
            double d2 = Math.signum(-((rjU_2)object).id_byte) * Math.acos(d / ((rjU_2)object).id_case()) * 57.2957763671875;
            Float f = Float.valueOf((float)d2);
            this.id_break.id_throws[16] = f;
        }
    }

    @Override
    public void id_protected() {
        Float f = Float.valueOf(0.0f);
        this.id_break.id_throws[16] = f;
    }

    @Override
    public boolean J_() {
        return false;
    }
}

