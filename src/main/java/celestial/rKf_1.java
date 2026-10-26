/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.an_3;
import celestial.kx_3;
import celestial.rKv_1;
import celestial.rLx_1;
import celestial.rRI;
import celestial.rRJ;
import celestial.rRV;
import celestial.rRh_1;
import celestial.rVm_1;
import celestial.rXE;
import celestial.rXs_1;
import celestial.rYA;
import celestial.rYB;
import celestial.rYG;
import celestial.rYs_1;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfj_3;
import celestial.rfl_3;
import celestial.rhd_3;
import celestial.rjh_3;
import celestial.roC_2;
import celestial.roE_2;
import celestial.roN_2;
import celestial.roX_2;
import celestial.roZ_2;
import celestial.rpr_3;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.rqR_2;
import celestial.rrEm_1;
import celestial.rrGs_1;
import celestial.rrrA;
import celestial.rrrH;
import celestial.rrrZ;
import celestial.rrse_3;
import celestial.ryO_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rKf_1
implements rRI {
    private static final Logger id_class = LogManager.getLogger();
    private final List<roC_2> id_break;
    private final int id_byte;
    private final int id_protected;
    private final int id_throws;
    private final rrEm_1 id_case;
    private final long id_catch;
    private final rrGs_1 id_private;
    private final Random id_implements;
    private final rRJ id_finally;
    private final rRV<xd_3> id_extends = new rYs_1<xd_3>(rfH_22 -> this.id_volatile((rfH_2)rfH_22).id_int());
    private final rRV<rXs_1> id_native = new rYs_1<rXs_1>(rfH_22 -> this.id_volatile((rfH_2)rfH_22).id_new());
    private final rYA id_volatile;
    private final rfj_3 id_final;
    private final rfj_3 id_package;
    private final rrrA id_int;

    @Override
    public rYG id_byte(int n, int n2, int n3) {
        return this.id_case.id_byte(n, n2, n3);
    }

    @Override
    public xc_3 id_byte(rfH_2 rfH_22) {
        return this.id_protected(rfH_22.b_() >> 4, rfH_22.d_() >> 4).id_byte(rfH_22);
    }

    @Override
    @Deprecated
    public rrEm_1 id_byte() {
        return this.id_case;
    }

    @Override
    public Random id_long() {
        return this.id_implements;
    }

    public rKf_1(rrEm_1 rrEm_12, List<roC_2> list) {
        int n = rfU_2.id_byte(Math.sqrt(list.size()));
        if (n * n != list.size()) {
            throw rqR_2.id_byte(new IllegalStateException("Cache size is not a square."));
        }
        rfj_3 rfj_32 = list.get(list.size() / 2).id_private();
        this.id_break = list;
        this.id_byte = rfj_32.id_break;
        this.id_protected = rfj_32.id_byte;
        this.id_throws = n;
        this.id_case = rrEm_12;
        this.id_catch = rrEm_12.id_break();
        this.id_private = rrEm_12.id_public();
        this.id_implements = rrEm_12.id_long();
        this.id_finally = rrEm_12.id_default();
        this.id_volatile = new rYA(this, rYA.id_class(this.id_catch), rrEm_12.id_default().id_volatile());
        this.id_final = list.get(0).id_private();
        this.id_package = list.get(list.size() - 1).id_private();
        this.id_int = rrEm_12.id_protected().id_class(this);
    }

    @Override
    public boolean id_class(rfH_2 rfH_22, xc_3 xc_32, int n, int n2) {
        xd_3 xd_32;
        roC_2 roC_22 = this.id_volatile(rfH_22);
        xc_3 xc_33 = roC_22.id_class(rfH_22, xc_32, false);
        if (xc_33 != null) {
            this.id_case.id_break(rfH_22, xc_33, xc_32);
        }
        if ((xd_32 = xc_32.id_break()).id_protected()) {
            if (roC_22.id_goto().id_catch() == roZ_2.LEVELCHUNK) {
                roC_22.id_class(rfH_22, ((kx_3)((Object)xd_32)).id_class(this));
            } else {
                rcd_3 rcd_32 = new rcd_3();
                rcd_32.id_break("x", rfH_22.b_());
                rcd_32.id_break("y", rfH_22.c_());
                rcd_32.id_break("z", rfH_22.d_());
                rcd_32.id_class("id", "DUMMY");
                roC_22.id_class(rcd_32);
            }
        } else if (xc_33 != null && xc_33.id_break().id_protected()) {
            roC_22.id_throws(rfH_22);
        }
        if (xc_32.id_int(this, rfH_22)) {
            this.id_new(rfH_22);
        }
        return true;
    }

    @Override
    public boolean id_class(rfH_2 rfH_22, Predicate<xc_3> predicate) {
        return predicate.test(this.id_byte(rfH_22));
    }

    @Override
    public boolean id_class(rfH_2 rfH_22, boolean bl) {
        return this.id_class(rfH_22, xu_3.id_class.id_continue(), 3);
    }

    @Override
    public ryO_2 id_class(rfH_2 rfH_22) {
        roC_2 roC_22 = this.id_volatile(rfH_22);
        ryO_2 ryO_22 = roC_22.id_class(rfH_22);
        if (ryO_22 != null) {
            return ryO_22;
        }
        rcd_3 rcd_32 = roC_22.id_case(rfH_22);
        xc_3 xc_32 = roC_22.id_byte(rfH_22);
        if (rcd_32 != null) {
            if ("DUMMY".equals(rcd_32.id_native("id"))) {
                xd_3 xd_32 = xc_32.id_break();
                if (!(xd_32 instanceof kx_3)) {
                    return null;
                }
                ryO_22 = ((kx_3)((Object)xd_32)).id_class(this.id_case);
            } else {
                ryO_22 = ryO_2.id_break(xc_32, rcd_32);
            }
            if (ryO_22 != null) {
                roC_22.id_class(rfH_22, ryO_22);
                return ryO_22;
            }
        }
        if (xc_32.id_break() instanceof kx_3) {
            id_class.warn("Tried to access a block entity before it was created. {}", (Object)rfH_22);
        }
        return null;
    }

    @Override
    public boolean id_class(rfH_2 rfH_22, boolean bl, an_3 an_32, int n) {
        xc_3 xc_32 = this.id_byte(rfH_22);
        if (xc_32.id_catch()) {
            return false;
        }
        if (bl) {
            ryO_2 ryO_22 = xc_32.id_break().id_protected() ? this.id_class(rfH_22) : null;
            xd_3.id_class(xc_32, (rYB)this.id_case, rfH_22, ryO_22, an_32, rdn_3.id_break);
        }
        return this.id_class(rfH_22, xu_3.id_class.id_continue(), 3, n);
    }

    @Override
    public int id_class(rKv_1 rKv_12, int n, int n2) {
        return this.id_protected(n >> 4, n2 >> 4).id_class(rKv_12, n & 0xF, n2 & 0xF) + 1;
    }

    @Override
    public void id_class(rhd_3 rhd_32, rfH_2 rfH_22, rqA_2 rqA_22, rqL_2 rqL_22, float f, float f2) {
    }

    @Override
    public void id_class(rLx_1 rLx_12, double d, double d2, double d3, double d4, double d5, double d6) {
    }

    @Override
    public void id_class(rhd_3 rhd_32, int n, rfH_2 rfH_22, int n2) {
    }

    @Override
    public rhd_3 id_class(double d, double d2, double d3, double d4, Predicate<an_3> predicate) {
        return null;
    }

    @Override
    public roC_2 id_class(int n, int n2, roN_2 roN_22, boolean bl) {
        roC_2 roC_22;
        if (this.id_break(n, n2)) {
            int n3 = n - this.id_final.id_break;
            int n4 = n2 - this.id_final.id_byte;
            roC_22 = this.id_break.get(n3 + n4 * this.id_throws);
            if (roC_22.id_goto().id_break(roN_22)) {
                return roC_22;
            }
        } else {
            roC_22 = null;
        }
        if (!bl) {
            return null;
        }
        id_class.error("Requested chunk : {} {}", (Object)n, (Object)n2);
        id_class.error("Region bounds : {} {} | {} {}", (Object)this.id_final.id_break, (Object)this.id_final.id_byte, (Object)this.id_package.id_break, (Object)this.id_package.id_byte);
        if (roC_22 != null) {
            throw rqR_2.id_byte(new RuntimeException(String.format("Chunk is not of correct status. Expecting %s, got %s | %s %s", roN_22, roC_22.id_goto(), n, n2)));
        }
        throw rqR_2.id_byte(new RuntimeException(String.format("We are asking a region for a chunk out of bound | %s %s", n, n2)));
    }

    @Override
    public Stream<? extends rrrH<?>> id_class(rjh_3 rjh_32, rrrZ<?> rrrZ2) {
        return this.id_int.id_class(rjh_32, rrrZ2);
    }

    @Override
    public float id_class(rpr_3 rpr_32, boolean bl) {
        return 1.0f;
    }

    @Override
    public <T extends an_3> List<T> id_class(Class<? extends T> clazz, rfl_3 rfl_32, Predicate<? super T> predicate) {
        return Collections.emptyList();
    }

    @Override
    public rrse_3 id_class() {
        return this.id_case.id_class();
    }

    @Override
    public rRJ id_default() {
        return this.id_finally;
    }

    @Override
    public int id_short() {
        return this.id_case.id_short();
    }

    @Override
    public int id_void() {
        return 0;
    }

    @Override
    public List<an_3> id_break(an_3 an_32, rfl_3 rfl_32, Predicate<? super an_3> predicate) {
        return Collections.emptyList();
    }

    @Override
    public long id_break() {
        return this.id_catch;
    }

    @Override
    public rXE id_break(rfH_2 rfH_22) {
        return this.id_volatile(rfH_22).id_break(rfH_22);
    }

    @Override
    public boolean id_break(int n, int n2) {
        return n >= this.id_final.id_break && n <= this.id_package.id_break && n2 >= this.id_final.id_byte && n2 <= this.id_package.id_byte;
    }

    public int id_throws() {
        return this.id_protected;
    }

    @Override
    public rRh_1 id_throws(rfH_2 rfH_22) {
        if (!this.id_break(rfH_22.b_() >> 4, rfH_22.d_() >> 4)) {
            throw new RuntimeException("We are asking a region for a chunk out of bound");
        }
        return new rRh_1(this.id_case.id_abstract(), this.id_case.P(), 0L, this.id_case.id_interface());
    }

    @Override
    public rRV<xd_3> id_finally() {
        return this.id_extends;
    }

    @Override
    public rRV<rXs_1> id_extends() {
        return this.id_native;
    }

    @Override
    public roX_2 id_goto() {
        return this.id_case.id_else();
    }

    public List<rhd_3> id_continue() {
        return Collections.emptyList();
    }

    @Override
    public boolean id_import() {
        return false;
    }

    @Override
    public roE_2 id_instanceof() {
        return this.id_case.id_instanceof();
    }

    @Override
    public rVm_1 id_new() {
        return this.id_case.id_new();
    }

    private void id_new(rfH_2 rfH_22) {
        this.id_volatile(rfH_22).id_extends(rfH_22);
    }

    @Override
    public rYA id_static() {
        return this.id_volatile;
    }

    @Override
    public rrGs_1 id_public() {
        return this.id_private;
    }

    public int id_protected() {
        return this.id_byte;
    }

    @Override
    public roC_2 id_protected(int n, int n2) {
        return this.id_class(n, n2, roN_2.id_class);
    }

    @Override
    public boolean a_(an_3 an_32) {
        int n = rfU_2.id_byte(an_32.rx() / 16.0);
        int n2 = rfU_2.id_byte(an_32.BO() / 16.0);
        this.id_protected(n, n2).id_class(an_32);
        return true;
    }
}

