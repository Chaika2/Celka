/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.MT;
import celestial.ju_3;
import celestial.lD_2;
import celestial.rqO_2;
import celestial.rrbb_3;
import celestial.rrbt_3;
import celestial.yb_3;
import java.util.Properties;

public class rrbT_2 {
    private rqO_2 id_class;
    private int id_break = 0;
    private int id_byte = 2;
    private boolean id_protected;
    private static final int id_throws = 2;
    private static final int id_case = 0;
    private static final int id_catch = 1;
    private static final int id_private = 2;

    public rrbT_2(rqO_2 rqO_22, int n, int n2, boolean bl) {
        this.id_class = rqO_22;
        this.id_break = n;
        this.id_byte = n2;
        this.id_protected = bl;
    }

    private static int id_class(String string) {
        if (string == null) {
            return 0;
        }
        if ((string = string.toLowerCase().trim()).equals("fixed")) {
            return 0;
        }
        if (string.equals("full")) {
            return 1;
        }
        if (string.equals("stretch")) {
            return 2;
        }
        rrbt_3.id_class("Invalid scale mode: " + string);
        return 0;
    }

    private static int id_class(String string, int n) {
        if (string == null) {
            return n;
        }
        int n2 = rrbb_3.id_class(string = string.trim(), -1);
        if (n2 < 1) {
            rrbt_3.id_class("Invalid scale: " + string);
            return n;
        }
        return n2;
    }

    public void id_class(int n, int n2) {
        MT.id_catch();
        MT.id_instanceof();
        yb_3 yb_32 = yb_3.id_class();
        lD_2 lD_22 = yb_32.id_byte();
        rrbb_3.J().id_class(this.id_class);
        MT.id_protected(1.0f, 1.0f, 1.0f, 1.0f);
        float f = 16 * this.id_byte;
        float f2 = (float)n / f;
        float f3 = (float)n2 / f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        if (this.id_protected) {
            f4 = (f - (float)n) / (f * 2.0f);
            f5 = (f - (float)n2) / (f * 2.0f);
        }
        switch (this.id_break) {
            case 1: {
                f = Math.max(n, n2);
                f2 = (float)(this.id_byte * n) / f;
                f3 = (float)(this.id_byte * n2) / f;
                if (!this.id_protected) break;
                f4 = (float)this.id_byte * (f - (float)n) / (f * 2.0f);
                f5 = (float)this.id_byte * (f - (float)n2) / (f * 2.0f);
                break;
            }
            case 2: {
                f2 = this.id_byte;
                f3 = this.id_byte;
                f4 = 0.0f;
                f5 = 0.0f;
            }
        }
        lD_22.id_class(7, ju_3.id_public);
        lD_22.id_class(0.0, (double)n2, 0.0).id_class(f4, f5 + f3).id_break(255, 255, 255, 255).id_class();
        lD_22.id_class((double)n, (double)n2, 0.0).id_class(f4 + f2, f5 + f3).id_break(255, 255, 255, 255).id_class();
        lD_22.id_class((double)n, 0.0, 0.0).id_class(f4 + f2, f5).id_break(255, 255, 255, 255).id_class();
        lD_22.id_class(0.0, 0.0, 0.0).id_class(f4, f5).id_break(255, 255, 255, 255).id_class();
        yb_32.id_break();
    }

    public static rrbT_2 id_class(String string, int n, Properties properties) {
        rqO_2 rqO_22 = new rqO_2(string);
        int n2 = rrbT_2.id_class(rrbT_2.id_break("scaleMode", n, properties));
        int n3 = n2 == 0 ? 2 : 1;
        int n4 = rrbT_2.id_class(rrbT_2.id_break("scale", n, properties), n3);
        boolean bl = rrbb_3.id_class(rrbT_2.id_break("center", n, properties), false);
        return new rrbT_2(rqO_22, n2, n4, bl);
    }

    private static String id_break(String string, int n, Properties properties) {
        if (properties == null) {
            return null;
        }
        String string2 = properties.getProperty("dim" + n + "." + string);
        return string2 != null ? string2 : properties.getProperty(string);
    }
}

