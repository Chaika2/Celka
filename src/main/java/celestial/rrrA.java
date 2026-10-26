/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixUtils
 */
package celestial;

import celestial.rKf_1;
import celestial.rRg_1;
import celestial.rRj_1;
import celestial.rfH_2;
import celestial.rfj_3;
import celestial.rjh_3;
import celestial.roN_2;
import celestial.rrSp_1;
import celestial.rrrH;
import celestial.rrrZ;
import com.mojang.datafixers.DataFixUtils;
import java.util.stream.Stream;

public class rrrA {
    private final rRg_1 id_class;
    private final rrSp_1 id_break;

    public rrrA(rRg_1 rRg_12, rrSp_1 rrSp_12) {
        this.id_class = rRg_12;
        this.id_break = rrSp_12;
    }

    public rrrH<?> id_class(rfH_2 rfH_22, boolean bl, rrrZ<?> rrrZ2) {
        return (rrrH)DataFixUtils.orElse(this.id_class(rjh_3.id_class(rfH_22), rrrZ2).filter(rrrH2 -> rrrH2.id_byte().id_break(rfH_22)).filter(rrrH2 -> !bl || rrrH2.id_protected().stream().anyMatch(rrrn_12 -> rrrn_12.id_catch().id_break(rfH_22))).findFirst(), rrrH.id_class);
    }

    public rrrA id_class(rKf_1 rKf_12) {
        if (rKf_12.id_byte() != this.id_class) {
            throw new IllegalStateException("Using invalid feature manager (source level: " + rKf_12.id_byte() + ", region: " + rKf_12);
        }
        return new rrrA(rKf_12, this.id_break);
    }

    public Stream<? extends rrrH<?>> id_class(rjh_3 rjh_33, rrrZ<?> rrrZ2) {
        return this.id_class.id_class(rjh_33.id_break(), rjh_33.id_protected(), roN_2.id_byte).id_break(rrrZ2).stream().map(l -> rjh_3.id_class(new rfj_3((long)l), 0)).map(rjh_32 -> this.id_class((rjh_3)rjh_32, rrrZ2, this.id_class.id_class(rjh_32.id_break(), rjh_32.id_protected(), roN_2.id_break))).filter(rrrH2 -> rrrH2 != null && rrrH2.id_throws());
    }

    public rrrH<?> id_class(rjh_3 rjh_32, rrrZ<?> rrrZ2, rRj_1 rRj_12) {
        return rRj_12.id_class(rrrZ2);
    }

    public void id_class(rjh_3 rjh_32, rrrZ<?> rrrZ2, rrrH<?> rrrH2, rRj_1 rRj_12) {
        rRj_12.id_class(rrrZ2, rrrH2);
    }

    public void id_class(rjh_3 rjh_32, rrrZ<?> rrrZ2, long l, rRj_1 rRj_12) {
        rRj_12.id_class(rrrZ2, l);
    }

    public boolean id_class() {
        return this.id_break.id_break();
    }
}

