/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 */
package celestial;

import celestial.LE;
import celestial.LS;
import celestial.Lb_1;
import com.google.common.base.MoreObjects;
import java.util.List;

public class LX {
    private final LE id_class;
    private final List<LS> id_break;
    private final int id_byte;

    public LX(LE lE, List<LS> list, int n) {
        this.id_class = lE;
        this.id_break = list;
        this.id_byte = n;
    }

    public LS id_class(int n) {
        return n >= 0 && n < this.id_break.size() ? (LS)MoreObjects.firstNonNull((Object)this.id_break.get(n), (Object)Lb_1.id_class) : Lb_1.id_class;
    }

    public int id_class() {
        return this.id_byte;
    }
}

