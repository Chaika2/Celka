/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.HU;
import celestial.Hv_1;
import celestial.KY;
import celestial.Ml_1;
import celestial.QY;
import celestial.jW_2;
import celestial.jz_3;
import celestial.lD_2;
import celestial.lT_2;
import celestial.lo_3;
import celestial.rXE;
import celestial.rfH_2;
import celestial.rfj_3;
import celestial.rjU_2;
import celestial.roJ_2;
import celestial.rox_3;
import celestial.rqR_2;
import celestial.rrGi_1;
import celestial.rrGq_1;
import celestial.rrJI;
import celestial.rrQX;
import celestial.rrbb_3;
import celestial.rrdZ;
import celestial.rrdk_1;
import celestial.rrnW_2;
import celestial.rrxF_2;
import celestial.rrxr_3;
import celestial.ryO_2;
import celestial.xN_2;
import celestial.xc_3;
import celestial.yL_2;
import celestial.yN_2;
import celestial.yQ_2;
import celestial.yW_2;
import celestial.yZ_2;
import celestial.ym_3;
import celestial.yz_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;

public class yc_3
extends yN_2 {
    protected yW_2 id_protected;
    public final /* synthetic */ yQ_2 id_throws;

    public yc_3(yQ_2 yQ_22, double d, yW_2 yW_22) {
        this(yQ_22, null, d, yW_22);
    }

    public yc_3(yQ_2 yQ_22, rfj_3 rfj_32, double d, yW_2 yW_22) {
        this.id_throws = yQ_22;
        super(yQ_22, rfj_32, d);
        this.id_protected = yW_22;
    }

    @Override
    public void id_class() {
        this.id_protected = null;
        if (this.id_break.compareAndSet(false, true)) {
            this.id_throws.id_class(false);
        }
    }

    private <E extends ryO_2> void id_class(yZ_2 yZ_22, Set<ryO_2> set, E e) {
        jW_2<E> jW_22 = jz_3.id_break.id_class(e);
        if (jW_22 != null) {
            if (jW_22.id_class(e)) {
                set.add(e);
            } else {
                yZ_22.id_throws.add(e);
            }
        }
    }

    private Set<ryO_2> id_class(float f, float f2, float f3, yZ_2 yZ_22, Hv_1 hv_1) {
        rfH_2 rfH_22 = this.id_throws.id_native.id_int();
        rfH_2 rfH_23 = rfH_22.id_break(15, 15, 15);
        yL_2 yL_22 = new yL_2();
        HashSet hashSet = Sets.newHashSet();
        this.id_protected = null;
        Ml_1 ml_1 = new Ml_1();
        if (!this.id_throws.id_protected(rfH_22)) {
            ++yz_3.id_break;
            rrJI rrJI2 = this.id_throws.id_break(rfH_22);
            rrJI2.id_break();
            HU[] hUArray = new HU[1];
            boolean bl = rrbb_3.rs();
            boolean bl2 = bl && rrdZ.q;
            lT_2.id_class();
            Random random = new Random();
            lo_3 lo_32 = QY.id_instanceof().id_synchronized();
            for (rrGi_1 rrGi_12 : rrGi_1.id_byte(rfH_22, rfH_23)) {
                Object object;
                Object object2;
                rrGq_1 rrGq_12;
                ryO_2 ryO_22;
                xc_3 xc_32 = rrJI2.id_byte(rrGi_12);
                if (xc_32.id_catch()) continue;
                if (xc_32.id_implements(rrJI2, rrGi_12)) {
                    yL_22.id_class(rrGi_12);
                }
                if (xc_32.id_break().id_protected() && (ryO_22 = rrJI2.id_class((rfH_2)rrGi_12, rox_3.CHECK)) != null) {
                    this.id_class(yZ_22, hashSet, ryO_22);
                }
                rXE object3 = xc_32.id_volatile();
                rrGq_1 rrGq_13 = rrGq_12 = yz_3.id_new ? this.id_class(rrGi_12) : null;
                if (!object3.id_byte()) {
                    object2 = this.id_throws.id_class(object3, hUArray);
                    for (int i = 0; i < ((HU[])object2).length; ++i) {
                        HU hU = object2[i];
                        if (yz_3.id_super && !rrxr_3.id_break(rrxr_3.Pw, object3, hU)) continue;
                        if (yz_3.id_this) {
                            rrxr_3.id_class(rrxr_3.rj, hU);
                        }
                        lD_2 lD_22 = hv_1.id_class(hU);
                        lD_22.id_break(hU);
                        object = lD_22.id_class(xc_32, rrGi_12);
                        ((rrxF_2)object).id_class(hv_1);
                        rrJI2.id_class((rrxF_2)object);
                        if (yZ_22.id_byte.add(hU)) {
                            this.id_throws.id_class(lD_22);
                        }
                        if (!lo_32.id_class(rrGi_12, rrJI2, lD_22, object3)) continue;
                        yZ_22.id_protected = false;
                        yZ_22.id_break.id_class(hU);
                    }
                }
                if (xc_32.id_private() != xN_2.INVISIBLE) {
                    Object object4 = object2 = this.id_throws.id_class(xc_32, hUArray);
                    int n = ((HU[])object4).length;
                    for (int i = 0; i < n; ++i) {
                        Object object5 = object = object4[i];
                        if (yz_3.id_continue && !rrxr_3.id_break(rrxr_3.Pt, xc_32, object5)) continue;
                        if (yz_3.id_this) {
                            rrxr_3.id_class(rrxr_3.rj, object5);
                        }
                        object5 = this.id_throws.id_class(rrJI2, xc_32, (rfH_2)rrGi_12, (HU)object5);
                        lD_2 lD_23 = hv_1.id_class((HU)object5);
                        lD_23.id_break((HU)object5);
                        rrxF_2 rrxF_22 = lD_23.id_class(xc_32, rrGi_12);
                        rrxF_22.id_class(hv_1);
                        rrJI2.id_class(rrxF_22);
                        if (yZ_22.id_byte.add((HU)object5)) {
                            this.id_throws.id_class(lD_23);
                        }
                        ml_1.id_class();
                        ml_1.id_class((double)this.id_throws.id_super + (double)(rrGi_12.b_() & 0xF), (double)this.id_throws.id_this + (double)(rrGi_12.c_() & 0xF), (double)this.id_throws.id_else + (double)(rrGi_12.d_() & 0xF));
                        if (bl2) {
                            lD_23.id_byte(0.5f + (float)this.id_throws.id_super + (float)(rrGi_12.b_() & 0xF), 0.5f + (float)this.id_throws.id_this + (float)(rrGi_12.c_() & 0xF), 0.5f + (float)this.id_throws.id_else + (float)(rrGi_12.d_() & 0xF));
                        }
                        if (lo_32.id_class(xc_32, rrGi_12, rrJI2, ml_1, lD_23, true, random, rrGq_12)) {
                            yZ_22.id_protected = false;
                            yZ_22.id_break.id_class((HU)object5);
                            if (rrxF_22.id_int()) {
                                this.id_throws.id_class(hv_1, yZ_22);
                                rrxF_22.id_class(false);
                            }
                        }
                        ml_1.id_break();
                    }
                }
                if ((object2 = this.id_throws.id_public) == null) continue;
                rrnW_2 rrnW_22 = new rrnW_2(rrGi_12, xc_32, xc_32.id_break(), ((roJ_2)object2).id_private());
                ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrnW_22);
            }
            if (yZ_22.id_break.id_break(HU.id_implements())) {
                lD_2 lD_24 = hv_1.id_class(HU.id_implements());
                lD_24.id_protected((float)this.id_throws.id_super + f - (float)rfH_22.b_(), (float)this.id_throws.id_this + f2 - (float)rfH_22.c_(), (float)this.id_throws.id_else + f3 - (float)rfH_22.d_());
                yZ_22.id_catch = lD_24.id_implements();
            }
            yZ_22.id_byte.stream().map(hv_1::id_class).forEach(lD_2::id_finally);
            for (HU hU : yz_3.id_class) {
                yZ_22.id_class(hU, null);
            }
            for (HU hU : yZ_22.id_byte) {
                if (rrbb_3.rs()) {
                    rrdk_1.id_case(hv_1.id_class(hU));
                }
                lD_2 lD_25 = hv_1.id_class(hU);
                if (lD_25.id_finally == null || lD_25.id_finally.isEmpty()) continue;
                yZ_22.id_class(hU, (BitSet)lD_25.id_finally.clone());
            }
            rrJI2.id_byte();
            lT_2.id_break();
        }
        yZ_22.id_case = yL_22.id_class();
        return hashSet;
    }

    @Override
    public CompletableFuture<ym_3> id_class(Hv_1 hv_1) {
        if (this.id_break.get()) {
            return CompletableFuture.completedFuture(ym_3.CANCELLED);
        }
        if (!this.id_throws.id_class()) {
            this.id_protected = null;
            this.id_throws.id_class(false);
            this.id_break.set(true);
            return CompletableFuture.completedFuture(ym_3.CANCELLED);
        }
        if (this.id_break.get()) {
            return CompletableFuture.completedFuture(ym_3.CANCELLED);
        }
        rjU_2 rjU_22 = this.id_throws.id_throws.id_break();
        float f = (float)rjU_22.id_break;
        float f2 = (float)rjU_22.id_byte;
        float f3 = (float)rjU_22.id_protected;
        yZ_2 yZ_22 = new yZ_2();
        Set<ryO_2> set = this.id_class(f, f2, f3, yZ_22, hv_1);
        this.id_throws.id_class(set);
        if (this.id_break.get()) {
            return CompletableFuture.completedFuture(ym_3.CANCELLED);
        }
        ArrayList arrayList = Lists.newArrayList();
        yZ_22.id_byte.forEach(hU -> arrayList.add(this.id_throws.id_throws.id_class(hv_1.id_class((HU)hU), this.id_throws.id_class((HU)hU))));
        return rqR_2.id_break(arrayList).handle((list, throwable) -> {
            if (throwable != null && !(throwable instanceof CancellationException) && !(throwable instanceof InterruptedException)) {
                QY.id_instanceof().id_break(KY.id_class(throwable, "Rendering chunk"));
            }
            if (this.id_break.get()) {
                return ym_3.CANCELLED;
            }
            this.id_throws.id_class.set(yZ_22);
            return ym_3.SUCCESSFUL;
        });
    }
}

