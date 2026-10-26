/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aL_2;
import celestial.an_3;
import celestial.eC_2;
import celestial.eF_2;
import celestial.ev_3;
import celestial.iB_2;
import celestial.rLD;
import celestial.rLY;
import celestial.rXQ;
import celestial.rdn_3;
import celestial.rxM_2;

public class eu_3
extends ev_3 {
    private static final String[] id_protected = new String[]{"all", "undead", "arthropods"};
    private static final int[] id_throws = new int[]{1, 5, 5};
    private static final int[] id_case = new int[]{11, 8, 8};
    private static final int[] id_catch = new int[]{20, 20, 20};
    public final int id_class;

    public eu_3(eF_2 eF_22, int n, rXQ ... rXQArray) {
        super(eF_22, eC_2.WEAPON, rXQArray);
        this.id_class = n;
    }

    @Override
    public void id_class(iB_2 iB_22, an_3 an_32, int n) {
        if (an_32 instanceof iB_2) {
            iB_2 iB_23 = (iB_2)an_32;
            if (this.id_class == 2 && iB_23.sG() == aL_2.id_byte) {
                int n2 = 20 + iB_22.Sa().nextInt(10 * n);
                iB_23.id_break(new rLY(rLD.id_break, n2, 3));
            }
        }
    }

    @Override
    public boolean id_class(rdn_3 rdn_32) {
        return rdn_32.id_break() instanceof rxM_2 ? true : super.id_class(rdn_32);
    }

    @Override
    public float id_class(int n, aL_2 aL_22) {
        if (this.id_class == 0) {
            return 1.0f + (float)Math.max(0, n - 1) * 0.5f;
        }
        if (this.id_class == 1 && aL_22 == aL_2.id_break) {
            return (float)n * 2.5f;
        }
        return this.id_class == 2 && aL_22 == aL_2.id_byte ? (float)n * 2.5f : 0.0f;
    }

    @Override
    public boolean id_class(ev_3 ev_32) {
        return !(ev_32 instanceof eu_3);
    }

    @Override
    public int id_class() {
        return 5;
    }

    @Override
    public int id_class(int n) {
        return id_throws[this.id_class] + (n - 1) * id_case[this.id_class];
    }

    @Override
    public int id_break(int n) {
        return this.id_class(n) + id_catch[this.id_class];
    }
}

