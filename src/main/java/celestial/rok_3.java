/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  it.unimi.dsi.fastutil.shorts.ShortList
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.an_3;
import celestial.rKZ;
import celestial.rKu_1;
import celestial.rKv_1;
import celestial.rRV;
import celestial.rVh_1;
import celestial.rXE;
import celestial.rXG;
import celestial.rXs_1;
import celestial.rYB;
import celestial.rYZ;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfj_3;
import celestial.roC_2;
import celestial.roJ_2;
import celestial.roN_2;
import celestial.roQ_2;
import celestial.roW_2;
import celestial.rrrH;
import celestial.rrrZ;
import celestial.rrse_3;
import celestial.ryO_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.AbstractCollection;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rok_3
implements roC_2 {
    private static final Logger id_class = LogManager.getLogger();
    private final rfj_3 id_break;
    private volatile boolean id_byte;
    private rYZ id_protected;
    private volatile rrse_3 id_throws;
    private final Map<rKv_1, rKZ> id_case = Maps.newEnumMap(rKv_1.class);
    private volatile roN_2 id_catch = roN_2.id_class;
    private final Map<rfH_2, ryO_2> id_private = Maps.newHashMap();
    private final Map<rfH_2, rcd_3> id_implements = Maps.newHashMap();
    private final roQ_2[] id_finally = new roQ_2[16];
    private final List<rcd_3> id_extends = Lists.newArrayList();
    private final List<rfH_2> id_native = Lists.newArrayList();
    private final ShortList[] id_volatile = new ShortList[16];
    private final Map<rrrZ<?>, rrrH<?>> id_final = Maps.newHashMap();
    private final Map<rrrZ<?>, LongSet> id_package = Maps.newHashMap();
    private final rVh_1 id_int;
    private final roW_2<xd_3> id_new;
    private final roW_2<rXs_1> id_continue;
    private long id_super;
    private final Map<rKu_1, BitSet> id_this = new Object2ObjectArrayMap();
    private volatile boolean id_else;

    @Override
    public roQ_2[] id_byte() {
        return this.id_finally;
    }

    @Override
    public xc_3 id_byte(rfH_2 rfH_22) {
        int n = rfH_22.c_();
        if (rYB.id_protected(n)) {
            return xu_3.hG.id_continue();
        }
        roQ_2 roQ_22 = this.id_byte()[n >> 4];
        return roQ_2.id_class(roQ_22) ? xu_3.id_class.id_continue() : roQ_22.id_class(rfH_22.b_() & 0xF, n & 0xF, rfH_22.d_() & 0xF);
    }

    public /* synthetic */ rRV id_int() {
        return this.id_finally();
    }

    public rok_3(rfj_3 rfj_32, rVh_1 rVh_12) {
        this(rfj_32, rVh_12, null, new roW_2<xd_3>(xd_32 -> xd_32 == null || xd_32.id_continue().id_catch(), rfj_32), new roW_2<rXs_1>(rXs_12 -> rXs_12 == null || rXs_12 == rXG.id_class, rfj_32));
    }

    public rok_3(rfj_3 rfj_32, rVh_1 rVh_12, roQ_2[] roQ_2Array, roW_2<xd_3> roW_22, roW_2<rXs_1> roW_23) {
        this.id_break = rfj_32;
        this.id_int = rVh_12;
        this.id_new = roW_22;
        this.id_continue = roW_23;
        if (roQ_2Array != null) {
            if (this.id_finally.length == roQ_2Array.length) {
                System.arraycopy(roQ_2Array, 0, this.id_finally, 0, this.id_finally.length);
            } else {
                id_class.warn("Could not set level chunk sections, array length is {} instead of {}", (Object)roQ_2Array.length, (Object)this.id_finally.length);
            }
        }
    }

    @Override
    public long id_this() {
        return this.id_super;
    }

    @Override
    public void id_class(rrrZ<?> rrrZ2, rrrH<?> rrrH2) {
        this.id_final.put(rrrZ2, rrrH2);
        this.id_byte = true;
    }

    public void id_class(short s, int n) {
        this.id_implements(rok_3.id_class(s, n, this.id_break));
    }

    @Override
    public void id_class(rrrZ<?> rrrZ3, long l) {
        this.id_package.computeIfAbsent(rrrZ3, rrrZ2 -> new LongOpenHashSet()).add(l);
        this.id_byte = true;
    }

    @Override
    public Map<rrrZ<?>, LongSet> id_class() {
        return Collections.unmodifiableMap(this.id_package);
    }

    @Override
    public void id_class(rKv_1 rKv_12, long[] lArray) {
        this.id_class(rKv_12).id_class(lArray);
    }

    @Override
    public rKZ id_class(rKv_1 rKv_13) {
        return this.id_case.computeIfAbsent(rKv_13, rKv_12 -> new rKZ(this, (rKv_1)rKv_12));
    }

    @Override
    public int id_class(rKv_1 rKv_12, int n, int n2) {
        rKZ rKZ2 = this.id_case.get(rKv_12);
        if (rKZ2 == null) {
            rKZ.id_class(this, EnumSet.of(rKv_12));
            rKZ2 = this.id_case.get(rKv_12);
        }
        return rKZ2.id_class(n & 0xF, n2 & 0xF) - 1;
    }

    @Override
    public void id_class(long l) {
    }

    @Override
    public rrrH<?> id_class(rrrZ<?> rrrZ2) {
        return this.id_final.get(rrrZ2);
    }

    public void id_class(rKu_1 rKu_12, BitSet bitSet) {
        this.id_this.put(rKu_12, bitSet);
    }

    public void id_class(rrse_3 rrse_32) {
        this.id_throws = rrse_32;
    }

    @Override
    public void id_class(Map<rrrZ<?>, LongSet> map) {
        this.id_package.clear();
        this.id_package.putAll(map);
        this.id_byte = true;
    }

    public static rfH_2 id_class(short s, int n, rfj_3 rfj_32) {
        int n2 = (s & 0xF) + (rfj_32.id_break << 4);
        int n3 = (s >>> 4 & 0xF) + (n << 4);
        int n4 = (s >>> 8 & 0xF) + (rfj_32.id_byte << 4);
        return new rfH_2(n2, n3, n4);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        this.id_implements.put(new rfH_2(rcd_32.id_private("x"), rcd_32.id_private("y"), rcd_32.id_private("z")), rcd_32);
    }

    public BitSet id_class(rKu_1 rKu_12) {
        return this.id_this.get(rKu_12);
    }

    public void id_class(roN_2 roN_22) {
        this.id_catch = roN_22;
        this.id_break(true);
    }

    @Override
    public void id_class(rfH_2 rfH_22, ryO_2 ryO_22) {
        ryO_22.id_byte(rfH_22);
        this.id_private.put(rfH_22, ryO_22);
    }

    @Override
    public void id_class(an_3 an_32) {
        if (!an_32.Pm()) {
            rcd_3 rcd_32 = new rcd_3();
            an_32.id_byte(rcd_32);
            this.id_break(rcd_32);
        }
    }

    @Override
    public ryO_2 id_class(rfH_2 rfH_22) {
        return this.id_private.get(rfH_22);
    }

    public void id_class(rYZ rYZ2) {
        this.id_protected = rYZ2;
    }

    @Override
    public xc_3 id_class(rfH_2 rfH_22, xc_3 xc_32, boolean bl) {
        int n = rfH_22.b_();
        int n2 = rfH_22.c_();
        int n3 = rfH_22.d_();
        if (n2 >= 0 && n2 < 256) {
            rKv_1 rKv_12;
            Object object;
            if (this.id_finally[n2 >> 4] == roJ_2.id_class && xc_32.id_class(xu_3.id_class)) {
                return xc_32;
            }
            if (xc_32.id_case() > 0) {
                this.id_native.add(new rfH_2((n & 0xF) + this.id_private().id_break(), n2, (n3 & 0xF) + this.id_private().id_byte()));
            }
            roQ_2 roQ_22 = this.id_class(n2 >> 4);
            xc_3 xc_33 = roQ_22.id_class(n & 0xF, n2 & 0xF, n3 & 0xF, xc_32);
            if (this.id_catch.id_break(roN_2.id_implements) && xc_32 != xc_33 && (xc_32.id_break(this, rfH_22) != xc_33.id_break(this, rfH_22) || xc_32.id_case() != xc_33.id_case() || xc_32.id_throws() || xc_33.id_throws())) {
                object = this.id_catch();
                ((rrse_3)object).id_class(rfH_22);
            }
            object = this.id_goto().id_private();
            EnumSet<rKv_1> enumSet = null;
            Iterator iterator = ((AbstractCollection)object).iterator();
            while (iterator.hasNext()) {
                rKv_12 = (rKv_1)iterator.next();
                rKZ rKZ2 = this.id_case.get(rKv_12);
                if (rKZ2 != null) continue;
                if (enumSet == null) {
                    enumSet = EnumSet.noneOf(rKv_1.class);
                }
                enumSet.add(rKv_12);
            }
            if (enumSet != null) {
                rKZ.id_class(this, enumSet);
            }
            iterator = ((AbstractCollection)object).iterator();
            while (iterator.hasNext()) {
                rKv_12 = (rKv_1)iterator.next();
                this.id_case.get(rKv_12).id_class(n & 0xF, n2, n3 & 0xF, xc_32);
            }
            return xc_33;
        }
        return xu_3.hG.id_continue();
    }

    public roQ_2 id_class(int n) {
        if (this.id_finally[n] == roJ_2.id_class) {
            this.id_finally[n] = new roQ_2(n << 4);
        }
        return this.id_finally[n];
    }

    @Override
    public void id_break(Map<rrrZ<?>, rrrH<?>> map) {
        this.id_final.clear();
        this.id_final.putAll(map);
        this.id_byte = true;
    }

    public BitSet id_break(rKu_1 rKu_13) {
        return this.id_this.computeIfAbsent(rKu_13, rKu_12 -> new BitSet(65536));
    }

    @Override
    public void id_break(short s, int n) {
        roC_2.id_class(this.id_volatile, n).add(s);
    }

    @Override
    public rXE id_break(rfH_2 rfH_22) {
        int n = rfH_22.c_();
        if (rYB.id_protected(n)) {
            return rXG.id_class.id_private();
        }
        roQ_2 roQ_22 = this.id_byte()[n >> 4];
        return roQ_2.id_class(roQ_22) ? rXG.id_class.id_private() : roQ_22.id_break(rfH_22.b_() & 0xF, n & 0xF, rfH_22.d_() & 0xF);
    }

    @Override
    public Set<rfH_2> id_break() {
        HashSet hashSet = Sets.newHashSet(this.id_implements.keySet());
        hashSet.addAll(this.id_private.keySet());
        return hashSet;
    }

    public void id_break(rcd_3 rcd_32) {
        this.id_extends.add(rcd_32);
    }

    @Override
    public LongSet id_break(rrrZ<?> rrrZ3) {
        return this.id_package.computeIfAbsent(rrrZ3, rrrZ2 -> new LongOpenHashSet());
    }

    @Override
    public void id_break(long l) {
        this.id_super = l;
    }

    @Override
    public void id_break(boolean bl) {
        this.id_byte = bl;
    }

    @Override
    public void id_throws(rfH_2 rfH_22) {
        this.id_private.remove(rfH_22);
        this.id_implements.remove(rfH_22);
    }

    public Map<rfH_2, ryO_2> id_throws() {
        return this.id_private;
    }

    public static short id_finally(rfH_2 rfH_22) {
        int n = rfH_22.b_();
        int n2 = rfH_22.c_();
        int n3 = rfH_22.d_();
        int n4 = n & 0xF;
        int n5 = n2 & 0xF;
        int n6 = n3 & 0xF;
        return (short)(n4 | n5 << 4 | n6 << 8);
    }

    public roW_2<xd_3> id_finally() {
        return this.id_new;
    }

    public rrse_3 id_catch() {
        return this.id_throws;
    }

    public roW_2<rXs_1> id_extends() {
        return this.id_continue;
    }

    @Override
    public void id_extends(rfH_2 rfH_22) {
        if (!rYB.id_super(rfH_22)) {
            roC_2.id_class(this.id_volatile, rfH_22.c_() >> 4).add(rok_3.id_finally(rfH_22));
        }
    }

    @Override
    public roN_2 id_goto() {
        return this.id_catch;
    }

    @Override
    public rcd_3 id_case(rfH_2 rfH_22) {
        return this.id_implements.get(rfH_22);
    }

    public List<rcd_3> id_case() {
        return this.id_extends;
    }

    @Override
    public boolean id_continue() {
        return this.id_byte;
    }

    public void id_implements(rfH_2 rfH_22) {
        this.id_native.add(rfH_22.id_int());
    }

    @Override
    public rYZ id_implements() {
        return this.id_protected;
    }

    public /* synthetic */ rRV id_new() {
        return this.id_extends();
    }

    @Override
    public Stream<rfH_2> id_package() {
        return this.id_native.stream();
    }

    @Override
    public ShortList[] id_return() {
        return this.id_volatile;
    }

    @Override
    public Map<rrrZ<?>, rrrH<?>> id_super() {
        return Collections.unmodifiableMap(this.id_final);
    }

    @Override
    public boolean id_throw() {
        return this.id_else;
    }

    @Override
    public void id_protected(boolean bl) {
        this.id_else = bl;
        this.id_break(true);
    }

    @Override
    public rcd_3 id_protected(rfH_2 rfH_22) {
        ryO_2 ryO_22 = this.id_class(rfH_22);
        return ryO_22 != null ? ryO_22.id_class(new rcd_3()) : this.id_implements.get(rfH_22);
    }

    public ShortList[] id_protected() {
        ShortList[] shortListArray = new ShortList[16];
        for (rfH_2 rfH_22 : this.id_native) {
            roC_2.id_class(shortListArray, rfH_22.c_() >> 4).add(rok_3.id_finally(rfH_22));
        }
        return shortListArray;
    }

    @Override
    public rfj_3 id_private() {
        return this.id_break;
    }

    public Map<rfH_2, rcd_3> id_volatile() {
        return Collections.unmodifiableMap(this.id_implements);
    }

    @Override
    public rVh_1 id_synchronized() {
        return this.id_int;
    }

    @Override
    public Collection<Map.Entry<rKv_1, rKZ>> id_native() {
        return Collections.unmodifiableSet(this.id_case.entrySet());
    }
}

