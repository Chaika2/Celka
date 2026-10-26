/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.util.Either
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 */
package celestial;

import celestial.rKZ;
import celestial.rKd_1;
import celestial.rKf_1;
import celestial.rKu_1;
import celestial.rKv_1;
import celestial.rRg_1;
import celestial.rVL;
import celestial.roC_2;
import celestial.roZ_2;
import celestial.roc_3;
import celestial.rok_3;
import celestial.rom_3;
import celestial.rou_3;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rrEM;
import celestial.rrEZ;
import celestial.rrEm_1;
import celestial.rrPt_1;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public class roN_2 {
    private static final EnumSet<rKv_1> id_final = EnumSet.of(rKv_1.OCEAN_FLOOR_WG, rKv_1.WORLD_SURFACE_WG);
    private static final EnumSet<rKv_1> id_package = EnumSet.of(rKv_1.OCEAN_FLOOR, rKv_1.WORLD_SURFACE, rKv_1.MOTION_BLOCKING, rKv_1.MOTION_BLOCKING_NO_LEAVES);
    private static final rou_3 id_int = (roN_22, rrEm_12, rrPt_12, rrEZ2, function, roC_22) -> {
        if (roC_22 instanceof rok_3 && !roC_22.id_goto().id_break(roN_22)) {
            ((rok_3)roC_22).id_class(roN_22);
        }
        return CompletableFuture.completedFuture(Either.left((Object)roC_22));
    };
    public static final roN_2 id_class = roN_2.id_class("empty", (roN_2)null, -1, id_final, roZ_2.PROTOCHUNK, (rrEm_1 rrEm_12, rKd_1 rKd_12, List<roC_2> list, roC_2 roC_22) -> {});
    public static final roN_2 id_break = roN_2.id_class("structure_starts", id_class, 0, id_final, roZ_2.PROTOCHUNK, (roN_2 roN_22, rrEm_1 rrEm_12, rKd_1 rKd_12, rrPt_1 rrPt_12, rrEZ rrEZ2, Function<roC_2, CompletableFuture<Either<roC_2, rrEM>>> function, List<roC_2> list, roC_2 roC_22) -> {
        if (!roC_22.id_goto().id_break(roN_22)) {
            if (rrEm_12.id_const().rB().id_long().id_break()) {
                rKd_12.id_class(rrEm_12.id_new(), rrEm_12.id_protected(), roC_22, rrPt_12, rrEm_12.id_break());
            }
            if (roC_22 instanceof rok_3) {
                ((rok_3)roC_22).id_class(roN_22);
            }
        }
        return CompletableFuture.completedFuture(Either.left((Object)roC_22));
    });
    public static final roN_2 id_byte = roN_2.id_class("structure_references", id_break, 8, id_final, roZ_2.PROTOCHUNK, (rrEm_1 rrEm_12, rKd_1 rKd_12, List<roC_2> list, roC_2 roC_22) -> {
        rKf_1 rKf_12 = new rKf_1(rrEm_12, list);
        rKd_12.id_class(rKf_12, rrEm_12.id_protected().id_class(rKf_12), roC_22);
    });
    public static final roN_2 id_protected = roN_2.id_class("biomes", id_byte, 0, id_final, roZ_2.PROTOCHUNK, (rrEm_1 rrEm_12, rKd_1 rKd_12, List<roC_2> list, roC_2 roC_22) -> rKd_12.id_class(rrEm_12.id_new().id_break(rVL.n), roC_22));
    public static final roN_2 id_throws = roN_2.id_class("noise", id_protected, 8, id_final, roZ_2.PROTOCHUNK, (rrEm_1 rrEm_12, rKd_1 rKd_12, List<roC_2> list, roC_2 roC_22) -> {
        rKf_1 rKf_12 = new rKf_1(rrEm_12, list);
        rKd_12.id_class((rRg_1)rKf_12, rrEm_12.id_protected().id_class(rKf_12), roC_22);
    });
    public static final roN_2 id_case = roN_2.id_class("surface", id_throws, 0, id_final, roZ_2.PROTOCHUNK, (rrEm_1 rrEm_12, rKd_1 rKd_12, List<roC_2> list, roC_2 roC_22) -> rKd_12.id_class(new rKf_1(rrEm_12, list), roC_22));
    public static final roN_2 id_catch = roN_2.id_class("carvers", id_case, 0, id_final, roZ_2.PROTOCHUNK, (rrEm_1 rrEm_12, rKd_1 rKd_12, List<roC_2> list, roC_2 roC_22) -> rKd_12.id_class(rrEm_12.id_break(), rrEm_12.id_static(), roC_22, rKu_1.AIR));
    public static final roN_2 id_private = roN_2.id_class("liquid_carvers", id_catch, 0, id_package, roZ_2.PROTOCHUNK, (rrEm_1 rrEm_12, rKd_1 rKd_12, List<roC_2> list, roC_2 roC_22) -> rKd_12.id_class(rrEm_12.id_break(), rrEm_12.id_static(), roC_22, rKu_1.LIQUID));
    public static final roN_2 id_implements = roN_2.id_class("features", id_private, 8, id_package, roZ_2.PROTOCHUNK, (roN_2 roN_22, rrEm_1 rrEm_12, rKd_1 rKd_12, rrPt_1 rrPt_12, rrEZ rrEZ2, Function<roC_2, CompletableFuture<Either<roC_2, rrEM>>> function, List<roC_2> list, roC_2 roC_22) -> {
        rok_3 rok_32 = (rok_3)roC_22;
        rok_32.id_class(rrEZ2);
        if (!roC_22.id_goto().id_break(roN_22)) {
            rKZ.id_class(roC_22, EnumSet.of(rKv_1.MOTION_BLOCKING, rKv_1.MOTION_BLOCKING_NO_LEAVES, rKv_1.OCEAN_FLOOR, rKv_1.WORLD_SURFACE));
            rKf_1 rKf_12 = new rKf_1(rrEm_12, list);
            rKd_12.id_class(rKf_12, rrEm_12.id_protected().id_class(rKf_12));
            rok_32.id_class(roN_22);
        }
        return CompletableFuture.completedFuture(Either.left((Object)roC_22));
    });
    public static final roN_2 id_finally = roN_2.id_class("light", id_implements, 1, id_package, roZ_2.PROTOCHUNK, (roN_22, rrEm_12, rKd_12, rrPt_12, rrEZ2, function, list, roC_22) -> roN_2.id_class(roN_22, rrEZ2, roC_22), (roN_22, rrEm_12, rrPt_12, rrEZ2, function, roC_22) -> roN_2.id_class(roN_22, rrEZ2, roC_22));
    public static final roN_2 id_extends = roN_2.id_class("spawn", id_finally, 0, id_package, roZ_2.PROTOCHUNK, (rrEm_1 rrEm_12, rKd_1 rKd_12, List<roC_2> list, roC_2 roC_22) -> rKd_12.id_class(new rKf_1(rrEm_12, list)));
    public static final roN_2 id_native = roN_2.id_class("heightmaps", id_extends, 0, id_package, roZ_2.PROTOCHUNK, (rrEm_1 rrEm_12, rKd_1 rKd_12, List<roC_2> list, roC_2 roC_22) -> {});
    public static final roN_2 id_volatile = roN_2.id_class("full", id_native, 0, id_package, roZ_2.LEVELCHUNK, (roN_22, rrEm_12, rKd_12, rrPt_12, rrEZ2, function, list, roC_22) -> (CompletableFuture)function.apply(roC_22), (roN_22, rrEm_12, rrPt_12, rrEZ2, function, roC_22) -> (CompletableFuture)function.apply(roC_22));
    private static final List<roN_2> id_new = ImmutableList.of((Object)id_volatile, (Object)id_implements, (Object)id_private, (Object)id_break, (Object)id_break, (Object)id_break, (Object)id_break, (Object)id_break, (Object)id_break, (Object)id_break, (Object)id_break);
    private static final IntList id_continue = (IntList)rqR_2.id_class(new IntArrayList(roN_2.id_class().size()), (T intArrayList) -> {
        int n = 0;
        for (int i = roN_2.id_class().size() - 1; i >= 0; --i) {
            while (n + 1 < id_new.size() && i <= id_new.get(n + 1).id_byte()) {
                ++n;
            }
            intArrayList.add(0, n);
        }
    });
    private final String id_super;
    private final int id_this;
    private final roN_2 id_else;
    private final roc_3 id_synchronized;
    private final rou_3 id_return;
    private final int id_public;
    private final roZ_2 id_goto;
    private final EnumSet<rKv_1> id_while;

    public int id_byte() {
        return this.id_this;
    }

    public roN_2(String string, roN_2 roN_22, int n, EnumSet<rKv_1> enumSet, roZ_2 roZ_22, roc_3 roc_32, rou_3 rou_32) {
        this.id_super = string;
        this.id_else = roN_22 == null ? this : roN_22;
        this.id_synchronized = roc_32;
        this.id_return = rou_32;
        this.id_public = n;
        this.id_goto = roZ_22;
        this.id_while = enumSet;
        this.id_this = roN_22 == null ? 0 : roN_22.id_byte() + 1;
    }

    public String toString() {
        return rVL.S.id_break(this).toString();
    }

    public static roN_2 id_class(String string) {
        return rVL.S.id_class(rqO_2.id_break(string));
    }

    private static CompletableFuture<Either<roC_2, rrEM>> id_class(roN_2 roN_22, rrEZ rrEZ2, roC_2 roC_22) {
        boolean bl = roN_2.id_class(roN_22, roC_22);
        if (!roC_22.id_goto().id_break(roN_22)) {
            ((rok_3)roC_22).id_class(roN_22);
        }
        return rrEZ2.id_class(roC_22, bl).thenApply(Either::left);
    }

    public CompletableFuture<Either<roC_2, rrEM>> id_class(rrEm_1 rrEm_12, rrPt_1 rrPt_12, rrEZ rrEZ2, Function<roC_2, CompletableFuture<Either<roC_2, rrEM>>> function, roC_2 roC_22) {
        return this.id_return.doWork(this, rrEm_12, rrPt_12, rrEZ2, function, roC_22);
    }

    private static roN_2 id_class(String string, roN_2 roN_22, int n, EnumSet<rKv_1> enumSet, roZ_2 roZ_22, roc_3 roc_32, rou_3 rou_32) {
        return rVL.id_class(rVL.S, string, new roN_2(string, roN_22, n, enumSet, roZ_22, roc_32, rou_32));
    }

    public static int id_class(roN_2 roN_22) {
        return id_continue.getInt(roN_22.id_byte());
    }

    public static roN_2 id_class(int n) {
        if (n >= id_new.size()) {
            return id_class;
        }
        return n < 0 ? id_volatile : id_new.get(n);
    }

    private static boolean id_class(roN_2 roN_22, roC_2 roC_22) {
        return roC_22.id_goto().id_break(roN_22) && roC_22.id_throw();
    }

    public static List<roN_2> id_class() {
        roN_2 roN_22;
        ArrayList arrayList = Lists.newArrayList();
        for (roN_22 = id_volatile; roN_22.id_throws() != roN_22; roN_22 = roN_22.id_throws()) {
            arrayList.add(roN_22);
        }
        arrayList.add(roN_22);
        Collections.reverse(arrayList);
        return arrayList;
    }

    public CompletableFuture<Either<roC_2, rrEM>> id_class(rrEm_1 rrEm_12, rKd_1 rKd_12, rrPt_1 rrPt_12, rrEZ rrEZ2, Function<roC_2, CompletableFuture<Either<roC_2, rrEM>>> function, List<roC_2> list) {
        return this.id_synchronized.doWork(this, rrEm_12, rKd_12, rrPt_12, rrEZ2, function, list, list.get(list.size() / 2));
    }

    private static roN_2 id_class(String string, roN_2 roN_22, int n, EnumSet<rKv_1> enumSet, roZ_2 roZ_22, roc_3 roc_32) {
        return roN_2.id_class(string, roN_22, n, enumSet, roZ_22, roc_32, id_int);
    }

    private static roN_2 id_class(String string, roN_2 roN_22, int n, EnumSet<rKv_1> enumSet, roZ_2 roZ_22, rom_3 rom_32) {
        return roN_2.id_class(string, roN_22, n, enumSet, roZ_22, (roc_3)rom_32);
    }

    public boolean id_break(roN_2 roN_22) {
        return this.id_byte() >= roN_22.id_byte();
    }

    public static int id_break() {
        return id_new.size();
    }

    public roN_2 id_throws() {
        return this.id_else;
    }

    public roZ_2 id_catch() {
        return this.id_goto;
    }

    public int id_case() {
        return this.id_public;
    }

    public String id_protected() {
        return this.id_super;
    }

    public EnumSet<rKv_1> id_private() {
        return this.id_while;
    }
}

