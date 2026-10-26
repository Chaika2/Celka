/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrMW;
import celestial.rrbb_3;
import celestial.rrdH;
import celestial.rrdn_1;
import celestial.rrko_1;

public interface rrdr_1 {
    public static rrdr_1 id_byte() {
        if (!rrbb_3.rs()) {
            return null;
        }
        String string = rrMW.id_class("optifine/texture.properties", "format");
        if (string != null) {
            String string2;
            String[] stringArray = rrbb_3.id_class(string, "/");
            String string3 = stringArray[0];
            String string4 = string2 = stringArray.length > 1 ? stringArray[1] : null;
            if (string3.equals("lab-pbr")) {
                return new rrdH(string2);
            }
            rrbb_3.id_protected("Unknown texture format: " + string);
            return null;
        }
        return null;
    }

    public rrko_1 id_class(rrdn_1 var1);

    public String id_class();

    public String id_break();

    public boolean id_break(rrdn_1 var1);
}

