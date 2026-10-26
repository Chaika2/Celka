/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrXV;
import celestial.rrXl_1;
import celestial.rrXq_1;
import celestial.rrXt_1;
import celestial.rrXv_1;
import celestial.rrbb_3;
import java.util.Map;

public class rrdq_1
implements rrXV {
    private Map<String, String> id_class = null;

    @Override
    public rrXt_1 id_byte(String string) {
        String string2;
        String string3 = "defined_";
        if (string.startsWith(string3)) {
            String string4 = string.substring(string3.length());
            return this.id_class.containsKey(string4) ? new rrXl_1(rrXq_1.TRUE, null) : new rrXl_1(rrXq_1.FALSE, null);
        }
        while (this.id_class.containsKey(string) && (string2 = this.id_class.get(string)) != null && !string2.equals(string)) {
            string = string2;
        }
        int n = rrbb_3.id_class(string, Integer.MIN_VALUE);
        if (n == Integer.MIN_VALUE) {
            rrbb_3.id_protected("Unknown macro value: " + string);
            return new rrXv_1(0.0f);
        }
        return new rrXv_1(n);
    }

    public rrdq_1(Map<String, String> map) {
        this.id_class = map;
    }
}

