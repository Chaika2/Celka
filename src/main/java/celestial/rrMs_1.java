/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.fJ_2;
import celestial.fj_3;
import celestial.rfH_2;
import celestial.rqO_2;
import celestial.rrMS;
import celestial.rrbO_2;
import celestial.rrbb_3;
import celestial.rrzJ_2;
import celestial.wK_2;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

public class rrMs_1 {
    private static rrMS[] id_class = new rrMS[0];

    public static void id_class() {
        id_class = new rrMS[0];
        if (rrbb_3.i()) {
            String string = "optifine/natural.properties";
            try {
                rqO_2 rqO_22 = new rqO_2(string);
                if (!rrbb_3.id_byte(rqO_22)) {
                    rrbb_3.id_byte("NaturalTextures: configuration \"" + string + "\" not found");
                    return;
                }
                boolean bl = rrbb_3.id_protected(rqO_22);
                InputStream inputStream = rrbb_3.id_class(rqO_22);
                ArrayList<rrMS> arrayList = new ArrayList<rrMS>(256);
                String string2 = rrbb_3.id_break(inputStream);
                inputStream.close();
                String[] stringArray = rrbb_3.id_class(string2, "\n\r");
                if (bl) {
                    rrbb_3.id_byte("Natural Textures: Parsing default configuration \"" + string + "\"");
                    rrbb_3.id_byte("Natural Textures: Valid only for textures from default resource pack");
                } else {
                    rrbb_3.id_byte("Natural Textures: Parsing configuration \"" + string + "\"");
                }
                int n = 0;
                fJ_2 fJ_22 = rrzJ_2.id_break();
                for (int i = 0; i < stringArray.length; ++i) {
                    String string3 = stringArray[i].trim();
                    if (string3.startsWith("#")) continue;
                    String[] stringArray2 = rrbb_3.id_class(string3, "=");
                    if (stringArray2.length != 2) {
                        rrbb_3.id_protected("Natural Textures: Invalid \"" + string + "\" line: " + string3);
                        continue;
                    }
                    String string4 = stringArray2[0].trim();
                    String string5 = stringArray2[1].trim();
                    fj_3 fj_32 = fJ_22.id_break("minecraft:block/" + string4);
                    if (fj_32 == null) {
                        rrbb_3.id_protected("Natural Textures: Texture not found: \"" + string + "\" line: " + string3);
                        continue;
                    }
                    int n2 = fj_32.id_new();
                    if (n2 < 0) {
                        rrbb_3.id_protected("Natural Textures: Invalid \"" + string + "\" line: " + string3);
                        continue;
                    }
                    if (bl && !rrbb_3.id_protected(new rqO_2("textures/block/" + string4 + ".png"))) {
                        return;
                    }
                    rrMS rrMS2 = new rrMS(string5);
                    if (!rrMS2.id_class()) continue;
                    while (arrayList.size() <= n2) {
                        arrayList.add(null);
                    }
                    arrayList.set(n2, rrMS2);
                    ++n;
                }
                id_class = arrayList.toArray(new rrMS[arrayList.size()]);
                if (n > 0) {
                    rrbb_3.id_byte("NaturalTextures: " + n);
                }
            }
            catch (FileNotFoundException fileNotFoundException) {
                rrbb_3.id_protected("NaturalTextures: configuration \"" + string + "\" not found");
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public static rrMS id_class(fj_3 fj_32) {
        if (!(fj_32 instanceof fj_3)) {
            return null;
        }
        int n = fj_32.id_new();
        return n >= 0 && n < id_class.length ? id_class[n] : null;
    }

    public static wK_2 id_class(rfH_2 rfH_22, wK_2 wK_22) {
        fj_3 fj_32 = wK_22.id_case();
        if (fj_32 == null) {
            return wK_22;
        }
        rrMS rrMS2 = rrMs_1.id_class(fj_32);
        if (rrMS2 == null) {
            return wK_22;
        }
        int n = rrbO_2.id_class(wK_22.id_protected());
        int n2 = rrbb_3.id_class(rfH_22, n);
        int n3 = 0;
        boolean bl = false;
        if (rrMS2.id_class > 1) {
            n3 = n2 & 3;
        }
        if (rrMS2.id_class == 2) {
            n3 = n3 / 2 * 2;
        }
        if (rrMS2.id_break) {
            bl = (n2 & 4) != 0;
        }
        return rrMS2.id_class(wK_22, n3, bl);
    }
}

