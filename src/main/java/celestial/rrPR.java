/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Products$P2
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 */
package celestial;

import celestial.rDv_1;
import celestial.rKH;
import celestial.rUX;
import celestial.rVL;
import celestial.reS_2;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfw_3;
import celestial.rrPY;
import celestial.rrPo_1;
import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;
import java.util.Set;

public abstract class rrPR {
    public static final Codec<rrPR> id_protected = rVL.rP.dispatch(rrPR::id_class, rrPo_1::id_class);
    protected final rUX id_throws;
    protected final rUX id_case;

    public rrPR(rUX rUX2, rUX rUX3) {
        this.id_throws = rUX2;
        this.id_case = rUX3;
    }

    private int id_class(Random random) {
        return this.id_case.id_class(random);
    }

    protected abstract boolean id_class(Random var1, int var2, int var3, int var4, int var5, boolean var6);

    public int id_class(Random random, int n) {
        return this.id_throws.id_class(random);
    }

    protected void id_class(rKH rKH2, Random random, rDv_1 rDv_12, rfH_2 rfH_22, int n, Set<rfH_2> set, int n2, boolean bl, rfi_3 rfi_32) {
        int n3 = bl ? 1 : 0;
        rfw_3 rfw_32 = new rfw_3();
        for (int i = -n; i <= n + n3; ++i) {
            for (int j = -n; j <= n + n3; ++j) {
                if (this.id_break(random, i, n2, j, n, bl)) continue;
                rfw_32.id_class(rfH_22, i, n2, j);
                if (!reS_2.id_throws(rKH2, rfw_32)) continue;
                rKH2.id_class((rfH_2)rfw_32, rDv_12.id_byte.id_class(random, rfw_32), 19);
                rfi_32.id_break(new rfi_3(rfw_32, rfw_32));
                set.add(rfw_32.id_int());
            }
        }
    }

    protected abstract rrPo_1<?> id_class();

    public void id_class(rKH rKH2, Random random, rDv_1 rDv_12, int n, rrPY rrPY2, int n2, int n3, Set<rfH_2> set, rfi_3 rfi_32) {
        this.id_class(rKH2, random, rDv_12, n, rrPY2, n2, n3, set, this.id_class(random), rfi_32);
    }

    public abstract int id_class(Random var1, int var2, rDv_1 var3);

    protected abstract void id_class(rKH var1, Random var2, rDv_1 var3, int var4, rrPY var5, int var6, int var7, Set<rfH_2> var8, int var9, rfi_3 var10);

    protected static <P extends rrPR> Products.P2<RecordCodecBuilder.Mu<P>, rUX, rUX> id_break(RecordCodecBuilder.Instance<P> instance) {
        return instance.group((App)rUX.id_class(0, 8, 8).fieldOf("radius").forGetter(rrPR2 -> rrPR2.id_throws), (App)rUX.id_class(0, 8, 8).fieldOf("offset").forGetter(rrPR2 -> rrPR2.id_case));
    }

    protected boolean id_break(Random random, int n, int n2, int n3, int n4, boolean bl) {
        int n5;
        int n6;
        if (bl) {
            n6 = Math.min(Math.abs(n), Math.abs(n - 1));
            n5 = Math.min(Math.abs(n3), Math.abs(n3 - 1));
        } else {
            n6 = Math.abs(n);
            n5 = Math.abs(n3);
        }
        return this.id_class(random, n6, n2, n5, n4, bl);
    }
}

