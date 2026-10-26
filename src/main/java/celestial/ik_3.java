/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Multimap
 *  com.google.common.collect.Sets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.iJ_2;
import celestial.iW_2;
import celestial.ic_3;
import celestial.ix_3;
import celestial.rVL;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rqO_2;
import celestial.rqR_2;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ik_3 {
    private static final Logger id_class = LogManager.getLogger();
    private final Map<iJ_2, ic_3> id_break = Maps.newHashMap();
    private final Set<ic_3> id_byte = Sets.newHashSet();
    private final iW_2 id_protected;

    public double id_byte(iJ_2 iJ_22) {
        ic_3 ic_32 = this.id_break.get(iJ_22);
        return ic_32 != null ? ic_32.id_case() : this.id_protected.id_class(iJ_22);
    }

    public rcy_3 id_byte() {
        rcy_3 rcy_32 = new rcy_3();
        for (ic_3 ic_32 : this.id_break.values()) {
            rcy_32.add(ic_32.id_catch());
        }
        return rcy_32;
    }

    public ik_3(iW_2 iW_22) {
        this.id_protected = iW_22;
    }

    public void id_class(ik_3 ik_32) {
        ik_32.id_break.values().forEach(ic_32 -> {
            ic_3 ic_33 = this.id_class(ic_32.id_class());
            if (ic_33 != null) {
                ic_33.id_class((ic_3)ic_32);
            }
        });
    }

    public Set<ic_3> id_class() {
        return this.id_byte;
    }

    public void id_class(rcy_3 rcy_32) {
        for (int i = 0; i < rcy_32.size(); ++i) {
            rcd_3 rcd_32 = rcy_32.id_class(i);
            String string = rcd_32.id_native("Name");
            rqR_2.id_class(rVL.O.id_break(rqO_2.id_break(string)), iJ_22 -> {
                ic_3 ic_32 = this.id_class((iJ_2)iJ_22);
                if (ic_32 != null) {
                    ic_32.id_class(rcd_32);
                }
            }, () -> id_class.warn("Ignoring unknown attribute '{}'", (Object)string));
        }
    }

    public boolean id_class(iJ_2 iJ_22, UUID uUID) {
        ic_3 ic_32 = this.id_break.get(iJ_22);
        return ic_32 != null ? ic_32.id_class(uUID) != null : this.id_protected.id_break(iJ_22, uUID);
    }

    public ic_3 id_class(iJ_2 iJ_23) {
        return this.id_break.computeIfAbsent(iJ_23, iJ_22 -> this.id_protected.id_class(this::id_class, (iJ_2)iJ_22));
    }

    public void id_class(Multimap<iJ_2, ix_3> multimap) {
        multimap.asMap().forEach((iJ_22, collection) -> {
            ic_3 ic_32 = this.id_break.get(iJ_22);
            if (ic_32 != null) {
                collection.forEach(ic_32::id_protected);
            }
        });
    }

    private void id_class(ic_3 ic_32) {
        if (ic_32.id_class().id_break()) {
            this.id_byte.add(ic_32);
        }
    }

    public void id_break(Multimap<iJ_2, ix_3> multimap) {
        multimap.forEach((iJ_22, ix_32) -> {
            ic_3 ic_32 = this.id_class((iJ_2)iJ_22);
            if (ic_32 != null) {
                ic_32.id_protected((ix_3)ix_32);
                ic_32.id_break((ix_3)ix_32);
            }
        });
    }

    public boolean id_break(iJ_2 iJ_22) {
        return this.id_break.get(iJ_22) != null || this.id_protected.id_byte(iJ_22);
    }

    public Collection<ic_3> id_break() {
        return this.id_break.values().stream().filter(ic_32 -> ic_32.id_class().id_break()).collect(Collectors.toList());
    }

    public double id_break(iJ_2 iJ_22, UUID uUID) {
        ic_3 ic_32 = this.id_break.get(iJ_22);
        return ic_32 != null ? ic_32.id_class(uUID).id_protected() : this.id_protected.id_class(iJ_22, uUID);
    }

    public double id_protected(iJ_2 iJ_22) {
        ic_3 ic_32 = this.id_break.get(iJ_22);
        return ic_32 != null ? ic_32.id_break() : this.id_protected.id_break(iJ_22);
    }
}

