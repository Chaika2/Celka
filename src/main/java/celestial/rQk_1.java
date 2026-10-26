/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.an_3;
import celestial.rQF;
import celestial.rQz_1;
import celestial.rWi_1;
import celestial.rYB;
import celestial.rnP_2;
import celestial.rns_3;
import celestial.rzB_2;
import celestial.rzV_2;
import celestial.rzd_3;
import celestial.rzr_3;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Map;
import java.util.Set;

public class rQk_1
implements rQz_1 {
    public final Map<String, rzV_2> id_class;
    public final rzB_2 id_break;

    public rQk_1(Map<String, rzV_2> map, rzB_2 rzB_22) {
        this.id_class = ImmutableMap.copyOf(map);
        this.id_break = rzB_22;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((rzr_3)object);
    }

    public boolean id_class(rzr_3 rzr_32) {
        an_3 an_32 = rzr_32.id_break(this.id_break.id_class());
        if (an_32 == null) {
            return false;
        }
        rns_3 rns_32 = ((rYB)an_32.id_throws[7]).id_package();
        for (Map.Entry<String, rzV_2> entry : this.id_class.entrySet()) {
            if (this.id_class(an_32, rns_32, entry.getKey(), entry.getValue())) continue;
            return false;
        }
        return true;
    }

    protected boolean id_class(an_3 an_32, rns_3 rns_32, String string, rzV_2 rzV_22) {
        rnP_2 rnP_22 = rns_32.id_byte(string);
        if (rnP_22 == null) {
            return false;
        }
        String string2 = an_32.i();
        return !rns_32.id_class(string2, rnP_22) ? false : rzV_22.id_class(rns_32.id_break(string2, rnP_22).id_break());
    }

    @Override
    public Set<rzd_3<?>> id_class() {
        return ImmutableSet.of(this.id_break.id_class());
    }

    @Override
    public rWi_1 id_break() {
        return rQF.id_catch;
    }
}

