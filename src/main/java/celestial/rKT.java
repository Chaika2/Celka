/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectList
 *  it.unimi.dsi.fastutil.objects.ObjectListIterator
 */
package celestial;

import celestial.JC;
import celestial.aH_2;
import celestial.rKI;
import celestial.rKW;
import celestial.rKZ;
import celestial.rKd_1;
import celestial.rKf_1;
import celestial.rKn_1;
import celestial.rKt_1;
import celestial.rKv_1;
import celestial.rKw_1;
import celestial.rKy_1;
import celestial.rRE;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rYG;
import celestial.rYK;
import celestial.rYY;
import celestial.rYf_1;
import celestial.rek_3;
import celestial.rel_3;
import celestial.rem_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.rfw_3;
import celestial.rjh_3;
import celestial.roC_2;
import celestial.roQ_2;
import celestial.rok_3;
import celestial.rqM_2;
import celestial.rqR_2;
import celestial.rqm_3;
import celestial.rrEj_1;
import celestial.rrST;
import celestial.rrrA;
import celestial.rrrH;
import celestial.rrrZ;
import celestial.rrrn_1;
import celestial.xc_3;
import celestial.xu_3;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public final class rKT
extends rKd_1 {
    public static final Codec<rKT> id_protected = RecordCodecBuilder.create(instance -> instance.group((App)rYY.id_class.fieldOf("biome_source").forGetter(rKT2 -> rKT2.id_break), (App)Codec.LONG.fieldOf("seed").stable().forGetter(rKT2 -> rKT2.id_return), (App)rKW.id_break.fieldOf("settings").forGetter(rKT2 -> rKT2.id_private)).apply((Applicative)instance, instance.stable(rKT::new)));
    private static final float[] id_implements = rqR_2.id_class(new float[13824], fArray -> {
        for (int i = 0; i < 24; ++i) {
            for (int j = 0; j < 24; ++j) {
                for (int k = 0; k < 24; ++k) {
                    fArray[i * 24 * 24 + j * 24 + k] = (float)rKT.id_break(j - 12, k - 12, i - 12);
                }
            }
        }
    });
    private static final float[] id_finally = rqR_2.id_class(new float[25], fArray -> {
        for (int i = -2; i <= 2; ++i) {
            for (int j = -2; j <= 2; ++j) {
                float f;
                fArray[i + 2 + (j + 2) * 5] = f = 10.0f / rfU_2.id_byte((float)(i * i + j * j) + 0.2f);
            }
        }
    });
    private static final xc_3 id_extends = xu_3.id_class.id_continue();
    private final int id_native;
    private final int id_volatile;
    private final int id_final;
    private final int id_package;
    private final int id_int;
    protected final rqm_3 id_throws;
    private final rKt_1 id_new;
    private final rKt_1 id_continue;
    private final rKt_1 id_super;
    private final rKn_1 id_this;
    private final rKt_1 id_else;
    private final rKI id_synchronized;
    protected final xc_3 id_case;
    protected final xc_3 id_catch;
    private final long id_return;
    protected final Supplier<rKW> id_private;
    private final int id_public;

    private double id_byte(int n, int n2) {
        double d = this.id_else.id_class(n * 200, 10.0, n2 * 200, 1.0, 0.0, true);
        double d2 = d < 0.0 ? -d * 0.3 : d;
        double d3 = d2 * 24.575625 - 2.0;
        return d3 < 0.0 ? d3 * 0.009486607142857142 : Math.min(d3, 1.0) * 0.006640625;
    }

    public rKT(rYY rYY2, long l, Supplier<rKW> supplier) {
        this(rYY2, rYY2, l, supplier);
    }

    private rKT(rYY rYY2, rYY rYY3, long l, Supplier<rKW> supplier) {
        super(rYY2, rYY3, supplier.get().id_class(), l);
        this.id_return = l;
        rKW rKW2 = supplier.get();
        this.id_private = supplier;
        rrST rrST2 = rKW2.id_break();
        this.id_public = rrST2.id_class();
        this.id_native = rrST2.id_case() * 4;
        this.id_volatile = rrST2.id_throws() * 4;
        this.id_case = rKW2.id_byte();
        this.id_catch = rKW2.id_protected();
        this.id_final = 16 / this.id_volatile;
        this.id_package = rrST2.id_class() / this.id_native;
        this.id_int = 16 / this.id_volatile;
        this.id_throws = new rqm_3(l);
        this.id_new = new rKt_1(this.id_throws, IntStream.rangeClosed(-15, 0));
        this.id_continue = new rKt_1(this.id_throws, IntStream.rangeClosed(-15, 0));
        this.id_super = new rKt_1(this.id_throws, IntStream.rangeClosed(-7, 0));
        this.id_this = rrST2.id_implements() ? new rKw_1(this.id_throws, IntStream.rangeClosed(-3, 0)) : new rKt_1(this.id_throws, IntStream.rangeClosed(-3, 0));
        this.id_throws.id_class(2620);
        this.id_else = new rKt_1(this.id_throws, IntStream.rangeClosed(-15, 0));
        if (rrST2.id_extends()) {
            rqm_3 rqm_32 = new rqm_3(l);
            rqm_32.id_class(17292);
            this.id_synchronized = new rKI(rqm_32);
        } else {
            this.id_synchronized = null;
        }
    }

    @Override
    public void id_class(rKf_1 rKf_12) {
        if (!this.id_private.get().id_private()) {
            int n = rKf_12.id_protected();
            int n2 = rKf_12.id_throws();
            rYG rYG2 = rKf_12.id_implements(new rfj_3(n, n2).id_finally());
            rqm_3 rqm_32 = new rqm_3();
            rqm_32.id_class(rKf_12.id_break(), n << 4, n2 << 4);
            rrEj_1.id_class(rKf_12, rYG2, n, n2, rqm_32);
        }
    }

    @Override
    public List<rYf_1> id_class(rYG rYG2, rrrA rrrA2, aH_2 aH_22, rfH_2 rfH_22) {
        if (rrrA2.id_class(rfH_22, true, rrrZ.id_finally).id_throws()) {
            if (aH_22 == aH_2.MONSTER) {
                return rrrZ.id_finally.id_byte();
            }
            if (aH_22 == aH_2.CREATURE) {
                return rrrZ.id_finally.id_private();
            }
        }
        if (aH_22 == aH_2.MONSTER) {
            if (rrrA2.id_class(rfH_22, false, rrrZ.id_break).id_throws()) {
                return rrrZ.id_break.id_byte();
            }
            if (rrrA2.id_class(rfH_22, false, rrrZ.id_native).id_throws()) {
                return rrrZ.id_native.id_byte();
            }
            if (rrrA2.id_class(rfH_22, true, rrrZ.id_final).id_throws()) {
                return rrrZ.id_final.id_byte();
            }
        }
        return super.id_class(rYG2, rrrA2, aH_22, rfH_22);
    }

    @Override
    public void id_class(rRg_1 rRg_12, rrrA rrrA2, roC_2 roC_22) {
        ObjectArrayList objectArrayList = new ObjectArrayList(10);
        ObjectArrayList objectArrayList2 = new ObjectArrayList(32);
        rfj_3 rfj_32 = roC_22.id_private();
        int n = rfj_32.id_break;
        int n2 = rfj_32.id_byte;
        int n3 = n << 4;
        int n4 = n2 << 4;
        for (rrrZ<?> rrrZ2 : rrrZ.id_this) {
            rrrA2.id_class(rjh_3.id_class(rfj_32, 0), rrrZ2).forEach(arg_0 -> rKT.id_class(rfj_32, (ObjectList)objectArrayList, n3, n4, (ObjectList)objectArrayList2, arg_0));
        }
        Object object = new double[2][this.id_int + 1][this.id_package + 1];
        for (int i = 0; i < this.id_int + 1; ++i) {
            object[0][i] = new double[this.id_package + 1];
            this.id_class((double[])object[0][i], n * this.id_final, n2 * this.id_int + i);
            object[1][i] = new double[this.id_package + 1];
        }
        rok_3 rok_32 = (rok_3)roC_22;
        rKZ rKZ2 = rok_32.id_class(rKv_1.OCEAN_FLOOR_WG);
        rKZ rKZ3 = rok_32.id_class(rKv_1.WORLD_SURFACE_WG);
        rfw_3 rfw_32 = new rfw_3();
        ObjectListIterator objectListIterator = objectArrayList.iterator();
        ObjectListIterator objectListIterator2 = objectArrayList2.iterator();
        for (int i = 0; i < this.id_final; ++i) {
            int n5;
            for (n5 = 0; n5 < this.id_int + 1; ++n5) {
                this.id_class((double[])object[1][n5], n * this.id_final + i + 1, n2 * this.id_int + n5);
            }
            for (n5 = 0; n5 < this.id_int; ++n5) {
                roQ_2 roQ_22 = rok_32.id_class(15);
                roQ_22.id_class();
                for (int j = this.id_package - 1; j >= 0; --j) {
                    Object object2 = object[0][n5][j];
                    Object object3 = object[0][n5 + 1][j];
                    Object object4 = object[1][n5][j];
                    Object object5 = object[1][n5 + 1][j];
                    Object object6 = object[0][n5][j + 1];
                    Object object7 = object[0][n5 + 1][j + 1];
                    Object object8 = object[1][n5][j + 1];
                    Object object9 = object[1][n5 + 1][j + 1];
                    for (int k = this.id_native - 1; k >= 0; --k) {
                        int n6 = j * this.id_native + k;
                        int n7 = n6 & 0xF;
                        int n8 = n6 >> 4;
                        if (roQ_22.id_catch() >> 4 != n8) {
                            roQ_22.id_break();
                            roQ_22 = rok_32.id_class(n8);
                            roQ_22.id_class();
                        }
                        double d = (double)k / (double)this.id_native;
                        double d2 = rfU_2.id_protected(d, (double)object2, (double)object6);
                        double d3 = rfU_2.id_protected(d, (double)object4, (double)object8);
                        double d4 = rfU_2.id_protected(d, (double)object3, (double)object7);
                        double d5 = rfU_2.id_protected(d, (double)object5, (double)object9);
                        for (int i2 = 0; i2 < this.id_volatile; ++i2) {
                            int n9 = n3 + i * this.id_volatile + i2;
                            int n10 = n9 & 0xF;
                            double d6 = (double)i2 / (double)this.id_volatile;
                            double d7 = rfU_2.id_protected(d6, d2, d3);
                            double d8 = rfU_2.id_protected(d6, d4, d5);
                            for (int i3 = 0; i3 < this.id_volatile; ++i3) {
                                int n11;
                                int n12;
                                Object object10;
                                int n13 = n4 + n5 * this.id_volatile + i3;
                                int n14 = n13 & 0xF;
                                double d9 = (double)i3 / (double)this.id_volatile;
                                double d10 = rfU_2.id_protected(d9, d7, d8);
                                double d11 = rfU_2.id_class(d10 / 200.0, -1.0, 1.0);
                                d11 = d11 / 2.0 - d11 * d11 * d11 / 24.0;
                                while (objectListIterator.hasNext()) {
                                    object10 = (rrrn_1)objectListIterator.next();
                                    rfi_3 rfi_32 = ((rrrn_1)object10).id_catch();
                                    n12 = Math.max(0, Math.max(rfi_32.id_class - n9, n9 - rfi_32.id_protected));
                                    n11 = n6 - (rfi_32.id_break + (object10 instanceof rel_3 ? ((rel_3)object10).id_protected() : 0));
                                    int n15 = Math.max(0, Math.max(rfi_32.id_byte - n13, n13 - rfi_32.id_case));
                                    d11 += rKT.id_class(n12, n11, n15) * 0.8;
                                }
                                objectListIterator.back(objectArrayList.size());
                                while (objectListIterator2.hasNext()) {
                                    object10 = (rek_3)objectListIterator2.next();
                                    int n16 = n9 - ((rek_3)object10).id_class();
                                    n12 = n6 - ((rek_3)object10).id_break();
                                    n11 = n13 - ((rek_3)object10).id_byte();
                                    d11 += rKT.id_class(n16, n12, n11) * 0.4;
                                }
                                objectListIterator2.back(objectArrayList2.size());
                                object10 = this.id_class(d11, n6);
                                if (object10 == id_extends) continue;
                                if (((JC)object10).id_case() != 0) {
                                    rfw_32.id_class(n9, n6, n13);
                                    rok_32.id_implements(rfw_32);
                                }
                                roQ_22.id_class(n10, n7, n14, (xc_3)object10, false);
                                rKZ2.id_class(n10, n6, n14, (xc_3)object10);
                                rKZ3.id_class(n10, n6, n14, (xc_3)object10);
                            }
                        }
                    }
                }
                roQ_22.id_break();
            }
            Object object11 = object[0];
            object[0] = object[1];
            object[1] = object11;
        }
    }

    private static double id_class(int n, int n2, int n3) {
        int n4 = n + 12;
        int n5 = n2 + 12;
        int n6 = n3 + 12;
        if (n4 >= 0 && n4 < 24) {
            if (n5 >= 0 && n5 < 24) {
                return n6 >= 0 && n6 < 24 ? (double)id_implements[n6 * 24 * 24 + n4 * 24 + n5] : 0.0;
            }
            return 0.0;
        }
        return 0.0;
    }

    @Override
    public rKd_1 id_class(long l) {
        return new rKT(this.id_break.id_class(l), l, this.id_private);
    }

    @Override
    protected Codec<? extends rKd_1> id_class() {
        return id_protected;
    }

    private static /* synthetic */ void id_class(rfj_3 rfj_32, ObjectList objectList, int n, int n2, ObjectList objectList2, rrrH rrrH2) {
        for (rrrn_1 rrrn_12 : rrrH2.id_protected()) {
            if (!rrrn_12.id_class(rfj_32, 12)) continue;
            if (rrrn_12 instanceof rel_3) {
                rel_3 rel_32 = (rel_3)rrrn_12;
                rem_3 rem_32 = rel_32.id_break().id_byte();
                if (rem_32 == rem_3.RIGID) {
                    objectList.add((Object)rel_32);
                }
                for (rek_3 rek_32 : rel_32.id_throws()) {
                    int n3 = rek_32.id_class();
                    int n4 = rek_32.id_byte();
                    if (n3 <= n - 12 || n4 <= n2 - 12 || n3 >= n + 15 + 12 || n4 >= n2 + 15 + 12) continue;
                    objectList2.add((Object)rek_32);
                }
                continue;
            }
            objectList.add((Object)rrrn_12);
        }
    }

    private int id_class(int n, int n2, xc_3[] xc_3Array, Predicate<xc_3> predicate) {
        int n3 = Math.floorDiv(n, this.id_volatile);
        int n4 = Math.floorDiv(n2, this.id_volatile);
        int n5 = Math.floorMod(n, this.id_volatile);
        int n6 = Math.floorMod(n2, this.id_volatile);
        double d = (double)n5 / (double)this.id_volatile;
        double d2 = (double)n6 / (double)this.id_volatile;
        double[][] dArrayArray = new double[][]{this.id_break(n3, n4), this.id_break(n3, n4 + 1), this.id_break(n3 + 1, n4), this.id_break(n3 + 1, n4 + 1)};
        for (int i = this.id_package - 1; i >= 0; --i) {
            double d3 = dArrayArray[0][i];
            double d4 = dArrayArray[1][i];
            double d5 = dArrayArray[2][i];
            double d6 = dArrayArray[3][i];
            double d7 = dArrayArray[0][i + 1];
            double d8 = dArrayArray[1][i + 1];
            double d9 = dArrayArray[2][i + 1];
            double d10 = dArrayArray[3][i + 1];
            for (int j = this.id_native - 1; j >= 0; --j) {
                double d11 = (double)j / (double)this.id_native;
                double d12 = rfU_2.id_class(d11, d, d2, d3, d7, d5, d9, d4, d8, d6, d10);
                int n7 = i * this.id_native + j;
                xc_3 xc_32 = this.id_class(d12, n7);
                if (xc_3Array != null) {
                    xc_3Array[n7] = xc_32;
                }
                if (predicate == null || !predicate.test(xc_32)) continue;
                return n7 + 1;
            }
        }
        return 0;
    }

    @Override
    public rRq_1 id_class(int n, int n2) {
        xc_3[] xc_3Array = new xc_3[this.id_package * this.id_native];
        this.id_class(n, n2, xc_3Array, (Predicate<xc_3>)null);
        return new rRE(xc_3Array);
    }

    @Override
    public int id_class(int n, int n2, rKv_1 rKv_12) {
        return this.id_class(n, n2, (xc_3[])null, rKv_12.id_throws());
    }

    public boolean id_class(long l, rqM_2<rKW> rqM_22) {
        return this.id_return == l && this.id_private.get().id_class(rqM_22);
    }

    private void id_class(double[] dArray, int n, int n2) {
        double d;
        double d2;
        double d3;
        double d4;
        rrST rrST2 = this.id_private.get().id_break();
        if (this.id_synchronized != null) {
            d4 = rYK.id_class(this.id_synchronized, n, n2) - 8.0f;
            d3 = d4 > 0.0 ? 0.25 : 1.0;
        } else {
            float f = 0.0f;
            float f2 = 0.0f;
            float f3 = 0.0f;
            int n3 = 2;
            int n4 = this.id_case();
            float f4 = this.id_break.id_protected(n, n4, n2).id_private();
            for (int i = -2; i <= 2; ++i) {
                for (int j = -2; j <= 2; ++j) {
                    float f5;
                    float f6;
                    rYG rYG2 = this.id_break.id_protected(n + i, n4, n2 + j);
                    float f7 = rYG2.id_private();
                    float f8 = rYG2.id_finally();
                    if (rrST2.id_native() && f7 > 0.0f) {
                        f6 = 1.0f + f7 * 2.0f;
                        f5 = 1.0f + f8 * 4.0f;
                    } else {
                        f6 = f7;
                        f5 = f8;
                    }
                    float f9 = f7 > f4 ? 0.5f : 1.0f;
                    float f10 = f9 * id_finally[i + 2 + (j + 2) * 5] / (f6 + 2.0f);
                    f += f5 * f10;
                    f2 += f6 * f10;
                    f3 += f10;
                }
            }
            float f11 = f2 / f3;
            float f12 = f / f3;
            d2 = f11 * 0.5f - 0.125f;
            d = f12 * 0.9f + 0.1f;
            d4 = d2 * 0.265625;
            d3 = 96.0 / d;
        }
        double d5 = 684.412 * rrST2.id_break().id_class();
        double d6 = 684.412 * rrST2.id_break().id_break();
        double d7 = d5 / rrST2.id_break().id_byte();
        double d8 = d6 / rrST2.id_break().id_protected();
        d2 = rrST2.id_byte().id_class();
        d = rrST2.id_byte().id_break();
        double d9 = rrST2.id_byte().id_byte();
        double d10 = rrST2.id_protected().id_class();
        double d11 = rrST2.id_protected().id_break();
        double d12 = rrST2.id_protected().id_byte();
        double d13 = rrST2.id_finally() ? this.id_byte(n, n2) : 0.0;
        double d14 = rrST2.id_catch();
        double d15 = rrST2.id_private();
        for (int i = 0; i <= this.id_package; ++i) {
            double d16;
            double d17 = this.id_class(n, i, n2, d5, d6, d7, d8);
            double d18 = 1.0 - (double)i * 2.0 / (double)this.id_package + d13;
            double d19 = d18 * d14 + d15;
            double d20 = (d19 + d4) * d3;
            d17 = d20 > 0.0 ? (d17 += d20 * 4.0) : (d17 += d20);
            if (d > 0.0) {
                d16 = ((double)(this.id_package - i) - d9) / d;
                d17 = rfU_2.id_break(d2, d17, d16);
            }
            if (d11 > 0.0) {
                d16 = ((double)i - d12) / d11;
                d17 = rfU_2.id_break(d10, d17, d16);
            }
            dArray[i] = d17;
        }
    }

    private double id_class(int n, int n2, int n3, double d, double d2, double d3, double d4) {
        double d5 = 0.0;
        double d6 = 0.0;
        double d7 = 0.0;
        boolean bl = true;
        double d8 = 1.0;
        for (int i = 0; i < 16; ++i) {
            rKy_1 rKy_12;
            rKy_1 rKy_13;
            double d9 = rKt_1.id_class((double)n * d * d8);
            double d10 = rKt_1.id_class((double)n2 * d2 * d8);
            double d11 = rKt_1.id_class((double)n3 * d * d8);
            double d12 = d2 * d8;
            rKy_1 rKy_14 = this.id_new.id_class(i);
            if (rKy_14 != null) {
                d5 += rKy_14.id_class(d9, d10, d11, d12, (double)n2 * d12) / d8;
            }
            if ((rKy_13 = this.id_continue.id_class(i)) != null) {
                d6 += rKy_13.id_class(d9, d10, d11, d12, (double)n2 * d12) / d8;
            }
            if (i < 8 && (rKy_12 = this.id_super.id_class(i)) != null) {
                d7 += rKy_12.id_class(rKt_1.id_class((double)n * d3 * d8), rKt_1.id_class((double)n2 * d4 * d8), rKt_1.id_class((double)n3 * d3 * d8), d4 * d8, (double)n2 * d4 * d8) / d8;
            }
            d8 /= 2.0;
        }
        return rfU_2.id_break(d5 / 512.0, d6 / 512.0, (d7 / 10.0 + 1.0) / 2.0);
    }

    protected xc_3 id_class(double d, int n) {
        xc_3 xc_32 = d > 0.0 ? this.id_case : (n < this.id_case() ? this.id_catch : id_extends);
        return xc_32;
    }

    private void id_class(roC_2 roC_22, Random random) {
        boolean bl;
        rfw_3 rfw_32 = new rfw_3();
        int n = roC_22.id_private().id_break();
        int n2 = roC_22.id_private().id_byte();
        rKW rKW2 = this.id_private.get();
        int n3 = rKW2.id_case();
        int n4 = this.id_public - 1 - rKW2.id_throws();
        int n5 = 5;
        boolean bl2 = n4 + 4 >= 0 && n4 < this.id_public;
        boolean bl3 = bl = n3 + 4 >= 0 && n3 < this.id_public;
        if (bl2 || bl) {
            for (rfH_2 rfH_22 : rfH_2.id_break(n, 0, n2, n + 15, 0, n2 + 15)) {
                int n6;
                if (bl2) {
                    for (n6 = 0; n6 < 5; ++n6) {
                        if (n6 > random.nextInt(5)) continue;
                        roC_22.id_class(rfw_32.id_class(rfH_22.b_(), n4 - n6, rfH_22.d_()), xu_3.id_while.id_continue(), false);
                    }
                }
                if (!bl) continue;
                for (n6 = 4; n6 >= 0; --n6) {
                    if (n6 > random.nextInt(5)) continue;
                    roC_22.id_class(rfw_32.id_class(rfH_22.b_(), n3 + n6, rfH_22.d_()), xu_3.id_while.id_continue(), false);
                }
            }
        }
    }

    @Override
    public void id_class(rKf_1 rKf_12, roC_2 roC_22) {
        rfj_3 rfj_32 = roC_22.id_private();
        int n = rfj_32.id_break;
        int n2 = rfj_32.id_byte;
        rqm_3 rqm_32 = new rqm_3();
        rqm_32.id_class(n, n2);
        rfj_3 rfj_33 = roC_22.id_private();
        int n3 = rfj_33.id_break();
        int n4 = rfj_33.id_byte();
        double d = 0.0625;
        rfw_3 rfw_32 = new rfw_3();
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                int n5 = n3 + i;
                int n6 = n4 + j;
                int n7 = roC_22.id_class(rKv_1.WORLD_SURFACE_WG, i, j) + 1;
                double d2 = this.id_this.id_class((double)n5 * 0.0625, (double)n6 * 0.0625, 0.0625, (double)i * 0.0625) * 15.0;
                rKf_12.id_implements(rfw_32.id_class(n3 + i, n7, n4 + j)).id_class(rqm_32, roC_22, n5, n6, n7, d2, this.id_case, this.id_catch, this.id_case(), rKf_12.id_break());
            }
        }
        this.id_class(roC_22, rqm_32);
    }

    private double[] id_break(int n, int n2) {
        double[] dArray = new double[this.id_package + 1];
        this.id_class(dArray, n, n2);
        return dArray;
    }

    private static double id_break(int n, int n2, int n3) {
        double d = n * n + n3 * n3;
        double d2 = (double)n2 + 0.5;
        double d3 = d2 * d2;
        double d4 = Math.pow(Math.E, -(d3 / 16.0 + d / 16.0));
        double d5 = -d2 * rfU_2.id_private(d3 / 2.0 + d / 2.0) / 2.0;
        return d5 * d4;
    }

    @Override
    public int id_throws() {
        return this.id_public;
    }

    @Override
    public int id_case() {
        return this.id_private.get().id_catch();
    }
}

