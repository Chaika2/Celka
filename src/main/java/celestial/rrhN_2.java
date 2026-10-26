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
import celestial.wx_3;

public class rrhN_2
extends rrMi_1 {
    public rrhN_2() {
        super(aI_2.N, "puffer_fish_medium", 0.2f);
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
        if (!rrxr_3.Ee.id_protected()) {
            rrbb_3.id_protected("Model field not found: RenderPufferfish.modelMedium");
            return null;
        }
        rrxr_3.Ee.id_class(qy_32, in_1);
        return qy_32;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof wx_3)) {
            return null;
        }
        wx_3 wx_32 = (wx_3)in_1;
        if (string.equals("body")) {
            return (Iq_1)rrxr_3.sj.id_class(wx_32, 0);
        }
        if (string.equals("fin_right")) {
            return (Iq_1)rrxr_3.sj.id_class(wx_32, 1);
        }
        if (string.equals("fin_left")) {
            return (Iq_1)rrxr_3.sj.id_class(wx_32, 2);
        }
        if (string.equals("spikes_front_top")) {
            return (Iq_1)rrxr_3.sj.id_class(wx_32, 3);
        }
        if (string.equals("spikes_back_top")) {
            return (Iq_1)rrxr_3.sj.id_class(wx_32, 4);
        }
        if (string.equals("spikes_front_right")) {
            return (Iq_1)rrxr_3.sj.id_class(wx_32, 5);
        }
        if (string.equals("spikes_back_right")) {
            return (Iq_1)rrxr_3.sj.id_class(wx_32, 6);
        }
        if (string.equals("spikes_back_left")) {
            return (Iq_1)rrxr_3.sj.id_class(wx_32, 7);
        }
        if (string.equals("spikes_front_left")) {
            return (Iq_1)rrxr_3.sj.id_class(wx_32, 8);
        }
        if (string.equals("spikes_back_bottom")) {
            return (Iq_1)rrxr_3.sj.id_class(wx_32, 9);
        }
        return string.equals("spikes_front_bottom") ? (Iq_1)rrxr_3.sj.id_class(wx_32, 10) : null;
    }

    @Override
    public In_1 id_throws() {
        return new wx_3();
    }

    @Override
    public String[] id_case() {
        return new String[]{"body", "fin_right", "fin_left", "spikes_front_top", "spikes_back_top", "spikes_front_right", "spikes_back_right", "spikes_back_left", "spikes_front_left", "spikes_back_bottom", "spikes_front_bottom"};
    }
}

