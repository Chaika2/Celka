/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LZ;
import celestial.Le_1;
import celestial.Qw_1;
import celestial.cn_3;
import celestial.rgP_2;
import celestial.rpl_3;
import celestial.vm_3;
import java.util.List;
import java.util.Optional;

public class vl_3
extends vm_3 {
    protected final vm_3 id_case;
    protected final Qw_1 id_catch;

    public vl_3(vm_3 vm_32, Qw_1 qw_1, rgP_2 rgP_22) {
        super(rgP_22);
        this.id_case = vm_32;
        this.id_catch = qw_1;
    }

    public static List<rpl_3> id_class(Le_1 le_1, int n, int n2) {
        Optional<LZ> optional = le_1.id_throws(n, n2);
        if (optional.isPresent() && optional.get() instanceof cn_3) {
            Optional<List<rpl_3>> optional2 = ((cn_3)((Object)optional.get())).id_class();
            return optional2.orElse(null);
        }
        return null;
    }

    @Override
    public void id_volatile() {
        this.id_volatile.id_break(this.id_case);
    }

    @Override
    public void w_() {
        super.w_();
        ((Qw_1)this.id_volatile.id_class[20]).id_break();
    }
}

