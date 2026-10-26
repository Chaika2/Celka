/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  it.unimi.dsi.fastutil.longs.Long2LongMap
 *  it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap
 */
package celestial;

import celestial.il_3;
import celestial.is_3;
import celestial.rLC;
import celestial.rRP;
import celestial.rRr_1;
import celestial.rfH_2;
import celestial.rga_3;
import celestial.rrEm_1;
import celestial.rrr_3;
import com.google.common.collect.ImmutableSet;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class iK_2
extends rrr_3<is_3> {
    private final Long2LongMap id_class = new Long2LongOpenHashMap();
    private int id_break;
    private long id_byte;

    public iK_2() {
        super(20);
    }

    @Override
    protected void id_class(rrEm_1 rrEm_12, is_3 is_32) {
        if (is_32.n_()) {
            this.id_break = 0;
            this.id_byte = rrEm_12.r() + (long)rrEm_12.id_long().nextInt(20);
            rga_3 rga_32 = rrEm_12.d();
            Predicate<rfH_2> predicate = rfH_22 -> {
                long l = rfH_22.id_package();
                if (this.id_class.containsKey(l)) {
                    return false;
                }
                if (++this.id_break >= 5) {
                    return false;
                }
                this.id_class.put(l, this.id_byte + 40L);
                return true;
            };
            Stream<rfH_2> stream = rga_32.id_class(rRP.id_continue.id_break(), predicate, is_32.Bs(), 48, rRr_1.ANY);
            rLC rLC2 = is_32.id_public().id_class(stream, rRP.id_continue.id_byte());
            if (rLC2 != null && rLC2.id_finally()) {
                rfH_2 rfH_23 = rLC2.id_volatile();
                Optional<rRP> optional = rga_32.id_byte(rfH_23);
                if (optional.isPresent()) {
                    is_32.SF().id_class(il_3.id_return, rfH_23);
                }
            } else if (this.id_break < 5) {
                this.id_class.long2LongEntrySet().removeIf(entry -> entry.getLongValue() < this.id_byte);
            }
        }
    }

    @Override
    public Set<il_3<?>> id_class() {
        return ImmutableSet.of(il_3.id_return);
    }
}

