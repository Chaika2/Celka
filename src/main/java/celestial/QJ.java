/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.cache.LoadingCache
 */
package celestial;

import celestial.Qh_1;
import celestial.rfH_2;
import celestial.rpr_3;
import celestial.ryw_3;
import com.google.common.base.MoreObjects;
import com.google.common.cache.LoadingCache;

public class QJ {
    private final rfH_2 id_class;
    private final rpr_3 id_break;
    private final rpr_3 id_byte;
    private final LoadingCache<rfH_2, ryw_3> id_protected;
    private final int id_throws;
    private final int id_case;
    private final int id_catch;

    public rpr_3 id_byte() {
        return this.id_byte;
    }

    public QJ(rfH_2 rfH_22, rpr_3 rpr_32, rpr_3 rpr_33, LoadingCache<rfH_2, ryw_3> loadingCache, int n, int n2, int n3) {
        this.id_class = rfH_22;
        this.id_break = rpr_32;
        this.id_byte = rpr_33;
        this.id_protected = loadingCache;
        this.id_throws = n;
        this.id_case = n2;
        this.id_catch = n3;
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("up", (Object)this.id_byte).add("forwards", (Object)this.id_break).add("frontTopLeft", (Object)this.id_class).toString();
    }

    public ryw_3 id_class(int n, int n2, int n3) {
        return (ryw_3)this.id_protected.getUnchecked((Object)Qh_1.id_class(this.id_class, this.id_break(), this.id_byte(), n, n2, n3));
    }

    public rfH_2 id_class() {
        return this.id_class;
    }

    public rpr_3 id_break() {
        return this.id_break;
    }
}

