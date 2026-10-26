/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.eA_2;
import celestial.ev_3;
import celestial.rJJ;
import celestial.rJY;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rpq_3;
import celestial.rsP_2;
import java.util.Map;

public class rJW
extends rJY {
    public final /* synthetic */ rpq_3 id_class;
    public final /* synthetic */ rJJ id_break;

    public rJW(rJJ rJJ2, rXu_1 rXu_12, int n, int n2, int n3, rpq_3 rpq_32) {
        this.id_break = rJJ2;
        this.id_class = rpq_32;
        super(rXu_12, n, n2, n3);
    }

    private int id_class(rYB rYB2) {
        int n = 0;
        n += this.id_throws(this.id_break.id_break.id_extends(0));
        if ((n += this.id_throws(this.id_break.id_break.id_extends(1))) > 0) {
            int n2 = (int)Math.ceil((double)n / 2.0);
            return n2 + rYB2.id_int.nextInt(n2);
        }
        return 0;
    }

    @Override
    public rdn_3 id_class(rhd_3 rhd_32, rdn_3 rdn_32) {
        this.id_class.id_class((rYB rYB2, rfH_2 rfH_22) -> {
            int n;
            for (int i = this.id_class((rYB)rYB2); i > 0; i -= n) {
                n = rsP_2.id_class(i);
                rYB2.a_(new rsP_2((rYB)rYB2, rfH_22.b_(), (double)rfH_22.c_() + 0.5, (double)rfH_22.d_() + 0.5, n));
            }
            rYB2.id_byte(1042, (rfH_2)rfH_22, 0);
        });
        this.id_break.id_break.id_break(0, rdn_3.id_break);
        this.id_break.id_break.id_break(1, rdn_3.id_break);
        return rdn_32;
    }

    @Override
    public boolean id_class(rdn_3 rdn_32) {
        return false;
    }

    private int id_throws(rdn_3 rdn_32) {
        int n = 0;
        Map<ev_3, Integer> map = eA_2.id_class(rdn_32);
        for (Map.Entry<ev_3, Integer> entry : map.entrySet()) {
            ev_3 ev_32 = entry.getKey();
            Integer n2 = entry.getValue();
            if (ev_32.id_byte()) continue;
            n += ev_32.id_class(n2);
        }
        return n;
    }
}

