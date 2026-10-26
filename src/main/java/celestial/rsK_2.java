/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rdI_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rsR_2;
import celestial.xd_3;
import java.util.Random;

public class rsK_2
implements rsR_2 {
    private final rdn_3 id_class;
    private final int id_break;
    private final int id_byte;
    private final int id_protected;
    private final int id_throws;
    private final float id_case;

    public rsK_2(rdn_3 rdn_32, int n, int n2, int n3, int n4, float f) {
        this.id_class = rdn_32;
        this.id_break = n;
        this.id_byte = n2;
        this.id_protected = n3;
        this.id_throws = n4;
        this.id_case = f;
    }

    public rsK_2(rdn_3 rdn_32, int n, int n2, int n3, int n4) {
        this(rdn_32, n, n2, n3, n4, 0.05f);
    }

    public rsK_2(rdb_3 rdb_32, int n, int n2, int n3, int n4) {
        this(new rdn_3(rdb_32), n, n2, n3, n4);
    }

    public rsK_2(rdb_3 rdb_32, int n, int n2, int n3) {
        this(new rdn_3(rdb_32), n, n2, 12, n3);
    }

    public rsK_2(xd_3 xd_32, int n, int n2, int n3, int n4) {
        this(new rdn_3(xd_32), n, n2, n3, n4);
    }

    @Override
    public rdI_2 id_class(an_3 an_32, Random random) {
        return new rdI_2(new rdn_3(rdy_3.dP, this.id_break), new rdn_3(this.id_class.id_break(), this.id_byte), this.id_protected, this.id_throws, this.id_case);
    }
}

