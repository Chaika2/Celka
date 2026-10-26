/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.In_1;
import celestial.Iq_1;
import celestial.QY;
import celestial.aI_2;
import celestial.pg_3;
import celestial.qP_2;
import celestial.rrMa_1;
import celestial.rrMi_1;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.tf_3;

public class rrOq_1
extends rrMi_1 {
    public rrOq_1() {
        super(aI_2.id_abstract, "guardian", 0.5f);
    }

    public rrOq_1(aI_2 aI_22, String string, float f) {
        super(aI_22, string, f);
    }

    @Override
    public Iq_1 id_class(In_1 in_1, String string) {
        if (!(in_1 instanceof tf_3)) {
            return null;
        }
        tf_3 tf_32 = (tf_3)in_1;
        if (string.equals("body")) {
            return (Iq_1)rrxr_3.id_class(tf_32, rrxr_3.sP);
        }
        if (string.equals("eye")) {
            return (Iq_1)rrxr_3.id_class(tf_32, rrxr_3.sB);
        }
        String string2 = "spine";
        if (string.startsWith(string2)) {
            Iq_1[] iq_1Array = (Iq_1[])rrxr_3.id_class(tf_32, rrxr_3.sS);
            if (iq_1Array == null) {
                return null;
            }
            String string3 = string.substring(string2.length());
            int n = rrbb_3.id_class(string3, -1);
            return --n >= 0 && n < iq_1Array.length ? iq_1Array[n] : null;
        }
        String string4 = "tail";
        if (string.startsWith(string4)) {
            Iq_1[] iq_1Array = (Iq_1[])rrxr_3.id_class(tf_32, rrxr_3.ss);
            if (iq_1Array == null) {
                return null;
            }
            String string5 = string.substring(string4.length());
            int n = rrbb_3.id_class(string5, -1);
            return --n >= 0 && n < iq_1Array.length ? iq_1Array[n] : null;
        }
        return null;
    }

    @Override
    public rrMa_1 id_class(In_1 in_1, float f) {
        pg_3 pg_32 = QY.id_instanceof().id_case();
        qP_2 qP_22 = new qP_2(pg_32);
        qP_22.id_throws = (tf_3)in_1;
        qP_22.id_byte = f;
        return qP_22;
    }

    @Override
    public In_1 id_throws() {
        return new tf_3();
    }

    @Override
    public String[] id_case() {
        return new String[]{"body", "eye", "spine1", "spine2", "spine3", "spine4", "spine5", "spine6", "spine7", "spine8", "spine9", "spine10", "spine11", "spine12", "tail1", "tail2", "tail3"};
    }
}

