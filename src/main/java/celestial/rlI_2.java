/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.util.Pair
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rHr_1;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rfw_3;
import celestial.rlH_2;
import celestial.rlT_2;
import celestial.rlY_2;
import celestial.rle_3;
import celestial.rlf_3;
import celestial.rlj_3;
import celestial.rlp_3;
import celestial.rqd_3;
import celestial.rrEm_1;
import celestial.ryG_2;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rlI_2 {
    private static final Logger id_class = LogManager.getLogger();
    private final rfH_2 id_break;
    private final rrEm_1 id_byte;
    private final rlT_2 id_protected;
    private final int id_throws;
    private final List<rle_3> id_case = Lists.newArrayList();
    private final Map<rle_3, rfH_2> id_catch = Maps.newHashMap();
    private final List<Pair<rlp_3, Collection<rle_3>>> id_private = Lists.newArrayList();
    private rlY_2 id_implements;
    private int id_finally = 0;
    private rfw_3 id_extends;

    public rlI_2(Collection<rlp_3> collection, rfH_2 rfH_22, rqd_3 rqd_32, rrEm_1 rrEm_12, rlT_2 rlT_22, int n) {
        this.id_extends = rfH_22.id_new();
        this.id_break = rfH_22;
        this.id_byte = rrEm_12;
        this.id_protected = rlT_22;
        this.id_throws = n;
        collection.forEach(rlp_32 -> {
            ArrayList arrayList = Lists.newArrayList();
            for (rlj_3 rlj_32 : rlp_32.id_break()) {
                rle_3 rle_32 = new rle_3(rlj_32, rqd_32, rrEm_12);
                arrayList.add(rle_32);
                this.id_case.add(rle_32);
            }
            this.id_private.add((Pair<rlp_3, Collection<rle_3>>)Pair.of((Object)rlp_32, (Object)arrayList));
        });
    }

    public void id_class(rle_3 rle_32) {
        if (this.id_implements.id_catch()) {
            this.id_class(this.id_finally + 1);
        }
    }

    public List<rle_3> id_class() {
        return this.id_case;
    }

    private void id_class(Collection<rle_3> collection) {
        int n = 0;
        rfl_3 rfl_32 = new rfl_3(this.id_extends);
        for (rle_3 rle_32 : collection) {
            rfH_2 rfH_22 = new rfH_2(this.id_extends);
            ryG_2 ryG_22 = rlH_2.id_class(rle_32.id_volatile(), rfH_22, rle_32.id_final(), 2, this.id_byte, true);
            rfl_3 rfl_33 = rlH_2.id_class(ryG_22);
            rle_32.id_class(ryG_22.id_char());
            this.id_catch.put(rle_32, new rfH_2(this.id_extends));
            rfl_32 = rfl_32.id_break(rfl_33);
            this.id_extends.id_byte((int)rfl_33.id_break() + 5, 0, 0);
            if (n++ % this.id_throws != this.id_throws - 1) continue;
            this.id_extends.id_byte(0, 0, (int)rfl_32.id_protected() + 6);
            this.id_extends.a_(this.id_break.b_());
            rfl_32 = new rfl_3(this.id_extends);
        }
    }

    private void id_class(int n) {
        this.id_finally = n;
        this.id_implements = new rlY_2();
        if (n < this.id_private.size()) {
            Pair<rlp_3, Collection<rle_3>> pair = this.id_private.get(this.id_finally);
            rlp_3 rlp_32 = (rlp_3)pair.getFirst();
            Collection collection = (Collection)pair.getSecond();
            this.id_class(collection);
            rlp_32.id_class(this.id_byte);
            String string = rlp_32.id_class();
            id_class.info("Running test batch '" + string + "' (" + collection.size() + " tests)...");
            collection.forEach(rle_32 -> {
                this.id_implements.id_class((rle_3)rle_32);
                this.id_implements.id_class(new rlf_3(this));
                rfH_2 rfH_22 = this.id_catch.get(rle_32);
                rHr_1.id_class(rle_32, rfH_22, this.id_protected);
            });
        }
    }

    public void id_break() {
        this.id_class(0);
    }
}

