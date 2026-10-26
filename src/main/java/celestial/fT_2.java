/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.fI_2;
import celestial.fV_2;
import celestial.ft_3;
import celestial.fw_3;
import celestial.rfU_2;
import celestial.rrWD;
import celestial.yG_2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class fT_2 {
    private static final Comparator<ft_3> id_class = Comparator.comparing(ft_32 -> -ft_32.id_byte).thenComparing(ft_32 -> -ft_32.id_break).thenComparing(ft_32 -> ft_32.id_class.id_class());
    private final int id_break;
    private final Set<ft_3> id_byte = Sets.newHashSetWithExpectedSize((int)256);
    private final List<fI_2> id_protected = Lists.newArrayListWithCapacity((int)256);
    private int id_throws;
    private int id_case;
    private final int id_catch;
    private final int id_private;

    public void id_byte() {
        ArrayList arrayList = Lists.newArrayList(this.id_byte);
        arrayList.sort(id_class);
        for (ft_3 ft_33 : arrayList) {
            if (this.id_class(ft_33)) continue;
            throw new yG_2(ft_33.id_class, (Collection)arrayList.stream().map(ft_32 -> ft_32.id_class).collect(ImmutableList.toImmutableList()), this.id_throws, this.id_case, this.id_catch, this.id_private);
        }
        this.id_throws = rfU_2.id_byte(this.id_throws);
        this.id_case = rfU_2.id_byte(this.id_case);
    }

    public fT_2(int n, int n2, int n3) {
        this.id_break = n3;
        this.id_catch = n;
        this.id_private = n2;
    }

    private boolean id_class(ft_3 ft_32) {
        for (fI_2 fI_22 : this.id_protected) {
            if (!fI_22.id_class(ft_32)) continue;
            return true;
        }
        return this.id_break(ft_32);
    }

    public int id_class() {
        return this.id_throws;
    }

    public void id_class(fw_3 fw_32) {
        for (fI_2 fI_23 : this.id_protected) {
            fI_23.id_class((fI_2 fI_22) -> {
                ft_3 ft_32 = fI_22.id_class();
                fV_2 fV_22 = ft_32.id_class;
                fw_32.load(fV_22, this.id_throws, this.id_case, fI_22.id_break(), fI_22.id_byte());
            });
        }
    }

    public static int id_class(int n, int n2) {
        return (n >> n2) + ((n & (1 << n2) - 1) == 0 ? 0 : 1) << n2;
    }

    public void id_class(fV_2 fV_22) {
        ft_3 ft_32 = new ft_3(fV_22, this.id_break);
        this.id_byte.add(ft_32);
    }

    public int id_break() {
        return this.id_case;
    }

    private boolean id_break(ft_3 ft_32) {
        fI_2 fI_22;
        boolean bl;
        boolean bl2;
        int n = rfU_2.id_byte(this.id_throws);
        int n2 = rfU_2.id_byte(this.id_case);
        int n3 = rfU_2.id_byte(this.id_throws + ft_32.id_break);
        int n4 = rfU_2.id_byte(this.id_case + ft_32.id_byte);
        boolean bl3 = n3 <= this.id_catch;
        boolean bl4 = bl2 = n4 <= this.id_private;
        if (!bl3 && !bl2) {
            return false;
        }
        int n5 = rrWD.id_class(this.id_case);
        boolean bl5 = bl = bl3 && n3 <= 2 * n5;
        if (this.id_throws == 0 && this.id_case == 0) {
            bl = true;
        }
        if (bl) {
            if (this.id_case == 0) {
                this.id_case = ft_32.id_byte;
            }
            fI_22 = new fI_2(this.id_throws, 0, ft_32.id_break, this.id_case);
            this.id_throws += ft_32.id_break;
        } else {
            fI_22 = new fI_2(0, this.id_case, this.id_throws, ft_32.id_byte);
            this.id_case += ft_32.id_byte;
        }
        fI_22.id_class(ft_32);
        this.id_protected.add(fI_22);
        return true;
    }
}

