/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.iB_2;
import celestial.iC_2;
import celestial.il_3;
import celestial.rPm_1;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class rPN<E extends iB_2>
extends rPm_1<E> {
    private final Predicate<E> id_class;
    private final rPm_1<? super E> id_byte;
    private final boolean id_protected;

    @Override
    protected void id_byte(rrEm_1 rrEm_12, E e, long l) {
        this.id_byte.id_byte(rrEm_12, e, l);
    }

    public rPN(Predicate<E> predicate, rPm_1<? super E> rPm_12) {
        this((Map<il_3<?>, iC_2>)ImmutableMap.of(), (Predicate<? super E>)predicate, rPm_12, false);
    }

    public rPN(Map<il_3<?>, iC_2> map, Predicate<E> predicate, rPm_1<? super E> rPm_12, boolean bl) {
        super(rPN.id_class(map, rPm_12.id_break));
        this.id_class = predicate;
        this.id_byte = rPm_12;
        this.id_protected = bl;
    }

    @Override
    public String toString() {
        return "RunIf: " + this.id_byte;
    }

    @Override
    protected boolean id_class(long l) {
        return false;
    }

    private static Map<il_3<?>, iC_2> id_class(Map<il_3<?>, iC_2> map, Map<il_3<?>, iC_2> map2) {
        HashMap hashMap = Maps.newHashMap();
        hashMap.putAll(map);
        hashMap.putAll(map2);
        return hashMap;
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, E e, long l) {
        return this.id_protected && this.id_class.test(e) && this.id_byte.id_class(rrEm_12, e, l);
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, E e) {
        return this.id_class.test(e) && this.id_byte.id_class(rrEm_12, e);
    }

    @Override
    protected void id_break(rrEm_1 rrEm_12, E e, long l) {
        this.id_byte.id_break(rrEm_12, e, l);
    }

    @Override
    protected void id_protected(rrEm_1 rrEm_12, E e, long l) {
        this.id_byte.id_protected(rrEm_12, e, l);
    }
}

