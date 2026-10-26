/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.eX_2;
import celestial.jW_2;
import celestial.jz_3;
import celestial.rHp_1;
import celestial.rjV_2;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rrAe_1;
import celestial.rrQX;
import celestial.rrbb_3;
import celestial.rrdL;
import celestial.ryO_2;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class jE_2<T extends rHp_1>
extends jW_2<T> {
    public static final rqO_2 id_class = new rqO_2("textures/environment/end_sky.png");
    public static final rqO_2 id_break = new rqO_2("textures/entity/end_portal.png");
    private static final Random id_byte = new Random(31100L);
    private static final List<HU> id_protected = (List)IntStream.range(0, 16).mapToObj(n -> HU.id_class(n + 1)).collect(ImmutableList.toImmutableList());

    public jE_2(jz_3 jz_32) {
        super(jz_32);
    }

    protected float id_class() {
        return 0.75f;
    }

    protected int id_class(double d) {
        if (d > 36864.0) {
            return 1;
        }
        if (d > 25600.0) {
            return 3;
        }
        if (d > 16384.0) {
            return 5;
        }
        if (d > 9216.0) {
            return 7;
        }
        if (d > 4096.0) {
            return 9;
        }
        if (d > 1024.0) {
            return 11;
        }
        if (d > 576.0) {
            return 13;
        }
        return d > 256.0 ? 14 : 15;
    }

    @Override
    public void id_class(T t, float f, Ml_1 ml_1, Hx_1 hx_1, int n, int n2) {
        if (!rrbb_3.rs() || !rrdL.id_class(t, f, this.id_class(), ml_1, hx_1, n, n2)) {
            id_byte.setSeed(31100L);
            double d = ((ryO_2)t).id_char().id_class((eX_2)this.id_catch.id_throws.id_break(), true);
            int n3 = this.id_class(d);
            float f2 = this.id_class();
            rjV_2 rjV_22 = ml_1.id_byte().id_class();
            this.id_class(t, f2, 0.15f, rjV_22, hx_1.getBuffer(id_protected.get(0)));
            if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAe_1.id_class()).id_byte()) {
                for (int i = 1; i < n3; ++i) {
                    this.id_class(t, f2, 2.0f / (float)(18 - i), rjV_22, hx_1.getBuffer(id_protected.get(i)));
                }
            }
        }
    }

    private void id_class(T t, rjV_2 rjV_22, Ok_1 ok_1, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, rpr_3 rpr_32) {
        if (((rHp_1)t).id_class(rpr_32)) {
            ok_1.id_class(rjV_22, f, f3, f5).id_class(f9, f10, f11, 1.0f).id_class();
            ok_1.id_class(rjV_22, f2, f3, f6).id_class(f9, f10, f11, 1.0f).id_class();
            ok_1.id_class(rjV_22, f2, f4, f7).id_class(f9, f10, f11, 1.0f).id_class();
            ok_1.id_class(rjV_22, f, f4, f8).id_class(f9, f10, f11, 1.0f).id_class();
        }
    }

    private void id_class(T t, float f, float f2, rjV_2 rjV_22, Ok_1 ok_1) {
        float f3 = (id_byte.nextFloat() * 0.5f + 0.1f) * f2;
        float f4 = (id_byte.nextFloat() * 0.5f + 0.4f) * f2;
        float f5 = (id_byte.nextFloat() * 0.5f + 0.5f) * f2;
        this.id_class(t, rjV_22, ok_1, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, f3, f4, f5, rpr_3.SOUTH);
        this.id_class(t, rjV_22, ok_1, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f3, f4, f5, rpr_3.NORTH);
        this.id_class(t, rjV_22, ok_1, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, f3, f4, f5, rpr_3.EAST);
        this.id_class(t, rjV_22, ok_1, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, f3, f4, f5, rpr_3.WEST);
        this.id_class(t, rjV_22, ok_1, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, f3, f4, f5, rpr_3.DOWN);
        this.id_class(t, rjV_22, ok_1, 0.0f, 1.0f, f, f, 1.0f, 1.0f, 0.0f, 0.0f, f3, f4, f5, rpr_3.UP);
    }
}

