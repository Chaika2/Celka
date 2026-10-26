/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aO_2;
import celestial.eA_2;
import celestial.eC_2;
import celestial.eF_2;
import celestial.eY_2;
import celestial.ev_3;
import celestial.iB_2;
import celestial.rXQ;
import celestial.rfU_2;
import celestial.rye_3;

public class aM_2
extends ev_3 {
    public final aO_2 id_class;

    public aM_2(eF_2 eF_22, aO_2 aO_22, rXQ ... rXQArray) {
        super(eF_22, aO_22 == aO_2.FALL ? eC_2.ARMOR_FEET : eC_2.ARMOR, rXQArray);
        this.id_class = aO_22;
    }

    @Override
    public int id_class(int n, rye_3 rye_32) {
        if (rye_32.id_private()) {
            return 0;
        }
        if (this.id_class == aO_2.ALL) {
            return n;
        }
        if (this.id_class == aO_2.FIRE && rye_32.id_int()) {
            return n * 2;
        }
        if (this.id_class == aO_2.FALL && rye_32 == rye_3.id_extends) {
            return n * 3;
        }
        if (this.id_class == aO_2.EXPLOSION && rye_32.id_protected()) {
            return n * 2;
        }
        return this.id_class == aO_2.PROJECTILE && rye_32.id_break() ? n * 2 : 0;
    }

    @Override
    public boolean id_class(ev_3 ev_32) {
        if (ev_32 instanceof aM_2) {
            aM_2 aM_22 = (aM_2)ev_32;
            if (this.id_class == aM_22.id_class) {
                return false;
            }
            return this.id_class == aO_2.FALL || aM_22.id_class == aO_2.FALL;
        }
        return super.id_class(ev_32);
    }

    public static int id_class(iB_2 iB_22, int n) {
        int n2 = eA_2.id_class(eY_2.id_break, iB_22);
        if (n2 > 0) {
            n -= rfU_2.id_protected((float)n * (float)n2 * 0.15f);
        }
        return n;
    }

    public static double id_class(iB_2 iB_22, double d) {
        int n = eA_2.id_class(eY_2.id_protected, iB_22);
        if (n > 0) {
            d -= (double)rfU_2.id_byte(d * (double)((float)n * 0.15f));
        }
        return d;
    }

    @Override
    public int id_class() {
        return 4;
    }

    @Override
    public int id_class(int n) {
        return this.id_class.id_class() + (n - 1) * this.id_class.id_break();
    }

    @Override
    public int id_break(int n) {
        return this.id_class(n) + this.id_class.id_break();
    }
}

