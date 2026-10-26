/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.QP;
import celestial.rCT;
import celestial.rDv_1;
import celestial.rKH;
import celestial.rKd_1;
import celestial.rKl_1;
import celestial.rKv_1;
import celestial.rRI;
import celestial.rRY;
import celestial.rRg_1;
import celestial.rUO;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfw_3;
import celestial.rja_3;
import celestial.rjd_3;
import celestial.rjp_3;
import celestial.rls_3;
import celestial.rpr_3;
import celestial.rrPY;
import celestial.rrPl_1;
import celestial.rrsk_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Set;

public class reS_2
extends rUO<rDv_1> {
    public static boolean id_byte(rKl_1 rKl_12, rfH_2 rfH_22) {
        return reS_2.id_throws(rKl_12, rfH_22) || rKl_12.id_class(rfH_22, xc_32 -> xc_32.id_class(rls_3.id_super));
    }

    public reS_2(Codec<rDv_1> codec) {
        super(codec);
    }

    private rjp_3 id_class(rRg_1 rRg_12, rfi_3 rfi_32, Set<rfH_2> set, Set<rfH_2> set2) {
        ArrayList arrayList = Lists.newArrayList();
        rjd_3 rjd_32 = new rjd_3(rfi_32.id_protected(), rfi_32.id_throws(), rfi_32.id_case());
        int n = 6;
        for (int i = 0; i < 6; ++i) {
            arrayList.add(Sets.newHashSet());
        }
        rfw_3 rfw_32 = new rfw_3();
        for (Object object : Lists.newArrayList(set2)) {
            if (!rfi_32.id_break((rja_3)object)) continue;
            ((rjp_3)rjd_32).id_class(((rja_3)object).b_() - rfi_32.id_class, ((rja_3)object).c_() - rfi_32.id_break, ((rja_3)object).d_() - rfi_32.id_byte, true, true);
        }
        for (Object object : Lists.newArrayList(set)) {
            if (rfi_32.id_break((rja_3)object)) {
                ((rjp_3)rjd_32).id_class(((rja_3)object).b_() - rfi_32.id_class, ((rja_3)object).c_() - rfi_32.id_break, ((rja_3)object).d_() - rfi_32.id_byte, true, true);
            }
            for (rpr_3 rpr_3Array : rpr_3.values()) {
                xc_3 xc_32;
                rfw_32.id_class((rja_3)object, rpr_3Array);
                if (set.contains(rfw_32) || !(xc_32 = rRg_12.id_byte(rfw_32)).id_break(rCT.N)) continue;
                ((Set)arrayList.get(0)).add(rfw_32.id_int());
                reS_2.id_break(rRg_12, rfw_32, (xc_3)xc_32.id_class(rCT.N, 1));
                if (!rfi_32.id_break(rfw_32)) continue;
                ((rjp_3)rjd_32).id_class(rfw_32.b_() - rfi_32.id_class, rfw_32.c_() - rfi_32.id_break, rfw_32.d_() - rfi_32.id_byte, true, true);
            }
        }
        for (int i = 1; i < 6; ++i) {
            Object object;
            object = (Set)arrayList.get(i - 1);
            Set set3 = (Set)arrayList.get(i);
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                rfH_2 rfH_22 = (rfH_2)iterator.next();
                if (rfi_32.id_break(rfH_22)) {
                    ((rjp_3)rjd_32).id_class(rfH_22.b_() - rfi_32.id_class, rfH_22.c_() - rfi_32.id_break, rfH_22.d_() - rfi_32.id_byte, true, true);
                }
                for (rpr_3 rpr_32 : rpr_3.values()) {
                    int n2;
                    xc_3 xc_33;
                    rfw_32.id_class((rja_3)rfH_22, rpr_32);
                    if (object.contains(rfw_32) || set3.contains(rfw_32) || !(xc_33 = rRg_12.id_byte(rfw_32)).id_break(rCT.N) || (n2 = xc_33.id_byte(rCT.N).intValue()) <= i + 1) continue;
                    xc_3 xc_34 = (xc_3)xc_33.id_class(rCT.N, i + 1);
                    reS_2.id_break(rRg_12, rfw_32, xc_34);
                    if (rfi_32.id_break(rfw_32)) {
                        ((rjp_3)rjd_32).id_class(rfw_32.b_() - rfi_32.id_class, rfw_32.c_() - rfi_32.id_break, rfw_32.d_() - rfi_32.id_byte, true, true);
                    }
                    set3.add(rfw_32.id_int());
                }
            }
        }
        return rjd_32;
    }

    @Override
    public final boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rDv_1 rDv_12) {
        HashSet hashSet = Sets.newHashSet();
        HashSet hashSet2 = Sets.newHashSet();
        HashSet hashSet3 = Sets.newHashSet();
        rfi_3 rfi_32 = rfi_3.id_class();
        boolean bl = this.id_class(rRI2, random, rfH_22, hashSet, hashSet2, rfi_32, rDv_12);
        if (rfi_32.id_class <= rfi_32.id_protected && bl && !hashSet.isEmpty()) {
            Object object;
            if (!rDv_12.id_protected.isEmpty()) {
                object = Lists.newArrayList((Iterable)hashSet);
                ArrayList arrayList = Lists.newArrayList((Iterable)hashSet2);
                object.sort(Comparator.comparingInt(rja_3::c_));
                arrayList.sort(Comparator.comparingInt(rja_3::c_));
                rDv_12.id_protected.forEach(arg_0 -> reS_2.id_class(rRI2, random, (List)object, arrayList, hashSet3, rfi_32, arg_0));
            }
            object = this.id_class(rRI2, rfi_32, hashSet, hashSet3);
            rrPl_1.id_class(rRI2, 3, (rjp_3)object, rfi_32.id_class, rfi_32.id_break, rfi_32.id_byte);
            return true;
        }
        return false;
    }

    @Override
    protected void id_class(rRY rRY2, rfH_2 rfH_22, xc_3 xc_32) {
        reS_2.id_break(rRY2, rfH_22, xc_32);
    }

    private int id_class(rKl_1 rKl_12, int n, rfH_2 rfH_22, rDv_1 rDv_12) {
        rfw_3 rfw_32 = new rfw_3();
        for (int i = 0; i <= n + 1; ++i) {
            int n2 = rDv_12.id_private.id_class(n, i);
            for (int j = -n2; j <= n2; ++j) {
                for (int k = -n2; k <= n2; ++k) {
                    rfw_32.id_class(rfH_22, j, i, k);
                    if (reS_2.id_byte(rKl_12, rfw_32) && (rDv_12.id_finally || !reS_2.id_case(rKl_12, rfw_32))) continue;
                    return i - 2;
                }
            }
        }
        return n;
    }

    private static /* synthetic */ void id_class(rRI rRI2, Random random, List list, List list2, Set set, rfi_3 rfi_32, rrsk_3 rrsk_32) {
        rrsk_32.id_class(rRI2, random, list, list2, set, rfi_32);
    }

    private boolean id_class(rKH rKH2, Random random, rfH_2 rfH_22, Set<rfH_2> set, Set<rfH_2> set2, rfi_3 rfi_32, rDv_1 rDv_12) {
        rfH_2 rfH_23;
        int n;
        int n2 = rDv_12.id_catch.id_class(random);
        int n3 = rDv_12.id_case.id_class(random, n2, rDv_12);
        int n4 = n2 - n3;
        int n5 = rDv_12.id_case.id_class(random, n4);
        if (!rDv_12.id_throws) {
            int n6 = rKH2.id_class(rKv_1.OCEAN_FLOOR, rfH_22).c_();
            n = rKH2.id_class(rKv_1.WORLD_SURFACE, rfH_22).c_();
            if (n - n6 > rDv_12.id_implements) {
                return false;
            }
            int n7 = rDv_12.id_extends == rKv_1.OCEAN_FLOOR ? n6 : (rDv_12.id_extends == rKv_1.WORLD_SURFACE ? n : rKH2.id_class(rDv_12.id_extends, rfH_22).c_());
            rfH_23 = new rfH_2(rfH_22.b_(), n7, rfH_22.d_());
        } else {
            rfH_23 = rfH_22;
        }
        if (rfH_23.c_() >= 1 && rfH_23.c_() + n2 + 1 <= 256) {
            if (!reS_2.id_private(rKH2, rfH_23.id_break())) {
                return false;
            }
            OptionalInt optionalInt = rDv_12.id_private.id_byte();
            n = this.id_class(rKH2, n2, rfH_23, rDv_12);
            if (n >= n2 || optionalInt.isPresent() && n >= optionalInt.getAsInt()) {
                List<rrPY> list = rDv_12.id_catch.id_class(rKH2, random, n, rfH_23, set, rfi_32, rDv_12);
                list.forEach(rrPY2 -> rDv_12.id_case.id_class(rKH2, random, rDv_12, n, (rrPY)rrPY2, n3, n5, set2, rfi_32));
                return true;
            }
            return false;
        }
        return false;
    }

    public static void id_break(rRY rRY2, rfH_2 rfH_22, xc_3 xc_32) {
        rRY2.id_class(rfH_22, xc_32, 19);
    }

    public static boolean id_throws(rKl_1 rKl_12, rfH_2 rfH_22) {
        return reS_2.id_protected(rKl_12, rfH_22) || reS_2.id_implements(rKl_12, rfH_22) || reS_2.id_catch(rKl_12, rfH_22);
    }

    private static boolean id_catch(rKl_1 rKl_12, rfH_2 rfH_22) {
        return rKl_12.id_class(rfH_22, xc_32 -> xc_32.id_class(xu_3.id_try));
    }

    private static boolean id_case(rKl_1 rKl_12, rfH_2 rfH_22) {
        return rKl_12.id_class(rfH_22, xc_32 -> xc_32.id_class(xu_3.BD));
    }

    private static boolean id_implements(rKl_1 rKl_12, rfH_2 rfH_22) {
        return rKl_12.id_class(rfH_22, xc_32 -> {
            QP qP = xc_32.id_byte();
            return qP == QP.id_catch;
        });
    }

    public static boolean id_protected(rKl_1 rKl_12, rfH_2 rfH_22) {
        return rKl_12.id_class(rfH_22, xc_32 -> xc_32.id_catch() || xc_32.id_class(rls_3.id_void));
    }

    private static boolean id_private(rKl_1 rKl_12, rfH_2 rfH_22) {
        return rKl_12.id_class(rfH_22, xc_32 -> {
            xd_3 xd_32 = xc_32.id_break();
            return reS_2.id_break(xd_32) || xd_32 == xu_3.PS;
        });
    }
}

