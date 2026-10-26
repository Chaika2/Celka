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
import celestial.rqG_2;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class yf_3 {
    public final UUID id_class;
    public final int id_break;
    public final eX_2 id_byte;
    public final rLC id_protected;
    public final rfH_2 id_throws;
    public final rfH_2 id_case;
    public final int id_catch;
    public final List<String> id_private = Lists.newArrayList();
    public final Set<rfH_2> id_implements = Sets.newHashSet();

    public boolean id_byte() {
        return this.id_case != null;
    }

    public yf_3(UUID uUID, int n, eX_2 eX_22, rLC rLC2, rfH_2 rfH_22, rfH_2 rfH_23, int n2) {
        this.id_class = uUID;
        this.id_break = n;
        this.id_byte = eX_22;
        this.id_protected = rLC2;
        this.id_throws = rfH_22;
        this.id_case = rfH_23;
        this.id_catch = n2;
    }

    public String toString() {
        return this.id_break();
    }

    public UUID id_class() {
        return this.id_class;
    }

    public boolean id_class(rfH_2 rfH_22) {
        return this.id_throws != null && this.id_throws.equals(rfH_22);
    }

    public String id_break() {
        return rqG_2.id_class(this.id_class);
    }
}

