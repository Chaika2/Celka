/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QY;
import celestial.fH_2;
import celestial.fJ_2;
import celestial.fY_2;
import celestial.ff_3;
import celestial.fj_3;
import celestial.rqO_2;
import celestial.rrbb_3;
import celestial.rrxn_3;
import celestial.rrzE_2;
import celestial.rrzJ_2;
import celestial.wK_2;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

public class rrbY_2 {
    private static String id_class = null;
    private static String id_break = null;
    private static boolean id_byte = false;
    private static boolean id_protected = false;
    private static boolean id_throws = false;
    private static boolean id_case = false;
    private static final String id_catch = ".png";
    private static final rqO_2 id_private = rrzJ_2.id_while;
    private static final rqO_2 id_implements = rrzJ_2.id_goto;
    private static fY_2 id_finally;
    private static int id_extends;

    public static void id_byte() {
        if (id_protected) {
            ++id_extends;
        } else {
            id_protected = true;
            id_throws = false;
        }
    }

    static {
        id_extends = 0;
    }

    public static void id_class(fJ_2 fJ_22, Set<rqO_2> set) {
        if (id_byte) {
            for (rqO_2 rqO_22 : set) {
                rrbY_2.id_class(fJ_22, rqO_22);
            }
        }
    }

    private static void id_class(String string) {
        rrbb_3.id_byte("EmissiveTextures: " + string);
    }

    private static void id_class(fj_3 fj_32, fJ_2 fJ_22) {
        fj_3 fj_33;
        fj_3 fj_34;
        if (fj_32.id_final != null && (fj_34 = fJ_22.id_protected(fj_32.id_finally())) != null && (fj_33 = fJ_22.id_protected(fj_32.id_final.id_finally())) != null) {
            fj_33.id_package = true;
            fj_34.id_final = fj_33;
        }
    }

    public static void id_class(fJ_2 fJ_22) {
        for (fj_3 fj_32 : fJ_22.id_implements()) {
            rrbY_2.id_class(fj_32, fJ_22);
        }
    }

    private static void id_class(fJ_2 fJ_22, rqO_2 rqO_22) {
        rqO_2 rqO_23;
        rqO_2 rqO_24;
        String string = rrbY_2.id_break();
        if (string != null && !rqO_22.id_break().endsWith(string) && rrbb_3.id_byte(rqO_24 = fJ_22.id_class(rqO_23 = new rqO_2(rqO_22.id_byte(), rqO_22.id_break() + string)))) {
            fj_3 fj_32 = fJ_22.id_throws(rqO_22);
            fj_3 fj_33 = fJ_22.id_throws(rqO_23);
            fj_33.id_package = true;
            fj_32.id_final = fj_33;
            fJ_22.id_throws(id_implements);
        }
    }

    public static boolean id_class() {
        return id_byte;
    }

    public static rqO_2 id_class(rqO_2 rqO_22) {
        if (!id_protected) {
            return rqO_22;
        }
        ff_3 ff_32 = id_finally.id_break(rqO_22);
        if (ff_32 instanceof fJ_2) {
            return rqO_22;
        }
        rqO_2 rqO_23 = null;
        if (ff_32 instanceof fH_2) {
            rqO_23 = ((fH_2)ff_32).id_protected;
        }
        if (!id_case) {
            if (rqO_23 != null) {
                id_throws = true;
            }
            return rqO_22;
        }
        if (rqO_23 == null) {
            rqO_23 = id_private;
        }
        return rqO_23;
    }

    public static fj_3 id_class(fj_3 fj_32) {
        if (!id_protected) {
            return fj_32;
        }
        fj_3 fj_33 = fj_32.id_final;
        if (!id_case) {
            if (fj_33 != null) {
                id_throws = true;
            }
            return fj_32;
        }
        if (fj_33 == null) {
            fj_33 = fj_32.id_extends().id_break(id_implements);
        }
        return fj_33;
    }

    public static wK_2 id_class(wK_2 wK_22) {
        if (!id_protected) {
            return wK_22;
        }
        wK_2 wK_23 = wK_22.id_int();
        if (!id_case) {
            if (wK_23 != null) {
                id_throws = true;
            }
            return wK_22;
        }
        return wK_23;
    }

    public static void id_class(rqO_2 rqO_22, fH_2 fH_22) {
        if (rqO_22 != null && fH_22 != null) {
            String string;
            fH_22.id_throws = false;
            fH_22.id_protected = null;
            if (id_break != null && (string = rqO_22.id_break()).endsWith(id_catch)) {
                if (string.endsWith(id_break)) {
                    fH_22.id_throws = true;
                } else {
                    String string2 = string.substring(0, string.length() - id_catch.length()) + id_break;
                    rqO_2 rqO_23 = new rqO_2(rqO_22.id_byte(), string2);
                    if (rrbb_3.id_byte(rqO_23)) {
                        fH_22.id_protected = rqO_23;
                    }
                }
            }
        }
    }

    private static void id_break(String string) {
        rrbb_3.id_protected("EmissiveTextures: " + string);
    }

    public static boolean id_break(rqO_2 rqO_22) {
        return id_break == null ? false : rqO_22.id_break().endsWith(id_break);
    }

    public static String id_break() {
        return id_class;
    }

    public static void id_throws() {
        id_case = true;
    }

    public static void id_catch() {
        rrxn_3.id_break();
        id_case = false;
    }

    public static boolean id_case() {
        return id_case;
    }

    public static void id_implements() {
        id_finally = QY.id_instanceof().A();
        id_byte = false;
        id_class = null;
        id_break = null;
        if (rrbb_3.rr()) {
            try {
                String string = "optifine/emissive.properties";
                rqO_2 rqO_22 = new rqO_2(string);
                InputStream inputStream = rrbb_3.id_class(rqO_22);
                if (inputStream == null) {
                    return;
                }
                rrbY_2.id_class("Loading " + string);
                rrzE_2 rrzE_22 = new rrzE_2();
                rrzE_22.load(inputStream);
                inputStream.close();
                id_class = rrzE_22.getProperty("suffix.emissive");
                if (id_class != null) {
                    id_break = id_class + id_catch;
                }
                id_byte = id_class != null;
            }
            catch (FileNotFoundException fileNotFoundException) {
                return;
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    public static boolean id_protected() {
        return id_extends > 0 ? false : id_throws;
    }

    public static void id_private() {
        if (id_extends > 0) {
            --id_extends;
        } else {
            id_protected = false;
            id_throws = false;
        }
    }
}

