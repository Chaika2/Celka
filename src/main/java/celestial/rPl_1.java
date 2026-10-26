/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  it.unimi.dsi.fastutil.longs.Long2LongMap
 *  it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap
 */
package celestial;

import celestial.aA_2;
import celestial.iB_2;
import celestial.iC_2;
import celestial.iH_2;
import celestial.il_3;
import celestial.rLC;
import celestial.rPm_1;
import celestial.rRP;
import celestial.rRr_1;
import celestial.rfH_2;
import celestial.rga_3;
import celestial.rrEm_1;
import celestial.ruP_2;
import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class rPl_1
extends rPm_1<iB_2> {
    private final float id_class;
    private final Long2LongMap id_byte = new Long2LongOpenHashMap();
    private int id_protected;
    private long id_throws;

    public rPl_1(float f) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_volatile, (Object)((Object)iC_2.VALUE_ABSENT), il_3.id_break, (Object)((Object)iC_2.VALUE_ABSENT)));
        this.id_class = f;
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, iB_2 iB_22) {
        if (rrEm_12.r() - this.id_throws < 20L) {
            return false;
        }
        aA_2 aA_22 = (aA_2)iB_22;
        rga_3 rga_32 = rrEm_12.d();
        Optional<rfH_2> optional = rga_32.id_protected(rRP.id_continue.id_break(), iB_22.Bs(), 48, rRr_1.ANY);
        return optional.isPresent() && !(optional.get().id_private(aA_22.Bs()) <= 4.0);
    }

    @Override
    protected void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_protected = 0;
        this.id_throws = rrEm_12.r() + (long)rrEm_12.id_long().nextInt(20);
        aA_2 aA_22 = (aA_2)iB_22;
        rga_3 rga_32 = rrEm_12.d();
        Predicate<rfH_2> predicate = rfH_22 -> {
            long l = rfH_22.id_package();
            if (this.id_byte.containsKey(l)) {
                return false;
            }
            if (++this.id_protected >= 5) {
                return false;
            }
            this.id_byte.put(l, this.id_throws + 40L);
            return true;
        };
        Stream<rfH_2> stream = rga_32.id_class(rRP.id_continue.id_break(), predicate, iB_22.Bs(), 48, rRr_1.ANY);
        rLC rLC2 = aA_22.id_public().id_class(stream, rRP.id_continue.id_byte());
        if (rLC2 != null && rLC2.id_finally()) {
            rfH_2 rfH_23 = rLC2.id_volatile();
            Optional<rRP> optional = rga_32.id_byte(rfH_23);
            if (optional.isPresent()) {
                iB_22.SF().id_class(il_3.id_volatile, new iH_2(rfH_23, this.id_class, 1));
                ruP_2.id_byte(rrEm_12, rfH_23);
            }
        } else if (this.id_protected < 5) {
            this.id_byte.long2LongEntrySet().removeIf(entry -> entry.getLongValue() < this.id_throws);
        }
    }
}

