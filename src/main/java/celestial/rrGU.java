/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.IJ;
import celestial.dU_2;
import celestial.de_3;
import celestial.fJ_2;
import celestial.fQ_2;
import celestial.fj_3;
import celestial.kq_3;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rrJy_1;
import celestial.rrbb_3;
import celestial.rrzE_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.Random;

public class rrGU {
    private static boolean id_class = true;
    private static boolean id_break = true;
    private static boolean id_byte = true;
    private static boolean id_protected = true;
    private static boolean id_throws = true;
    private static boolean id_case = true;
    private static boolean id_catch = true;
    private static boolean id_private = false;
    private static fj_3 id_implements = null;
    private static fj_3 id_finally = null;
    private static fj_3 id_extends = null;
    private static fj_3 id_native = null;
    private static fj_3 id_volatile = null;
    private static fj_3 id_final = null;
    private static fj_3 id_package = null;
    private static boolean id_int = false;
    private static IJ id_new = null;
    private static IJ id_continue = null;
    private static IJ id_super = null;
    private static IJ id_this = null;
    private static IJ id_else = null;
    private static IJ id_synchronized = null;
    private static boolean id_return = false;
    private static final String id_public = "block/grass_block_top";
    private static final String id_goto = "block/grass_block_side";
    private static final String id_while = "block/grass_path_top";
    private static final String id_try = "block/grass_path_side";
    private static final String id_instanceof = "block/mycelium_top";
    private static final String id_throw = "block/podzol_top";
    private static final String id_interface = "block/snow";
    private static final Random id_char = new Random(0L);

    private static void id_byte(fJ_2 fJ_22) {
        id_class = true;
        id_break = true;
        id_byte = true;
        id_protected = true;
        id_throws = true;
        id_case = true;
        id_catch = true;
        id_implements = fJ_22.id_throws(new rqO_2(id_public));
        id_finally = fJ_22.id_throws(new rqO_2(id_goto));
        id_extends = fJ_22.id_throws(new rqO_2(id_while));
        id_native = fJ_22.id_throws(new rqO_2(id_try));
        id_volatile = fJ_22.id_throws(new rqO_2(id_instanceof));
        id_final = fJ_22.id_throws(new rqO_2(id_throw));
        id_package = fJ_22.id_throws(new rqO_2(id_interface));
        id_int = true;
        String string = "optifine/bettergrass.properties";
        try {
            rqO_2 rqO_22 = new rqO_2(string);
            if (!rrbb_3.id_byte(rqO_22)) {
                return;
            }
            InputStream inputStream = rrbb_3.id_class(rqO_22);
            if (inputStream == null) {
                return;
            }
            boolean bl = rrbb_3.id_protected(rqO_22);
            if (bl) {
                rrbb_3.id_byte("BetterGrass: Parsing default configuration " + string);
            } else {
                rrbb_3.id_byte("BetterGrass: Parsing configuration " + string);
            }
            rrzE_2 rrzE_22 = new rrzE_2();
            rrzE_22.load(inputStream);
            inputStream.close();
            id_class = rrGU.id_class(rrzE_22, "grass", true);
            id_break = rrGU.id_class(rrzE_22, "grass_path", true);
            id_byte = rrGU.id_class(rrzE_22, "mycelium", true);
            id_protected = rrGU.id_class(rrzE_22, "podzol", true);
            id_throws = rrGU.id_class(rrzE_22, "grass.snow", true);
            id_case = rrGU.id_class(rrzE_22, "mycelium.snow", true);
            id_catch = rrGU.id_class(rrzE_22, "podzol.snow", true);
            id_private = rrGU.id_class(rrzE_22, "grass.multilayer", false);
            id_implements = rrGU.id_class(rrzE_22, "texture.grass", id_public, fJ_22);
            id_finally = rrGU.id_class(rrzE_22, "texture.grass_side", id_goto, fJ_22);
            id_extends = rrGU.id_class(rrzE_22, "texture.grass_path", id_while, fJ_22);
            id_native = rrGU.id_class(rrzE_22, "texture.grass_path_side", id_try, fJ_22);
            id_volatile = rrGU.id_class(rrzE_22, "texture.mycelium", id_instanceof, fJ_22);
            id_final = rrGU.id_class(rrzE_22, "texture.podzol", id_throw, fJ_22);
            id_package = rrGU.id_class(rrzE_22, "texture.snow", id_interface, fJ_22);
        }
        catch (IOException iOException) {
            rrbb_3.id_protected("Error reading: " + string + ", " + iOException.getClass().getName() + ": " + iOException.getMessage());
        }
    }

