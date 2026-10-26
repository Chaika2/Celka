/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.At_1;
import celestial.OT;
import celestial.Oj_1;
import celestial.Ot_1;
import celestial.rqO_2;
import celestial.ruS_2;
import celestial.ruu_3;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class rZI
implements ruS_2<At_1> {
    private boolean id_class;
    private Map<rqO_2, Ot_1> id_break;
    private Set<rqO_2> id_byte;
    private Map<rqO_2, Oj_1> id_protected;

    public Set<rqO_2> id_byte() {
        return this.id_byte;
    }

    public rZI() {
    }

    public rZI(boolean bl, Collection<OT> collection, Set<rqO_2> set, Map<rqO_2, Oj_1> map) {
        this.id_class = bl;
        this.id_break = Maps.newHashMap();
        for (OT oT : collection) {
            this.id_break.put(oT.id_private(), oT.id_class());
        }
        this.id_byte = set;
        this.id_protected = Maps.newHashMap(map);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        rqO_2 rqO_22;
        int n;
        this.id_class = ruu_32.readBoolean();
        this.id_break = Maps.newHashMap();
        this.id_byte = Sets.newLinkedHashSet();
        this.id_protected = Maps.newHashMap();
        int n2 = ruu_32.id_case();
        for (n = 0; n < n2; ++n) {
            rqO_22 = ruu_32.id_volatile();
            Ot_1 ot_1 = Ot_1.id_break(ruu_32);
            this.id_break.put(rqO_22, ot_1);
        }
        n2 = ruu_32.id_case();
        for (n = 0; n < n2; ++n) {
            rqO_22 = ruu_32.id_volatile();
            this.id_byte.add(rqO_22);
        }
        n2 = ruu_32.id_case();
        for (n = 0; n < n2; ++n) {
            rqO_22 = ruu_32.id_volatile();
            this.id_protected.put(rqO_22, Oj_1.id_break(ruu_32));
        }
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    public Map<rqO_2, Ot_1> id_break() {
        return this.id_break;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeBoolean(this.id_class);
        ruu_32.id_protected(this.id_break.size());
        for (Map.Entry<rqO_2, Ot_1> object : this.id_break.entrySet()) {
            rqO_2 rqO_22 = object.getKey();
            Ot_1 ot_1 = object.getValue();
            ruu_32.id_class(rqO_22);
            ot_1.id_class(ruu_32);
        }
        ruu_32.id_protected(this.id_byte.size());
        for (rqO_2 rqO_23 : this.id_byte) {
            ruu_32.id_class(rqO_23);
        }
        ruu_32.id_protected(this.id_protected.size());
        for (Map.Entry entry : this.id_protected.entrySet()) {
            ruu_32.id_class((rqO_2)entry.getKey());
            ((Oj_1)entry.getValue()).id_class(ruu_32);
        }
    }

    public boolean id_throws() {
        return this.id_class;
    }

    public Map<rqO_2, Oj_1> id_protected() {
        return this.id_protected;
    }
}

