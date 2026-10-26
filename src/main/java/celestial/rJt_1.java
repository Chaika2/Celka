/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 */
package celestial;

import celestial.eA_2;
import celestial.is_3;
import celestial.rJT;
import celestial.rJY;
import celestial.rXQ;
import celestial.rXu_1;
import celestial.rdn_3;
import celestial.rhd_3;
import celestial.rqO_2;
import com.mojang.datafixers.util.Pair;

public class rJt_1
extends rJY {
    public final /* synthetic */ rXQ id_class;

    public rJt_1(rJT rJT2, rXu_1 rXu_12, int n, int n2, int n3, rXQ rXQ2) {
        this.id_class = rXQ2;
        super(rXu_12, n, n2, n3);
    }

    @Override
    public boolean id_class(rhd_3 rhd_32) {
        rdn_3 rdn_32 = this.id_class();
        return !rdn_32.id_class() && !rhd_32.id_implements() && eA_2.id_protected(rdn_32) ? false : super.id_class(rhd_32);
    }

    @Override
    public boolean id_class(rdn_3 rdn_32) {
        return this.id_class == is_3.id_finally(rdn_32);
    }

    @Override
    public Pair<rqO_2, rqO_2> id_throws() {
        return Pair.of((Object)rJT.id_class, (Object)rJT.id_implements[this.id_class.id_break()]);
    }

    @Override
    public int id_protected() {
        return 1;
    }
}

