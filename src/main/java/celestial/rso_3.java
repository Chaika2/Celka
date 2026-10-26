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

public class rso_3
implements rsR_2 {
    private final rdn_3 id_class;
    private final int id_break;
    private final int id_byte;
    private final rdn_3 id_protected;
    private final int id_throws;
    private final int id_case;
    private final int id_catch;
    private final float id_private;

    public rso_3(rpL_2 rpL_22, int n, rdb_3 rdb_32, int n2, int n3, int n4) {
        this(rpL_22, n, 1, rdb_32, n2, n3, n4);
    }

    public rso_3(rpL_2 rpL_22, int n, int n2, rdb_3 rdb_32, int n3, int n4, int n5) {
        this.id_class = new rdn_3(rpL_22);
        this.id_break = n;
        this.id_byte = n2;
        this.id_protected = new rdn_3(rdb_32);
        this.id_throws = n3;
        this.id_case = n4;
        this.id_catch = n5;
        this.id_private = 0.05f;
    }

    @Override
    public rdI_2 id_class(an_3 an_32, Random random) {
        return new rdI_2(new rdn_3(rdy_3.dP, this.id_byte), new rdn_3(this.id_class.id_break(), this.id_break), new rdn_3(this.id_protected.id_break(), this.id_throws), this.id_case, this.id_catch, this.id_private);
    }
}

