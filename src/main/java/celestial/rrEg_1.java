/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMaps
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 */
package celestial;

import celestial.aH_2;
import celestial.aI_2;
import celestial.is_3;
import celestial.rYI;
import celestial.rfH_2;
import celestial.roC_2;
import celestial.rrET;
import celestial.rrEj_1;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class rrEg_1 {
    private final int id_class;
    private final Object2IntOpenHashMap<aH_2> id_break;
    private final rrET id_byte;
    private final Object2IntMap<aH_2> id_protected;
    private rfH_2 id_throws;
    private aI_2<?> id_case;
    private double id_catch;

    public rrEg_1(int n, Object2IntOpenHashMap<aH_2> object2IntOpenHashMap, rrET rrET2) {
        this.id_class = n;
        this.id_break = object2IntOpenHashMap;
        this.id_byte = rrET2;
        this.id_protected = Object2IntMaps.unmodifiable(object2IntOpenHashMap);
    }

    public boolean id_class(aH_2 aH_22) {
        int n = aH_22.id_byte() * this.id_class / rrEj_1.id_break;
        return this.id_break.getInt((Object)aH_22) < n;
    }

    public int id_class() {
        return this.id_class;
    }

    public void id_class(is_3 is_32, roC_2 roC_22) {
        rYI rYI2;
        aI_2<?> aI_22 = is_32.BC();
        rfH_2 rfH_22 = is_32.Bs();
        double d = rfH_22.equals(this.id_throws) && aI_22 == this.id_case ? this.id_catch : ((rYI2 = rrEj_1.id_class(rfH_22, roC_22).id_break().id_class(aI_22)) != null ? rYI2.id_break() : 0.0);
        this.id_byte.id_class(rfH_22, d);
        this.id_break.addTo((Object)aI_22.id_throws(), 1);
    }

    public boolean id_class(aI_2<?> aI_22, rfH_2 rfH_22, roC_2 roC_22) {
        double d;
        this.id_throws = rfH_22;
        this.id_case = aI_22;
        rYI rYI2 = rrEj_1.id_class(rfH_22, roC_22).id_break().id_class(aI_22);
        if (rYI2 == null) {
            this.id_catch = 0.0;
            return true;
        }
        this.id_catch = d = rYI2.id_break();
        double d2 = this.id_byte.id_break(rfH_22, d);
        return d2 <= rYI2.id_class();
    }

    public Object2IntMap<aH_2> id_break() {
        return this.id_protected;
    }
}

