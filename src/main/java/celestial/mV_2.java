/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Lg_1;
import celestial.Ml_1;
import celestial.ch_3;
import celestial.mj_3;
import celestial.rYG;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgX_2;
import celestial.rgn_3;
import celestial.rqO_2;

public class mV_2
extends Lg_1<mV_2> {
    public final rYG id_break;
    private final rgP_2 id_byte;
    public final /* synthetic */ mj_3 id_class;

    public mV_2(mj_3 mj_32, rYG rYG2) {
        this.id_class = mj_32;
        this.id_break = rYG2;
        rqO_2 rqO_22 = mj_32.id_class.id_catch.id_break(rYG2);
        String string = "biome." + rqO_22.id_byte() + "." + rqO_22.id_break();
        this.id_byte = rgX_2.id_byte().id_break(string) ? new rgn_3(string) : new rgN_2(rqO_22.toString());
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        ch_3.id_break(ml_1, this.id_class.id_class.id_super, this.id_byte, n3 + 5, n2 + 2, 0xFFFFFF);
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        if (n == 0) {
            this.id_class.id_class(this);
            return true;
        }
        return false;
    }
}

