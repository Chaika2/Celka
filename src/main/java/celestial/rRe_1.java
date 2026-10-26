/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rRD;
import celestial.rRV;
import celestial.rRa_1;
import celestial.rYr_1;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rfH_2;
import celestial.rqO_2;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class rRe_1<T>
implements rRV<T> {
    private final List<rRa_1<T>> id_class;
    private final Function<T, rqO_2> id_break;

    public rRe_1(Function<T, rqO_2> function, List<rRD<T>> list, long l) {
        this(function, list.stream().map(rRD2 -> new rRa_1(rRD2.id_break(), rRD2.id_class, (int)(rRD2.id_break - l), rRD2.id_byte)).collect(Collectors.toList()));
    }

    private rRe_1(Function<T, rqO_2> function, List<rRa_1<T>> list) {
        this.id_class = list;
        this.id_break = function;
    }

    public void id_class(rRV<T> rRV2) {
        this.id_class.forEach(rRa_12 -> rRV2.id_class(rRa_12.id_class, rRa_12.id_protected, rRa_12.id_break, rRa_12.id_byte));
    }

    public static <T> rRe_1<T> id_class(rcy_3 rcy_32, Function<T, rqO_2> function, Function<rqO_2, T> function2) {
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < rcy_32.size(); ++i) {
            rcd_3 rcd_32 = rcy_32.id_class(i);
            T t = function2.apply(new rqO_2(rcd_32.id_native("i")));
            if (t == null) continue;
            rfH_2 rfH_22 = new rfH_2(rcd_32.id_private("x"), rcd_32.id_private("y"), rcd_32.id_private("z"));
            arrayList.add(new rRa_1<T>(t, rfH_22, rcd_32.id_private("t"), rYr_1.id_class(rcd_32.id_private("p"))));
        }
        return new rRe_1<T>(function, arrayList);
    }

    @Override
    public boolean id_class(rfH_2 rfH_22, T t) {
        return false;
    }

    @Override
    public void id_class(rfH_2 rfH_22, T t, int n, rYr_1 rYr_12) {
        this.id_class.add(new rRa_1<T>(t, rfH_22, n, rYr_12));
    }

    public rcy_3 id_class() {
        rcy_3 rcy_32 = new rcy_3();
        for (rRa_1<T> rRa_12 : this.id_class) {
            rcd_3 rcd_32 = new rcd_3();
            rcd_32.id_class("i", this.id_break.apply(rRa_12.id_protected).toString());
            rcd_32.id_break("x", rRa_12.id_class.b_());
            rcd_32.id_break("y", rRa_12.id_class.c_());
            rcd_32.id_break("z", rRa_12.id_class.d_());
            rcd_32.id_break("t", rRa_12.id_break);
            rcd_32.id_break("p", rRa_12.id_byte.id_class());
            rcy_32.add(rcd_32);
        }
        return rcy_32;
    }

    @Override
    public boolean id_break(rfH_2 rfH_22, T t) {
        return false;
    }
}

