/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.objects.ObjectArraySet
 */
package celestial;

import celestial.HU;
import celestial.le_3;
import celestial.rpr_3;
import celestial.rrxx_3;
import celestial.ryO_2;
import celestial.yF_2;
import celestial.yv_3;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.BitSet;
import java.util.List;
import java.util.Set;

public class yZ_2 {
    public static final yZ_2 id_class = new yv_3();
    public final rrxx_3 id_break = new rrxx_3();
    public final Set<HU> id_byte = new ObjectArraySet();
    public boolean id_protected = true;
    public final List<ryO_2> id_throws = Lists.newArrayList();
    public yF_2 id_case = new yF_2();
    public le_3 id_catch;
    private final BitSet[] id_private = new BitSet[HU.s.length];

    public boolean id_byte(HU hU) {
        return this.id_byte.contains(hU);
    }

    public void id_class(HU hU, BitSet bitSet) {
        this.id_private[hU.id_protected()] = bitSet;
    }

    public boolean id_class(HU hU) {
        return !this.id_break.id_break(hU);
    }

    public boolean id_class(rpr_3 rpr_32, rpr_3 rpr_33) {
        return this.id_case.id_class(rpr_32, rpr_33);
    }

    public boolean id_class() {
        return this.id_protected;
    }

    public BitSet id_break(HU hU) {
        return this.id_private[hU.id_protected()];
    }

    public List<ryO_2> id_break() {
        return this.id_throws;
    }

    public void id_throws(HU hU) {
        this.id_break.id_class(hU);
    }

    public void id_protected(HU hU) {
        this.id_byte.add(hU);
    }
}

