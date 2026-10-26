/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.pi_3;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrXO;
import celestial.rrbb_3;
import celestial.tw_3;
import java.util.Iterator;

public class rrOy_1
extends rrMi_1 {
    public rrOy_1() {
        super(aI_2.id_interface, "ghast", 0.5f);
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        pi_3 pi_32 = new pi_3(pg_32);
        pi_32.id_throws = (tw_3)in_1;
        pi_32.id_byte = f;
        return pi_32;
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof tw_3)) {
            return null;
        }
        tw_3 tw_32 = (tw_3)in_1;
        Iterator<Iq_1> iterator = tw_32.id_class().iterator();
        if (string.equals("body")) {
            return rrXO.id_class(iterator, 0);
        }
        String string2 = "tentacle";
        if (string.startsWith(string2)) {
            String string3 = string.substring(string2.length());
            int n = rrbb_3.id_class(string3, -1);
            return rrXO.id_class(iterator, n);
        }
        return null;
    }

    @Override
    public In_1 id_throws() {
        return new tw_3();
    }

    @Override
    public String[] id_case() {
        return new String[]{"body", "tentacle1", "tentacle2", "tentacle3", "tentacle4", "tentacle5", "tentacle6", "tentacle7", "tentacle8", "tentacle9"};
    }
}

