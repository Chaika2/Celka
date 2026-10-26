/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.shorts.ShortArrayList
 *  it.unimi.dsi.fastutil.shorts.ShortList
 *  org.apache.logging.log4j.LogManager
 */
package celestial;

import celestial.an_3;
import celestial.rKZ;
import celestial.rKv_1;
import celestial.rRV;
import celestial.rRj_1;
import celestial.rRq_1;
import celestial.rVh_1;
import celestial.rXs_1;
import celestial.rYZ;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfj_3;
import celestial.roN_2;
import celestial.roQ_2;
import celestial.rrrH;
import celestial.rrrZ;
import celestial.ryO_2;
import celestial.xc_3;
import celestial.xd_3;
import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;

public interface roC_2
extends rRj_1,
rRq_1 {
    default public int id_char() {
        roQ_2 roQ_22 = this.id_interface();
        return roQ_22 == null ? 0 : roQ_22.id_catch();
    }

    public roQ_2[] id_byte();

    public rRV<xd_3> id_int();

    public long id_this();

    default public roQ_2 id_interface() {
        roQ_2[] roQ_2Array = this.id_byte();
        for (int i = roQ_2Array.length - 1; i >= 0; --i) {
            roQ_2 roQ_22 = roQ_2Array[i];
            if (roQ_2.id_class(roQ_22)) continue;
            return roQ_22;
        }
        return null;
    }

    public int id_class(rKv_1 var1, int var2, int var3);

    public rKZ id_class(rKv_1 var1);

    public void id_class(long var1);

    default public boolean id_class(int n, int n2) {
        if (n < 0) {
            n = 0;
        }
        if (n2 >= 256) {
            n2 = 255;
        }
        for (int i = n; i <= n2; i += 16) {
            if (roQ_2.id_class(this.id_byte()[i >> 4])) continue;
            return false;
        }
        return true;
    }

    default public void id_class(rcd_3 rcd_32) {
        LogManager.getLogger().warn("Trying to set a BlockEntity, but this operation is not supported.");
    }

    public void id_class(rfH_2 var1, ryO_2 var2);

    public void id_class(an_3 var1);

    public xc_3 id_class(rfH_2 var1, xc_3 var2, boolean var3);

    public void id_class(rKv_1 var1, long[] var2);

    public static ShortList id_class(ShortList[] shortListArray, int n) {
        if (shortListArray[n] == null) {
            shortListArray[n] = new ShortArrayList();
        }
        return shortListArray[n];
    }

    public void id_break(boolean var1);

    default public void id_break(short s, int n) {
        roC_2.id_class(this.id_return(), n).add(s);
    }

    public void id_break(long var1);

    public Set<rfH_2> id_break();

    public void id_break(Map<rrrZ<?>, rrrH<?>> var1);

    public void id_throws(rfH_2 var1);

    default public void id_extends(rfH_2 rfH_22) {
        LogManager.getLogger().warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", (Object)rfH_22);
    }

    public roN_2 id_goto();

    public rcd_3 id_case(rfH_2 var1);

    public boolean id_continue();

    public rYZ id_implements();

    public rRV<rXs_1> id_new();

    public Stream<rfH_2> id_package();

    public ShortList[] id_return();

    public Map<rrrZ<?>, rrrH<?>> id_super();

    public boolean id_throw();

    public void id_protected(boolean var1);

    public rcd_3 id_protected(rfH_2 var1);

    public rfj_3 id_private();

    public rVh_1 id_synchronized();

    public Collection<Map.Entry<rKv_1, rKZ>> id_native();
}

