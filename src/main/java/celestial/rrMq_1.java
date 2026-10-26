/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrMp_1;
import celestial.rrbb_3;

public class rrMq_1 {
    private rrMp_1[] id_class = new rrMp_1[0];

    public rrMq_1() {
    }

    public rrMq_1(rrMp_1 rrMp_12) {
        this.id_class(rrMp_12);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        for (int i = 0; i < this.id_class.length; ++i) {
            rrMp_1 rrMp_12 = this.id_class[i];
            if (i > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(rrMp_12.toString());
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public boolean id_class(int n) {
        for (int i = 0; i < this.id_class.length; ++i) {
            rrMp_1 rrMp_12 = this.id_class[i];
            if (!rrMp_12.id_class(n)) continue;
            return true;
        }
        return false;
    }

    public int id_class() {
        return this.id_class.length;
    }

    public void id_class(rrMp_1 rrMp_12) {
        this.id_class = (rrMp_1[])rrbb_3.id_class((Object[])this.id_class, (Object)rrMp_12);
    }

    public rrMp_1 id_break(int n) {
        return this.id_class[n];
    }
}

