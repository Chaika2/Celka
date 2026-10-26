/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.rJI;
import celestial.rka_3;
import celestial.rke_3;
import celestial.rkw_3;
import celestial.rqO_2;
import com.google.common.collect.Sets;
import java.util.Set;

public class rkU_2 {
    protected final Set<rqO_2> id_class = Sets.newHashSet();
    protected final Set<rqO_2> id_break = Sets.newHashSet();
    private final rka_3 id_byte = new rka_3();

    protected void id_byte(rqO_2 rqO_22) {
        this.id_class.remove(rqO_22);
        this.id_break.remove(rqO_22);
    }

    public void id_byte(rkw_3<?> rkw_32) {
        this.id_byte(rkw_32.id_case());
    }

    public boolean id_class(rke_3 rke_32) {
        return this.id_byte.id_class(rke_32);
    }

    public void id_class(rka_3 rka_32) {
        this.id_byte.id_class(rka_32);
    }

    public void id_class(rke_3 rke_32, boolean bl, boolean bl2) {
        this.id_byte.id_class(rke_32, bl);
        this.id_byte.id_break(rke_32, bl2);
    }

    public boolean id_class(rJI<?> rJI2) {
        return this.id_break(rJI2.id_implements());
    }

    public void id_class(rke_3 rke_32, boolean bl) {
        this.id_byte.id_class(rke_32, bl);
    }

    public void id_class(rkU_2 rkU_22) {
        this.id_class.clear();
        this.id_break.clear();
        this.id_byte.id_class(rkU_22.id_byte);
        this.id_class.addAll(rkU_22.id_class);
        this.id_break.addAll(rkU_22.id_break);
    }

    protected void id_class(rqO_2 rqO_22) {
        this.id_class.add(rqO_22);
    }

    public void id_class(rkw_3<?> rkw_32) {
        if (!rkw_32.id_implements()) {
            this.id_class(rkw_32.id_case());
        }
    }

    public void id_break(rke_3 rke_32, boolean bl) {
        this.id_byte.id_break(rke_32, bl);
    }

    public boolean id_break(rke_3 rke_32) {
        return this.id_byte.id_break(rke_32);
    }

    public boolean id_break(rqO_2 rqO_22) {
        return this.id_class.contains(rqO_22);
    }

    public rka_3 id_break() {
        return this.id_byte.id_class();
    }

    public boolean id_break(rkw_3<?> rkw_32) {
        return rkw_32 == null ? false : this.id_class.contains(rkw_32.id_case());
    }

    public void id_throws(rkw_3<?> rkw_32) {
        this.id_break.remove(rkw_32.id_case());
    }

    public void id_case(rkw_3<?> rkw_32) {
        this.id_protected(rkw_32.id_case());
    }

    protected void id_protected(rqO_2 rqO_22) {
        this.id_break.add(rqO_22);
    }

    public boolean id_protected(rkw_3<?> rkw_32) {
        return this.id_break.contains(rkw_32.id_case());
    }
}

