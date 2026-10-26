/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Codec
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.util.Supplier
 */
package celestial;

import celestial.Jj_1;
import celestial.KU;
import celestial.KY;
import celestial.Ko_1;
import celestial.aI_2;
import celestial.an_3;
import celestial.rHf_1;
import celestial.rKv_1;
import celestial.rLx_1;
import celestial.rRJ;
import celestial.rRQ;
import celestial.rRW;
import celestial.rRg_1;
import celestial.rRh_1;
import celestial.rRq_1;
import celestial.rRu_1;
import celestial.rRz_1;
import celestial.rVL;
import celestial.rWB;
import celestial.rXE;
import celestial.rXG;
import celestial.rYA;
import celestial.rYG;
import celestial.rYJ;
import celestial.rYS;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rlQ_2;
import celestial.rnW_2;
import celestial.rns_3;
import celestial.roC_2;
import celestial.roE_2;
import celestial.roJ_2;
import celestial.roN_2;
import celestial.roX_2;
import celestial.rox_3;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.rqM_2;
import celestial.rqO_2;
import celestial.rrEJ;
import celestial.rrGS;
import celestial.rrGb_1;
import celestial.rrGs_1;
import celestial.rrse_3;
import celestial.ruS_2;
import celestial.ryO_2;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Supplier;

