/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.QS;
import celestial.QY;
import celestial.cm_3;
import celestial.ct_3;
import celestial.fk_3;
import celestial.rfU_2;
import celestial.rgP_2;
import celestial.rjV_2;
import celestial.rje_3;
import celestial.rqO_2;
import celestial.rrGO;
import celestial.rrGb_1;

public class cw_3
implements AutoCloseable {
    public final rrGb_1 id_class;
    private final fk_3 id_break;
    private final HU id_byte;

    public cw_3(ct_3 ct_32, rrGb_1 rrGb_12) {
        this.id_class = rrGb_12;
        this.id_break = new fk_3(128, 128, true);
        rqO_2 rqO_22 = ct_32.id_byte.id_class("map/" + rrGb_12.id_throws(), this.id_break);
        this.id_byte = HU.id_int(rqO_22);
    }

    public void id_class(Ml_1 ml_1, Hx_1 hx_1, boolean bl, int n) {
        boolean bl2 = false;
        boolean bl3 = false;
        float f = 0.0f;
        rjV_2 rjV_22 = ml_1.id_byte().id_class();
        Ok_1 ok_1 = hx_1.getBuffer(this.id_byte);
        ok_1.id_class(rjV_22, 0.0f, 128.0f, -0.01f).id_break(255, 255, 255, 255).id_class(0.0f, 1.0f).id_break(n).id_class();
        ok_1.id_class(rjV_22, 128.0f, 128.0f, -0.01f).id_break(255, 255, 255, 255).id_class(1.0f, 1.0f).id_break(n).id_class();
        ok_1.id_class(rjV_22, 128.0f, 0.0f, -0.01f).id_break(255, 255, 255, 255).id_class(1.0f, 0.0f).id_break(n).id_class();
        ok_1.id_class(rjV_22, 0.0f, 0.0f, -0.01f).id_break(255, 255, 255, 255).id_class(0.0f, 0.0f).id_break(n).id_class();
        int n2 = 0;
        for (rrGO rrGO2 : this.id_class.id_finally.values()) {
            if (bl && !rrGO2.id_case()) continue;
            ml_1.id_class();
            ml_1.id_class((double)(0.0f + (float)rrGO2.id_byte() / 2.0f + 64.0f), (double)(0.0f + (float)rrGO2.id_protected() / 2.0f + 64.0f), (double)-0.02f);
            ml_1.id_class(rje_3.id_case.id_byte((float)(rrGO2.id_throws() * 360) / 16.0f));
            ml_1.id_class(4.0f, 4.0f, 3.0f);
            ml_1.id_class(-0.125, 0.125, 0.0);
            byte by = rrGO2.id_class();
            float f2 = (float)(by % 16 + 0) / 16.0f;
            float f3 = (float)(by / 16 + 0) / 16.0f;
            float f4 = (float)(by % 16 + 1) / 16.0f;
            float f5 = (float)(by / 16 + 1) / 16.0f;
            rjV_2 rjV_23 = ml_1.id_byte().id_class();
            float f6 = -0.001f;
            Ok_1 ok_12 = hx_1.getBuffer(ct_3.id_break);
            ok_12.id_class(rjV_23, -1.0f, 1.0f, (float)n2 * -0.001f).id_break(255, 255, 255, 255).id_class(f2, f3).id_break(n).id_class();
            ok_12.id_class(rjV_23, 1.0f, 1.0f, (float)n2 * -0.001f).id_break(255, 255, 255, 255).id_class(f4, f3).id_break(n).id_class();
            ok_12.id_class(rjV_23, 1.0f, -1.0f, (float)n2 * -0.001f).id_break(255, 255, 255, 255).id_class(f4, f5).id_break(n).id_class();
            ok_12.id_class(rjV_23, -1.0f, -1.0f, (float)n2 * -0.001f).id_break(255, 255, 255, 255).id_class(f2, f5).id_break(n).id_class();
            ml_1.id_break();
            if (rrGO2.id_catch() != null) {
                cm_3 cm_32 = (cm_3)QY.id_instanceof().id_class[15];
                rgP_2 rgP_22 = rrGO2.id_catch();
                float f7 = cm_32.id_class(rgP_22);
                float f8 = rfU_2.id_class(25.0f / f7, 0.0f, 0.6666667f);
                ml_1.id_class();
                ml_1.id_class((double)(0.0f + (float)rrGO2.id_byte() / 2.0f + 64.0f - f7 * f8 / 2.0f), (double)(0.0f + (float)rrGO2.id_protected() / 2.0f + 64.0f + 4.0f), (double)-0.025f);
                ml_1.id_class(f8, f8, 1.0f);
                ml_1.id_class(0.0, 0.0, (double)-0.1f);
                cm_32.id_class(rgP_22, 0.0f, 0.0f, -1, false, ml_1.id_byte().id_class(), hx_1, false, Integer.MIN_VALUE, n);
                ml_1.id_break();
            }
            ++n2;
        }
    }

    public void id_class() {
        for (int i = 0; i < 128; ++i) {
            for (int j = 0; j < 128; ++j) {
                int n = j + i * 128;
                int n2 = this.id_class.id_catch[n] & 0xFF;
                if (n2 / 4 == 0) {
                    this.id_break.id_break().id_class(j, i, 0);
                    continue;
                }
                QS qS = QS.id_class[n2 / 4];
                if (qS == null) continue;
                this.id_break.id_break().id_class(j, i, qS.id_class(n2 & 3));
            }
        }
        this.id_break.id_class();
    }

    @Override
    public void close() {
        this.id_break.close();
    }
}

