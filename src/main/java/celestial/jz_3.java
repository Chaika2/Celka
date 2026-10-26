/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.HQ;
import celestial.Hx_1;
import celestial.KU;
import celestial.KY;
import celestial.Ko_1;
import celestial.Ml_1;
import celestial.cm_3;
import celestial.eX_2;
import celestial.fD_2;
import celestial.fU_2;
import celestial.fY_2;
import celestial.fZ_2;
import celestial.fa_3;
import celestial.fe_3;
import celestial.fi_3;
import celestial.jE_2;
import celestial.jM_2;
import celestial.jO_2;
import celestial.jP_2;
import celestial.jS_2;
import celestial.jW_2;
import celestial.jX_2;
import celestial.jb_3;
import celestial.jd_3;
import celestial.jh_3;
import celestial.jr_3;
import celestial.js_3;
import celestial.jx_3;
import celestial.lD_2;
import celestial.ly_3;
import celestial.rYB;
import celestial.rjG_2;
import celestial.rjU_2;
import celestial.rrbY_2;
import celestial.ryO_2;
import celestial.ryW_2;
import celestial.wv_3;
import celestial.yX_2;
import com.google.common.collect.Maps;
import java.util.Map;

public class jz_3 {
    public final Map<ryW_2<?>, jW_2<?>> id_class = Maps.newHashMap();
    public static final jz_3 id_break = new jz_3();
    private final lD_2 id_private = new lD_2(256);
    private cm_3 id_implements;
    public fY_2 id_byte;
    public rYB id_protected;
    public ly_3 id_throws;
    public rjG_2 id_case;
    public static ryO_2 id_catch;

    private jz_3() {
        this.id_break(ryW_2.id_private, new jX_2(this));
        this.id_break(ryW_2.id_implements, new jM_2(this));
        this.id_break(ryW_2.id_finally, new jO_2(this));
        this.id_break(ryW_2.id_break, new jr_3(this));
        this.id_break(ryW_2.id_protected, new jr_3(this));
        this.id_break(ryW_2.id_byte, new jr_3(this));
        this.id_break(ryW_2.id_native, new jS_2(this));
        this.id_break(ryW_2.id_throw, new jb_3(this));
        this.id_break(ryW_2.id_volatile, new jE_2(this));
        this.id_break(ryW_2.id_else, new js_3(this));
        this.id_break(ryW_2.id_final, new fU_2(this));
        this.id_break(ryW_2.id_package, new jx_3(this));
        this.id_break(ryW_2.id_super, new fD_2(this));
        this.id_break(ryW_2.id_this, new jd_3(this));
        this.id_break(ryW_2.id_return, new jh_3(new wv_3(), this));
        this.id_break(ryW_2.id_public, new fe_3(this));
        this.id_break(ryW_2.id_goto, new jP_2(this));
        this.id_break(ryW_2.id_interface, new fa_3(this));
        this.id_break(ryW_2.id_abstract, new fi_3(this));
    }

    public void id_class(rYB rYB2) {
        this.id_protected = rYB2;
        if (rYB2 == null) {
            this.id_throws = null;
        }
    }

    public cm_3 id_class() {
        return this.id_implements;
    }

    public jW_2 id_class(ryW_2 ryW_22) {
        return this.id_class.get(ryW_22);
    }

    public synchronized <T extends ryO_2> void id_class(ryW_2<T> ryW_22, jW_2<? super T> jW_22) {
        this.id_class.put(ryW_22, jW_22);
    }

    private static void id_class(ryO_2 ryO_22, Runnable runnable) {
        try {
            runnable.run();
        }
        catch (Throwable throwable) {
            KY kY = KY.id_class(throwable, "Rendering Block Entity");
            Ko_1 ko_1 = kY.id_class("Block Entity Details");
            ryO_22.id_class(ko_1);
            throw new KU(kY);
        }
    }

    public void id_class(rYB rYB2, fY_2 fY_22, cm_3 cm_32, ly_3 ly_32, rjG_2 rjG_22) {
        if (this.id_protected != rYB2) {
            this.id_class(rYB2);
        }
        this.id_byte = fY_22;
        this.id_throws = ly_32;
        this.id_implements = cm_32;
        this.id_case = rjG_22;
    }

    public <E extends ryO_2> jW_2<E> id_class(E e) {
        return this.id_class.get(e.id_void());
    }

    private static <T extends ryO_2> void id_class(jW_2<T> jW_22, T t, float f, Ml_1 ml_1, Hx_1 hx_1) {
        rYB rYB2 = t.id_while();
        int n = rYB2 != null ? yX_2.id_class(rYB2, t.id_char()) : 0xF000F0;
        id_catch = t;
        if (rrbY_2.id_class()) {
            rrbY_2.id_byte();
        }
        jW_22.id_class(t, f, ml_1, hx_1, n, fZ_2.id_class);
        if (rrbY_2.id_class()) {
            if (rrbY_2.id_protected()) {
                rrbY_2.id_throws();
                jW_22.id_class(t, f, ml_1, hx_1, HQ.id_class, fZ_2.id_class);
                rrbY_2.id_catch();
            }
            rrbY_2.id_private();
        }
        id_catch = null;
    }

    public <E extends ryO_2> boolean id_class(E e, Ml_1 ml_1, Hx_1 hx_1, int n, int n2) {
        jW_2 jW_22 = this.id_class(e);
        if (jW_22 == null) {
            return true;
        }
        jz_3.id_class(e, () -> {
            id_catch = e;
            jW_22.id_class(e, 0.0f, ml_1, hx_1, n, n2);
            id_catch = null;
        });
        return false;
    }

    public <E extends ryO_2> void id_class(E e, float f, Ml_1 ml_1, Hx_1 hx_1) {
        jW_2 jW_22;
        if (rjU_2.id_class(e.id_char()).id_class((eX_2)this.id_throws.id_break(), e.id_implements()) && (jW_22 = this.id_class(e)) != null && e.id_interface() && e.id_void().id_class(e.id_abstract().id_break())) {
            jz_3.id_class(e, () -> jz_3.id_class(jW_22, e, f, ml_1, hx_1));
        }
    }

    private <E extends ryO_2> void id_break(ryW_2<E> ryW_22, jW_2<E> jW_22) {
        this.id_class.put(ryW_22, jW_22);
    }
}

