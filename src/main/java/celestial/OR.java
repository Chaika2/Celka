/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.Og_1;
import celestial.gw_3;
import celestial.rqO_2;
import com.google.common.collect.Lists;
import java.util.List;

public class OR {
    private int id_class;
    private final List<rqO_2> id_break = Lists.newArrayList();
    private final List<rqO_2> id_byte = Lists.newArrayList();
    private rqO_2 id_protected;

    public Og_1 id_class() {
        return new Og_1(this.id_class, this.id_break.toArray(new rqO_2[0]), this.id_byte.toArray(new rqO_2[0]), this.id_protected == null ? gw_3.id_class : new gw_3(this.id_protected));
    }

    public static OR id_class(rqO_2 rqO_22) {
        return new OR().id_break(rqO_22);
    }

    public static OR id_class(int n) {
        return new OR().id_break(n);
    }

    public OR id_break(rqO_2 rqO_22) {
        this.id_byte.add(rqO_22);
        return this;
    }

    public OR id_break(int n) {
        this.id_class += n;
        return this;
    }
}

