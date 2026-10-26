/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.rWr_1;
import celestial.rdn_3;
import celestial.rkU_2;
import celestial.rkw_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class mG_2 {
    private final List<rkw_3<?>> id_class;
    private final boolean id_break;
    private final Set<rkw_3<?>> id_byte = Sets.newHashSet();
    private final Set<rkw_3<?>> id_protected = Sets.newHashSet();
    private final Set<rkw_3<?>> id_throws = Sets.newHashSet();

    public boolean id_byte() {
        return !this.id_protected.isEmpty();
    }

    public mG_2(List<rkw_3<?>> list) {
        this.id_class = ImmutableList.copyOf(list);
        this.id_break = list.size() <= 1 ? true : mG_2.id_class(list);
    }

    public List<rkw_3<?>> id_class(boolean bl) {
        ArrayList arrayList = Lists.newArrayList();
        Set<rkw_3<?>> set = bl ? this.id_byte : this.id_protected;
        for (rkw_3<?> rkw_32 : this.id_class) {
            if (!set.contains(rkw_32)) continue;
            arrayList.add(rkw_32);
        }
        return arrayList;
    }

    public boolean id_class(rkw_3<?> rkw_32) {
        return this.id_byte.contains(rkw_32);
    }

    public void id_class(rWr_1 rWr_12, int n, int n2, rkU_2 rkU_22) {
        for (rkw_3<?> rkw_32 : this.id_class) {
            boolean bl;
            boolean bl2 = bl = rkw_32.id_class(n, n2) && rkU_22.id_break(rkw_32);
            if (bl) {
                this.id_protected.add(rkw_32);
            } else {
                this.id_protected.remove(rkw_32);
            }
            if (bl && rWr_12.id_class(rkw_32, null)) {
                this.id_byte.add(rkw_32);
                continue;
            }
            this.id_byte.remove(rkw_32);
        }
    }

    private static boolean id_class(List<rkw_3<?>> list) {
        int n = list.size();
        rdn_3 rdn_32 = list.get(0).id_byte();
        for (int i = 1; i < n; ++i) {
            rdn_3 rdn_33 = list.get(i).id_byte();
            if (rdn_3.id_byte(rdn_32, rdn_33) && rdn_3.id_class(rdn_32, rdn_33)) continue;
            return false;
        }
        return true;
    }

    public boolean id_class() {
        return !this.id_throws.isEmpty();
    }

    public void id_class(rkU_2 rkU_22) {
        for (rkw_3<?> rkw_32 : this.id_class) {
            if (!rkU_22.id_break(rkw_32)) continue;
            this.id_throws.add(rkw_32);
        }
    }

    public List<rkw_3<?>> id_break(boolean bl) {
        ArrayList arrayList = Lists.newArrayList();
        for (rkw_3<?> rkw_32 : this.id_class) {
            if (!this.id_protected.contains(rkw_32) || this.id_byte.contains(rkw_32) != bl) continue;
            arrayList.add(rkw_32);
        }
        return arrayList;
    }

    public boolean id_break() {
        return !this.id_byte.isEmpty();
    }

    public boolean id_throws() {
        return this.id_break;
    }

    public List<rkw_3<?>> id_protected() {
        return this.id_class;
    }
}

