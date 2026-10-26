/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rYB;
import celestial.rYZ;
import celestial.rfj_3;
import celestial.roJ_2;
import celestial.roQ_2;
import celestial.rrbB_2;
import celestial.rrbE_2;

public class rrbS_2
extends roJ_2 {
    private rrbB_2 id_break;
    private boolean id_byte;
    private boolean id_protected;

    @Override
    public void id_byte(boolean bl) {
        this.id_byte = bl;
        super.id_byte(bl);
    }

    public boolean id_long() {
        return this.id_byte;
    }

    public rrbS_2(rYB rYB2, rfj_3 rfj_32, rYZ rYZ2) {
        super(rYB2, rfj_32, rYZ2);
    }

    @Override
    public void id_class(boolean bl) {
        this.id_protected = bl;
        super.id_class(bl);
    }

    @Override
    public void id_class(an_3 an_32) {
        this.id_byte = true;
        super.id_class(an_32);
    }

    public static rrbB_2 id_class(roJ_2 roJ_22) {
        rrbE_2[] rrbE_2Array = null;
        roQ_2 roQ_22 = roJ_22.id_interface();
        if (roQ_22 != null) {
            int n = (roQ_22.id_catch() >> 4) + 1;
            rrbE_2Array = new rrbE_2[n];
            roQ_2[] roQ_2Array = roJ_22.id_byte();
            for (int i = 0; i < n; ++i) {
                roQ_2 roQ_23 = roQ_2Array[i];
                if (roQ_23 == null) continue;
                short s = roQ_23.id_extends();
                short s2 = roQ_23.id_native();
                short s3 = roQ_23.id_volatile();
                rrbE_2Array[i] = new rrbE_2(s, s2, s3);
            }
        }
        return new rrbB_2(rrbE_2Array);
    }

    public void id_class(rrbB_2 rrbB_22) {
        this.id_break = rrbB_22;
    }

    @Override
    public boolean id_finally() {
        return this.id_protected;
    }

    public rrbB_2 id_abstract() {
        return this.id_break;
    }
}

