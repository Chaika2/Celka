/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKd_1;
import celestial.rRI;
import celestial.rUH;
import celestial.rUO;
import celestial.rfH_2;
import celestial.xc_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rer_3
extends rUO<rUH> {
    public rer_3(Codec<rUH> codec) {
        super(codec);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUH rUH2) {
        if (!rUH2.id_case.contains(rRI2.id_byte(rfH_22.id_final()).id_break())) {
            return false;
        }
        if (rUH2.id_byte && !rUH2.id_case.contains(rRI2.id_byte(rfH_22.id_break()).id_break())) {
            return false;
        }
        xc_3 xc_32 = rRI2.id_byte(rfH_22);
        if (!xc_32.id_catch() && !rUH2.id_case.contains(xc_32.id_break())) {
            return false;
        }
        int n = 0;
        int n2 = 0;
        if (rUH2.id_case.contains(rRI2.id_byte(rfH_22.id_byte()).id_break())) {
            ++n2;
        }
        if (rUH2.id_case.contains(rRI2.id_byte(rfH_22.id_extends()).id_break())) {
            ++n2;
        }
        if (rUH2.id_case.contains(rRI2.id_byte(rfH_22.id_private()).id_break())) {
            ++n2;
        }
        if (rUH2.id_case.contains(rRI2.id_byte(rfH_22.id_protected()).id_break())) {
            ++n2;
        }
        if (rUH2.id_case.contains(rRI2.id_byte(rfH_22.id_break()).id_break())) {
            ++n2;
        }
        int n3 = 0;
        if (rRI2.id_finally(rfH_22.id_byte())) {
            ++n3;
        }
        if (rRI2.id_finally(rfH_22.id_extends())) {
            ++n3;
        }
        if (rRI2.id_finally(rfH_22.id_private())) {
            ++n3;
        }
        if (rRI2.id_finally(rfH_22.id_protected())) {
            ++n3;
        }
        if (rRI2.id_finally(rfH_22.id_break())) {
            ++n3;
        }
        if (n2 == rUH2.id_protected && n3 == rUH2.id_throws) {
            rRI2.id_class(rfH_22, rUH2.id_break.id_catch(), 2);
            rRI2.id_extends().id_class(rfH_22, rUH2.id_break.id_class(), 0);
            ++n;
        }
        return n > 0;
    }
}

