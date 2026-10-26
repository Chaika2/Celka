/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.Hashing
 */
package celestial;

import celestial.rYG;
import celestial.rYT;
import celestial.rYY;
import celestial.rYn_1;
import celestial.rfH_2;
import celestial.rfU_2;
import com.google.common.hash.Hashing;

public class rYA {
    private final rYn_1 id_class;
    private final long id_break;
    private final rYT id_byte;

    public rYA(rYn_1 rYn_12, long l, rYT rYT2) {
        this.id_class = rYn_12;
        this.id_break = l;
        this.id_byte = rYT2;
    }

    public rYG id_class(rfH_2 rfH_22) {
        return this.id_byte.id_class(this.id_break, rfH_22.b_(), rfH_22.c_(), rfH_22.d_(), this.id_class);
    }

    public rYG id_class(double d, double d2, double d3) {
        int n = rfU_2.id_byte(d) >> 2;
        int n2 = rfU_2.id_byte(d2) >> 2;
        int n3 = rfU_2.id_byte(d3) >> 2;
        return this.id_class(n, n2, n3);
    }

    public rYG id_class(int n, int n2, int n3) {
        return this.id_class.id_protected(n, n2, n3);
    }

    public rYA id_class(rYY rYY2) {
        return new rYA(rYY2, this.id_break, this.id_byte);
    }

    public static long id_class(long l) {
        return Hashing.sha256().hashLong(l).asLong();
    }

    public rYG id_break(rfH_2 rfH_22) {
        int n = rfH_22.b_() >> 2;
        int n2 = rfH_22.c_() >> 2;
        int n3 = rfH_22.d_() >> 2;
        return this.id_class(n, n2, n3);
    }
}

