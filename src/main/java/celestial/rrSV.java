/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKw_1;
import celestial.rYG;
import celestial.rfw_3;
import celestial.roC_2;
import celestial.rqm_3;
import celestial.rrSa_1;
import celestial.rrsE_2;
import celestial.rrsG_2;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class rrSV
extends rrsE_2<rrsG_2> {
    private static final xc_3 id_import = xu_3.sw.id_continue();
    private static final xc_3 id_short = xu_3.sI.id_continue();
    private static final xc_3 id_default = xu_3.Ee.id_continue();
    private static final xc_3 id_const = xu_3.sV.id_continue();
    private static final xc_3 id_strictfp = xu_3.se.id_continue();
    private static final xc_3 id_boolean = xu_3.si.id_continue();
    private static final xc_3 id_transient = xu_3.so.id_continue();
    protected xc_3[] id_class;
    protected long id_break;
    protected rKw_1 id_byte;
    protected rKw_1 id_protected;
    protected rKw_1 id_throws;

    public rrSV(Codec<rrsG_2> codec) {
        super(codec);
    }

    protected xc_3 id_class(int n, int n2, int n3) {
        int n4 = (int)Math.round(this.id_throws.id_class((double)n / 512.0, (double)n3 / 512.0, false) * 2.0);
        return this.id_class[(n2 + n4 + 64) % 64];
    }

    @Override
    public void id_class(Random random, roC_2 roC_22, rYG rYG2, int n, int n2, int n3, double d, xc_3 xc_32, xc_3 xc_33, int n4, long l, rrsG_2 rrsG_22) {
        int n5 = n & 0xF;
        int n6 = n2 & 0xF;
        xc_3 xc_34 = id_import;
        rrSa_1 rrSa_12 = rYG2.id_throws().id_throws();
        xc_3 xc_35 = rrSa_12.id_break();
        xc_3 xc_36 = rrSa_12.id_class();
        xc_3 xc_37 = xc_35;
        int n7 = (int)(d / 3.0 + 3.0 + random.nextDouble() * 0.25);
        boolean bl = Math.cos(d / 3.0 * Math.PI) > 0.0;
        int n8 = -1;
        boolean bl2 = false;
        int n9 = 0;
        rfw_3 rfw_32 = new rfw_3();
        for (int i = n3; i >= 0; --i) {
            if (n9 >= 15) continue;
            rfw_32.id_class(n5, i, n6);
            xc_3 xc_38 = roC_22.id_byte(rfw_32);
            if (xc_38.id_catch()) {
                n8 = -1;
                continue;
            }
            if (!xc_38.id_class(xc_32.id_break())) continue;
            if (n8 == -1) {
                bl2 = false;
                if (n7 <= 0) {
                    xc_34 = xu_3.id_class.id_continue();
                    xc_37 = xc_32;
                } else if (i >= n4 - 4 && i <= n4 + 1) {
                    xc_34 = id_import;
                    xc_37 = xc_35;
                }
                if (i < n4 && (xc_34 == null || xc_34.id_catch())) {
                    xc_34 = xc_33;
                }
                n8 = n7 + Math.max(0, i - n4);
                if (i >= n4 - 1) {
                    if (i > n4 + 3 + n7) {
                        var30_28 = i >= 64 && i <= 127 ? (bl ? id_default : this.id_class(n, i, n2)) : id_short;
                        roC_22.id_class(rfw_32, (xc_3)var30_28, false);
                    } else {
                        roC_22.id_class(rfw_32, xc_36, false);
                        bl2 = true;
                    }
                } else {
                    roC_22.id_class(rfw_32, xc_37, false);
                    var30_28 = xc_37.id_break();
                    if (var30_28 == xu_3.sw || var30_28 == xu_3.sI || var30_28 == xu_3.sf || var30_28 == xu_3.sj || var30_28 == xu_3.sV || var30_28 == xu_3.sg || var30_28 == xu_3.sR || var30_28 == xu_3.sY || var30_28 == xu_3.so || var30_28 == xu_3.sK || var30_28 == xu_3.sD || var30_28 == xu_3.sU || var30_28 == xu_3.se || var30_28 == xu_3.sa || var30_28 == xu_3.si || var30_28 == xu_3.Er) {
                        roC_22.id_class(rfw_32, id_short, false);
                    }
                }
            } else if (n8 > 0) {
                --n8;
                if (bl2) {
                    roC_22.id_class(rfw_32, id_short, false);
                } else {
                    roC_22.id_class(rfw_32, this.id_class(n, i, n2), false);
                }
            }
            ++n9;
        }
    }

    @Override
    public void id_class(long l) {
        if (this.id_break != l || this.id_class == null) {
            this.id_break(l);
        }
        if (this.id_break != l || this.id_byte == null || this.id_protected == null) {
            rqm_3 rqm_32 = new rqm_3(l);
            this.id_byte = new rKw_1(rqm_32, IntStream.rangeClosed(-3, 0));
            this.id_protected = new rKw_1(rqm_32, (List<Integer>)ImmutableList.of((Object)0));
        }
        this.id_break = l;
    }

    protected void id_break(long l) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        this.id_class = new xc_3[64];
        Arrays.fill(this.id_class, id_default);
        rqm_3 rqm_32 = new rqm_3(l);
        this.id_throws = new rKw_1(rqm_32, (List<Integer>)ImmutableList.of((Object)0));
        for (n7 = 0; n7 < 64; ++n7) {
            if ((n7 += rqm_32.nextInt(5) + 1) >= 64) continue;
            this.id_class[n7] = id_short;
        }
        n7 = rqm_32.nextInt(4) + 2;
        for (n6 = 0; n6 < n7; ++n6) {
            n5 = rqm_32.nextInt(3) + 1;
            n4 = rqm_32.nextInt(64);
            for (n3 = 0; n4 + n3 < 64 && n3 < n5; ++n3) {
                this.id_class[n4 + n3] = id_const;
            }
        }
        n6 = rqm_32.nextInt(4) + 2;
        for (n5 = 0; n5 < n6; ++n5) {
            n4 = rqm_32.nextInt(3) + 2;
            n3 = rqm_32.nextInt(64);
            for (n2 = 0; n3 + n2 < 64 && n2 < n4; ++n2) {
                this.id_class[n3 + n2] = id_strictfp;
            }
        }
        n5 = rqm_32.nextInt(4) + 2;
        for (n4 = 0; n4 < n5; ++n4) {
            n3 = rqm_32.nextInt(3) + 1;
            n2 = rqm_32.nextInt(64);
            for (n = 0; n2 + n < 64 && n < n3; ++n) {
                this.id_class[n2 + n] = id_boolean;
            }
        }
        n4 = rqm_32.nextInt(3) + 3;
        n3 = 0;
        for (n2 = 0; n2 < n4; ++n2) {
            n = 1;
            n3 += rqm_32.nextInt(16) + 4;
            for (int i = 0; n3 + i < 64 && i < 1; ++i) {
                this.id_class[n3 + i] = id_import;
                if (n3 + i > 1 && rqm_32.nextBoolean()) {
                    this.id_class[n3 + i - 1] = id_transient;
                }
                if (n3 + i >= 63 || !rqm_32.nextBoolean()) continue;
                this.id_class[n3 + i + 1] = id_transient;
            }
        }
    }
}

