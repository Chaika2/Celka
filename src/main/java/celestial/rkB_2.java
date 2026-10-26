/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rlc_3;
import celestial.rpm_3;
import java.util.function.Predicate;

public abstract class rkB_2
extends rdb_3 {
    public static final Predicate<rdn_3> id_break = rdn_32 -> rdn_32.id_break().id_class(rlc_3.s);
    public static final Predicate<rdn_3> id_byte = id_break.or(rdn_32 -> rdn_32.id_break() == rdy_3.dc);

    public abstract Predicate<rdn_3> id_byte();

    public rkB_2(rdO_2 rdO_22) {
        super(rdO_22);
    }

    public static rdn_3 id_class(iB_2 iB_22, Predicate<rdn_3> predicate) {
        if (predicate.test(iB_22.id_protected(rpm_3.OFF_HAND))) {
            return iB_22.id_protected(rpm_3.OFF_HAND);
        }
        return predicate.test(iB_22.id_protected(rpm_3.MAIN_HAND)) ? iB_22.id_protected(rpm_3.MAIN_HAND) : rdn_3.id_break;
    }

    public abstract int id_throws();

    @Override
    public int id_protected() {
        return 1;
    }

    public Predicate<rdn_3> id_private() {
        return this.id_byte();
    }
}

