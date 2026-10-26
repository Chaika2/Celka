/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rNc_1;
import celestial.rNl_1;
import celestial.rQz_1;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rgn_3;
import celestial.rjU_2;
import celestial.rrEm_1;
import celestial.rrGb_1;
import celestial.rrGh_1;
import celestial.rrrZ;
import celestial.rxI_2;
import celestial.rzO_2;
import celestial.rzQ_2;
import celestial.rzd_3;
import celestial.rzr_3;
import celestial.rzx_3;
import com.google.common.collect.ImmutableSet;
import java.util.Locale;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rNN
extends rzO_2 {
    public static final Logger id_protected = LogManager.getLogger();
    public static final rrrZ<?> id_break = rrrZ.id_int;
    public static final rrGh_1 id_byte = rrGh_1.MANSION;
    public final rrrZ<?> id_throws;
    public final rrGh_1 id_case;
    public final byte id_catch;
    public final int id_private;
    public final boolean id_implements;

    public static rNc_1 id_byte() {
        return new rNc_1();
    }

    public rNN(rQz_1[] rQz_1Array, rrrZ<?> rrrZ2, rrGh_1 rrGh_12, byte by, int n, boolean bl) {
        super(rQz_1Array);
        this.id_throws = rrrZ2;
        this.id_case = rrGh_12;
        this.id_catch = by;
        this.id_private = n;
        this.id_implements = bl;
    }

    @Override
    public Set<rzd_3<?>> id_class() {
        return ImmutableSet.of(rzQ_2.id_case);
    }

    @Override
    public rzx_3 id_break() {
        return rNl_1.id_extends;
    }

    @Override
    public rdn_3 id_break(rdn_3 rdn_32, rzr_3 rzr_32) {
        rrEm_1 rrEm_12;
        rfH_2 rfH_22;
        if (rdn_32.id_break() != rdy_3.dM) {
            return rdn_32;
        }
        rjU_2 rjU_22 = rzr_32.id_break(rzQ_2.id_case);
        if (rjU_22 != null && (rfH_22 = (rrEm_12 = rzr_32.id_byte()).id_class(this.id_throws, new rfH_2(rjU_22), this.id_private, this.id_implements)) != null) {
            rdn_3 rdn_33 = rxI_2.id_class(rrEm_12, rfH_22.b_(), rfH_22.d_(), this.id_catch, true, true);
            rxI_2.id_class(rrEm_12, rdn_33);
            rrGb_1.id_class(rdn_33, rfH_22, "+", this.id_case);
            rdn_33.id_class(new rgn_3("filled_map." + this.id_throws.id_catch().toLowerCase(Locale.ROOT)));
            return rdn_33;
        }
        return rdn_32;
    }
}

