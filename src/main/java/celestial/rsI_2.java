/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rdI_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rpL_2;
import celestial.rsR_2;
import java.util.Random;

public class rsI_2
implements rsR_2 {
    private final rdb_3 id_class;
    private final int id_break;
    private final int id_byte;
    private final int id_protected;
    private final float id_throws;

    public rsI_2(rpL_2 rpL_22, int n, int n2, int n3) {
        this.id_class = rpL_22.id_case();
        this.id_break = n;
        this.id_byte = n2;
        this.id_protected = n3;
        this.id_throws = 0.05f;
    }

    @Override
    public rdI_2 id_class(an_3 an_32, Random random) {
        rdn_3 rdn_32 = new rdn_3(this.id_class, this.id_break);
        return new rdI_2(rdn_32, new rdn_3(rdy_3.dP), this.id_byte, this.id_protected, this.id_throws);
    }
}