public abstract class rYB
implements AutoCloseable,
rRg_1 {
    protected static final Logger id_class = LogManager.getLogger();
    public static final Codec<rqM_2<rYB>> id_break = rqO_2.id_class.xmap(rqM_2.id_break(rVL.id_static), rqM_2::id_class);
    public static final rqM_2<rYB> id_byte = rqM_2.id_class(rVL.id_static, new rqO_2("overworld"));
    public static final rqM_2<rYB> id_protected = rqM_2.id_class(rVL.id_static, new rqO_2("the_nether"));
    public static final rqM_2<rYB> id_throws = rqM_2.id_class(rVL.id_static, new rqO_2("the_end"));
    private static final rpr_3[] id_this = rpr_3.values();
    public final List<ryO_2> id_case = Lists.newArrayList();
    public final List<ryO_2> id_catch = Lists.newArrayList();
    protected final List<ryO_2> id_private = Lists.newArrayList();
    protected final List<ryO_2> id_implements = Lists.newArrayList();
    private final Thread id_else;
    private final boolean id_synchronized;
    private int id_return;
    protected int id_finally = new Random().nextInt();
    protected final int id_extends;
    protected float id_native;
    protected float id_volatile;
    protected float id_final;
    protected float id_package;
    public final Random id_int = new Random();
    private final rRJ id_public;
    protected final rrGS id_new;
    public final boolean id_continue;
    protected boolean id_super;
    private final roE_2 id_goto;
    private final rYA id_while;
    private final rqM_2<rYB> id_try;

    public boolean id_boolean() {
        return !this.id_default().id_final() && !this.id_strictfp();
    }

    public void id_byte(int n) {
    }

    public void id_byte(rfH_2 rfH_22, xd_3 xd_32) {
        for (rpr_3 rpr_32 : rpb_3.HORIZONTAL) {
            rfH_2 rfH_23 = rfH_22.id_break(rpr_32);
            if (!this.id_int(rfH_23)) continue;
            xc_3 xc_32 = this.id_byte(rfH_23);
            if (xc_32.id_class(xu_3.sL)) {
                xc_32.id_class(this, rfH_23, xd_32, rfH_22, false);
                continue;
            }
            if (!xc_32.id_catch(this, rfH_23) || !(xc_32 = this.id_byte(rfH_23 = rfH_23.id_break(rpr_32))).id_class(xu_3.sL)) continue;
            xc_32.id_class(this, rfH_23, xd_32, rfH_22, false);
        }
    }

    @Override
    public xc_3 id_byte(rfH_2 rfH_22) {
        if (rYB.id_super(rfH_22)) {
            return xu_3.hG.id_continue();
        }
        roJ_2 roJ_22 = this.id_throws(rfH_22.b_() >> 4, rfH_22.d_() >> 4);
        return roJ_22.id_byte(rfH_22);
    }

    @Override
    public rRq_1 id_byte(int n, int n2) {
        return this.id_class(n, n2, roN_2.id_volatile, false);
    }

    public int id_byte(rfH_2 rfH_22, rpr_3 rpr_32) {
        xc_3 xc_32 = this.id_byte(rfH_22);
        int n = xc_32.id_break((rRq_1)this, rfH_22, rpr_32);
        return xc_32.id_catch(this, rfH_22) ? Math.max(n, this.id_return(rfH_22)) : n;
    }

    public abstract rlQ_2 id_int();

    @Override
    public Random id_long() {
        return this.id_int;
    }

    public void id_double() {
        double d = 1.0 - (double)(this.id_private(1.0f) * 5.0f) / 16.0;
        double d2 = 1.0 - (double)(this.id_case(1.0f) * 5.0f) / 16.0;
        double d3 = 0.5 + 2.0 * rfU_2.id_class((double)rfU_2.id_break(this.id_protected(1.0f) * ((float)Math.PI * 2)), -0.25, 0.25);
        this.id_return = (int)((1.0 - d3 * d * d2) * 11.0);
    }

    protected rYB(rrGS rrGS2, rqM_2<rYB> rqM_22, rRJ rRJ2, boolean bl, boolean bl2, long l) {
        this.id_extends = 1013904223;
        this.id_new = rrGS2;
        this.id_public = rRJ2;
        this.id_try = rqM_22;
        this.id_continue = bl;
        this.id_goto = rRJ2.id_case() != 1.0 ? new rYS(this, rRJ2) : new roE_2();
        this.id_else = Thread.currentThread();
        this.id_while = new rYA(this, l, rRJ2.id_volatile());
        this.id_synchronized = bl2;
    }

    public rRu_1 B() {
        return this.id_new.id_finally();
    }

    public boolean S() {
        if (this.id_default().id_break() && !this.id_default().id_byte()) {
            return (double)this.id_case(1.0f) > 0.9;
        }
        return false;
    }

    public roJ_2 id_this(rfH_2 rfH_22) {
        return this.id_throws(rfH_22.b_() >> 4, rfH_22.d_() >> 4);
    }

    public final boolean b() {
        return this.id_synchronized;
    }

    public boolean s() {
        return (double)this.id_private(1.0f) > 0.2;
    }

    public void id_class(rfH_2 rfH_22, ryO_2 ryO_22) {
        if (!rYB.id_super(rfH_22) && ryO_22 != null && !ryO_22.id_long()) {
            if (this.id_super) {
                ryO_22.id_break(this, rfH_22);
                Iterator<ryO_2> iterator = this.id_private.iterator();
                while (iterator.hasNext()) {
                    ryO_2 ryO_23 = iterator.next();
                    if (!ryO_23.id_char().equals(rfH_22)) continue;
                    ryO_23.aa_();
                    iterator.remove();
                }
                this.id_private.add(ryO_22);
            } else {
                this.id_this(rfH_22).id_class(rfH_22, ryO_22);
                this.id_class(ryO_22);
            }
        }
    }

    public abstract void id_class(int var1, rfH_2 var2, int var3);

    @Override
    public ryO_2 id_class(rfH_2 rfH_22) {
        if (rYB.id_super(rfH_22)) {
            return null;
        }
        if (!this.id_continue && Thread.currentThread() != this.id_else) {
            return null;
        }
        ryO_2 ryO_22 = null;
        if (this.id_super) {
            ryO_22 = this.id_throw(rfH_22);
        }
        if (ryO_22 == null) {
            ryO_22 = this.id_this(rfH_22).id_class(rfH_22, rox_3.IMMEDIATE);
        }
        if (ryO_22 == null) {
            ryO_22 = this.id_throw(rfH_22);
        }
        return ryO_22;
    }

    public Ko_1 id_class(KY kY) {
        Ko_1 ko_1 = kY.id_class("Affected level", 1);
        ko_1.id_class("All players", () -> this.id_continue().size() + " total; " + this.id_continue());
        ko_1.id_class("Chunk stats", this.id_goto()::id_byte);
        ko_1.id_class("Level dimension", () -> this.E().id_class().toString());
        try {
            this.id_new.id_class(ko_1);
        }
        catch (Throwable throwable) {
            ko_1.id_class("Level Data Unobtainable", throwable);
        }
        return ko_1;
    }

    public boolean id_class(rfH_2 rfH_22, an_3 an_32, rpr_3 rpr_32) {
        if (rYB.id_super(rfH_22)) {
            return false;
        }
        roC_2 roC_22 = this.id_class(rfH_22.b_() >> 4, rfH_22.d_() >> 4, roN_2.id_volatile, false);
        return roC_22 == null ? false : roC_22.id_byte(rfH_22).id_class((rRq_1)this, rfH_22, an_32, rpr_32);
    }

    public void id_class(double d, double d2, double d3, double d4, double d5, double d6, rcd_3 rcd_32) {
    }

    public rRW id_class(an_3 an_32, double d, double d2, double d3, float f, rRz_1 rRz_12) {
        return this.id_class(an_32, null, null, d, d2, d3, f, false, rRz_12);
    }

    public void id_class(Consumer<an_3> consumer, an_3 an_32) {
        try {
            consumer.accept(an_32);
        }
        catch (Throwable throwable) {
            KY kY = KY.id_class(throwable, "Ticking entity");
            Ko_1 ko_1 = kY.id_class("Entity being ticked");
            an_32.id_class(ko_1);
            throw new KU(kY);
        }
    }

    public rRW id_class(an_3 an_32, double d, double d2, double d3, float f, boolean bl, rRz_1 rRz_12) {
        return this.id_class(an_32, null, null, d, d2, d3, f, bl, rRz_12);
    }

    public rRW id_class(an_3 an_32, rye_3 rye_32, rRQ rRQ2, double d, double d2, double d3, float f, boolean bl, rRz_1 rRz_12) {
        rRW rRW2 = new rRW(this, an_32, rye_32, rRQ2, d, d2, d3, f, bl, rRz_12);
        rRW2.id_class();
        rRW2.id_class(true);
        return rRW2;
    }

    public void id_class(Collection<ryO_2> collection) {
        if (this.id_super) {
            this.id_private.addAll(collection);
        } else {
            for (ryO_2 ryO_22 : collection) {
                this.id_class(ryO_22);
            }
        }
    }

    public List<an_3> id_class(an_3 an_32, rfl_3 rfl_32, Predicate<? super an_3> predicate, Function<an_3, rjU_2> function) {
        ArrayList arrayList = Lists.newArrayList();
        int n = rfU_2.id_byte((rfl_32.id_class - 2.0) / 16.0);
        int n2 = rfU_2.id_byte((rfl_32.id_protected + 2.0) / 16.0);
        int n3 = rfU_2.id_byte((rfl_32.id_byte - 2.0) / 16.0);
        int n4 = rfU_2.id_byte((rfl_32.id_case + 2.0) / 16.0);
        roX_2 roX_22 = this.id_goto();
        for (int i = n; i <= n2; ++i) {
            for (int j = n3; j <= n4; ++j) {
                roJ_2 roJ_22 = roX_22.id_class(i, j, false);
                if (roJ_22 == null) continue;
                roJ_22.id_class(an_32, rfl_32, arrayList, predicate, function);
            }
        }
        return arrayList;
    }

    public <T extends an_3> List<T> id_class(aI_2<T> aI_22, rfl_3 rfl_32, Predicate<? super T> predicate) {
        int n = rfU_2.id_byte((rfl_32.id_class - 2.0) / 16.0);
        int n2 = rfU_2.id_throws((rfl_32.id_protected + 2.0) / 16.0);
        int n3 = rfU_2.id_byte((rfl_32.id_byte - 2.0) / 16.0);
        int n4 = rfU_2.id_throws((rfl_32.id_case + 2.0) / 16.0);
        ArrayList arrayList = Lists.newArrayList();
        for (int i = n; i < n2; ++i) {
            for (int j = n3; j < n4; ++j) {
                roJ_2 roJ_22 = this.id_goto().id_class(i, j, false);
                if (roJ_22 == null) continue;
                roJ_22.id_class(aI_22, rfl_32, arrayList, predicate);
            }
        }
        return arrayList;
    }

    @Override
    public <T extends an_3> List<T> id_class(Class<? extends T> clazz, rfl_3 rfl_32, Predicate<? super T> predicate) {
        int n = rfU_2.id_byte((rfl_32.id_class - 2.0) / 16.0);
        int n2 = rfU_2.id_throws((rfl_32.id_protected + 2.0) / 16.0);
        int n3 = rfU_2.id_byte((rfl_32.id_byte - 2.0) / 16.0);
        int n4 = rfU_2.id_throws((rfl_32.id_case + 2.0) / 16.0);
        ArrayList arrayList = Lists.newArrayList();
        roX_2 roX_22 = this.id_goto();
        for (int i = n; i < n2; ++i) {
            for (int j = n3; j < n4; ++j) {
                roJ_2 roJ_22 = roX_22.id_class(i, j, false);
                if (roJ_22 == null) continue;
                roJ_22.id_class(clazz, rfl_32, arrayList, predicate);
            }
        }
        return arrayList;
    }

    public void id_class(rfH_2 rfH_22, xd_3 xd_32, int n, int n2) {
        this.id_byte(rfH_22).id_class(this, rfH_22, n, n2);
    }

    public void id_class(an_3 an_32, byte by) {
    }

    public boolean id_class(rhd_3 rhd_32, rfH_2 rfH_22) {
        return true;
    }

    public boolean id_class(rfH_2 rfH_22, an_3 an_32) {
        return this.id_class(rfH_22, an_32, rpr_3.UP);
    }

    private static boolean id_class(int n) {
        return n < -20000000 || n >= 20000000;
    }

    public void id_class(boolean bl, boolean bl2) {
        this.id_goto().id_class(bl, bl2);
    }

    public abstract void id_class(rrGb_1 var1);

    public abstract rrGb_1 id_class(String var1);

    @Override
    public int id_class(rKv_1 rKv_12, int n, int n2) {
        int n3 = n >= -30000000 && n2 >= -30000000 && n < 30000000 && n2 < 30000000 ? (this.id_break(n >> 4, n2 >> 4) ? this.id_throws(n >> 4, n2 >> 4).id_class(rKv_12, n & 0xF, n2 & 0xF) + 1 : 0) : this.id_short() + 1;
        return n3;
    }

    public void id_class(rfH_2 rfH_22, xd_3 xd_32, rfH_2 rfH_23) {
        if (!this.id_continue) {
            xc_3 xc_32 = this.id_byte(rfH_22);
            try {
                xc_32.id_class(this, rfH_22, xd_32, rfH_23, false);
            }
            catch (Throwable throwable) {
                KY kY = KY.id_class(throwable, "Exception while updating neighbours");
                Ko_1 ko_1 = kY.id_class("Block being updated");
                ko_1.id_class("Source block type", () -> {
                    try {
                        return String.format("ID #%s (%s // %s)", rVL.id_strictfp.id_break(xd_32), xd_32.id_volatile(), xd_32.getClass().getCanonicalName());
                    }
                    catch (Throwable throwable) {
                        return "ID #" + rVL.id_strictfp.id_break(xd_32);
                    }
                });
                Ko_1.id_class(ko_1, rfH_22, xc_32);
                throw new KU(kY);
            }
        }
    }

    public void id_class(rfH_2 rfH_22, xd_3 xd_32, rpr_3 rpr_32) {
        if (rpr_32 != rpr_3.WEST) {
            this.id_class(rfH_22.id_byte(), xd_32, rfH_22);
        }
        if (rpr_32 != rpr_3.EAST) {
            this.id_class(rfH_22.id_extends(), xd_32, rfH_22);
        }
        if (rpr_32 != rpr_3.DOWN) {
            this.id_class(rfH_22.id_break(), xd_32, rfH_22);
        }
        if (rpr_32 != rpr_3.UP) {
            this.id_class(rfH_22.id_final(), xd_32, rfH_22);
        }
        if (rpr_32 != rpr_3.NORTH) {
            this.id_class(rfH_22.id_private(), xd_32, rfH_22);
        }
        if (rpr_32 != rpr_3.SOUTH) {
            this.id_class(rfH_22.id_protected(), xd_32, rfH_22);
        }
    }

    public void id_class(rfH_2 rfH_22, xc_3 xc_32, xc_3 xc_33) {
    }

    @Override
    public rrse_3 id_class() {
        return this.id_goto().id_class();
    }

    @Override
    public roC_2 id_class(int n, int n2, roN_2 roN_22, boolean bl) {
        roC_2 roC_22 = this.id_goto().id_break(n, n2, roN_22, bl);
        if (roC_22 == null && bl) {
            throw new IllegalStateException("Should always be able to create a chunk!");
        }
        return roC_22;
    }

    public rfH_2 id_class(int n, int n2, int n3, int n4) {
        this.id_finally = this.id_finally * 3 + 1013904223;
        int n5 = this.id_finally >> 2;
        return new rfH_2(n + (n5 & 0xF), n2 + (n5 >> 16 & n4), n3 + (n5 >> 8 & 0xF));
    }

    @Override
    public boolean id_class(rfH_2 rfH_22, xc_3 xc_32, int n) {
        return this.id_class(rfH_22, xc_32, n, 512);
    }

    @Override
    public boolean id_class(rfH_2 rfH_22, xc_3 xc_32, int n, int n2) {
        if (rYB.id_super(rfH_22)) {
            return false;
        }
        if (!this.id_continue && this.b()) {
            return false;
        }
        roJ_2 roJ_22 = this.id_this(rfH_22);
        xd_3 xd_32 = xc_32.id_break();
        xc_3 xc_33 = roJ_22.id_class(rfH_22, xc_32, (n & 0x40) != 0);
        if (xc_33 == null) {
            return false;
        }
        xc_3 xc_34 = this.id_byte(rfH_22);
        if ((n & 0x80) == 0 && xc_34 != xc_33 && (xc_34.id_break((rRq_1)this, rfH_22) != xc_33.id_break((rRq_1)this, rfH_22) || xc_34.id_case() != xc_33.id_case() || xc_34.id_throws() || xc_33.id_throws())) {
            this.id_goto().id_class().id_class(rfH_22);
        }
        if (xc_34 == xc_32) {
            if (xc_33 != xc_34) {
                this.id_class(rfH_22, xc_33, xc_34);
            }
            if ((n & 2) != 0 && (!this.id_continue || (n & 4) == 0) && (this.id_continue || roJ_22.id_instanceof() != null && roJ_22.id_instanceof().id_class(rrEJ.TICKING))) {
                this.id_class(rfH_22, xc_33, xc_32, n);
            }
            if ((n & 1) != 0) {
                this.id_class(rfH_22, xc_33.id_break());
                if (!this.id_continue && xc_32.id_finally()) {
                    this.id_byte(rfH_22, xd_32);
                }
            }
            if ((n & 0x10) == 0 && n2 > 0) {
                int n3 = n & 0xFFFFFFDE;
                xc_33.id_break((rRg_1)this, rfH_22, n3, n2 - 1);
                xc_32.id_class((rRg_1)this, rfH_22, n3, n2 - 1);
                xc_32.id_break((rRg_1)this, rfH_22, n3, n2 - 1);
            }
            this.id_break(rfH_22, xc_33, xc_34);
        }
        return true;
    }

    @Override
    public boolean id_class(rfH_2 rfH_22, boolean bl) {
        rXE rXE2 = this.id_break(rfH_22);
        return this.id_class(rfH_22, rXE2.id_catch(), 3 | (bl ? 64 : 0));
    }

    @Override
    public boolean id_class(rfH_2 rfH_22, boolean bl, an_3 an_32, int n) {
        xc_3 xc_32 = this.id_byte(rfH_22);
        if (xc_32.id_catch()) {
            return false;
        }
        rXE rXE2 = this.id_break(rfH_22);
        if (!(xc_32.id_break() instanceof Jj_1)) {
            this.id_byte(2001, rfH_22, xd_3.id_finally(xc_32));
        }
        if (bl) {
            ryO_2 ryO_22 = xc_32.id_break().id_protected() ? this.id_class(rfH_22) : null;
            xd_3.id_class(xc_32, this, rfH_22, ryO_22, an_32, rdn_3.id_break);
        }
        return this.id_class(rfH_22, rXE2.id_catch(), 3, n);
    }

    public abstract void id_class(rfH_2 var1, xc_3 var2, xc_3 var3, int var4);

    public abstract void id_class(rhd_3 var1, an_3 var2, rqA_2 var3, rqL_2 var4, float var5, float var6);

    public void id_class(double d, double d2, double d3, rqA_2 rqA_22, rqL_2 rqL_22, float f, float f2, boolean bl) {
    }

    @Override
    public void id_class(rLx_1 rLx_12, double d, double d2, double d3, double d4, double d5, double d6) {
    }

    @Override
    public boolean id_class(rfH_2 rfH_22, Predicate<xc_3> predicate) {
        return predicate.test(this.id_byte(rfH_22));
    }

    public void id_class(ruS_2<?> ruS_22) {
        throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
    }

    @Override
    public void id_class(rhd_3 rhd_32, rfH_2 rfH_22, rqA_2 rqA_22, rqL_2 rqL_22, float f, float f2) {
        this.id_class(rhd_32, (double)rfH_22.b_() + 0.5, (double)rfH_22.c_() + 0.5, (double)rfH_22.d_() + 0.5, rqA_22, rqL_22, f, f2);
    }

    public boolean id_class(ryO_2 ryO_22) {
        boolean bl;
        if (this.id_super) {
            Supplier[] supplierArray = new Supplier[2];
            supplierArray[0] = () -> rVL.r.id_break(ryO_22.id_void());
            supplierArray[1] = ryO_22::id_char;
            id_class.error("Adding block entity while ticking: {} @ {}", supplierArray);
        }
        if ((bl = this.id_case.add(ryO_22)) && ryO_22 instanceof rHf_1) {
            this.id_catch.add(ryO_22);
        }
        if (this.id_continue) {
            rfH_2 rfH_22 = ryO_22.id_char();
            xc_3 xc_32 = this.id_byte(rfH_22);
            this.id_class(rfH_22, xc_32, xc_32, 2);
        }
        return bl;
    }

    public abstract void id_class(rhd_3 var1, double var2, double var4, double var6, rqA_2 var8, rqL_2 var9, float var10, float var11);

    public void id_class(rLx_1 rLx_12, boolean bl, double d, double d2, double d3, double d4, double d5, double d6) {
    }

    @Override
    public rRJ id_default() {
        return this.id_public;
    }

    @Override
    public int id_short() {
        return 63;
    }

    @Override
    public void close() throws IOException {
        this.id_goto().close();
    }

    @Override
    public int id_void() {
        return this.id_return;
    }

    public long r() {
        return this.id_new.id_throws();
    }

    public void id_break(int n, rfH_2 rfH_22, int n2) {
    }

    @Override
    public List<an_3> id_break(an_3 an_32, rfl_3 rfl_32, Predicate<? super an_3> predicate) {
        return this.id_class(an_32, rfl_32, predicate, null);
    }

    public void id_break(rfH_2 rfH_22, ryO_2 ryO_22) {
        if (this.id_int(rfH_22)) {
            this.id_this(rfH_22).id_case();
        }
    }

    @Override
    public rXE id_break(rfH_2 rfH_22) {
        if (rYB.id_super(rfH_22)) {
            return rXG.id_class.id_private();
        }
        roJ_2 roJ_22 = this.id_this(rfH_22);
        return roJ_22.id_break(rfH_22);
    }

    public abstract an_3 id_break(int var1);

    public void id_break(rLx_1 rLx_12, double d, double d2, double d3, double d4, double d5, double d6) {
    }

    @Override
    public <T extends an_3> List<T> id_break(Class<? extends T> clazz, rfl_3 rfl_32, Predicate<? super T> predicate) {
        int n = rfU_2.id_byte((rfl_32.id_class - 2.0) / 16.0);
        int n2 = rfU_2.id_throws((rfl_32.id_protected + 2.0) / 16.0);
        int n3 = rfU_2.id_byte((rfl_32.id_byte - 2.0) / 16.0);
        int n4 = rfU_2.id_throws((rfl_32.id_case + 2.0) / 16.0);
        ArrayList arrayList = Lists.newArrayList();
        roX_2 roX_22 = this.id_goto();
        for (int i = n; i < n2; ++i) {
            for (int j = n3; j < n4; ++j) {
                roJ_2 roJ_22 = roX_22.id_protected(i, j);
                if (roJ_22 == null) continue;
                roJ_22.id_class(clazz, rfl_32, arrayList, predicate);
            }
        }
        return arrayList;
    }

    public void id_break(rLx_1 rLx_12, boolean bl, double d, double d2, double d3, double d4, double d5, double d6) {
    }

    public boolean id_break(rfH_2 rfH_22, xc_3 xc_32) {
        return this.id_class(rfH_22, xc_32, 3);
    }

    public void id_break(rfH_2 rfH_22, xc_3 xc_32, xc_3 xc_33) {
    }

    public void id_break(rfH_2 rfH_22, xd_3 xd_32) {
        this.id_class(rfH_22.id_byte(), xd_32, rfH_22);
        this.id_class(rfH_22.id_extends(), xd_32, rfH_22);
        this.id_class(rfH_22.id_break(), xd_32, rfH_22);
        this.id_class(rfH_22.id_final(), xd_32, rfH_22);
        this.id_class(rfH_22.id_private(), xd_32, rfH_22);
        this.id_class(rfH_22.id_protected(), xd_32, rfH_22);
    }

    public boolean id_break(rfH_2 rfH_22, rpr_3 rpr_32) {
        return this.id_byte(rfH_22, rpr_32) > 0;
    }

    public roJ_2 id_throws(int n, int n2) {
        return (roJ_2)this.id_class(n, n2, roN_2.id_volatile);
    }

    public float id_throws(float f) {
        float f2 = this.id_protected(f);
        return f2 * ((float)Math.PI * 2);
    }

    @Override
    public rRh_1 id_throws(rfH_2 rfH_22) {
        long l = 0L;
        float f = 0.0f;
        if (this.id_int(rfH_22)) {
            f = this.id_interface();
            l = this.id_this(rfH_22).id_this();
        }
        return new rRh_1(this.id_abstract(), this.P(), l, f);
    }

    public long P() {
        return this.id_new.id_case();
    }

    public void id_catch() {
    }

    public void id_catch(float f) {
        this.id_final = f;
        this.id_package = f;
    }

    public boolean G() {
        return false;
    }

    public int id_goto(rfH_2 rfH_22) {
        int n = 0;
        for (rpr_3 rpr_32 : id_this) {
            int n2 = this.id_byte(rfH_22.id_break(rpr_32), rpr_32);
            if (n2 >= 15) {
                return 15;
            }
            if (n2 <= n) continue;
            n = n2;
        }
        return n;
    }

    public float id_case(float f) {
        return rfU_2.id_catch(f, this.id_final, this.id_package) * this.id_private(f);
    }

    public rnW_2 id_const() {
        return null;
    }

    public static boolean id_continue(rfH_2 rfH_22) {
        return !rYB.id_class(rfH_22.c_()) && rYB.id_instanceof(rfH_22);
    }

    public void id_else(rfH_2 rfH_22) {
        ryO_2 ryO_22 = this.id_class(rfH_22);
        if (ryO_22 != null && this.id_super) {
            ryO_22.aa_();
            this.id_private.remove(ryO_22);
        } else {
            if (ryO_22 != null) {
                this.id_private.remove(ryO_22);
                this.id_case.remove(ryO_22);
                this.id_catch.remove(ryO_22);
            }
            this.id_this(rfH_22).id_throws(rfH_22);
        }
    }

    public String id_for() {
        return this.id_goto().id_byte();
    }

    public abstract rWB id_implements();

    public void id_implements(float f) {
        this.id_native = f;
        this.id_volatile = f;
    }

    @Override
    public boolean id_import() {
        return this.id_continue;
    }

    @Override
    public roE_2 id_instanceof() {
        return this.id_goto;
    }

    private static boolean id_instanceof(rfH_2 rfH_22) {
        return rfH_22.b_() >= -30000000 && rfH_22.d_() >= -30000000 && rfH_22.b_() < 30000000 && rfH_22.d_() < 30000000;
    }

    public static boolean id_new(rfH_2 rfH_22) {
        return !rYB.id_super(rfH_22) && rYB.id_instanceof(rfH_22);
    }

    public abstract rns_3 id_package();

    public int id_return(rfH_2 rfH_22) {
        int n = 0;
        if ((n = Math.max(n, this.id_class(rfH_22.id_break(), rpr_3.DOWN))) >= 15) {
            return n;
        }
        if ((n = Math.max(n, this.id_class(rfH_22.id_final(), rpr_3.UP))) >= 15) {
            return n;
        }
        if ((n = Math.max(n, this.id_class(rfH_22.id_private(), rpr_3.NORTH))) >= 15) {
            return n;
        }
        if ((n = Math.max(n, this.id_class(rfH_22.id_protected(), rpr_3.SOUTH))) >= 15) {
            return n;
        }
        if ((n = Math.max(n, this.id_class(rfH_22.id_byte(), rpr_3.WEST))) >= 15) {
            return n;
        }
        return (n = Math.max(n, this.id_class(rfH_22.id_extends(), rpr_3.EAST))) >= 15 ? n : n;
    }

    public static boolean id_super(rfH_2 rfH_22) {
        return rYB.id_protected(rfH_22.c_());
    }

    protected void id_switch() {
        if (this.id_new.id_private()) {
            this.id_volatile = 1.0f;
            if (this.id_new.id_catch()) {
                this.id_package = 1.0f;
            }
        }
    }

    private ryO_2 id_throw(rfH_2 rfH_22) {
        for (int i = 0; i < this.id_private.size(); ++i) {
            ryO_2 ryO_22 = this.id_private.get(i);
            if (ryO_22.id_long() || !ryO_22.id_char().equals(rfH_22)) continue;
            return ryO_22;
        }
        return null;
    }

    public boolean id_try(rfH_2 rfH_22) {
        rYG rYG2 = this.id_implements(rfH_22);
        return rYG2.id_protected();
    }

    public boolean id_while(rfH_2 rfH_22) {
        if (!this.s()) {
            return false;
        }
        if (!this.id_case(rfH_22)) {
            return false;
        }
        if (this.id_class(rKv_1.MOTION_BLOCKING, rfH_22).c_() > rfH_22.c_()) {
            return false;
        }
        rYG rYG2 = this.id_implements(rfH_22);
        return rYG2.id_byte() == rYJ.RAIN && rYG2.id_class(rfH_22) >= 0.15f;
    }

    @Override
    public rYA id_static() {
        return this.id_while;
    }

    @Override
    public rrGs_1 id_public() {
        return this.id_new;
    }

    public boolean id_public(rfH_2 rfH_22) {
        if (this.id_byte(rfH_22.id_break(), rpr_3.DOWN) > 0) {
            return true;
        }
        if (this.id_byte(rfH_22.id_final(), rpr_3.UP) > 0) {
            return true;
        }
        if (this.id_byte(rfH_22.id_private(), rpr_3.NORTH) > 0) {
            return true;
        }
        if (this.id_byte(rfH_22.id_protected(), rpr_3.SOUTH) > 0) {
            return true;
        }
        if (this.id_byte(rfH_22.id_byte(), rpr_3.WEST) > 0) {
            return true;
        }
        return this.id_byte(rfH_22.id_extends(), rpr_3.EAST) > 0;
    }

    @Override
    public /* synthetic */ roC_2 id_protected(int n, int n2) {
        return this.id_throws(n, n2);
    }

    public static boolean id_protected(int n) {
        return n < 0 || n >= 256;
    }

    public float id_private(float f) {
        return rfU_2.id_catch(f, this.id_native, this.id_volatile);
    }

    public abstract int id_final();

    public void id_transient() {
        Object object;
        if (!this.id_implements.isEmpty()) {
            this.id_catch.removeAll(this.id_implements);
            this.id_case.removeAll(this.id_implements);
            this.id_implements.clear();
        }
        this.id_super = true;
        Iterator<ryO_2> iterator = this.id_catch.iterator();
        while (iterator.hasNext()) {
            ryO_2 ryO_22 = iterator.next();
            if (!ryO_22.id_long() && ryO_22.id_interface()) {
                object = ryO_22.id_char();
                if (this.id_goto().id_class((rfH_2)object) && this.id_instanceof().id_class((rfH_2)object)) {
                    try {
                        if (ryO_22.id_void().id_class(this.id_byte((rfH_2)object).id_break())) {
                            ((rHf_1)((Object)ryO_22)).id_throws();
                        } else {
                            ryO_22.id_static();
                        }
                    }
                    catch (Throwable throwable) {
                        KY kY = KY.id_class(throwable, "Ticking block entity");
                        Ko_1 ko_1 = kY.id_class("Block entity being ticked");
                        ryO_22.id_class(ko_1);
                        throw new KU(kY);
                    }
                }
            }
            if (!ryO_22.id_long()) continue;
            iterator.remove();
            this.id_case.remove(ryO_22);
            if (!this.id_int(ryO_22.id_char())) continue;
            this.id_this(ryO_22.id_char()).id_throws(ryO_22.id_char());
        }
        this.id_super = false;
        if (!this.id_private.isEmpty()) {
            for (int i = 0; i < this.id_private.size(); ++i) {
                object = this.id_private.get(i);
                if (((ryO_2)object).id_long()) continue;
                if (!this.id_case.contains(object)) {
                    this.id_class((ryO_2)object);
                }
                if (!this.id_int(((ryO_2)object).id_char())) continue;
                roJ_2 roJ_22 = this.id_this(((ryO_2)object).id_char());
                xc_3 xc_32 = roJ_22.id_byte(((ryO_2)object).id_char());
                roJ_22.id_class(((ryO_2)object).id_char(), (ryO_2)object);
                this.id_class(((ryO_2)object).id_char(), xc_32, xc_32, 3);
            }
            this.id_private.clear();
        }
    }

    public boolean id_synchronized(rfH_2 rfH_22) {
        return rYB.id_super(rfH_22) ? false : this.id_goto().id_case(rfH_22.b_() >> 4, rfH_22.d_() >> 4);
    }

    public boolean id_strictfp() {
        return !this.id_default().id_final() && this.id_return < 4;
    }

    public rqM_2<rYB> E() {
        return this.id_try;
    }
}

