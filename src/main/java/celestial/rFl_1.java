/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.At_1;
import celestial.rVL;
import celestial.rkw_3;
import celestial.rqO_2;
import celestial.ruS_2;
import celestial.ruu_3;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

public class rFl_1
implements ruS_2<At_1> {
    private List<rkw_3<?>> id_class;

    public static rkw_3<?> id_byte(ruu_3 ruu_32) {
        rqO_2 rqO_22 = ruu_32.id_volatile();
        rqO_2 rqO_23 = ruu_32.id_volatile();
        return rVL.M.id_break(rqO_22).orElseThrow(() -> new IllegalArgumentException("Unknown recipe serializer " + rqO_22)).id_break(rqO_23, ruu_32);
    }

    public rFl_1() {
    }

    public rFl_1(Collection<rkw_3<?>> collection) {
        this.id_class = Lists.newArrayList(collection);
    }

    public static <T extends rkw_3<?>> void id_class(T t, ruu_3 ruu_32) {
        ruu_32.id_class(rVL.M.id_break(t.W_()));
        ruu_32.id_class(t.id_case());
        t.W_().id_class(ruu_32, t);
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = Lists.newArrayList();
        int n = ruu_32.id_case();
        for (int i = 0; i < n; ++i) {
            this.id_class.add(rFl_1.id_byte(ruu_32));
        }
    }

    public List<rkw_3<?>> id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class.size());
        for (rkw_3<?> rkw_32 : this.id_class) {
            rFl_1.id_class(rkw_32, ruu_32);
        }
    }
}

