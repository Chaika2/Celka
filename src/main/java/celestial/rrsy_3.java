/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 */
package celestial;

import celestial.rRo_1;
import celestial.rfH_2;
import celestial.rjh_3;
import celestial.roH_2;
import celestial.rol_3;
import celestial.rrsR_2;
import celestial.rrsp_3;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class rrsy_3
extends rrsR_2<rrsp_3> {
    protected rrsy_3(rol_3 rol_32) {
        super(rRo_1.BLOCK, rol_32, new rrsp_3((Long2ObjectOpenHashMap<roH_2>)new Long2ObjectOpenHashMap()));
    }

    @Override
    protected int id_protected(long l) {
        long l2 = rjh_3.id_throws(l);
        roH_2 roH_22 = this.id_class(l2, false);
        return roH_22 == null ? 0 : roH_22.id_class(rjh_3.id_break(rfH_2.id_class(l)), rjh_3.id_break(rfH_2.id_break(l)), rjh_3.id_break(rfH_2.id_byte(l)));
    }
}

