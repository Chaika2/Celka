/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.iB_2;
import celestial.rXB;
import celestial.rXE;
import celestial.rXs_1;
import celestial.rdb_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjQ_2;
import celestial.rjm_3;
import celestial.rpB_2;
import java.util.function.Predicate;

public class rjz_3
implements rjm_3 {
    protected static final rjm_3 id_class = new rjQ_2(false, -1.7976931348623157E308, rdy_3.id_class, rXs_12 -> false);
    private final boolean id_break;
    private final double id_byte;
    private final rdb_3 id_protected;
    private final Predicate<rXs_1> id_throws;

    protected rjz_3(boolean bl, double d, rdb_3 rdb_32, Predicate<rXs_1> predicate) {
        this.id_break = bl;
        this.id_byte = d;
        this.id_protected = rdb_32;
        this.id_throws = predicate;
    }

    @Deprecated
    protected rjz_3(an_3 an_32) {
        this(an_32.rk(), an_32.re(), an_32 instanceof iB_2 ? ((iB_2)an_32).ss().id_break() : rdy_3.id_class, an_32 instanceof iB_2 ? ((iB_2)an_32)::id_class : rXs_12 -> false);
    }

    @Override
    public boolean id_class() {
        return this.id_break;
    }

    @Override
    public boolean id_class(rjC_2 rjC_22, rfH_2 rfH_22, boolean bl) {
        return this.id_byte > (double)rfH_22.c_() + rjC_22.id_byte(rpB_2.Y) - (double)1.0E-5f;
    }

    @Override
    public boolean id_class(rdb_3 rdb_32) {
        return this.id_protected == rdb_32;
    }

    @Override
    public boolean id_class(rXE rXE2, rXB rXB2) {
        return this.id_throws.test(rXB2) && !rXE2.id_class().id_class(rXB2);
    }
}

