/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKd_1;
import celestial.rUv_1;
import celestial.rVA;
import celestial.rVL;
import celestial.rVm_1;
import celestial.rYG;
import celestial.rYY;
import celestial.rfj_3;
import celestial.rqm_3;
import celestial.rrPt_1;
import celestial.rrSI;
import celestial.rrrH;
import celestial.rrrZ;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Supplier;

public class reP_2<FC extends rUv_1, F extends rrrZ<FC>> {
    public static final Codec<reP_2<?, ?>> id_class = rVL.t.dispatch(reP_22 -> reP_22.id_protected, rrrZ::id_case);
    public static final Codec<Supplier<reP_2<?, ?>>> id_break = rVA.id_class(rVL.F, id_class);
    public static final Codec<List<Supplier<reP_2<?, ?>>>> id_byte = rVA.id_break(rVL.F, id_class);
    public final F id_protected;
    public final FC id_throws;

    public reP_2(F f, FC FC2) {
        this.id_protected = f;
        this.id_throws = FC2;
    }

    public rrrH<?> id_class(rVm_1 rVm_12, rKd_1 rKd_12, rYY rYY2, rrPt_1 rrPt_12, long l, rfj_3 rfj_32, rYG rYG2, int n, rrSI rrSI2) {
        return ((rrrZ)this.id_protected).id_class(rVm_12, rKd_12, rYY2, rrPt_12, l, rfj_32, rYG2, n, new rqm_3(), rrSI2, this.id_throws);
    }
}

