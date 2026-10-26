/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.eL_2;
import celestial.ev_3;
import celestial.rVL;
import celestial.rdI_2;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfU_2;
import celestial.rsR_2;
import celestial.rxy_3;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class rsV_2
implements rsR_2 {
    private final int id_class;

    public rsV_2(int n) {
        this.id_class = n;
    }

    @Override
    public rdI_2 id_class(an_3 an_32, Random random) {
        List list = rVL.id_boolean.id_case().filter(ev_3::id_private).collect(Collectors.toList());
        ev_3 ev_32 = (ev_3)list.get(random.nextInt(list.size()));
        int n = rfU_2.id_class(random, ev_32.id_throws(), ev_32.id_class());
        rdn_3 rdn_32 = rxy_3.id_class(new eL_2(ev_32, n));
        int n2 = 2 + random.nextInt(5 + n * 10) + 3 * n;
        if (ev_32.id_break()) {
            n2 *= 2;
        }
        if (n2 > 64) {
            n2 = 64;
        }
        return new rdI_2(new rdn_3(rdy_3.dP, n2), new rdn_3(rdy_3.XM), rdn_32, 12, this.id_class, 0.2f);
    }
}

