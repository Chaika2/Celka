/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 */
package celestial;

import celestial.aA_2;
import celestial.an_3;
import celestial.iB_2;
import celestial.iC_2;
import celestial.il_3;
import celestial.rLC;
import celestial.rPm_1;
import celestial.rRP;
import celestial.rRr_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfK_2;
import celestial.rga_3;
import celestial.rrEm_1;
import celestial.rrt_3;
import celestial.ruP_2;
import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class rrT_2
extends rPm_1<aA_2> {
    private final rRP id_class;
    private final il_3<rfK_2> id_byte;
    private final boolean id_protected;
    private final Optional<Byte> id_throws;
    private long id_case;
    private final Long2ObjectMap<rrt_3> id_catch = new Long2ObjectOpenHashMap();

    public rrT_2(rRP rRP2, il_3<rfK_2> il_32, il_3<rfK_2> il_33, boolean bl, Optional<Byte> optional) {
        super((Map<il_3<?>, iC_2>)rrT_2.id_class(il_32, il_33));
        this.id_class = rRP2;
        this.id_byte = il_33;
        this.id_protected = bl;
        this.id_throws = optional;
    }

    public rrT_2(rRP rRP2, il_3<rfK_2> il_32, boolean bl, Optional<Byte> optional) {
        this(rRP2, il_32, il_32, bl, optional);
    }

    private static ImmutableMap<il_3<?>, iC_2> id_class(il_3<rfK_2> il_32, il_3<rfK_2> il_33) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.put(il_32, (Object)iC_2.VALUE_ABSENT);
        if (il_33 != il_32) {
            builder.put(il_33, (Object)iC_2.VALUE_ABSENT);
        }
        return builder.build();
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, aA_2 aA_22) {
        if (this.id_protected && aA_22.n_()) {
            return false;
        }
        if (this.id_case == 0L) {
            this.id_case = ((rYB)aA_22.id_throws[7]).r() + (long)rrEm_12.id_int.nextInt(20);
            return false;
        }
        return rrEm_12.r() >= this.id_case;
    }

    protected void id_class(rrEm_1 rrEm_12, aA_2 aA_22, long l) {
        this.id_case = l + 20L + (long)rrEm_12.id_long().nextInt(20);
        rga_3 rga_32 = rrEm_12.d();
        this.id_catch.long2ObjectEntrySet().removeIf(entry -> !((rrt_3)entry.getValue()).id_break(l));
        Predicate<rfH_2> predicate = rfH_22 -> {
            rrt_3 rrt_32 = (rrt_3)this.id_catch.get(rfH_22.id_package());
            if (rrt_32 == null) {
                return true;
            }
            if (!rrt_32.id_byte(l)) {
                return false;
            }
            rrt_32.id_class(l);
            return true;
        };
        Set<rfH_2> set = rga_32.id_break(this.id_class.id_break(), predicate, aA_22.Bs(), 48, rRr_1.HAS_SPACE).limit(5L).collect(Collectors.toSet());
        rLC rLC2 = aA_22.id_public().id_class(set, this.id_class.id_byte());
        if (rLC2 != null && rLC2.id_finally()) {
            rfH_2 rfH_23 = rLC2.id_volatile();
            rga_32.id_byte(rfH_23).ifPresent(rRP2 -> {
                rga_32.id_class(this.id_class.id_break(), rfH_23 -> rfH_23.equals(rfH_23), rfH_23, 1);
                aA_22.SF().id_class(this.id_byte, rfK_2.id_class(rrEm_12.E(), rfH_23));
                this.id_throws.ifPresent(by -> rrEm_12.id_class((an_3)aA_22, (byte)by));
                this.id_catch.clear();
                ruP_2.id_byte(rrEm_12, rfH_23);
            });
        } else {
            for (rfH_2 rfH_24 : set) {
                this.id_catch.computeIfAbsent(rfH_24.id_package(), l2 -> new rrt_3(((rYB)aA_22.id_throws[7]).id_int, l));
            }
        }
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (aA_2)iB_22, l);
    }
}

