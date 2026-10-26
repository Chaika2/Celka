/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.shorts.ShortList
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.KU;
import celestial.KY;
import celestial.Ko_1;
import celestial.aI_2;
import celestial.an_3;
import celestial.kx_3;
import celestial.rKZ;
import celestial.rKk_1;
import celestial.rKv_1;
import celestial.rRV;
import celestial.rRd_1;
import celestial.rRe_1;
import celestial.rSm_1;
import celestial.rSu_1;
import celestial.rVL;
import celestial.rVh_1;
import celestial.rXE;
import celestial.rXG;
import celestial.rXs_1;
import celestial.rYB;
import celestial.rYZ;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfj_3;
import celestial.rfl_3;
import celestial.rjU_2;
import celestial.roC_2;
import celestial.roN_2;
import celestial.roQ_2;
import celestial.roW_2;
import celestial.rok_3;
import celestial.rox_3;
import celestial.rrEJ;
import celestial.rrEm_1;
import celestial.rrQX;
import celestial.rrnb_3;
import celestial.rrrH;
import celestial.rrrZ;
import celestial.rrse_3;
import celestial.ruu_3;
import celestial.ryI_2;
import celestial.ryO_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class roJ_2
implements roC_2 {
    private static final Logger id_break = LogManager.getLogger();
    public static final roQ_2 id_class = null;
    private final roQ_2[] id_byte = new roQ_2[16];
    private rYZ id_protected;
    private final Map<rfH_2, rcd_3> id_throws = Maps.newHashMap();
    private boolean id_case;
    private final rYB id_catch;
    private final Map<rKv_1, rKZ> id_private = Maps.newEnumMap(rKv_1.class);
    private final rVh_1 id_implements;
    private final Map<rfH_2, ryO_2> id_finally = Maps.newHashMap();
    private final ryI_2<an_3>[] id_extends;
    private final Map<rrrZ<?>, rrrH<?>> id_native = Maps.newHashMap();
    private final Map<rrrZ<?>, LongSet> id_volatile = Maps.newHashMap();
    private final ShortList[] id_final = new ShortList[16];
    private rRV<xd_3> id_package;
    private rRV<rXs_1> id_int;
    private boolean id_new;
    private long id_continue;
    private volatile boolean id_super;
    private long id_this;
    private Supplier<rrEJ> id_else;
    private Consumer<roJ_2> id_synchronized;
    private final rfj_3 id_return;
    private volatile boolean id_public;

    @Override
    public xc_3 id_byte(rfH_2 rfH_22) {
        int n = rfH_22.b_();
        int n2 = rfH_22.c_();
        int n3 = rfH_22.d_();
        if (this.id_catch.b()) {
            xc_3 xc_32 = null;
            if (n2 == 60) {
                xc_32 = xu_3.Ec.id_continue();
            }
            if (n2 == 70) {
                xc_32 = rKk_1.id_break(n, n3);
            }
            return xc_32 == null ? xu_3.id_class.id_continue() : xc_32;
        }
        try {
            roQ_2 roQ_22;
            if (n2 >= 0 && n2 >> 4 < this.id_byte.length && !roQ_2.id_class(roQ_22 = this.id_byte[n2 >> 4])) {
                return roQ_22.id_class(n & 0xF, n2 & 0xF, n3 & 0xF);
            }
            return xu_3.id_class.id_continue();
        }
        catch (Throwable throwable) {
            KY kY = KY.id_class(throwable, "Getting block state");
            Ko_1 ko_1 = kY.id_class("Block being got");
            ko_1.id_class("Location", () -> Ko_1.id_class(n, n2, n3));
            throw new KU(kY);
        }
    }

    public void id_byte(boolean bl) {
        this.id_new = bl;
    }

    @Override
    public roQ_2[] id_byte() {
        return this.id_byte;
    }

    @Override
    public rRV<xd_3> id_int() {
        return this.id_package;
    }

    public roJ_2(rYB rYB2, rfj_3 rfj_32, rYZ rYZ2, rVh_1 rVh_12, rRV<xd_3> rRV2, rRV<rXs_1> rRV3, long l, roQ_2[] roQ_2Array, Consumer<roJ_2> consumer) {
        this.id_extends = new ryI_2[16];
        this.id_catch = rYB2;
        this.id_return = rfj_32;
        this.id_implements = rVh_12;
        for (rKv_1 rKv_12 : rKv_1.values()) {
            if (!roN_2.id_volatile.id_private().contains(rKv_12)) continue;
            this.id_private.put(rKv_12, new rKZ(this, rKv_12));
        }
        for (int i = 0; i < this.id_extends.length; ++i) {
            this.id_extends[i] = new ryI_2<an_3>(an_3.class);
        }
        this.id_protected = rYZ2;
        this.id_package = rRV2;
        this.id_int = rRV3;
        this.id_this = l;
        this.id_synchronized = consumer;
        if (roQ_2Array != null) {
            if (this.id_byte.length == roQ_2Array.length) {
                System.arraycopy(roQ_2Array, 0, this.id_byte, 0, this.id_byte.length);
            } else {
                id_break.warn("Could not set level chunk sections, array length is {} instead of {}", (Object)roQ_2Array.length, (Object)this.id_byte.length);
            }
        }
    }

    public roJ_2(rYB rYB2, rok_3 rok_32) {
        this(rYB2, rok_32.id_private(), rok_32.id_implements(), rok_32.id_synchronized(), rok_32.id_finally(), rok_32.id_extends(), rok_32.id_this(), rok_32.id_byte(), null);
        for (rcd_3 entry : rok_32.id_case()) {
            aI_2.id_class(entry, rYB2, (an_3 an_32) -> {
                this.id_class((an_3)an_32);
                return an_32;
            });
        }
        for (ryO_2 ryO_22 : rok_32.id_throws().values()) {
            this.id_class(ryO_22);
        }
        this.id_throws.putAll(rok_32.id_volatile());
        for (int i = 0; i < rok_32.id_return().length; ++i) {
            this.id_final[i] = rok_32.id_return()[i];
        }
        this.id_break(rok_32.id_super());
        this.id_class(rok_32.id_class());
        for (Map.Entry<rKv_1, rKZ> entry : rok_32.id_native()) {
            if (!roN_2.id_volatile.id_private().contains(entry.getKey())) continue;
            this.id_class(entry.getKey()).id_class(entry.getValue().id_class());
        }
        this.id_protected(rok_32.id_throw());
        this.id_super = true;
    }

    public roJ_2(rYB rYB2, rfj_3 rfj_32, rYZ rYZ2) {
        this(rYB2, rfj_32, rYZ2, rVh_1.id_class, rRd_1.id_class(), rRd_1.id_class(), 0L, null, null);
    }

    @Override
    public long id_this() {
        return this.id_this;
    }

    public rXE id_class(int n, int n2, int n3) {
        try {
            roQ_2 roQ_22;
            if (n2 >= 0 && n2 >> 4 < this.id_byte.length && !roQ_2.id_class(roQ_22 = this.id_byte[n2 >> 4])) {
                return roQ_22.id_break(n & 0xF, n2 & 0xF, n3 & 0xF);
            }
            return rXG.id_class.id_private();
        }
        catch (Throwable throwable) {
            KY kY = KY.id_class(throwable, "Getting fluid state");
            Ko_1 ko_1 = kY.id_class("Block being got");
            ko_1.id_class("Location", () -> Ko_1.id_class(n, n2, n3));
            throw new KU(kY);
        }
    }

    @Override
    public void id_class(long l) {
        this.id_continue = l;
    }

    @Override
    public rrrH<?> id_class(rrrZ<?> rrrZ2) {
        return this.id_native.get(rrrZ2);
    }

    @Override
    public void id_class(rrrZ<?> rrrZ2, rrrH<?> rrrH2) {
        this.id_native.put(rrrZ2, rrrH2);
    }

    public <T extends an_3> void id_class(Class<? extends T> clazz, rfl_3 rfl_32, List<T> list, Predicate<? super T> predicate) {
        int n = rfU_2.id_byte((rfl_32.id_break - 2.0) / 16.0);
        int n2 = rfU_2.id_byte((rfl_32.id_throws + 2.0) / 16.0);
        n = rfU_2.id_class(n, 0, this.id_extends.length - 1);
        n2 = rfU_2.id_class(n2, 0, this.id_extends.length - 1);
        for (int i = n; i <= n2; ++i) {
            for (an_3 an_32 : this.id_extends[i].id_class(clazz)) {
                if (!an_32.rN().id_byte(rfl_32) || predicate != null && !predicate.test(an_32)) continue;
                list.add(an_32);
            }
        }
    }

    public void id_class(rYZ rYZ2, ruu_3 ruu_32, rcd_3 rcd_32, int n) {
        boolean bl = rYZ2 != null;
        Predicate<rfH_2> predicate = bl ? rfH_22 -> true : rfH_22 -> (n & 1 << (rfH_22.c_() >> 4)) != 0;
        Sets.newHashSet(this.id_finally.keySet()).stream().filter(predicate).forEach(this.id_catch::id_else);
        for (int i = 0; i < this.id_byte.length; ++i) {
            roQ_2 roQ_22 = this.id_byte[i];
            if ((n & 1 << i) == 0) {
                if (!bl || roQ_22 == id_class) continue;
                this.id_byte[i] = id_class;
                continue;
            }
            if (roQ_22 == id_class) {
                this.id_byte[i] = roQ_22 = new roQ_2(i << 4);
            }
            roQ_22.id_class(ruu_32);
        }
        if (rYZ2 != null) {
            this.id_protected = rYZ2;
        }
        for (rKv_1 rKv_12 : rKv_1.values()) {
            String string = rKv_12.id_break();
            if (!rcd_32.id_byte(string, 12)) continue;
            this.id_class(rKv_12, rcd_32.id_package(string));
        }
        for (ryO_2 ryO_22 : this.id_finally.values()) {
            ryO_22.id_float();
        }
    }

    public void id_class(boolean bl) {
        this.id_case = bl;
    }

    @Override
    public xc_3 id_class(rfH_2 rfH_22, xc_3 xc_32, boolean bl) {
        ryO_2 ryO_22;
        int n = rfH_22.b_() & 0xF;
        int n2 = rfH_22.c_();
        int n3 = rfH_22.d_() & 0xF;
        roQ_2 roQ_22 = this.id_byte[n2 >> 4];
        if (roQ_22 == id_class) {
            if (xc_32.id_catch()) {
                return null;
            }
            this.id_byte[n2 >> 4] = roQ_22 = new roQ_2(n2 >> 4 << 4);
        }
        boolean bl2 = roQ_22.id_byte();
        xc_3 xc_33 = roQ_22.id_class(n, n2 & 0xF, n3, xc_32);
        if (xc_33 == xc_32) {
            return null;
        }
        xd_3 xd_32 = xc_32.id_break();
        xd_3 xd_33 = xc_33.id_break();
        this.id_private.get(rKv_1.MOTION_BLOCKING).id_class(n, n2, n3, xc_32);
        this.id_private.get(rKv_1.MOTION_BLOCKING_NO_LEAVES).id_class(n, n2, n3, xc_32);
        this.id_private.get(rKv_1.OCEAN_FLOOR).id_class(n, n2, n3, xc_32);
        this.id_private.get(rKv_1.WORLD_SURFACE).id_class(n, n2, n3, xc_32);
        boolean bl3 = roQ_22.id_byte();
        if (bl2 != bl3) {
            this.id_catch.id_goto().id_class().id_class(rfH_22, bl3);
        }
        if (!this.id_catch.id_continue) {
            xc_33.id_break(this.id_catch, rfH_22, xc_32, bl);
        } else if (xd_33 != xd_32 && xd_33 instanceof kx_3) {
            this.id_catch.id_else(rfH_22);
        }
        if (!roQ_22.id_class(n, n2 & 0xF, n3).id_class(xd_32)) {
            return null;
        }
        if (xd_33 instanceof kx_3 && (ryO_22 = this.id_class(rfH_22, rox_3.CHECK)) != null) {
            ryO_22.id_float();
        }
        if (!this.id_catch.id_continue) {
            xc_32.id_class(this.id_catch, rfH_22, xc_33, bl);
        }
        if (xd_32 instanceof kx_3) {
            ryO_22 = this.id_class(rfH_22, rox_3.CHECK);
            if (ryO_22 == null) {
                ryO_22 = ((kx_3)((Object)xd_32)).id_class(this.id_catch);
                this.id_catch.id_class(rfH_22, ryO_22);
            } else {
                ryO_22.id_float();
            }
        }
        this.id_super = true;
        return xc_33;
    }

    public void id_class(rrEm_1 rrEm_12) {
        if (this.id_package == rRd_1.id_class()) {
            this.id_package = new rRe_1<xd_3>(rVL.id_strictfp::id_break, rrEm_12.id_synchronized().id_class(this.id_return, true, false), rrEm_12.r());
            this.id_break(true);
        }
        if (this.id_int == rRd_1.id_class()) {
            this.id_int = new rRe_1<rXs_1>(rVL.id_default::id_break, rrEm_12.id_return().id_class(this.id_return, true, false), rrEm_12.r());
            this.id_break(true);
        }
    }

    public void id_class(Supplier<rrEJ> supplier) {
        this.id_else = supplier;
    }

    @Override
    public rKZ id_class(rKv_1 rKv_13) {
        return this.id_private.computeIfAbsent(rKv_13, rKv_12 -> new rKZ(this, (rKv_1)rKv_12));
    }

    @Override
    public void id_class(rrrZ<?> rrrZ3, long l) {
        this.id_volatile.computeIfAbsent(rrrZ3, rrrZ2 -> new LongOpenHashSet()).add(l);
    }

    @Override
    public Map<rrrZ<?>, LongSet> id_class() {
        return this.id_volatile;
    }

    @Override
    public void id_class(Map<rrrZ<?>, LongSet> map) {
        this.id_volatile.clear();
        this.id_volatile.putAll(map);
    }

    private ryO_2 id_class(rfH_2 rfH_22, rcd_3 rcd_32) {
        ryO_2 ryO_22;
        xc_3 xc_32 = this.id_byte(rfH_22);
        if ("DUMMY".equals(rcd_32.id_native("id"))) {
            xd_3 xd_32 = xc_32.id_break();
            if (xd_32 instanceof kx_3) {
                ryO_22 = ((kx_3)((Object)xd_32)).id_class(this.id_catch);
            } else {
                ryO_22 = null;
                id_break.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", (Object)rfH_22, (Object)xc_32);
            }
        } else {
            ryO_22 = ryO_2.id_break(xc_32, rcd_32);
        }
        if (ryO_22 != null) {
            ryO_22.id_break(this.id_catch, rfH_22);
            this.id_class(ryO_22);
        } else {
            id_break.warn("Tried to load a block entity for block {} but failed at location {}", (Object)xc_32, (Object)rfH_22);
        }
        return ryO_22;
    }

    @Override
    public ryO_2 id_class(rfH_2 rfH_22) {
        return this.id_class(rfH_22, rox_3.CHECK);
    }

    public ryO_2 id_class(rfH_2 rfH_22, rox_3 rox_32) {
        ryO_2 ryO_22;
        rcd_3 rcd_32;
        ryO_2 ryO_23 = this.id_finally.get(rfH_22);
        if (ryO_23 == null && (rcd_32 = this.id_throws.remove(rfH_22)) != null && (ryO_22 = this.id_class(rfH_22, rcd_32)) != null) {
            return ryO_22;
        }
        if (ryO_23 == null) {
            if (rox_32 == rox_3.IMMEDIATE) {
                ryO_23 = this.id_implements(rfH_22);
                this.id_catch.id_class(rfH_22, ryO_23);
            }
        } else if (ryO_23.id_long()) {
            this.id_finally.remove(rfH_22);
            return null;
        }
        return ryO_23;
    }

    public void id_class(ryO_2 ryO_22) {
        this.id_class(ryO_22.id_char(), ryO_22);
        if (this.id_case || this.id_catch.id_import()) {
            this.id_catch.id_class(ryO_22.id_char(), ryO_22);
        }
    }

    @Override
    public void id_class(rfH_2 rfH_22, ryO_2 ryO_22) {
        if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrnb_3.id_class(ryO_22)).id_byte()) {
            return;
        }
        if (this.id_byte(rfH_22).id_break() instanceof kx_3) {
            ryO_22.id_break(this.id_catch, rfH_22);
            ryO_22.id_int();
            ryO_2 ryO_23 = this.id_finally.put(rfH_22.id_int(), ryO_22);
            if (ryO_23 != null && ryO_23 != ryO_22) {
                ryO_23.aa_();
            }
        }
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        this.id_throws.put(new rfH_2(rcd_32.id_private("x"), rcd_32.id_private("y"), rcd_32.id_private("z")), rcd_32);
    }

    @Override
    public void id_class(an_3 an_32) {
        int n;
        this.id_new = true;
        int n2 = rfU_2.id_byte(an_32.rx() / 16.0);
        int n3 = rfU_2.id_byte(an_32.BO() / 16.0);
        if (n2 != this.id_return.id_break || n3 != this.id_return.id_byte) {
            id_break.warn("Wrong location! ({}, {}) should be ({}, {}), {}", (Object)n2, (Object)n3, (Object)this.id_return.id_break, (Object)this.id_return.id_byte, (Object)an_32);
            Boolean bl = true;
            an_32.id_throws[27] = bl;
        }
        if ((n = rfU_2.id_byte(an_32.re() / 16.0)) < 0) {
            n = 0;
        }
        if (n >= this.id_extends.length) {
            n = this.id_extends.length - 1;
        }
        Boolean bl = true;
        an_32.id_throws[50] = bl;
        Integer n4 = this.id_return.id_break;
        an_32.id_throws[51] = n4;
        Integer n5 = n;
        an_32.id_throws[52] = n5;
        Integer n6 = this.id_return.id_byte;
        an_32.id_throws[53] = n6;
        this.id_extends[n].add(an_32);
    }

    @Override
    public void id_class(rKv_1 rKv_12, long[] lArray) {
        this.id_private.get(rKv_12).id_class(lArray);
    }

    public void id_class(an_3 an_32, int n) {
        if (n < 0) {
            n = 0;
        }
        if (n >= this.id_extends.length) {
            n = this.id_extends.length - 1;
        }
        this.id_extends[n].remove(an_32);
    }

    @Override
    public int id_class(rKv_1 rKv_12, int n, int n2) {
        return this.id_private.get(rKv_12).id_class(n & 0xF, n2 & 0xF) - 1;
    }

    public void id_class(an_3 an_32, rfl_3 rfl_32, List<an_3> list, Predicate<? super an_3> predicate, Function<an_3, rjU_2> function) {
        int n = rfU_2.id_byte((rfl_32.id_break - 2.0) / 16.0);
        int n2 = rfU_2.id_byte((rfl_32.id_throws + 2.0) / 16.0);
        n = rfU_2.id_class(n, 0, this.id_extends.length - 1);
        n2 = rfU_2.id_class(n2, 0, this.id_extends.length - 1);
        for (int i = n; i <= n2; ++i) {
            ryI_2<an_3> ryI_22 = this.id_extends[i];
            List<an_3> list2 = ryI_22.id_class();
            int n3 = list2.size();
            for (int j = 0; j < n3; ++j) {
                rSm_1[] rSm_1Array;
                an_3 an_33 = list2.get(j);
                rfl_3 rfl_33 = an_33.rN();
                if (function != null && (rSm_1Array = function.apply(an_33)) != null) {
                    rfl_33 = rfl_33.id_private(rSm_1Array.id_break, rSm_1Array.id_byte, rSm_1Array.id_protected);
                }
                if (!rfl_33.id_byte(rfl_32) || an_33 == an_32) continue;
                if (predicate == null || predicate.test(an_33)) {
                    list.add(an_33);
                }
                if (!(an_33 instanceof rSu_1)) continue;
                rSm_1Array = ((rSu_1)an_33).id_implements();
                int n4 = rSm_1Array.length;
                for (int k = 0; k < n4; ++k) {
                    rSm_1 rSm_12 = rSm_1Array[k];
                    if (rSm_12 == an_32 || !rSm_12.rN().id_byte(rfl_32) || predicate != null && !predicate.test(rSm_12)) continue;
                    list.add(rSm_12);
                }
            }
        }
    }

    public <T extends an_3> void id_class(aI_2<?> aI_22, rfl_3 rfl_32, List<? super T> list, Predicate<? super T> predicate) {
        int n = rfU_2.id_byte((rfl_32.id_break - 2.0) / 16.0);
        int n2 = rfU_2.id_byte((rfl_32.id_throws + 2.0) / 16.0);
        n = rfU_2.id_class(n, 0, this.id_extends.length - 1);
        n2 = rfU_2.id_class(n2, 0, this.id_extends.length - 1);
        for (int i = n; i <= n2; ++i) {
            for (an_3 an_32 : this.id_extends[i].id_class(an_3.class)) {
                if (aI_22 != null && an_32.BC() != aI_22 || !an_32.rN().id_byte(rfl_32) || !predicate.test(an_32)) continue;
                list.add(an_32);
            }
        }
    }

    @Override
    public void id_break(Map<rrrZ<?>, rrrH<?>> map) {
        this.id_native.clear();
        this.id_native.putAll(map);
    }

    @Override
    public LongSet id_break(rrrZ<?> rrrZ3) {
        return this.id_volatile.computeIfAbsent(rrrZ3, rrrZ2 -> new LongOpenHashSet());
    }

    @Override
    public Set<rfH_2> id_break() {
        HashSet hashSet = Sets.newHashSet(this.id_throws.keySet());
        hashSet.addAll(this.id_finally.keySet());
        return hashSet;
    }

    @Override
    public void id_break(long l) {
        this.id_this = l;
    }

    @Override
    public rXE id_break(rfH_2 rfH_22) {
        return this.id_class(rfH_22.b_(), rfH_22.c_(), rfH_22.d_());
    }

    public void id_break(an_3 an_32) {
        this.id_class(an_32, (int)((Integer)an_32.id_throws[52]));
    }

    @Override
    public void id_break(boolean bl) {
        this.id_super = bl;
    }

    public void id_throws() {
        if (this.id_synchronized != null) {
            this.id_synchronized.accept(this);
            this.id_synchronized = null;
        }
    }

    @Override
    public void id_throws(rfH_2 rfH_22) {
        ryO_2 ryO_22;
        if ((this.id_case || this.id_catch.id_import()) && (ryO_22 = this.id_finally.remove(rfH_22)) != null) {
            ryO_22.aa_();
        }
    }

    public boolean id_finally() {
        return this.id_case;
    }

    public boolean id_catch() {
        return false;
    }

    public rYB id_extends() {
        return this.id_catch;
    }

    @Override
    public roN_2 id_goto() {
        return roN_2.id_volatile;
    }

    @Override
    public rcd_3 id_case(rfH_2 rfH_22) {
        return this.id_throws.get(rfH_22);
    }

    public void id_case() {
        this.id_super = true;
    }

    @Override
    public boolean id_continue() {
        return this.id_super || this.id_new && this.id_catch.r() != this.id_continue;
    }

    public void id_else() {
        rfj_3 rfj_32 = this.id_private();
        for (int i = 0; i < this.id_final.length; ++i) {
            if (this.id_final[i] == null) continue;
            for (Short s : this.id_final[i]) {
                rfH_2 rfH_22 = rok_3.id_class(s, i, rfj_32);
                xc_3 xc_32 = this.id_byte(rfH_22);
                xc_3 xc_33 = xd_3.id_break(xc_32, this.id_catch, rfH_22);
                this.id_catch.id_class(rfH_22, xc_33, 20);
            }
            this.id_final[i].clear();
        }
        this.id_public();
        for (Object object : Sets.newHashSet(this.id_throws.keySet())) {
            this.id_class((rfH_2)object);
        }
        this.id_throws.clear();
        this.id_implements.id_class(this);
    }

    @Override
    public rYZ id_implements() {
        return this.id_protected;
    }

    private ryO_2 id_implements(rfH_2 rfH_22) {
        xc_3 xc_32 = this.id_byte(rfH_22);
        xd_3 xd_32 = xc_32.id_break();
        return !xd_32.id_protected() ? null : ((kx_3)((Object)xd_32)).id_class(this.id_catch);
    }

    public rrEJ id_instanceof() {
        return this.id_else == null ? rrEJ.BORDER : this.id_else.get();
    }

    @Override
    public rRV<rXs_1> id_new() {
        return this.id_int;
    }

    @Override
    public Stream<rfH_2> id_package() {
        return StreamSupport.stream(rfH_2.id_break(this.id_return.id_break(), 0, this.id_return.id_byte(), this.id_return.id_protected(), 255, this.id_return.id_throws()).spliterator(), false).filter(rfH_22 -> this.id_byte((rfH_2)rfH_22).id_case() != 0);
    }

    @Override
    public ShortList[] id_return() {
        return this.id_final;
    }

    @Override
    public Map<rrrZ<?>, rrrH<?>> id_super() {
        return this.id_native;
    }

    @Override
    public boolean id_throw() {
        return this.id_public;
    }

    public void id_public() {
        if (this.id_package instanceof roW_2) {
            ((roW_2)this.id_package).id_class(this.id_catch.id_finally(), (rfH_2 rfH_22) -> this.id_byte((rfH_2)rfH_22).id_break());
            this.id_package = rRd_1.id_class();
        } else if (this.id_package instanceof rRe_1) {
            ((rRe_1)this.id_package).id_class(this.id_catch.id_finally());
            this.id_package = rRd_1.id_class();
        }
        if (this.id_int instanceof roW_2) {
            ((roW_2)this.id_int).id_class(this.id_catch.id_extends(), (rfH_2 rfH_22) -> this.id_break((rfH_2)rfH_22).id_class());
            this.id_int = rRd_1.id_class();
        } else if (this.id_int instanceof rRe_1) {
            ((rRe_1)this.id_int).id_class(this.id_catch.id_extends());
            this.id_int = rRd_1.id_class();
        }
    }

    @Override
    public rcd_3 id_protected(rfH_2 rfH_22) {
        ryO_2 ryO_22 = this.id_class(rfH_22);
        if (ryO_22 != null && !ryO_22.id_long()) {
            rcd_3 rcd_32 = ryO_22.id_class(new rcd_3());
            rcd_32.id_class("keepPacked", false);
            return rcd_32;
        }
        rcd_3 rcd_33 = this.id_throws.get(rfH_22);
        if (rcd_33 != null) {
            rcd_33 = rcd_33.id_catch();
            rcd_33.id_class("keepPacked", true);
        }
        return rcd_33;
    }

    public rrse_3 id_protected() {
        return this.id_catch.id_goto().id_class();
    }

    @Override
    public void id_protected(boolean bl) {
        this.id_public = bl;
        this.id_break(true);
    }

    @Override
    public rfj_3 id_private() {
        return this.id_return;
    }

    public ryI_2<an_3>[] id_final() {
        return this.id_extends;
    }

    public Map<rfH_2, ryO_2> id_volatile() {
        return this.id_finally;
    }

    @Override
    public rVh_1 id_synchronized() {
        return this.id_implements;
    }

    @Override
    public Collection<Map.Entry<rKv_1, rKZ>> id_native() {
        return Collections.unmodifiableSet(this.id_private.entrySet());
    }
}