    private static List id_byte(rRq_1 rRq_12, xc_3 xc_32, rfH_2 rfH_22, rpr_3 rpr_32, List list) {
        if (!id_break) {
            return list;
        }
        if (rrbb_3.u()) {
            return rrGU.id_class(rfH_22.id_break(), rpr_32, rRq_12) == xu_3.bt ? id_continue.id_class(xc_32, rpr_32, id_char) : list;
        }
        return id_continue.id_class(xc_32, rpr_32, id_char);
    }

    public static List id_class(rRq_1 rRq_12, xc_3 xc_32, rfH_2 rfH_22, rpr_3 rpr_32, List list) {
        if (rpr_32 != rpr_3.UP && rpr_32 != rpr_3.DOWN) {
            if (!id_return) {
                return list;
            }
            xd_3 xd_32 = xc_32.id_break();
            if (xd_32 instanceof kq_3) {
                return rrGU.id_break(rRq_12, xc_32, rfH_22, rpr_32, list);
            }
            if (xd_32 instanceof de_3) {
                return rrGU.id_byte(rRq_12, xc_32, rfH_22, rpr_32, list);
            }
            if (xd_32 == xu_3.id_native) {
                return rrGU.id_protected(rRq_12, xc_32, rfH_22, rpr_32, list);
            }
            if (xd_32 == xu_3.id_finally) {
                return rrGU.id_throws(rRq_12, xc_32, rfH_22, rpr_32, list);
            }
            return xd_32 instanceof dU_2 ? rrGU.id_case(rRq_12, xc_32, rfH_22, rpr_32, list) : list;
        }
        return list;
    }

    public static void id_class() {
        if (id_int) {
            id_new = rrJy_1.id_class(id_implements, 0);
            if (id_private) {
                IJ iJ = rrJy_1.id_class(id_finally, -1);
                id_new = rrJy_1.id_class(iJ, id_new);
            }
            id_continue = rrJy_1.id_class("grass_path", id_native, id_extends);
            id_super = rrJy_1.id_class(id_extends, -1);
            id_this = rrJy_1.id_class(id_volatile, -1);
            id_else = rrJy_1.id_class(id_final, 0);
            id_synchronized = rrJy_1.id_class(id_package, -1);
            id_return = true;
        }
    }

    public static void id_class(fJ_2 fJ_22) {
        id_int = false;
        id_return = false;
        rrGU.id_byte(fJ_22);
    }

    private static xd_3 id_class(rfH_2 rfH_22, rpr_3 rpr_32, rRq_1 rRq_12) {
        rfH_2 rfH_23 = rfH_22.id_break(rpr_32);
        return rRq_12.id_byte(rfH_23).id_break();
    }

    private static fj_3 id_class(Properties properties, String string, String string2, fJ_2 fJ_22) {
        rqO_2 rqO_22;
        String string3 = properties.getProperty(string);
        if (string3 == null) {
            string3 = string2;
        }
        if (!rrbb_3.id_byte(rqO_22 = new rqO_2("textures/" + string3 + ".png"))) {
            rrbb_3.id_protected("BetterGrass texture not found: " + rqO_22);
            string3 = string2;
        }
        rqO_2 rqO_23 = new rqO_2(string3);
        return fJ_22.id_throws(rqO_23);
    }

    private static fj_3 id_class(fJ_2 fJ_22, rqO_2 rqO_22) {
        fj_3 fj_32 = fJ_22.id_break(rqO_22);
        if (fj_32 == null || fj_32 instanceof fQ_2) {
            rrbb_3.id_protected("Missing BetterGrass sprite: " + rqO_22);
        }
        return fj_32;
    }

    private static boolean id_class(Properties properties, String string, boolean bl) {
        String string2 = properties.getProperty(string);
        return string2 == null ? bl : Boolean.parseBoolean(string2);
    }

