/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.OK;
import celestial.OU;
import celestial.Og_1;
import celestial.Ot_1;
import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgc_3;
import celestial.rgp_3;
import celestial.rgv_3;
import celestial.rgy_3;
import celestial.rqO_2;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class OT {
    private final OT id_class;
    private final OU id_break;
    private final Og_1 id_byte;
    private final rqO_2 id_protected;
    private final Map<String, OK> id_throws;
    private final String[][] id_case;
    private final Set<OT> id_catch = Sets.newLinkedHashSet();
    private final rgP_2 id_private;

    public OU id_byte() {
        return this.id_break;
    }

    public OT(rqO_2 rqO_22, OT oT, OU oU, Og_1 og_1, Map<String, OK> map, String[][] stringArray) {
        this.id_protected = rqO_22;
        this.id_break = oU;
        this.id_throws = ImmutableMap.copyOf(map);
        this.id_class = oT;
        this.id_byte = og_1;
        this.id_case = stringArray;
        if (oT != null) {
            oT.id_class(this);
        }
        if (oU == null) {
            this.id_private = new rgN_2(rqO_22.toString());
        } else {
            rgP_2 rgP_22 = oU.id_class();
            rgF_2 rgF_22 = oU.id_throws().id_byte();
            rVi_1 rVi_12 = rgv_3.id_class(rgP_22.id_case(), rgc_3.id_class.id_class(rgF_22)).id_break("\n").id_class(oU.id_break());
            rVi_1 rVi_13 = rgP_22.id_case().id_class(rgc_32 -> rgc_32.id_class(new rgy_3(rgp_3.id_class, rVi_12)));
            this.id_private = rgv_3.id_class(rVi_13).id_class(rgF_22);
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof OT)) {
            return false;
        }
        OT oT = (OT)object;
        return this.id_protected.equals(oT.id_protected);
    }

    public String toString() {
        return "SimpleAdvancement{id=" + this.id_private() + ", parent=" + (Comparable)(this.id_class == null ? "null" : this.id_class.id_private()) + ", display=" + this.id_break + ", rewards=" + this.id_byte + ", criteria=" + this.id_throws + ", requirements=" + Arrays.deepToString((Object[])this.id_case) + "}";
    }

    public int hashCode() {
        return this.id_protected.hashCode();
    }

    public void id_class(OT oT) {
        this.id_catch.add(oT);
    }

    public Ot_1 id_class() {
        return new Ot_1(this.id_class == null ? null : this.id_class.id_private(), this.id_break, this.id_byte, this.id_throws, this.id_case);
    }

    public OT id_break() {
        return this.id_class;
    }

    public Iterable<OT> id_throws() {
        return this.id_catch;
    }

    public rgP_2 id_finally() {
        return this.id_private;
    }

    public int id_catch() {
        return this.id_case.length;
    }

    public Map<String, OK> id_case() {
        return this.id_throws;
    }

    public String[][] id_implements() {
        return this.id_case;
    }

    public Og_1 id_protected() {
        return this.id_byte;
    }

    public rqO_2 id_private() {
        return this.id_protected;
    }
}

