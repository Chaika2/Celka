/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.eA_2;
import celestial.rdI_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rsR_2;
import java.util.Random;

public class rsg_3
implements rsR_2 {
    private final rdn_3 id_class;
    private final int id_break;
    private final int id_byte;
    private final int id_protected;
    private final float id_throws;

    public rsg_3(rdb_3 rdb_32, int n, int n2, int n3) {
        this(rdb_32, n, n2, n3, 0.05f);
    }

    public rsg_3(rdb_3 rdb_32, int n, int n2, int n3, float f) {
        this.id_class = new rdn_3(rdb_32);
        this.id_break = n;
        this.id_byte = n2;
        this.id_protected = n3;
        this.id_throws = f;
    }

    @Override
    public rdI_2 id_class(an_3 an_32, Random random) {
        int n = 5 + random.nextInt(15);
        rdn_3 rdn_32 = eA_2.id_class(random, new rdn_3(this.id_class.id_break()), n, false);
        int n2 = Math.min(this.id_break + n, 64);
        rdn_3 rdn_33 = new rdn_3(rdy_3.dP, n2);
        return new rdI_2(rdn_33, rdn_32, this.id_byte, this.id_protected, this.id_throws);
    }
}

