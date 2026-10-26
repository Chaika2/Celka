/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rHK;
import celestial.rJr_1;
import celestial.rJs_1;
import celestial.rXC;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhz_3;
import celestial.rqs_3;
import celestial.ryW_2;
import celestial.xc_3;
import java.util.Random;

public class rHC
extends rHK {
    private static final Random id_class = new Random();
    private rqs_3<rdn_3> id_break = rqs_3.id_class(9, rdn_3.id_break);

    protected rHC(ryW_2<?> ryW_22) {
        super(ryW_22);
    }

    public rHC() {
        this(ryW_2.id_case);
    }

    @Override
    protected rJr_1 id_class(int n, rhz_3 rhz_32) {
        return new rJs_1(n, rhz_32, this);
    }

    @Override
    protected void id_class(rqs_3<rdn_3> rqs_32) {
        this.id_break = rqs_32;
    }

    @Override
    public void id_class(xc_3 xc_32, rcd_3 rcd_32) {
        super.id_class(xc_32, rcd_32);
        this.id_break = rqs_3.id_class(this.id_else(), rdn_3.id_break);
        if (!this.id_break(rcd_32)) {
            rXC.id_break(rcd_32, this.id_break);
        }
    }

    public int id_class(rdn_3 rdn_32) {
        for (int i = 0; i < this.id_break.size(); ++i) {
            if (!this.id_break.get(i).id_class()) continue;
            this.id_break(i, rdn_32);
            return i;
        }
        return -1;
    }

    @Override
    public rcd_3 id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        if (!this.id_byte(rcd_32)) {
            rXC.id_class(rcd_32, this.id_break);
        }
        return rcd_32;
    }

    public int id_catch() {
        this.id_protected(null);
        int n = -1;
        int n2 = 1;
        for (int i = 0; i < this.id_break.size(); ++i) {
            if (this.id_break.get(i).id_class() || id_class.nextInt(n2++) != 0) continue;
            n = i;
        }
        return n;
    }

    @Override
    public int id_else() {
        return 9;
    }

    @Override
    protected rqs_3<rdn_3> ad_() {
        return this.id_break;
    }

    @Override
    protected rgP_2 X_() {
        return new rgn_3("container.dispenser");
    }
}

