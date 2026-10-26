/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.types.Type
 */
package celestial;

import celestial.ryO_2;
import celestial.ryW_2;
import celestial.xd_3;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.types.Type;
import java.util.Set;
import java.util.function.Supplier;

public final class ryz_3<T extends ryO_2> {
    private final Supplier<? extends T> id_class;
    public final Set<xd_3> id_break;

    private ryz_3(Supplier<? extends T> supplier, Set<xd_3> set) {
        this.id_class = supplier;
        this.id_break = set;
    }

    public static <T extends ryO_2> ryz_3<T> id_class(Supplier<? extends T> supplier, xd_3 ... xd_3Array) {
        return new ryz_3<T>(supplier, (Set<xd_3>)ImmutableSet.copyOf((Object[])xd_3Array));
    }

    public ryW_2<T> id_class(Type<?> type) {
        return new ryW_2<T>(this.id_class, this.id_break, type);
    }
}

