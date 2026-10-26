/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Products$P3
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 */
package celestial;

import celestial.rDv_1;
import celestial.rKH;
import celestial.rKl_1;
import celestial.rRY;
import celestial.rUO;
import celestial.rVL;
import celestial.reS_2;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfw_3;
import celestial.rrPY;
import celestial.rrsA_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Random;
import java.util.Set;

public abstract class rrsN_2 {
    public static final Codec<rrsN_2> id_class = rVL.rB.dispatch(rrsN_2::id_class, rrsA_2::id_class);
    protected final int id_break;
    protected final int id_byte;
    protected final int id_protected;

    public rrsN_2(int n, int n2, int n3) {
        this.id_break = n;
        this.id_byte = n2;
        this.id_protected = n3;
    }

    protected static boolean id_class(rKH rKH2, Random random, rfH_2 rfH_22, Set<rfH_2> set, rfi_3 rfi_32, rDv_1 rDv_12) {
        if (reS_2.id_throws(rKH2, rfH_22)) {
            rrsN_2.id_class(rKH2, rfH_22, rDv_12.id_break.id_class(random, rfH_22), rfi_32);
            set.add(rfH_22.id_int());
            return true;
        }
        return false;
    }

    protected static void id_class(rKH rKH2, Random random, rfw_3 rfw_32, Set<rfH_2> set, rfi_3 rfi_32, rDv_1 rDv_12) {
        if (reS_2.id_byte(rKH2, rfw_32)) {
            rrsN_2.id_class(rKH2, random, (rfH_2)rfw_32, set, rfi_32, rDv_12);
        }
    }

    protected static <P extends rrsN_2> Products.P3<RecordCodecBuilder.Mu<P>, Integer, Integer, Integer> id_class(RecordCodecBuilder.Instance<P> instance) {
        return instance.group((App)Codec.intRange((int)0, (int)32).fieldOf("base_height").forGetter(rrsN_22 -> rrsN_22.id_break), (App)Codec.intRange((int)0, (int)24).fieldOf("height_rand_a").forGetter(rrsN_22 -> rrsN_22.id_byte), (App)Codec.intRange((int)0, (int)24).fieldOf("height_rand_b").forGetter(rrsN_22 -> rrsN_22.id_protected));
    }

    protected abstract rrsA_2<?> id_class();

    public abstract List<rrPY> id_class(rKH var1, Random var2, int var3, rfH_2 var4, Set<rfH_2> var5, rfi_3 var6, rDv_1 var7);

    public int id_class(Random random) {
        return this.id_break + random.nextInt(this.id_byte + 1) + random.nextInt(this.id_protected + 1);
    }

    protected static void id_class(rKH rKH2, rfH_2 rfH_22) {
        if (!rrsN_2.id_class((rKl_1)rKH2, rfH_22)) {
            reS_2.id_break(rKH2, rfH_22, xu_3.id_finally.id_continue());
        }
    }

    private static boolean id_class(rKl_1 rKl_12, rfH_2 rfH_22) {
        return rKl_12.id_class(rfH_22, xc_32 -> {
            xd_3 xd_32 = xc_32.id_break();
            return rUO.id_break(xd_32) && !xc_32.id_class(xu_3.id_implements) && !xc_32.id_class(xu_3.Bi);
        });
    }

    protected static void id_class(rRY rRY2, rfH_2 rfH_22, xc_3 xc_32, rfi_3 rfi_32) {
        reS_2.id_break(rRY2, rfH_22, xc_32);
        rfi_32.id_break(new rfi_3(rfH_22, rfH_22));
    }
}

