/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.RZ;
import celestial.Xm_1;
import celestial.aI_2;
import celestial.an_3;
import celestial.gy_3;
import celestial.rVi_1;
import celestial.rfl_3;
import celestial.rgv_3;
import celestial.rhN_2;
import celestial.rjU_2;
import celestial.rrEm_1;
import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Rn_1 {
    private final int id_class;
    private final boolean id_break;
    private final boolean id_byte;
    private final Predicate<an_3> id_protected;
    private final Xm_1 id_throws;
    private final Function<rjU_2, rjU_2> id_case;
    private final rfl_3 id_catch;
    private final BiConsumer<rjU_2, List<? extends an_3>> id_private;
    private final boolean id_implements;
    private final String id_finally;
    private final UUID id_extends;
    private final aI_2<?> id_native;
    private final boolean id_volatile;

    public boolean id_byte() {
        return this.id_implements;
    }

    public rhN_2 id_byte(gy_3 gy_32) throws CommandSyntaxException {
        this.id_throws(gy_32);
        List<rhN_2> list = this.id_protected(gy_32);
        if (list.size() != 1) {
            throw RZ.id_throws.create();
        }
        return list.get(0);
    }

    public Rn_1(int n, boolean bl, boolean bl2, Predicate<an_3> predicate, Xm_1 xm_1, Function<rjU_2, rjU_2> function, rfl_3 rfl_32, BiConsumer<rjU_2, List<? extends an_3>> biConsumer, boolean bl3, String string, UUID uUID, aI_2<?> aI_22, boolean bl4) {
        this.id_class = n;
        this.id_break = bl;
        this.id_byte = bl2;
        this.id_protected = predicate;
        this.id_throws = xm_1;
        this.id_case = function;
        this.id_catch = rfl_32;
        this.id_private = biConsumer;
        this.id_implements = bl3;
        this.id_finally = string;
        this.id_extends = uUID;
        this.id_native = aI_22;
        this.id_volatile = bl4;
    }

    private void id_class(List<an_3> list, rrEm_1 rrEm_12, rjU_2 rjU_22, Predicate<an_3> predicate) {
        if (this.id_catch != null) {
            list.addAll(rrEm_12.id_class(this.id_native, this.id_catch.id_protected(rjU_22), predicate));
        } else {
            list.addAll(rrEm_12.id_class(this.id_native, predicate));
        }
    }

    private Predicate<an_3> id_class(rjU_2 rjU_22) {
        Predicate<an_3> predicate = this.id_protected;
        if (this.id_catch != null) {
            rfl_3 rfl_32 = this.id_catch.id_protected(rjU_22);
            predicate = predicate.and(an_32 -> rfl_32.id_byte(an_32.rN()));
        }
        if (!this.id_throws.id_byte()) {
            predicate = predicate.and(an_32 -> this.id_throws.id_class(an_32.id_break(rjU_22)));
        }
        return predicate;
    }

    private <T extends an_3> List<T> id_class(rjU_2 rjU_22, List<T> list) {
        if (list.size() > 1) {
            this.id_private.accept(rjU_22, list);
        }
        return list.subList(0, Math.min(this.id_class, list.size()));
    }

    public static rVi_1 id_class(List<? extends an_3> list) {
        return rgv_3.id_break(list, an_3::L_);
    }

    public an_3 id_class(gy_3 gy_32) throws CommandSyntaxException {
        this.id_throws(gy_32);
        List<? extends an_3> list = this.id_break(gy_32);
        if (list.isEmpty()) {
            throw RZ.id_protected.create();
        }
        if (list.size() > 1) {
            throw RZ.id_class.create();
        }
        return list.get(0);
    }

    public int id_class() {
        return this.id_class;
    }

    public boolean id_break() {
        return this.id_break;
    }

    public List<? extends an_3> id_break(gy_3 gy_32) throws CommandSyntaxException {
        this.id_throws(gy_32);
        if (!this.id_break) {
            return this.id_protected(gy_32);
        }
        if (this.id_finally != null) {
            rhN_2 rhN_22 = gy_32.id_super().x().id_class(this.id_finally);
            return rhN_22 == null ? Collections.emptyList() : Lists.newArrayList((Object[])new rhN_2[]{rhN_22});
        }
        if (this.id_extends != null) {
            for (rrEm_1 rrEm_12 : gy_32.id_super().id_float()) {
                an_3 an_32 = rrEm_12.id_break(this.id_extends);
                if (an_32 == null) continue;
                return Lists.newArrayList((Object[])new an_3[]{an_32});
            }
            return Collections.emptyList();
        }
        rjU_2 rjU_22 = this.id_case.apply(gy_32.id_volatile());
        Predicate<an_3> predicate = this.id_class(rjU_22);
        if (this.id_implements) {
            return gy_32.id_package() != null && predicate.test(gy_32.id_package()) ? Lists.newArrayList((Object[])new an_3[]{gy_32.id_package()}) : Collections.emptyList();
        }
        ArrayList arrayList = Lists.newArrayList();
        if (this.id_protected()) {
            this.id_class(arrayList, gy_32.id_final(), rjU_22, predicate);
        } else {
            for (rrEm_1 rrEm_13 : gy_32.id_super().id_float()) {
                this.id_class(arrayList, rrEm_13, rjU_22, predicate);
            }
        }
        return this.id_class(rjU_22, arrayList);
    }

    private void id_throws(gy_3 gy_32) throws CommandSyntaxException {
        if (this.id_volatile && !gy_32.id_class(2)) {
            throw RZ.id_case.create();
        }
    }

    public List<rhN_2> id_protected(gy_3 gy_32) throws CommandSyntaxException {
        List<Object> list;
        this.id_throws(gy_32);
        if (this.id_finally != null) {
            rhN_2 rhN_22 = gy_32.id_super().x().id_class(this.id_finally);
            return rhN_22 == null ? Collections.emptyList() : Lists.newArrayList((Object[])new rhN_2[]{rhN_22});
        }
        if (this.id_extends != null) {
            rhN_2 rhN_23 = gy_32.id_super().x().id_class(this.id_extends);
            return rhN_23 == null ? Collections.emptyList() : Lists.newArrayList((Object[])new rhN_2[]{rhN_23});
        }
        rjU_2 rjU_22 = this.id_case.apply(gy_32.id_volatile());
        Predicate<an_3> predicate = this.id_class(rjU_22);
        if (this.id_implements) {
            rhN_2 rhN_24;
            if (gy_32.id_package() instanceof rhN_2 && predicate.test(rhN_24 = (rhN_2)gy_32.id_package())) {
                return Lists.newArrayList((Object[])new rhN_2[]{rhN_24});
            }
            return Collections.emptyList();
        }
        if (this.id_protected()) {
            list = gy_32.id_final().id_class(predicate::test);
        } else {
            list = Lists.newArrayList();
            for (rhN_2 rhN_25 : gy_32.id_super().x().id_super()) {
                if (!predicate.test(rhN_25)) continue;
                list.add(rhN_25);
            }
        }
        return this.id_class(rjU_22, list);
    }

    public boolean id_protected() {
        return this.id_byte;
    }
}

