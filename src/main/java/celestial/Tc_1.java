/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.Hz_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.Tf_1;
import celestial.an_3;
import celestial.fZ_2;
import celestial.iB_2;
import celestial.qE_2;
import celestial.rXQ;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rds_3;
import celestial.rqO_2;
import celestial.rrbb_3;
import celestial.rrby_3;
import celestial.rrxr_3;
import celestial.rxS_2;
import celestial.tW_2;
import celestial.tX_2;
import com.google.common.collect.Maps;
import java.util.Map;

public class Tc_1<T extends iB_2, M extends tW_2<T>, A extends tW_2<T>>
extends Tf_1<T, M> {
    private static final Map<String, rqO_2> id_class = Maps.newHashMap();
    private final A id_break;
    private final A id_byte;

    public Tc_1(qE_2<T, M> qE_22, A a, A a2) {
        super(qE_22);
        this.id_break = a;
        this.id_byte = a2;
    }

    private A id_class(rXQ rXQ2) {
        return this.id_break(rXQ2) ? this.id_break : this.id_byte;
    }

    private rqO_2 id_class(rxS_2 rxS_22, boolean bl, String string) {
        String string2 = "textures/models/armor/" + rxS_22.id_throws().id_protected() + "_layer_" + (bl ? 2 : 1) + (String)(string == null ? "" : "_" + string) + ".png";
        return id_class.computeIfAbsent(string2, rqO_2::new);
    }

    protected A id_class(T t, rdn_3 rdn_32, rXQ rXQ2, A a) {
        return (A)((tW_2)(rrxr_3.rQ.id_byte() ? rrxr_3.rQ.id_class(new Object[]{t, rdn_32, rXQ2, a}) : a));
    }

    public rqO_2 id_class(an_3 an_32, rdn_3 rdn_32, rXQ rXQ2, String string) {
        rqO_2 rqO_22;
        rxS_2 rxS_22 = (rxS_2)rdn_32.id_break();
        String string2 = rxS_22.id_throws().id_protected();
        String string3 = "minecraft";
        int n = string2.indexOf(58);
        if (n != -1) {
            string3 = string2.substring(0, n);
            string2 = string2.substring(n + 1);
        }
        String string4 = String.format("%s:textures/models/armor/%s_layer_%d%s.png", string3, string2, this.id_break(rXQ2) ? 2 : 1, string == null ? "" : String.format("_%s", string));
        if (rrxr_3.rN.id_byte()) {
            string4 = rrxr_3.id_catch(rrxr_3.rN, new Object[]{an_32, rdn_32, string4, rXQ2, string});
        }
        if ((rqO_22 = id_class.get(string4)) == null) {
            rqO_22 = new rqO_2(string4);
            id_class.put(string4, rqO_22);
        }
        if (rrbb_3.rd()) {
            rqO_22 = rrby_3.id_class(rdn_32, rXQ2, string, rqO_22);
        }
        return rqO_22;
    }

    private void id_class(Ml_1 ml_1, Hx_1 hx_1, T t, rXQ rXQ2, int n, A a) {
        rxS_2 rxS_22;
        rdn_3 rdn_32 = ((iB_2)t).id_class(rXQ2);
        rdb_3 rdb_32 = rdn_32.id_break();
        if (rdb_32 instanceof rxS_2 && (rxS_22 = (rxS_2)rdb_32).id_byte() == rXQ2) {
            if (rrxr_3.rb.id_byte()) {
                a = this.id_class(t, rdn_32, rXQ2, a);
            }
            ((tW_2)this.id_byte()).id_class(a);
            this.id_class(a, rXQ2);
            boolean bl = rdn_32.id_else();
            if (rxS_22 instanceof rds_3) {
                int n2 = ((rds_3)((Object)rxS_22)).d_(rdn_32);
                float f = (float)(n2 >> 16 & 0xFF) / 255.0f;
                float f2 = (float)(n2 >> 8 & 0xFF) / 255.0f;
                float f3 = (float)(n2 & 0xFF) / 255.0f;
                this.id_class(ml_1, hx_1, n, bl, a, f, f2, f3, this.id_class((an_3)t, rdn_32, rXQ2, null));
                this.id_class(ml_1, hx_1, n, bl, a, 1.0f, 1.0f, 1.0f, this.id_class((an_3)t, rdn_32, rXQ2, "overlay"));
            } else {
                this.id_class(ml_1, hx_1, n, bl, a, 1.0f, 1.0f, 1.0f, this.id_class((an_3)t, rdn_32, rXQ2, null));
            }
        }
    }

    protected void id_class(A a, rXQ rXQ2) {
        ((tW_2)a).b_(false);
        switch (rXQ2) {
            case HEAD: {
                ((tW_2)a).id_class.id_finally = true;
                ((tW_2)a).id_break.id_finally = true;
                break;
            }
            case CHEST: {
                ((tW_2)a).id_byte.id_finally = true;
                ((tW_2)a).id_protected.id_finally = true;
                ((tW_2)a).id_throws.id_finally = true;
                break;
            }
            case LEGS: {
                ((tW_2)a).id_byte.id_finally = true;
                ((tW_2)a).id_case.id_finally = true;
                ((tW_2)a).id_catch.id_finally = true;
                break;
            }
            case FEET: {
                ((tW_2)a).id_case.id_finally = true;
                ((tW_2)a).id_catch.id_finally = true;
            }
        }
    }

    private void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, rxS_2 rxS_22, boolean bl, A a, boolean bl2, float f, float f2, float f3, String string) {
        this.id_class(ml_1, hx_1, n, bl, a, f, f2, f3, this.id_class(rxS_22, bl2, string));
    }

    private void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, boolean bl, A a, float f, float f2, float f3, rqO_2 rqO_22) {
        Ok_1 ok_1 = Hz_1.id_class(hx_1, HU.id_class(rqO_22), false, bl);
        ((tX_2)a).id_class(ml_1, ok_1, n, fZ_2.id_class, f, f2, f3, 1.0f);
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, T t, float f, float f2, float f3, float f4, float f5, float f6) {
        this.id_class(ml_1, hx_1, t, rXQ.CHEST, n, this.id_class(rXQ.CHEST));
        this.id_class(ml_1, hx_1, t, rXQ.LEGS, n, this.id_class(rXQ.LEGS));
        this.id_class(ml_1, hx_1, t, rXQ.FEET, n, this.id_class(rXQ.FEET));
        this.id_class(ml_1, hx_1, t, rXQ.HEAD, n, this.id_class(rXQ.HEAD));
    }

    private boolean id_break(rXQ rXQ2) {
        return rXQ2 == rXQ.LEGS;
    }
}

