/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rYB;
import celestial.rdI_2;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rgn_3;
import celestial.rrEm_1;
import celestial.rrGb_1;
import celestial.rrGh_1;
import celestial.rrrZ;
import celestial.rsR_2;
import celestial.rxI_2;
import java.util.Locale;
import java.util.Random;

public class rsf_3
implements rsR_2 {
    private final int id_class;
    private final rrrZ<?> id_break;
    private final rrGh_1 id_byte;
    private final int id_protected;
    private final int id_throws;

    public rsf_3(int n, rrrZ<?> rrrZ2, rrGh_1 rrGh_12, int n2, int n3) {
        this.id_class = n;
        this.id_break = rrrZ2;
        this.id_byte = rrGh_12;
        this.id_protected = n2;
        this.id_throws = n3;
    }

    @Override
    public rdI_2 id_class(an_3 an_32, Random random) {
        if (!((rYB)an_32.id_throws[7] instanceof rrEm_1)) {
            return null;
        }
        rrEm_1 rrEm_12 = (rrEm_1)((rYB)an_32.id_throws[7]);
        rfH_2 rfH_22 = rrEm_12.id_class(this.id_break, an_32.Bs(), 100, true);
        if (rfH_22 != null) {
            rdn_3 rdn_32 = rxI_2.id_class(rrEm_12, rfH_22.b_(), rfH_22.d_(), (byte)2, true, true);
            rxI_2.id_class(rrEm_12, rdn_32);
            rrGb_1.id_class(rdn_32, rfH_22, "+", this.id_byte);
            rdn_32.id_class(new rgn_3("filled_map." + this.id_break.id_catch().toLowerCase(Locale.ROOT)));
            return new rdI_2(new rdn_3(rdy_3.dP, this.id_class), new rdn_3(rdy_3.Xx), rdn_32, this.id_protected, this.id_throws, 0.2f);
        }
        return null;
    }
}

