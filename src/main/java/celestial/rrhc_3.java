/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pV_2;
import celestial.pg_3;
import celestial.qy_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.wd_3;

public class rrhc_3
extends rrMi_1 {
    public rrhc_3() {
        super(aI_2.N, "puffer_fish_small", 0.2f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        qy_3 qy_32;
        pg_3 pg_32 = QY.id_instanceof().id_case();
        pV_2 pV_22 = pg_32.id_throws().get(aI_2.N);
        if (!(pV_22 instanceof qy_3)) {
            rrbb_3.id_protected("Not a PufferfishRenderer: " + pV_22);
            return null;
        }
        if (pV_22.id_byte() == null) {
            qy_32 = new qy_3(pg_32);
            qy_32.id_byte = f;
            pV_22 = qy_32;
        }
        qy_32 = (qy_3)pV_22;
        if (!rrxr_3.EU.id_protected()) {
            rrbb_3.id_protected("Model field not found: RenderPufferfish.modelSmall");
            return null;
        }
        rrxr_3.EU.id_class(qy_32, in_1);
        return qy_32;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof wd_3)) {
            return null;
        }
        wd_3 wd_32 = (wd_3)in_1;
        if (string.equals("body")) {
            return (Iq_1)rrxr_3.sg.id_class(wd_32, 0);
        }
        if (string.equals("eye_right")) {
            return (Iq_1)rrxr_3.sg.id_class(wd_32, 1);
        }
        if (string.equals("eye_left")) {
            return (Iq_1)rrxr_3.sg.id_class(wd_32, 2);
        }
        if (string.equals("fin_right")) {
            return (Iq_1)rrxr_3.sg.id_class(wd_32, 3);
        }
        if (string.equals("fin_left")) {
            return (Iq_1)rrxr_3.sg.id_class(wd_32, 4);
        }
        return string.equals("tail") ? (Iq_1)rrxr_3.sg.id_class(wd_32, 5) : null;
    }

    @Override
    public In_1 id_throws() {
        return new wd_3();
    }

    @Override
    public String[] id_case() {
        return new String[]{"body", "eye_right", "eye_left", "tail", "fin_right", "fin_left"};
    }
}

