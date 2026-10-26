/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.Iq_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.QY;
import celestial.Tf_1;
import celestial.an_3;
import celestial.au_3;
import celestial.lo_3;
import celestial.qE_2;
import celestial.qd_3;
import celestial.rMF;
import celestial.rfU_2;
import celestial.rje_3;
import celestial.rqO_2;
import celestial.rrbb_3;
import celestial.tL_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;

public class Tg_1<T extends rMF>
extends Tf_1<T, tL_2<T>> {
    private Iq_1 id_class;
    private static final rqO_2 id_break = new rqO_2("textures/entity/cow/red_mushroom.png");
    private static final rqO_2 id_byte = new rqO_2("textures/entity/cow/brown_mushroom.png");
    private static boolean id_protected = false;
    private static boolean id_throws = false;

    public Tg_1(qE_2<T, tL_2<T>> qE_22) {
        super(qE_22);
        qE_2<T, tL_2<T>> qE_23 = qE_22;
        this.id_class = new Iq_1(qE_23.id_class());
        this.id_class.id_break(16, 16);
        this.id_class.id_byte = 8.0f;
        this.id_class.id_throws = 8.0f;
        this.id_class.id_catch = rfU_2.id_break / 4.0f;
        int[][] nArrayArray = new int[][]{null, null, {16, 16, 0, 0}, {16, 16, 0, 0}, null, null};
        this.id_class.id_class(nArrayArray, -10.0f, 0.0f, 0.0f, 20.0f, 16.0f, 0.0f, 0.0f);
        int[][] nArrayArray2 = new int[][]{null, null, null, null, {16, 16, 0, 0}, {16, 16, 0, 0}};
        this.id_class.id_class(nArrayArray2, 0.0f, 0.0f, -10.0f, 0.0f, 16.0f, 20.0f, 0.0f);
    }

    public static void id_class() {
        id_protected = rrbb_3.id_byte(id_break);
        id_throws = rrbb_3.id_byte(id_byte);
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, T t, float f, float f2, float f3, float f4, float f5, float f6) {
        if (!((au_3)t).n_() && !((an_3)t).Pp()) {
            lo_3 lo_32 = QY.id_instanceof().id_synchronized();
            xc_3 xc_32 = ((rMF)t).n().id_class();
            rqO_2 rqO_22 = this.id_class(xc_32);
            Ok_1 ok_1 = null;
            if (rqO_22 != null) {
                ok_1 = hx_1.getBuffer(HU.id_byte(rqO_22));
            }
            int n2 = qd_3.id_byte(t, 0.0f);
            ml_1.id_class();
            ml_1.id_class((double)0.2f, (double)-0.35f, 0.5);
            ml_1.id_class(rje_3.id_protected.id_byte(-48.0f));
            ml_1.id_class(-1.0f, -1.0f, 1.0f);
            ml_1.id_class(-0.5, -0.5, -0.5);
            if (rqO_22 != null) {
                this.id_class.id_class(ml_1, ok_1, n, n2);
            } else {
                lo_32.id_class(xc_32, ml_1, hx_1, n, n2);
            }
            ml_1.id_break();
            ml_1.id_class();
            ml_1.id_class((double)0.2f, (double)-0.35f, 0.5);
            ml_1.id_class(rje_3.id_protected.id_byte(42.0f));
            ml_1.id_class((double)0.1f, 0.0, (double)-0.6f);
            ml_1.id_class(rje_3.id_protected.id_byte(-48.0f));
            ml_1.id_class(-1.0f, -1.0f, 1.0f);
            ml_1.id_class(-0.5, -0.5, -0.5);
            if (rqO_22 != null) {
                this.id_class.id_class(ml_1, ok_1, n, n2);
            } else {
                lo_32.id_class(xc_32, ml_1, hx_1, n, n2);
            }
            ml_1.id_break();
            ml_1.id_class();
            ((tL_2)this.id_byte()).id_byte().id_class(ml_1);
            ml_1.id_class(0.0, (double)-0.7f, (double)-0.2f);
            ml_1.id_class(rje_3.id_protected.id_byte(-78.0f));
            ml_1.id_class(-1.0f, -1.0f, 1.0f);
            ml_1.id_class(-0.5, -0.5, -0.5);
            if (rqO_22 != null) {
                this.id_class.id_class(ml_1, ok_1, n, n2);
            } else {
                lo_32.id_class(xc_32, ml_1, hx_1, n, n2);
            }
            ml_1.id_break();
        }
    }

    @Override
    private rqO_2 id_class(xc_3 xc_32) {
        xd_3 xd_32 = xc_32.id_break();
        if (xd_32 == xu_3.rT && id_protected) {
            return id_break;
        }
        return xd_32 == xu_3.rq && id_throws ? id_byte : null;
    }
}

