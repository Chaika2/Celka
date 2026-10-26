/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.ImmutableMultimap
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Multimap
 */
package celestial;

import celestial.rQz_1;
import celestial.rWo_1;
import celestial.rqO_2;
import celestial.rzL_2;
import celestial.rzk_3;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

public class rQs_1 {
    private final Multimap<String, String> id_class;
    private final Supplier<String> id_break;
    private final rzk_3 id_byte;
    private final Function<rqO_2, rQz_1> id_protected;
    private final Set<rqO_2> id_throws;
    private final Function<rqO_2, rzL_2> id_case;
    private final Set<rqO_2> id_catch;
    private String id_private;

    public rzL_2 id_byte(rqO_2 rqO_22) {
        return this.id_case.apply(rqO_22);
    }

    public rQs_1(rzk_3 rzk_32, Function<rqO_2, rQz_1> function, Function<rqO_2, rzL_2> function2) {
        this((Multimap<String, String>)HashMultimap.create(), () -> "", rzk_32, function, (Set<rqO_2>)ImmutableSet.of(), function2, (Set<rqO_2>)ImmutableSet.of());
    }

    public rQs_1(Multimap<String, String> multimap, Supplier<String> supplier, rzk_3 rzk_32, Function<rqO_2, rQz_1> function, Set<rqO_2> set, Function<rqO_2, rzL_2> function2, Set<rqO_2> set2) {
        this.id_class = multimap;
        this.id_break = supplier;
        this.id_byte = rzk_32;
        this.id_protected = function;
        this.id_throws = set;
        this.id_case = function2;
        this.id_catch = set2;
    }

    public Multimap<String, String> id_class() {
        return ImmutableMultimap.copyOf(this.id_class);
    }

    public void id_class(String string) {
        this.id_class.put((Object)this.id_break(), (Object)string);
    }

    public void id_class(rWo_1 rWo_12) {
        this.id_byte.id_class(this, rWo_12);
    }

    public rQs_1 id_class(rzk_3 rzk_32) {
        return new rQs_1(this.id_class, this.id_break, rzk_32, this.id_protected, this.id_throws, this.id_case, this.id_catch);
    }

    public boolean id_class(rqO_2 rqO_22) {
        return this.id_catch.contains(rqO_22);
    }

    public rQs_1 id_class(String string, rqO_2 rqO_22) {
        ImmutableSet immutableSet = ImmutableSet.builder().addAll(this.id_catch).add((Object)rqO_22).build();
        return new rQs_1(this.id_class, () -> this.id_break() + string, this.id_byte, this.id_protected, this.id_throws, this.id_case, (Set<rqO_2>)immutableSet);
    }

    public rQs_1 id_break(String string) {
        return new rQs_1(this.id_class, () -> this.id_break() + string, this.id_byte, this.id_protected, this.id_throws, this.id_case, this.id_catch);
    }

    public boolean id_break(rqO_2 rqO_22) {
        return this.id_throws.contains(rqO_22);
    }

    private String id_break() {
        if (this.id_private == null) {
            this.id_private = this.id_break.get();
        }
        return this.id_private;
    }

    public rQs_1 id_break(String string, rqO_2 rqO_22) {
        ImmutableSet immutableSet = ImmutableSet.builder().addAll(this.id_throws).add((Object)rqO_22).build();
        return new rQs_1(this.id_class, () -> this.id_break() + string, this.id_byte, this.id_protected, (Set<rqO_2>)immutableSet, this.id_case, this.id_catch);
    }

    public rQz_1 id_protected(rqO_2 rqO_22) {
        return this.id_protected.apply(rqO_22);
    }
}

