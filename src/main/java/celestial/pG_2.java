/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.eX_2;
import celestial.rLC;
import celestial.rfH_2;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class pG_2 {
    public final UUID id_class;
    public final int id_break;
    public final String id_byte;
    public final String id_protected;
    public final int id_throws;
    public final float id_case;
    public final float id_catch;
    public final eX_2 id_private;
    public final String id_implements;
    public final rLC id_finally;
    public final boolean id_extends;
    public final List<String> id_native = Lists.newArrayList();
    public final List<String> id_volatile = Lists.newArrayList();
    public final List<String> id_final = Lists.newArrayList();
    public final List<String> id_package = Lists.newArrayList();
    public final Set<rfH_2> id_int = Sets.newHashSet();
    public final Set<rfH_2> id_new = Sets.newHashSet();

    public pG_2(UUID uUID, int n, String string, String string2, int n2, float f, float f2, eX_2 eX_22, String string3, rLC rLC2, boolean bl) {
        this.id_class = uUID;
        this.id_break = n;
        this.id_byte = string;
        this.id_protected = string2;
        this.id_throws = n2;
        this.id_case = f;
        this.id_catch = f2;
        this.id_private = eX_22;
        this.id_implements = string3;
        this.id_finally = rLC2;
        this.id_extends = bl;
    }

    public UUID id_class() {
        return this.id_class;
    }

    public boolean id_class(rfH_2 rfH_22) {
        return this.id_int.stream().anyMatch(rfH_22::equals);
    }

    public boolean id_break(rfH_2 rfH_22) {
        return this.id_new.contains(rfH_22);
    }
}