    private static List id_break(rRq_1 rRq_12, xc_3 xc_32, rfH_2 rfH_22, rpr_3 rpr_32, List list) {
        boolean bl;
        xd_3 xd_32 = rRq_12.id_byte(rfH_22.id_final()).id_break();
        boolean bl2 = bl = xd_32 == xu_3.Pt || xd_32 == xu_3.Pq;
        if (rrbb_3.u()) {
            if (bl) {
                if (id_case && rrGU.id_class(rfH_22, rpr_32, rRq_12) == xu_3.Pq) {
                    return id_synchronized.id_class(xc_32, rpr_32, id_char);
                }
            } else if (id_byte && rrGU.id_class(rfH_22.id_break(), rpr_32, rRq_12) == xu_3.Bi) {
                return id_this.id_class(xc_32, rpr_32, id_char);
            }
        } else if (bl) {
            if (id_case) {
                return id_synchronized.id_class(xc_32, rpr_32, id_char);
            }
        } else if (id_byte) {
            return id_this.id_class(xc_32, rpr_32, id_char);
        }
        return list;
    }

    public static void id_break(fJ_2 fJ_22) {
        id_implements = rrGU.id_class(fJ_22, id_implements.id_finally());
        id_finally = rrGU.id_class(fJ_22, id_finally.id_finally());
        id_extends = rrGU.id_class(fJ_22, id_extends.id_finally());
        id_native = rrGU.id_class(fJ_22, id_native.id_finally());
        id_volatile = rrGU.id_class(fJ_22, id_volatile.id_finally());
        id_final = rrGU.id_class(fJ_22, id_final.id_finally());
        id_package = rrGU.id_class(fJ_22, id_package.id_finally());
    }

    private static List id_throws(rRq_1 rRq_12, xc_3 xc_32, rfH_2 rfH_22, rpr_3 rpr_32, List list) {
        xd_3 xd_32 = rrGU.id_class(rfH_22, rpr_3.UP, rRq_12);
        return xd_32 == xu_3.bt && id_break && rrGU.id_class(rfH_22, rpr_32, rRq_12) == xu_3.bt ? id_super.id_class(xc_32, rpr_32, id_char) : list;
    }

    private static List id_case(rRq_1 rRq_12, xc_3 xc_32, rfH_2 rfH_22, rpr_3 rpr_32, List list) {
        boolean bl;
        xd_3 xd_32 = rRq_12.id_byte(rfH_22.id_final()).id_break();
        boolean bl2 = bl = xd_32 == xu_3.Pt || xd_32 == xu_3.Pq;
        if (rrbb_3.u()) {
            if (bl) {
                if (id_throws && rrGU.id_class(rfH_22, rpr_32, rRq_12) == xu_3.Pq) {
                    return id_synchronized.id_class(xc_32, rpr_32, id_char);
                }
            } else if (id_class && rrGU.id_class(rfH_22.id_break(), rpr_32, rRq_12) == xu_3.id_implements) {
                return id_new.id_class(xc_32, rpr_32, id_char);
            }
        } else if (bl) {
            if (id_throws) {
                return id_synchronized.id_class(xc_32, rpr_32, id_char);
            }
        } else if (id_class) {
            return id_new.id_class(xc_32, rpr_32, id_char);
        }
        return list;
    }

    private static List id_protected(rRq_1 rRq_12, xc_3 xc_32, rfH_2 rfH_22, rpr_3 rpr_32, List list) {
        boolean bl;
        xd_3 xd_32 = rrGU.id_class(rfH_22, rpr_3.UP, rRq_12);
        boolean bl2 = bl = xd_32 == xu_3.Pt || xd_32 == xu_3.Pq;
        if (rrbb_3.u()) {
            rfH_2 rfH_23;
            xc_3 xc_33;
            if (bl) {
                if (id_catch && rrGU.id_class(rfH_22, rpr_32, rRq_12) == xu_3.Pq) {
                    return id_synchronized.id_class(xc_32, rpr_32, id_char);
                }
            } else if (id_protected && (xc_33 = rRq_12.id_byte(rfH_23 = rfH_22.id_break().id_break(rpr_32))).id_break() == xu_3.id_native) {
                return id_else.id_class(xc_32, rpr_32, id_char);
            }
        } else if (bl) {
            if (id_catch) {
                return id_synchronized.id_class(xc_32, rpr_32, id_char);
            }
        } else if (id_protected) {
            return id_else.id_class(xc_32, rpr_32, id_char);
        }
        return list;
    }
}

