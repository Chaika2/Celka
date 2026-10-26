/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.serialization.Dynamic
 *  it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 */
package celestial;

import celestial.rpf_3;
import celestial.rtO_2;
import celestial.rtS_2;
import celestial.rtd_3;
import celestial.ryv_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class rtk_3 {
    private final rpf_3<Dynamic<?>> id_break = new rpf_3(32);
    private final List<Dynamic<?>> id_byte;
    private final Dynamic<?> id_protected;
    private final boolean id_throws;
    public final Int2ObjectMap<IntList> id_case = new Int2ObjectLinkedOpenHashMap();
    public final IntList id_catch = new IntArrayList();
    public final int id_class;
    private final Set<Dynamic<?>> id_private = Sets.newIdentityHashSet();
    private final int[] id_implements = new int[4096];

    public rtk_3(Dynamic<?> dynamic) {
        this.id_byte = Lists.newArrayList();
        this.id_protected = dynamic;
        this.id_class = dynamic.get("Y").asInt(0);
        this.id_throws = dynamic.get("Blocks").result().isPresent();
    }

    private void id_class(int n, int n2) {
        IntList intList = (IntList)this.id_case.get(n);
        if (intList == null) {
            intList = new IntArrayList();
            this.id_case.put(n, (Object)intList);
        }
        intList.add(n2);
    }

    public Dynamic<?> id_class() {
        Dynamic dynamic = this.id_protected;
        if (!this.id_throws) {
            return dynamic;
        }
        dynamic = dynamic.set("Palette", dynamic.createList(this.id_byte.stream()));
        int n = Math.max(4, DataFixUtils.ceillog2((int)this.id_private.size()));
        ryv_3 ryv_32 = new ryv_3(n, 4096);
        for (int i = 0; i < this.id_implements.length; ++i) {
            ryv_32.id_class(i, this.id_implements[i]);
        }
        dynamic = dynamic.set("BlockStates", dynamic.createLongList(Arrays.stream(ryv_32.id_class())));
        dynamic = dynamic.remove("Blocks");
        dynamic = dynamic.remove("Data");
        return dynamic.remove("Add");
    }

    public Dynamic<?> id_class(int n) {
        if (n >= 0 && n <= 4095) {
            Dynamic<?> dynamic = this.id_break.id_class(this.id_implements[n]);
            return dynamic == null ? rtO_2.id_else : dynamic;
        }
        return rtO_2.id_else;
    }

    public void id_class(int n, Dynamic<?> dynamic) {
        if (this.id_private.add(dynamic)) {
            this.id_byte.add("%%FILTER_ME%%".equals(rtO_2.id_class(dynamic)) ? rtO_2.id_else : dynamic);
        }
        this.id_implements[n] = rtO_2.id_class(this.id_break, dynamic);
    }

    public int id_break(int n) {
        if (!this.id_throws) {
            return n;
        }
        ByteBuffer byteBuffer2 = (ByteBuffer)this.id_protected.get("Blocks").asByteBufferOpt().result().get();
        rtd_3 rtd_32 = this.id_protected.get("Data").asByteBufferOpt().map(byteBuffer -> new rtd_3(DataFixUtils.toArray((ByteBuffer)byteBuffer))).result().orElseGet(rtd_3::new);
        rtd_3 rtd_33 = this.id_protected.get("Add").asByteBufferOpt().map(byteBuffer -> new rtd_3(DataFixUtils.toArray((ByteBuffer)byteBuffer))).result().orElseGet(rtd_3::new);
        this.id_private.add(rtO_2.id_else);
        rtO_2.id_class(this.id_break, rtO_2.id_else);
        this.id_byte.add(rtO_2.id_else);
        for (int i = 0; i < 4096; ++i) {
            int n2 = i & 0xF;
            int n3 = i >> 8 & 0xF;
            int n4 = i >> 4 & 0xF;
            int n5 = rtd_33.id_class(n2, n3, n4) << 12 | (byteBuffer2.get(i) & 0xFF) << 4 | rtd_32.id_class(n2, n3, n4);
            if (rtO_2.id_byte.get(n5 >> 4)) {
                this.id_class(n5 >> 4, i);
            }
            if (rtO_2.id_break.get(n5 >> 4)) {
                int n6 = rtO_2.id_class(n2 == 0, n2 == 15, n4 == 0, n4 == 15);
                if (n6 == 0) {
                    this.id_catch.add(i);
                } else {
                    n |= n6;
                }
            }
            this.id_class(i, rtS_2.id_break(n5));
        }
        return n;
    }
}

