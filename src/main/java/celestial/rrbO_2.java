/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.IJ;
import celestial.QY;
import celestial.WL;
import celestial.dK_2;
import celestial.dV_2;
import celestial.fJ_2;
import celestial.fQ_2;
import celestial.fj_3;
import celestial.kK_2;
import celestial.rAC;
import celestial.rAI;
import celestial.rRp_1;
import celestial.rRq_1;
import celestial.rYG;
import celestial.rfH_2;
import celestial.rpB_2;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rrGU;
import celestial.rrGa_1;
import celestial.rrJp_1;
import celestial.rrJy_1;
import celestial.rrMl_1;
import celestial.rrWP;
import celestial.rrWr_1;
import celestial.rrbM_2;
import celestial.rrbX_2;
import celestial.rrbb_3;
import celestial.rrxF_2;
import celestial.rrzE_2;
import celestial.rrzJ_2;
import celestial.rrzM_2;
import celestial.rrzX_2;
import celestial.rrzz_3;
import celestial.rxL_2;
import celestial.wK_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import celestial.zE_2;
import celestial.zs_3;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class rrbO_2 {
    private static Map[] id_extends = null;
    private static Map[] id_native = null;
    private static Map[][] id_volatile = null;
    private static rrbM_2[][] id_final = null;
    private static rrbM_2[][] id_package = null;
    private static boolean id_int = false;
    protected static final int id_class = -1;
    protected static final int id_break = 0;
    protected static final int id_byte = 1;
    protected static final int id_protected = 2;
    protected static final int id_throws = 3;
    protected static final int id_case = 4;
    protected static final int id_catch = 5;
    private static final int id_new = 0;
    private static final int id_continue = 1;
    private static final int id_super = 2;
    public static final xc_3 id_private = xu_3.id_class.id_continue();
    private static fj_3 id_this = null;
    public static rqO_2 id_implements = rrzJ_2.id_goto;
    private static final rrGa_1[] id_else = new rrGa_1[]{rrGa_1.WEST, rrGa_1.EAST, rrGa_1.NORTH, rrGa_1.SOUTH};
    private static final rrGa_1[] id_synchronized = new rrGa_1[]{rrGa_1.WEST, rrGa_1.EAST, rrGa_1.SOUTH, rrGa_1.NORTH};
    private static final rrGa_1[] id_return = new rrGa_1[]{rrGa_1.EAST, rrGa_1.WEST, rrGa_1.DOWN, rrGa_1.UP};
    private static final rrGa_1[] id_public = new rrGa_1[]{rrGa_1.WEST, rrGa_1.EAST, rrGa_1.DOWN, rrGa_1.UP};
    private static final rrGa_1[] id_goto = new rrGa_1[]{rrGa_1.NORTH, rrGa_1.SOUTH, rrGa_1.DOWN, rrGa_1.UP};
    private static final rrGa_1[] id_while = new rrGa_1[]{rrGa_1.SOUTH, rrGa_1.NORTH, rrGa_1.DOWN, rrGa_1.UP};
    private static final rrGa_1[] id_try = new rrGa_1[]{rrGa_1.NORTH_EAST, rrGa_1.NORTH_WEST, rrGa_1.SOUTH_EAST, rrGa_1.SOUTH_WEST};
    private static final rrGa_1[] id_instanceof = new rrGa_1[]{rrGa_1.SOUTH_EAST, rrGa_1.SOUTH_WEST, rrGa_1.NORTH_EAST, rrGa_1.NORTH_WEST};
    private static final rrGa_1[] id_throw = new rrGa_1[]{rrGa_1.DOWN_WEST, rrGa_1.DOWN_EAST, rrGa_1.UP_WEST, rrGa_1.UP_EAST};
    private static final rrGa_1[] id_interface = new rrGa_1[]{rrGa_1.DOWN_EAST, rrGa_1.DOWN_WEST, rrGa_1.UP_EAST, rrGa_1.UP_WEST};
    private static final rrGa_1[] id_char = new rrGa_1[]{rrGa_1.DOWN_SOUTH, rrGa_1.DOWN_NORTH, rrGa_1.UP_SOUTH, rrGa_1.UP_NORTH};
    private static final rrGa_1[] id_abstract = new rrGa_1[]{rrGa_1.DOWN_NORTH, rrGa_1.DOWN_SOUTH, rrGa_1.UP_NORTH, rrGa_1.UP_SOUTH};
    public static final fj_3 id_finally = new fj_3(new rqO_2("default"));
    private static final Random id_long = new Random(0L);

    private static rrGa_1[] id_byte(int n, int n2) {
        switch (n) {
            case 0: {
                return id_try;
            }
            case 1: {
                return id_instanceof;
            }
            case 2: {
                return id_throw;
            }
            case 3: {
                return id_interface;
            }
            case 4: {
                return id_char;
            }
            case 5: {
                return id_abstract;
            }
        }
        throw new IllegalArgumentException("Unknown side: " + n);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static wK_2[] id_byte(rrbM_2 rrbM_22, rRq_1 rRq_12, xc_3 xc_32, rfH_2 rfH_22, int n, int n2, wK_2 wK_22, int n3, rrxF_2 rrxF_22) {
        Object var10_11;
        if (!wK_22.id_final()) {
            return null;
        }
        rrJp_1 rrJp_12 = rrxF_22.id_class(rrbM_22.id_char);
        try {
            fj_3 fj_32 = rrbO_2.id_class(rrbM_22, rRq_12, xc_32, rfH_22, n, n2, wK_22.id_case(), n3, rrxF_22);
            if (fj_32 != null) {
                rrJp_12.id_class(rrbO_2.id_class(fj_32, wK_22, rrbM_22.id_throw), rrbM_22.id_interface);
            }
            var10_11 = null;
        }
        finally {
            if (rrJp_12.id_class() > 0) {
                rrxF_22.id_class(true);
            }
        }
        return var10_11;
    }

    private static fj_3 id_byte(rrbM_2 rrbM_22, rRq_1 rRq_12, xc_3 xc_32, rfH_2 rfH_22, int n, int n2, fj_3 fj_32, int n3) {
        fj_3[] fj_3Array = rrbM_22.id_goto;
        fj_3 fj_33 = rrbO_2.id_class(rrbM_22, rRq_12, xc_32, rfH_22, n, n2, fj_32, n3);
        if (fj_33 != null && fj_33 != fj_32 && fj_33 != fj_3Array[3]) {
            return fj_33;
        }
        fj_3 fj_34 = rrbO_2.id_break(rrbM_22, rRq_12, xc_32, rfH_22, n, n2, fj_32, n3);
        if (fj_34 == fj_3Array[0]) {
            return fj_3Array[4];
        }
        if (fj_34 == fj_3Array[1]) {
            return fj_3Array[5];
        }
        return fj_34 == fj_3Array[2] ? fj_3Array[6] : fj_34;
    }

    private static boolean id_byte(rrbM_2 rrbM_22, rRq_1 rRq_12, xc_3 xc_32, rfH_2 rfH_22, int n, fj_3 fj_32, int n2) {
        xc_3 xc_33 = rRq_12.id_byte(rfH_22);
        return rrbO_2.id_class(rrbM_22, rRq_12, xc_32, rfH_22, xc_33, n, fj_32, n2);
    }

    private static String[] id_byte() {
        ArrayList arrayList = new ArrayList();
        rrbO_2.id_class(arrayList, "textures/block/glass.png", "20_glass/glass.properties");
        rrbO_2.id_class(arrayList, "textures/block/glass.png", "20_glass/glass_pane.properties");
        rrbO_2.id_class(arrayList, "textures/block/bookshelf.png", "30_bookshelf/bookshelf.properties");
        rrbO_2.id_class(arrayList, "textures/block/sandstone.png", "40_sandstone/sandstone.properties");
        rrbO_2.id_class(arrayList, "textures/block/red_sandstone.png", "41_red_sandstone/red_sandstone.properties");
        String[] stringArray = new String[]{"white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"};
        for (int i = 0; i < stringArray.length; ++i) {
            String string = stringArray[i];
            String string2 = rrzX_2.id_class("" + i, 2, '0');
            rrbO_2.id_class(arrayList, "textures/block/" + string + "_stained_glass.png", string2 + "_glass_" + string + "/glass_" + string + ".properties");
            rrbO_2.id_class(arrayList, "textures/block/" + string + "_stained_glass.png", string2 + "_glass_" + string + "/glass_pane_" + string + ".properties");
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }

    private static boolean id_class(rrbM_2 rrbM_22, rRq_1 rRq_12, xc_3 xc_32, rfH_2 rfH_22, xc_3 xc_33, int n, fj_3 fj_32, int n2) {
        if (xc_32 == xc_33) {
            return true;
        }
        if (rrbM_22.id_private == 2) {
            if (xc_33 == null) {
                return false;
            }
            if (xc_33 == id_private) {
                return false;
            }
            fj_3 fj_33 = rrbO_2.id_class(rRq_12, xc_32, rfH_22, xc_33, n);
            return fj_33 == fj_32;
        }
        if (rrbM_22.id_private == 3) {
            if (xc_33 == null) {
                return false;
            }
            if (xc_33 == id_private) {
                return false;
            }
            return xc_33.id_byte() == xc_32.id_byte();
        }
        if (rrbM_22.id_private == 1) {
            xd_3 xd_32 = xc_32.id_break();
            xd_3 xd_33 = xc_33.id_break();
            return xd_33 == xd_32;
        }
        return false;
    }

    private static fj_3 id_class(rRq_1 rRq_12, xc_3 xc_32, rfH_2 rfH_22, xc_3 xc_33, int n) {
        IJ iJ = QY.id_instanceof().id_synchronized().id_break().id_break(xc_33);
        if (iJ == null) {
            return null;
        }
        rpr_3 rpr_32 = rrbO_2.id_class(n);
        List list = iJ.id_class(xc_33, rpr_32, id_long);
        if (list == null) {
            return null;
        }
        if (rrbb_3.c()) {
            list = rrGU.id_class(rRq_12, xc_33, rfH_22, rpr_32, list);
        }
        if (list.size() > 0) {
            wK_2 wK_22 = list.get(0);
            return wK_22.id_case();
        }
        List<wK_2> list2 = iJ.id_class(xc_33, null, id_long);
        if (list2 == null) {
            return null;
        }
        for (int i = 0; i < list2.size(); ++i) {
            wK_2 wK_23 = list2.get(i);
            if (wK_23.id_protected() != rpr_32) continue;
            return wK_23.id_case();
        }
        return null;
    }

    private static fj_3 id_class(rrbM_2 rrbM_22, rRq_1 rRq_12, xc_3 xc_32, rfH_2 rfH_22, int n, int n2, fj_3 fj_32, int n3) {
        boolean bl = false;
        boolean bl2 = false;
        block0 : switch (n) {
            case 0: {
                switch (n2) {
                    case 0: {
                        bl = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_byte(), n2, fj_32, n3);
                        bl2 = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_extends(), n2, fj_32, n3);
                        break;
                    }
                    case 1: {
                        bl = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_byte(), n2, fj_32, n3);
                        bl2 = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_extends(), n2, fj_32, n3);
                        break;
                    }
                    case 2: {
                        bl = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_extends(), n2, fj_32, n3);
                        bl2 = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_byte(), n2, fj_32, n3);
                        break;
                    }
                    case 3: {
                        bl = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_byte(), n2, fj_32, n3);
                        bl2 = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_extends(), n2, fj_32, n3);
                        break;
                    }
                    case 4: {
                        bl = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_private(), n2, fj_32, n3);
                        bl2 = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_protected(), n2, fj_32, n3);
                        break;
                    }
                    case 5: {
                        bl = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_protected(), n2, fj_32, n3);
                        bl2 = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_private(), n2, fj_32, n3);
                    }
                }
                break;
            }
            case 1: {
                switch (n2) {
                    case 0: {
                        bl = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_extends(), n2, fj_32, n3);
                        bl2 = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_byte(), n2, fj_32, n3);
                        break;
                    }
                    case 1: {
                        bl = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_byte(), n2, fj_32, n3);
                        bl2 = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_extends(), n2, fj_32, n3);
                        break;
                    }
                    case 2: {
                        bl = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_byte(), n2, fj_32, n3);
                        bl2 = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_extends(), n2, fj_32, n3);
                        break;
                    }
                    case 3: {
                        bl = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_byte(), n2, fj_32, n3);
                        bl2 = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_extends(), n2, fj_32, n3);
                        break;
                    }
                    case 4: {
                        bl = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_break(), n2, fj_32, n3);
                        bl2 = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_final(), n2, fj_32, n3);
                        break;
                    }
                    case 5: {
                        bl = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_final(), n2, fj_32, n3);
                        bl2 = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_break(), n2, fj_32, n3);
                    }
                }
                break;
            }
            case 2: {
                switch (n2) {
                    case 0: {
                        bl = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_protected(), n2, fj_32, n3);
                        bl2 = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_private(), n2, fj_32, n3);
                        break block0;
                    }
                    case 1: {
                        bl = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_private(), n2, fj_32, n3);
                        bl2 = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_protected(), n2, fj_32, n3);
                        break block0;
                    }
                    case 2: {
                        bl = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_break(), n2, fj_32, n3);
                        bl2 = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_final(), n2, fj_32, n3);
                        break block0;
                    }
                    case 3: {
                        bl = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_final(), n2, fj_32, n3);
                        bl2 = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_break(), n2, fj_32, n3);
                        break block0;
                    }
                    case 4: {
                        bl = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_private(), n2, fj_32, n3);
                        bl2 = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_protected(), n2, fj_32, n3);
                        break block0;
                    }
                    case 5: {
                        bl = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_private(), n2, fj_32, n3);
                        bl2 = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_protected(), n2, fj_32, n3);
                    }
                }
            }
        }
        int n4 = 3;
        n4 = bl ? (bl2 ? 1 : 2) : (bl2 ? 0 : 3);
        return rrbM_22.id_goto[n4];
    }

    private static boolean id_class(rRq_1 rRq_12, xc_3 xc_32, rfH_2 rfH_22, wK_2 wK_22, rrxF_2 rrxF_22) {
        xd_3 xd_32 = xc_32.id_break();
        if (xd_32 instanceof kK_2) {
            rxL_2 rxL_22;
            rxL_2 rxL_23;
            rpr_3 rpr_32 = wK_22.id_protected();
            if (rpr_32 != rpr_3.UP && rpr_32 != rpr_3.DOWN) {
                return false;
            }
            if (!wK_22.id_volatile()) {
                return false;
            }
            rfH_2 rfH_23 = rfH_22.id_break(wK_22.id_protected());
            xc_3 xc_33 = rRq_12.id_byte(rfH_23);
            if (xc_33.id_break() != xd_32) {
                return false;
            }
            xd_3 xd_33 = xc_33.id_break();
            if (xd_32 instanceof zE_2 && xd_33 instanceof zE_2 && (rxL_23 = ((zE_2)xd_32).id_break()) != (rxL_22 = ((zE_2)xd_33).id_break())) {
                return false;
            }
            double d = wK_22.id_finally();
            if (d < 0.4) {
                if (xc_33.id_byte(dV_2.id_int).booleanValue()) {
                    return true;
                }
            } else if (d > 0.6) {
                if (xc_33.id_byte(dV_2.id_final).booleanValue()) {
                    return true;
                }
            } else {
                double d2 = wK_22.id_native();
                if (d2 < 0.4) {
                    if (xc_33.id_byte(dV_2.id_volatile).booleanValue()) {
                        return true;
                    }
                } else {
                    if (!(d2 > 0.6)) {
                        return true;
                    }
                    if (xc_33.id_byte(dV_2.id_package).booleanValue()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void id_class(fJ_2 fJ_22) {
        id_final = null;
        id_package = null;
        id_extends = null;
        id_volatile = null;
        if (rrbb_3.a()) {
            rAC[] rACArray = rrbb_3.d();
            for (int i = rACArray.length - 1; i >= 0; --i) {
                rAC rAC2 = rACArray[i];
                rrbO_2.id_class(fJ_22, rAC2);
            }
            rrbO_2.id_class(fJ_22, rrbb_3.W());
            id_this = fJ_22.id_throws(id_implements);
            id_extends = new Map[fJ_22.id_throws() + 1];
            id_native = new Map[fJ_22.id_throws() + 1];
            id_volatile = new Map[fJ_22.id_throws() + 1][];
            if (id_final.length <= 0) {
                id_final = null;
            }
            if (id_package.length <= 0) {
                id_package = null;
            }
        }
    }

    private static synchronized wK_2 id_class(fj_3 fj_32, wK_2 wK_22) {
        if (id_extends == null) {
            return wK_22;
        }
        int n = fj_32.id_new();
        if (n >= 0 && n < id_extends.length) {
            wK_2 wK_23;
            IdentityHashMap<wK_2, wK_2> identityHashMap = id_extends[n];
            if (identityHashMap == null) {
                rrbO_2.id_extends[n] = identityHashMap = new IdentityHashMap<wK_2, wK_2>(1);
            }
            if ((wK_23 = (wK_2)identityHashMap.get(wK_22)) == null) {
                wK_23 = rrbO_2.id_class(wK_22, fj_32);
                identityHashMap.put(wK_22, wK_23);
            }
            return wK_23;
        }
        return wK_22;
    }

    private static void id_class(int n, int n2, boolean[] blArray) {
        boolean bl = blArray[n];
        blArray[n] = blArray[n2];
        blArray[n2] = bl;
    }

    private static boolean id_class(rrbM_2 rrbM_22, rRq_1 rRq_12, xc_3 xc_32, rfH_2 rfH_22, int n, fj_3 fj_32, int n2) {
        Object object;
        xc_3 xc_33 = rRq_12.id_byte(rfH_22);
        if (!rrbO_2.id_class(xc_33, rRq_12, rfH_22)) {
            return false;
        }
        if (rrbM_22.id_while != null && !rrMl_1.id_class(xc_33.id_continue(), xc_33.id_super(), rrbM_22.id_while)) {
            return false;
        }
        if (rrbM_22.id_instanceof != null && !rrbb_3.id_break(object = rrbO_2.id_class(rRq_12, xc_32, rfH_22, xc_33, n), rrbM_22.id_instanceof)) {
            return false;
        }
        object = rfH_22.id_break(rrbO_2.id_class(n));
        xc_3 xc_34 = rRq_12.id_byte((rfH_2)object);
        if (xc_34.id_implements(rRq_12, (rfH_2)object)) {
            return false;
        }
        if (n == 1 && xc_34.id_break() == xu_3.Pq) {
            return false;
        }
        return !rrbO_2.id_class(rrbM_22, rRq_12, xc_32, rfH_22, xc_33, n, fj_32, n2);
    }

    private static boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        if (rrWP.id_class(xc_32, rRq_12, rfH_22)) {
            return true;
        }
        xd_3 xd_32 = xc_32.id_break();
        if (xd_32 instanceof dK_2) {
            return true;
        }
        return xd_32 instanceof zs_3;
    }

    protected static wK_2[] id_class(fj_3 fj_32, wK_2 wK_22, rrxF_2 rrxF_22) {
        if (fj_32 == null) {
            return null;
        }
        if (fj_32 == id_finally) {
            return rrxF_22.id_break(wK_22);
        }
        wK_2 wK_23 = rrbO_2.id_class(fj_32, wK_22);
        return rrxF_22.id_break(wK_23);
    }

    private static void id_class(rrbM_2 rrbM_22, List list) {
        if (rrbM_22.id_public != null) {
            for (int i = 0; i < rrbM_22.id_public.length; ++i) {
                fj_3 fj_32 = rrbM_22.id_public[i];
                if (!(fj_32 instanceof fj_3)) {
                    rrbb_3.id_protected("TextureAtlasSprite is not TextureAtlasSprite: " + fj_32 + ", name: " + fj_32.id_finally());
                    continue;
                }
                int n = fj_32.id_new();
                if (n < 0) {
                    rrbb_3.id_protected("Invalid tile ID: " + n + ", icon: " + fj_32.id_finally());
                    continue;
                }
                rrbO_2.id_class(rrbM_22, list, n);
            }
        }
    }

    private static void id_class(rrbM_2 rrbM_22, List list, int n) {
        while (n >= list.size()) {
            list.add(null);
        }
        ArrayList<rrbM_2> arrayList = (ArrayList<rrbM_2>)list.get(n);
        if (arrayList == null) {
            arrayList = new ArrayList<rrbM_2>();
            list.set(n, arrayList);
        }
        arrayList.add(rrbM_22);
    }

    public static wK_2[] id_class(rRp_1 rRp_12, xc_3 xc_32, rfH_2 rfH_22, wK_2 wK_22, rrxF_2 rrxF_22) {
        fj_3 fj_32 = wK_22.id_case();
        if (fj_32 == null) {
            return rrxF_22.id_break(wK_22);
        }
        if (rrbO_2.id_class((rRq_1)rRp_12, xc_32, rfH_22, wK_22, rrxF_22)) {
            wK_22 = rrbO_2.id_class(id_this, wK_22);
            return rrxF_22.id_break(wK_22);
        }
        rpr_3 rpr_32 = wK_22.id_protected();
        return rrbO_2.id_class(rRp_12, xc_32, rfH_22, rpr_32, wK_22, rrxF_22);
    }

    private static void id_class(List list, String string, String string2) {
        String string3 = "optifine/ctm/default/";
        rqO_2 rqO_22 = new rqO_2(string);
        rAC rAC2 = rrbb_3.id_throws(rqO_22);
        if (rAC2 != null) {
            if (rAC2.id_class().equals("Programmer Art")) {
                String string4 = string3 + "programmer_art/";
                list.add(string4 + string2);
            } else if (rAC2 == rrbb_3.W()) {
                list.add(string3 + string2);
            }
        }
    }

    protected static Map[][] id_class() {
        return id_volatile;
    }

    public static void id_class(fJ_2 fJ_22, rAC rAC2) {
        String[] stringArray = rrzM_2.id_class(rAC2, "optifine/ctm/", ".properties", rrbO_2.id_byte());
        Arrays.sort(stringArray);
        List list = rrbO_2.id_class(id_package);
        List list2 = rrbO_2.id_class(id_final);
        for (int i = 0; i < stringArray.length; ++i) {
            String string = stringArray[i];
            rrbb_3.id_byte("ConnectedTextures: " + string);
            try {
                rqO_2 rqO_22 = new rqO_2(string);
                InputStream inputStream = rAC2.id_class(rAI.CLIENT_RESOURCES, rqO_22);
                if (inputStream == null) {
                    rrbb_3.id_protected("ConnectedTextures file not found: " + string);
                    continue;
                }
                rrzE_2 rrzE_22 = new rrzE_2();
                rrzE_22.load(inputStream);
                inputStream.close();
                rrbM_2 rrbM_22 = new rrbM_2(rrzE_22, string);
                if (!rrbM_22.id_class(string)) continue;
                rrbM_22.id_class(fJ_22);
                rrbO_2.id_class(rrbM_22, list);
                rrbO_2.id_break(rrbM_22, list2);
                continue;
            }
            catch (FileNotFoundException fileNotFoundException) {
                rrbb_3.id_protected("ConnectedTextures file not found: " + string);
                continue;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        id_final = rrbO_2.id_class(list2);
        id_package = rrbO_2.id_class(list);
        id_int = rrbO_2.id_break();
        rrbb_3.id_byte("Multipass connected textures: " + id_int);
    }

    private static fj_3 id_class(fJ_2 fJ_22, rqO_2 rqO_22) {
        fj_3 fj_32 = fJ_22.id_break(rqO_22);
        if (fj_32 == null || fj_32 instanceof fQ_2) {
            rrbb_3.id_protected("Missing CTM sprite: " + rqO_22);
        }
        return fj_32;
    }

    private static void id_class(rrbM_2[][] rrbM_2Array, fJ_2 fJ_22) {
        if (rrbM_2Array != null) {
            for (int i = 0; i < rrbM_2Array.length; ++i) {
                rrbM_2[] rrbM_2Array2 = rrbM_2Array[i];
                if (rrbM_2Array2 == null) continue;
                for (int j = 0; j < rrbM_2Array2.length; ++j) {
                    rrbM_2 rrbM_22 = rrbM_2Array2[j];
                    if (rrbM_22 == null) continue;
                    rrbM_22.id_break(fJ_22);
                }
            }
        }
    }

    private static List id_class(rrbM_2[][] rrbM_2Array) {
        ArrayList<ArrayList<rrbM_2>> arrayList = new ArrayList<ArrayList<rrbM_2>>();
        if (rrbM_2Array != null) {
            for (int i = 0; i < rrbM_2Array.length; ++i) {
                rrbM_2[] rrbM_2Array2 = rrbM_2Array[i];
                ArrayList<rrbM_2> arrayList2 = null;
                if (rrbM_2Array2 != null) {
                    arrayList2 = new ArrayList<rrbM_2>(Arrays.asList(rrbM_2Array2));
                }
                arrayList.add(arrayList2);
            }
        }
        return arrayList;
    }

    private static rrbM_2[][] id_class(List list) {
        rrbM_2[][] rrbM_2Array = new rrbM_2[list.size()][];
        for (int i = 0; i < list.size(); ++i) {
            List list2 = (List)list.get(i);
            if (list2 == null) continue;
            rrbM_2[] rrbM_2Array2 = list2.toArray(new rrbM_2[list2.size()]);
            rrbM_2Array[i] = rrbM_2Array2;
        }
        return rrbM_2Array;
    }

    private static int id_class(int n, int n2) {
        switch (n2) {
            case 0: {
                return n;
            }
            case 1: {
                switch (n) {
                    case 0: {
                        return 2;
                    }
                    case 1: {
                        return 3;
                    }
                    case 2: {
                        return 1;
                    }
                    case 3: {
                        return 0;
                    }
                }
                return n;
            }
            case 2: {
                switch (n) {
                    case 0: {
                        return 4;
                    }
                    case 1: {
                        return 5;
                    }
                    default: {
                        return n;
                    }
                    case 4: {
                        return 1;
                    }
                    case 5: 
                }
                return 0;
            }
        }
        return n;
    }

    private static int id_class(xc_3 xc_32) {
        rpB_2 rpB_22 = xc_32.id_byte(WL.id_new);
        switch (rpB_22) {
            case X: {
                return 2;
            }
            case Z: {
                return 1;
            }
        }
        return 0;
    }

    private static fj_3 id_class(rrbM_2 rrbM_22, rRq_1 rRq_12, xc_3 xc_32, rfH_2 rfH_22, int n) {
        int n2;
        if (rrbM_22.id_goto.length == 1) {
            return rrbM_22.id_goto[0];
        }
        int n3 = n / rrbM_22.id_super * rrbM_22.id_super;
        if (rrbM_22.id_this) {
            rfH_2 rfH_23 = rfH_22.id_break();
            xc_3 xc_33 = rRq_12.id_byte(rfH_23);
            while (xc_33.id_break() == xc_32.id_break()) {
                rfH_22 = rfH_23;
                if ((rfH_23 = rfH_23.id_break()).c_() < 0) break;
                xc_33 = rRq_12.id_byte(rfH_23);
            }
        }
        int n4 = rrbb_3.id_class(rfH_22, n3) & Integer.MAX_VALUE;
        for (n2 = 0; n2 < rrbM_22.id_continue; ++n2) {
            n4 = rrbb_3.id_class(n4);
        }
        n2 = 0;
        if (rrbM_22.id_new == null) {
            n2 = n4 % rrbM_22.id_goto.length;
        } else {
            int n5 = n4 % rrbM_22.id_return;
            int[] nArray = rrbM_22.id_synchronized;
            for (int i = 0; i < nArray.length; ++i) {
                if (n5 >= nArray[i]) continue;
                n2 = i;
                break;
            }
        }
        return rrbM_22.id_goto[n2];
    }

    private static fj_3 id_class(rrbM_2 rrbM_22) {
        return rrbM_22.id_goto[0];
    }

    private static fj_3 id_class(rrbM_2 rrbM_22, rfH_2 rfH_22, int n) {
        if (rrbM_22.id_goto.length == 1) {
            return rrbM_22.id_goto[0];
        }
        int n2 = rfH_22.b_();
        int n3 = rfH_22.c_();
        int n4 = rfH_22.d_();
        int n5 = 0;
        int n6 = 0;
        switch (n) {
            case 0: {
                n5 = n2;
                n6 = -n4 - 1;
                break;
            }
            case 1: {
                n5 = n2;
                n6 = n4;
                break;
            }
            case 2: {
                n5 = -n2 - 1;
                n6 = -n3;
                break;
            }
            case 3: {
                n5 = n2;
                n6 = -n3;
                break;
            }
            case 4: {
                n5 = n4;
                n6 = -n3;
                break;
            }
            case 5: {
                n5 = -n4 - 1;
                n6 = -n3;
            }
        }
        n6 %= rrbM_22.id_int;
        if ((n5 %= rrbM_22.id_package) < 0) {
            n5 += rrbM_22.id_package;
        }
        if (n6 < 0) {
            n6 += rrbM_22.id_int;
        }
        int n7 = n6 * rrbM_22.id_package + n5;
        return rrbM_22.id_goto[n7];
    }

    private static fj_3 id_class(rrbM_2 rrbM_22, rRq_1 rRq_12, xc_3 xc_32, rfH_2 rfH_22, int n, int n2, fj_3 fj_32, int n3, rrxF_2 rrxF_22) {
        int n4 = rrbO_2.id_break(rrbM_22, rRq_12, xc_32, rfH_22, n, n2, fj_32, n3, rrxF_22);
        return rrbM_22.id_goto[n4];
    }

    private static void id_class(int[] nArray, int n, fj_3 fj_32, fj_3 fj_33) {
        int n2 = nArray.length / 4;
        int n3 = n2 * n;
        float f = Float.intBitsToFloat(nArray[n3 + 4]);
        float f2 = Float.intBitsToFloat(nArray[n3 + 4 + 1]);
        double d = fj_32.id_class(f);
        double d2 = fj_32.id_break(f2);
        nArray[n3 + 4] = Float.floatToRawIntBits(fj_33.id_class(d));
        nArray[n3 + 4 + 1] = Float.floatToRawIntBits(fj_33.id_break(d2));
    }

    private static wK_2[] id_class(rRp_1 rRp_12, xc_3 xc_32, rfH_2 rfH_22, rpr_3 rpr_32, wK_2 wK_22, rrxF_2 rrxF_22) {
        int n;
        wK_2[] wK_2Array = rrbO_2.id_class(rRp_12, xc_32, rfH_22, rpr_32, wK_22, true, 0, rrxF_22);
        if (!id_int) {
            return wK_2Array;
        }
        if (wK_2Array.length == 1 && wK_2Array[0] == wK_22) {
            return wK_2Array;
        }
        List<wK_2> list = rrxF_22.id_class(wK_2Array);
        for (n = 0; n < list.size(); ++n) {
            wK_2[] wK_2Array2;
            wK_2 wK_23;
            wK_2 wK_24 = wK_23 = list.get(n);
            for (int i = 0; i < 3 && (wK_2Array2 = rrbO_2.id_class(rRp_12, xc_32, rfH_22, rpr_32, wK_24, false, i + 1, rrxF_22)).length == 1 && wK_2Array2[0] != wK_24; ++i) {
                wK_24 = wK_2Array2[0];
            }
            list.set(n, wK_24);
        }
        for (n = 0; n < wK_2Array.length; ++n) {
            wK_2Array[n] = list.get(n);
        }
        return wK_2Array;
    }

    public static wK_2[] id_class(rRp_1 rRp_12, xc_3 xc_32, rfH_2 rfH_22, rpr_3 rpr_32, wK_2 wK_22, boolean bl, int n, rrxF_2 rrxF_22) {
        wK_2[] wK_2Array;
        rrbM_2 rrbM_22;
        int n2;
        int n3;
        rrbM_2[] rrbM_2Array;
        int n4;
        xd_3 xd_32 = xc_32.id_break();
        fj_3 fj_32 = wK_22.id_case();
        if (id_package != null && (n4 = fj_32.id_new()) >= 0 && n4 < id_package.length && (rrbM_2Array = id_package[n4]) != null) {
            n3 = rrbO_2.id_class(rpr_32);
            for (n2 = 0; n2 < rrbM_2Array.length; ++n2) {
                rrbM_22 = rrbM_2Array[n2];
                if (rrbM_22 == null || !rrbM_22.id_class(xc_32.id_continue()) || (wK_2Array = rrbO_2.id_class(rrbM_22, rRp_12, xc_32, rfH_22, n3, wK_22, n, rrxF_22)) == null) continue;
                return wK_2Array;
            }
        }
        if (id_final != null && bl && (n4 = rrxF_22.id_class()) >= 0 && n4 < id_final.length && (rrbM_2Array = id_final[n4]) != null) {
            n3 = rrbO_2.id_class(rpr_32);
            for (n2 = 0; n2 < rrbM_2Array.length; ++n2) {
                rrbM_22 = rrbM_2Array[n2];
                if (rrbM_22 == null || !rrbM_22.id_class(fj_32) || (wK_2Array = rrbO_2.id_class(rrbM_22, rRp_12, xc_32, rfH_22, n3, wK_22, n, rrxF_22)) == null) continue;
                return wK_2Array;
            }
        }
        return rrxF_22.id_break(wK_22);
    }

    public static int id_class(rpr_3 rpr_32) {
        if (rpr_32 == null) {
            return -1;
        }
        switch (rpr_32) {
            case DOWN: {
                return 0;
            }
            case UP: {
                return 1;
            }
            case EAST: {
                return 5;
            }
            case WEST: {
                return 4;
            }
            case NORTH: {
                return 2;
            }
            case SOUTH: {
                return 3;
            }
        }
        return -1;
    }

    private static rpr_3 id_class(int n) {
        switch (n) {
            case 0: {
                return rpr_3.DOWN;
            }
            case 1: {
                return rpr_3.UP;
            }
            case 2: {
                return rpr_3.NORTH;
            }
            case 3: {
                return rpr_3.SOUTH;
            }
            case 4: {
                return rpr_3.WEST;
            }
            case 5: {
                return rpr_3.EAST;
            }
        }
        return rpr_3.UP;
    }

    private static wK_2[] id_class(rrbM_2 rrbM_22, rRp_1 rRp_12, xc_3 xc_32, rfH_2 rfH_22, int n, wK_2 wK_22, int n2, rrxF_2 rrxF_22) {
        Object object;
        int n3;
        int n4 = 0;
        int n5 = xc_32.id_super();
        xd_3 xd_32 = xc_32.id_break();
        if (xd_32 instanceof WL) {
            n4 = rrbO_2.id_class(xc_32);
        }
        if (!rrbM_22.id_class(xc_32.id_continue(), n5)) {
            return null;
        }
        if (n >= 0 && rrbM_22.id_implements != 63) {
            n3 = n;
            if (n4 != 0) {
                n3 = rrbO_2.id_class(n, n4);
            }
            if ((1 << n3 & rrbM_22.id_implements) == 0) {
                return null;
            }
        }
        n3 = rfH_22.c_();
        if (rrbM_22.id_extends != null && !rrbM_22.id_extends.id_class(n3)) {
            return null;
        }
        if (rrbM_22.id_finally != null && !rrbM_22.id_class((rYG)(object = rrWr_1.id_class(rRp_12, rfH_22)))) {
            return null;
        }
        if (rrbM_22.id_else != null && !rrbM_22.id_else.id_class((String)(object = rrzz_3.id_class(rRp_12, rfH_22)))) {
            return null;
        }
        object = wK_22.id_case();
        switch (rrbM_22.id_case) {
            case 1: {
                return rrbO_2.id_class(rrbO_2.id_class(rrbM_22, (rRq_1)rRp_12, xc_32, rfH_22, n4, n, (fj_3)object, n5, rrxF_22), wK_22, rrxF_22);
            }
            case 2: {
                return rrbO_2.id_class(rrbO_2.id_class(rrbM_22, (rRq_1)rRp_12, xc_32, rfH_22, n4, n, (fj_3)object, n5), wK_22, rrxF_22);
            }
            case 3: {
                return rrbO_2.id_class(rrbO_2.id_throws(rrbM_22, rRp_12, xc_32, rfH_22, n4, n, (fj_3)object, n5), wK_22, rrxF_22);
            }
            case 4: {
                return rrbO_2.id_class(rrbO_2.id_class(rrbM_22, rRp_12, xc_32, rfH_22, n), wK_22, rrxF_22);
            }
            case 5: {
                return rrbO_2.id_class(rrbO_2.id_class(rrbM_22, rfH_22, n), wK_22, rrxF_22);
            }
            case 6: {
                return rrbO_2.id_class(rrbO_2.id_break(rrbM_22, rRp_12, xc_32, rfH_22, n4, n, (fj_3)object, n5), wK_22, rrxF_22);
            }
            case 7: {
                return rrbO_2.id_class(rrbO_2.id_class(rrbM_22), wK_22, rrxF_22);
            }
            case 8: {
                return rrbO_2.id_class(rrbO_2.id_byte(rrbM_22, rRp_12, xc_32, rfH_22, n4, n, (fj_3)object, n5), wK_22, rrxF_22);
            }
            case 9: {
                return rrbO_2.id_class(rrbO_2.id_protected(rrbM_22, rRp_12, xc_32, rfH_22, n4, n, (fj_3)object, n5), wK_22, rrxF_22);
            }
            case 10: {
                if (n2 == 0) {
                    return rrbO_2.id_class(rrbM_22, (rRq_1)rRp_12, xc_32, rfH_22, n4, n, wK_22, n5, rrxF_22);
                }
            }
            default: {
                return null;
            }
            case 11: {
                return rrbO_2.id_break(rrbM_22, (rRq_1)rRp_12, xc_32, rfH_22, n4, n, wK_22, n5, rrxF_22);
            }
            case 12: {
                return rrbO_2.id_class(rrbM_22, wK_22, rrxF_22);
            }
            case 13: {
                return rrbO_2.id_class(rrbM_22, (rRq_1)rRp_12, xc_32, rfH_22, n, wK_22, rrxF_22);
            }
            case 14: {
                return rrbO_2.id_class(rrbM_22, rfH_22, n, wK_22, rrxF_22);
            }
            case 15: 
        }
        return rrbO_2.id_byte(rrbM_22, rRp_12, xc_32, rfH_22, n4, n, wK_22, n5, rrxF_22);
    }

    private static synchronized wK_2[] id_class(rrbM_2 rrbM_22, rRq_1 rRq_12, xc_3 xc_32, rfH_2 rfH_22, int n, int n2, wK_2 wK_22, int n3, rrxF_2 rrxF_22) {
        fj_3 fj_32 = wK_22.id_case();
        int n4 = rrbO_2.id_break(rrbM_22, rRq_12, xc_32, rfH_22, n, n2, fj_32, n3, rrxF_22);
        return rrbX_2.id_class(n4, rrbM_22, n2, wK_22, rrxF_22);
    }

    private static wK_2 id_class(wK_2 wK_22, fj_3 fj_32) {
        int[] nArray = (int[])wK_22.id_class().clone();
        fj_3 fj_33 = wK_22.id_case();
        for (int i = 0; i < 4; ++i) {
            rrbO_2.id_class(nArray, i, fj_33, fj_32);
        }
        return new wK_2(nArray, wK_22.id_byte(), wK_22.id_protected(), fj_32, wK_22.id_throws());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static wK_2[] id_class(rrbM_2 rrbM_22, rRq_1 rRq_12, xc_3 xc_32, rfH_2 rfH_22, int n, wK_2 wK_22, rrxF_2 rrxF_22) {
        Object var8_9;
        if (!wK_22.id_final()) {
            return null;
        }
        rrJp_1 rrJp_12 = rrxF_22.id_class(rrbM_22.id_char);
        try {
            fj_3 fj_32 = rrbO_2.id_class(rrbM_22, rRq_12, xc_32, rfH_22, n);
            if (fj_32 != null) {
                rrJp_12.id_class(rrbO_2.id_class(fj_32, wK_22, rrbM_22.id_throw), rrbM_22.id_interface);
            }
            var8_9 = null;
        }
        finally {
            if (rrJp_12.id_class() > 0) {
                rrxF_22.id_class(true);
            }
        }
        return var8_9;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static wK_2[] id_class(rrbM_2 rrbM_22, wK_2 wK_22, rrxF_2 rrxF_22) {
        Object var4_5;
        if (!wK_22.id_final()) {
            return null;
        }
        rrJp_1 rrJp_12 = rrxF_22.id_class(rrbM_22.id_char);
        try {
            fj_3 fj_32 = rrbO_2.id_class(rrbM_22);
            if (fj_32 != null) {
                rrJp_12.id_class(rrbO_2.id_class(fj_32, wK_22, rrbM_22.id_throw), rrbM_22.id_interface);
            }
            var4_5 = null;
        }
        finally {
            if (rrJp_12.id_class() > 0) {
                rrxF_22.id_class(true);
            }
        }
        return var4_5;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static wK_2[] id_class(rrbM_2 rrbM_22, rfH_2 rfH_22, int n, wK_2 wK_22, rrxF_2 rrxF_22) {
        Object var6_7;
        if (!wK_22.id_final()) {
            return null;
        }
        rrJp_1 rrJp_12 = rrxF_22.id_class(rrbM_22.id_char);
        try {
            fj_3 fj_32 = rrbO_2.id_class(rrbM_22, rfH_22, n);
            if (fj_32 != null) {
                rrJp_12.id_class(rrbO_2.id_class(fj_32, wK_22, rrbM_22.id_throw), rrbM_22.id_interface);
            }
            var6_7 = null;
        }
        finally {
            if (rrJp_12.id_class() > 0) {
                rrxF_22.id_class(true);
            }
        }
        return var6_7;
    }

    private static synchronized wK_2 id_class(fj_3 fj_32, wK_2 wK_22, int n) {
        if (id_native == null) {
            return null;
        }
        if (fj_32 == null) {
            return null;
        }
        int n2 = fj_32.id_new();
        if (n2 >= 0 && n2 < id_native.length) {
            rpr_3 rpr_32;
            wK_2 wK_23;
            EnumMap<rpr_3, wK_2> enumMap = id_native[n2];
            if (enumMap == null) {
                rrbO_2.id_native[n2] = enumMap = new EnumMap<rpr_3, wK_2>(rpr_3.class);
            }
            if ((wK_23 = (wK_2)enumMap.get(rpr_32 = wK_22.id_protected())) == null) {
                wK_23 = rrJy_1.id_class(rpr_32, fj_32, n);
                enumMap.put(rpr_32, wK_23);
            }
            return wK_23;
        }
        return null;
    }

    private static boolean id_break(rrbM_2 rrbM_22, rRq_1 rRq_12, xc_3 xc_32, rfH_2 rfH_22, int n, fj_3 fj_32, int n2) {
        Object object;
        xc_3 xc_33 = rRq_12.id_byte(rfH_22);
        if (xc_33 == id_private) {
            return false;
        }
        if (rrbM_22.id_byte != null && !rrbM_22.id_class(xc_33.id_continue(), xc_33.id_super())) {
            return false;
        }
        if (rrbM_22.id_public != null && (object = rrbO_2.id_class(rRq_12, xc_32, rfH_22, xc_33, n)) != fj_32) {
            return false;
        }
        object = rfH_22.id_break(rrbO_2.id_class(n));
        xc_3 xc_34 = rRq_12.id_byte((rfH_2)object);
        if (xc_34.id_implements(rRq_12, (rfH_2)object)) {
            return false;
        }
        return n != 1 || xc_34.id_break() != xu_3.Pq;
    }

    private static void id_break(rrbM_2 rrbM_22, List list) {
        if (rrbM_22.id_byte != null) {
            for (int i = 0; i < rrbM_22.id_byte.length; ++i) {
                int n = rrbM_22.id_byte[i].id_class();
                if (n < 0) {
                    rrbb_3.id_protected("Invalid block ID: " + n);
                    continue;
                }
                rrbO_2.id_class(rrbM_22, list, n);
            }
        }
    }

    private static rrGa_1[] id_break(int n, int n2) {
        switch (n) {
            case 0: {
                return id_else;
            }
            case 1: {
                return id_synchronized;
            }
            case 2: {
                return id_return;
            }
            case 3: {
                return id_public;
            }
            case 4: {
                return id_goto;
            }
            case 5: {
                return id_while;
            }
        }
        throw new IllegalArgumentException("Unknown side: " + n);
    }

    private static int id_break(rrbM_2 rrbM_22, rRq_1 rRq_12, xc_3 xc_32, rfH_2 rfH_22, int n, int n2, fj_3 fj_32, int n3, rrxF_2 rrxF_22) {
        boolean[] blArray = rrxF_22.id_implements();
        switch (n2) {
            case 0: {
                blArray[0] = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_byte(), n2, fj_32, n3);
                blArray[1] = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_extends(), n2, fj_32, n3);
                blArray[2] = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_private(), n2, fj_32, n3);
                blArray[3] = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_protected(), n2, fj_32, n3);
                if (!rrbM_22.id_volatile) break;
                rfH_2 rfH_23 = rfH_22.id_break();
                blArray[0] = blArray[0] && !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_23.id_byte(), n2, fj_32, n3);
                blArray[1] = blArray[1] && !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_23.id_extends(), n2, fj_32, n3);
                blArray[2] = blArray[2] && !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_23.id_private(), n2, fj_32, n3);
                blArray[3] = blArray[3] && !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_23.id_protected(), n2, fj_32, n3);
                break;
            }
            case 1: {
                blArray[0] = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_byte(), n2, fj_32, n3);
                blArray[1] = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_extends(), n2, fj_32, n3);
                blArray[2] = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_protected(), n2, fj_32, n3);
                blArray[3] = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_private(), n2, fj_32, n3);
                if (!rrbM_22.id_volatile) break;
                rfH_2 rfH_23 = rfH_22.id_final();
                blArray[0] = blArray[0] && !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_23.id_byte(), n2, fj_32, n3);
                blArray[1] = blArray[1] && !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_23.id_extends(), n2, fj_32, n3);
                blArray[2] = blArray[2] && !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_23.id_protected(), n2, fj_32, n3);
                blArray[3] = blArray[3] && !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_23.id_private(), n2, fj_32, n3);
                break;
            }
            case 2: {
                blArray[0] = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_extends(), n2, fj_32, n3);
                blArray[1] = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_byte(), n2, fj_32, n3);
                blArray[2] = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_break(), n2, fj_32, n3);
                blArray[3] = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_final(), n2, fj_32, n3);
                if (!rrbM_22.id_volatile) break;
                rfH_2 rfH_23 = rfH_22.id_private();
                blArray[0] = blArray[0] && !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_23.id_extends(), n2, fj_32, n3);
                blArray[1] = blArray[1] && !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_23.id_byte(), n2, fj_32, n3);
                blArray[2] = blArray[2] && !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_23.id_break(), n2, fj_32, n3);
                blArray[3] = blArray[3] && !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_23.id_final(), n2, fj_32, n3);
                break;
            }
            case 3: {
                blArray[0] = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_byte(), n2, fj_32, n3);
                blArray[1] = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_extends(), n2, fj_32, n3);
                blArray[2] = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_break(), n2, fj_32, n3);
                blArray[3] = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_final(), n2, fj_32, n3);
                if (!rrbM_22.id_volatile) break;
                rfH_2 rfH_23 = rfH_22.id_protected();
                blArray[0] = blArray[0] && !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_23.id_byte(), n2, fj_32, n3);
                blArray[1] = blArray[1] && !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_23.id_extends(), n2, fj_32, n3);
                blArray[2] = blArray[2] && !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_23.id_break(), n2, fj_32, n3);
                blArray[3] = blArray[3] && !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_23.id_final(), n2, fj_32, n3);
                break;
            }
            case 4: {
                blArray[0] = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_private(), n2, fj_32, n3);
                blArray[1] = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_protected(), n2, fj_32, n3);
                blArray[2] = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_break(), n2, fj_32, n3);
                blArray[3] = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_final(), n2, fj_32, n3);
                if (!rrbM_22.id_volatile) break;
                rfH_2 rfH_23 = rfH_22.id_byte();
                blArray[0] = blArray[0] && !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_23.id_private(), n2, fj_32, n3);
                blArray[1] = blArray[1] && !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_23.id_protected(), n2, fj_32, n3);
                blArray[2] = blArray[2] && !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_23.id_break(), n2, fj_32, n3);
                blArray[3] = blArray[3] && !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_23.id_final(), n2, fj_32, n3);
                break;
            }
            case 5: {
                blArray[0] = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_protected(), n2, fj_32, n3);
                blArray[1] = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_private(), n2, fj_32, n3);
                blArray[2] = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_break(), n2, fj_32, n3);
                blArray[3] = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_final(), n2, fj_32, n3);
                if (!rrbM_22.id_volatile) break;
                rfH_2 rfH_23 = rfH_22.id_extends();
                blArray[0] = blArray[0] && !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_23.id_protected(), n2, fj_32, n3);
                blArray[1] = blArray[1] && !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_23.id_private(), n2, fj_32, n3);
                blArray[2] = blArray[2] && !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_23.id_break(), n2, fj_32, n3);
                blArray[3] = blArray[3] && !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_23.id_final(), n2, fj_32, n3);
            }
        }
        int n4 = 0;
        if (blArray[0] & !blArray[1] & !blArray[2] & !blArray[3]) {
            n4 = 3;
        } else if (!blArray[0] & blArray[1] & !blArray[2] & !blArray[3]) {
            n4 = 1;
        } else if (!blArray[0] & !blArray[1] & blArray[2] & !blArray[3]) {
            n4 = 12;
        } else if (!blArray[0] & !blArray[1] & !blArray[2] & blArray[3]) {
            n4 = 36;
        } else if (blArray[0] & blArray[1] & !blArray[2] & !blArray[3]) {
            n4 = 2;
        } else if (!blArray[0] & !blArray[1] & blArray[2] & blArray[3]) {
            n4 = 24;
        } else if (blArray[0] & !blArray[1] & blArray[2] & !blArray[3]) {
            n4 = 15;
        } else if (blArray[0] & !blArray[1] & !blArray[2] & blArray[3]) {
            n4 = 39;
        } else if (!blArray[0] & blArray[1] & blArray[2] & !blArray[3]) {
            n4 = 13;
        } else if (!blArray[0] & blArray[1] & !blArray[2] & blArray[3]) {
            n4 = 37;
        } else if (!blArray[0] & blArray[1] & blArray[2] & blArray[3]) {
            n4 = 25;
        } else if (blArray[0] & !blArray[1] & blArray[2] & blArray[3]) {
            n4 = 27;
        } else if (blArray[0] & blArray[1] & !blArray[2] & blArray[3]) {
            n4 = 38;
        } else if (blArray[0] & blArray[1] & blArray[2] & !blArray[3]) {
            n4 = 14;
        } else if (blArray[0] & blArray[1] & blArray[2] & blArray[3]) {
            n4 = 26;
        }
        if (n4 == 0) {
            return n4;
        }
        if (!rrbb_3.rP()) {
            return n4;
        }
        switch (n2) {
            case 0: {
                blArray[0] = !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_extends().id_private(), n2, fj_32, n3);
                blArray[1] = !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_byte().id_private(), n2, fj_32, n3);
                blArray[2] = !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_extends().id_protected(), n2, fj_32, n3);
                boolean bl = blArray[3] = !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_byte().id_protected(), n2, fj_32, n3);
                if (!rrbM_22.id_volatile) break;
                rfH_2 rfH_24 = rfH_22.id_break();
                blArray[0] = blArray[0] || rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_24.id_extends().id_private(), n2, fj_32, n3);
                blArray[1] = blArray[1] || rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_24.id_byte().id_private(), n2, fj_32, n3);
                blArray[2] = blArray[2] || rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_24.id_extends().id_protected(), n2, fj_32, n3);
                blArray[3] = blArray[3] || rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_24.id_byte().id_protected(), n2, fj_32, n3);
                break;
            }
            case 1: {
                blArray[0] = !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_extends().id_protected(), n2, fj_32, n3);
                blArray[1] = !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_byte().id_protected(), n2, fj_32, n3);
                blArray[2] = !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_extends().id_private(), n2, fj_32, n3);
                boolean bl = blArray[3] = !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_byte().id_private(), n2, fj_32, n3);
                if (!rrbM_22.id_volatile) break;
                rfH_2 rfH_25 = rfH_22.id_final();
                blArray[0] = blArray[0] || rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_25.id_extends().id_protected(), n2, fj_32, n3);
                blArray[1] = blArray[1] || rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_25.id_byte().id_protected(), n2, fj_32, n3);
                blArray[2] = blArray[2] || rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_25.id_extends().id_private(), n2, fj_32, n3);
                blArray[3] = blArray[3] || rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_25.id_byte().id_private(), n2, fj_32, n3);
                break;
            }
            case 2: {
                blArray[0] = !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_byte().id_break(), n2, fj_32, n3);
                blArray[1] = !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_extends().id_break(), n2, fj_32, n3);
                blArray[2] = !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_byte().id_final(), n2, fj_32, n3);
                boolean bl = blArray[3] = !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_extends().id_final(), n2, fj_32, n3);
                if (!rrbM_22.id_volatile) break;
                rfH_2 rfH_26 = rfH_22.id_private();
                blArray[0] = blArray[0] || rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_26.id_byte().id_break(), n2, fj_32, n3);
                blArray[1] = blArray[1] || rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_26.id_extends().id_break(), n2, fj_32, n3);
                blArray[2] = blArray[2] || rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_26.id_byte().id_final(), n2, fj_32, n3);
                blArray[3] = blArray[3] || rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_26.id_extends().id_final(), n2, fj_32, n3);
                break;
            }
            case 3: {
                blArray[0] = !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_extends().id_break(), n2, fj_32, n3);
                blArray[1] = !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_byte().id_break(), n2, fj_32, n3);
                blArray[2] = !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_extends().id_final(), n2, fj_32, n3);
                boolean bl = blArray[3] = !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_byte().id_final(), n2, fj_32, n3);
                if (!rrbM_22.id_volatile) break;
                rfH_2 rfH_27 = rfH_22.id_protected();
                blArray[0] = blArray[0] || rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_27.id_extends().id_break(), n2, fj_32, n3);
                blArray[1] = blArray[1] || rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_27.id_byte().id_break(), n2, fj_32, n3);
                blArray[2] = blArray[2] || rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_27.id_extends().id_final(), n2, fj_32, n3);
                blArray[3] = blArray[3] || rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_27.id_byte().id_final(), n2, fj_32, n3);
                break;
            }
            case 4: {
                blArray[0] = !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_break().id_protected(), n2, fj_32, n3);
                blArray[1] = !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_break().id_private(), n2, fj_32, n3);
                blArray[2] = !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_final().id_protected(), n2, fj_32, n3);
                boolean bl = blArray[3] = !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_final().id_private(), n2, fj_32, n3);
                if (!rrbM_22.id_volatile) break;
                rfH_2 rfH_28 = rfH_22.id_byte();
                blArray[0] = blArray[0] || rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_28.id_break().id_protected(), n2, fj_32, n3);
                blArray[1] = blArray[1] || rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_28.id_break().id_private(), n2, fj_32, n3);
                blArray[2] = blArray[2] || rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_28.id_final().id_protected(), n2, fj_32, n3);
                blArray[3] = blArray[3] || rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_28.id_final().id_private(), n2, fj_32, n3);
                break;
            }
            case 5: {
                blArray[0] = !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_break().id_private(), n2, fj_32, n3);
                blArray[1] = !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_break().id_protected(), n2, fj_32, n3);
                blArray[2] = !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_final().id_private(), n2, fj_32, n3);
                boolean bl = blArray[3] = !rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_final().id_protected(), n2, fj_32, n3);
                if (!rrbM_22.id_volatile) break;
                rfH_2 rfH_29 = rfH_22.id_extends();
                blArray[0] = blArray[0] || rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_29.id_break().id_private(), n2, fj_32, n3);
                blArray[1] = blArray[1] || rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_29.id_break().id_protected(), n2, fj_32, n3);
                blArray[2] = blArray[2] || rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_29.id_final().id_private(), n2, fj_32, n3);
                boolean bl2 = blArray[3] = blArray[3] || rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_29.id_final().id_protected(), n2, fj_32, n3);
            }
        }
        if (n4 == 13 && blArray[0]) {
            n4 = 4;
        } else if (n4 == 15 && blArray[1]) {
            n4 = 5;
        } else if (n4 == 37 && blArray[2]) {
            n4 = 16;
        } else if (n4 == 39 && blArray[3]) {
            n4 = 17;
        } else if (n4 == 14 && blArray[0] && blArray[1]) {
            n4 = 7;
        } else if (n4 == 25 && blArray[0] && blArray[2]) {
            n4 = 6;
        } else if (n4 == 27 && blArray[3] && blArray[1]) {
            n4 = 19;
        } else if (n4 == 38 && blArray[3] && blArray[2]) {
            n4 = 18;
        } else if (n4 == 14 && !blArray[0] && blArray[1]) {
            n4 = 31;
        } else if (n4 == 25 && blArray[0] && !blArray[2]) {
            n4 = 30;
        } else if (n4 == 27 && !blArray[3] && blArray[1]) {
            n4 = 41;
        } else if (n4 == 38 && blArray[3] && !blArray[2]) {
            n4 = 40;
        } else if (n4 == 14 && blArray[0] && !blArray[1]) {
            n4 = 29;
        } else if (n4 == 25 && !blArray[0] && blArray[2]) {
            n4 = 28;
        } else if (n4 == 27 && blArray[3] && !blArray[1]) {
            n4 = 43;
        } else if (n4 == 38 && !blArray[3] && blArray[2]) {
            n4 = 42;
        } else if (n4 == 26 && blArray[0] && blArray[1] && blArray[2] && blArray[3]) {
            n4 = 46;
        } else if (n4 == 26 && !blArray[0] && blArray[1] && blArray[2] && blArray[3]) {
            n4 = 9;
        } else if (n4 == 26 && blArray[0] && !blArray[1] && blArray[2] && blArray[3]) {
            n4 = 21;
        } else if (n4 == 26 && blArray[0] && blArray[1] && !blArray[2] && blArray[3]) {
            n4 = 8;
        } else if (n4 == 26 && blArray[0] && blArray[1] && blArray[2] && !blArray[3]) {
            n4 = 20;
        } else if (n4 == 26 && blArray[0] && blArray[1] && !blArray[2] && !blArray[3]) {
            n4 = 11;
        } else if (n4 == 26 && !blArray[0] && !blArray[1] && blArray[2] && blArray[3]) {
            n4 = 22;
        } else if (n4 == 26 && !blArray[0] && blArray[1] && !blArray[2] && blArray[3]) {
            n4 = 23;
        } else if (n4 == 26 && blArray[0] && !blArray[1] && blArray[2] && !blArray[3]) {
            n4 = 10;
        } else if (n4 == 26 && blArray[0] && !blArray[1] && !blArray[2] && blArray[3]) {
            n4 = 34;
        } else if (n4 == 26 && !blArray[0] && blArray[1] && blArray[2] && !blArray[3]) {
            n4 = 35;
        } else if (n4 == 26 && blArray[0] && !blArray[1] && !blArray[2] && !blArray[3]) {
            n4 = 32;
        } else if (n4 == 26 && !blArray[0] && blArray[1] && !blArray[2] && !blArray[3]) {
            n4 = 33;
        } else if (n4 == 26 && !blArray[0] && !blArray[1] && blArray[2] && !blArray[3]) {
            n4 = 44;
        } else if (n4 == 26 && !blArray[0] && !blArray[1] && !blArray[2] && blArray[3]) {
            n4 = 45;
        }
        return n4;
    }

    private static fj_3 id_break(rrbM_2 rrbM_22, rRq_1 rRq_12, xc_3 xc_32, rfH_2 rfH_22, int n, int n2, fj_3 fj_32, int n3) {
        boolean bl = false;
        boolean bl2 = false;
        switch (n) {
            case 0: {
                if (n2 == 1) {
                    bl = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_protected(), n2, fj_32, n3);
                    bl2 = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_private(), n2, fj_32, n3);
                    break;
                }
                if (n2 == 0) {
                    bl = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_private(), n2, fj_32, n3);
                    bl2 = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_protected(), n2, fj_32, n3);
                    break;
                }
                bl = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_break(), n2, fj_32, n3);
                bl2 = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_final(), n2, fj_32, n3);
                break;
            }
            case 1: {
                if (n2 == 3) {
                    bl = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_break(), n2, fj_32, n3);
                    bl2 = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_final(), n2, fj_32, n3);
                    break;
                }
                if (n2 == 2) {
                    bl = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_final(), n2, fj_32, n3);
                    bl2 = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_break(), n2, fj_32, n3);
                    break;
                }
                bl = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_protected(), n2, fj_32, n3);
                bl2 = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_private(), n2, fj_32, n3);
                break;
            }
            case 2: {
                if (n2 == 5) {
                    bl = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_final(), n2, fj_32, n3);
                    bl2 = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_break(), n2, fj_32, n3);
                    break;
                }
                if (n2 == 4) {
                    bl = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_break(), n2, fj_32, n3);
                    bl2 = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_final(), n2, fj_32, n3);
                    break;
                }
                bl = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_byte(), n2, fj_32, n3);
                bl2 = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_extends(), n2, fj_32, n3);
            }
        }
        int n4 = 3;
        n4 = bl ? (bl2 ? 1 : 2) : (bl2 ? 0 : 3);
        return rrbM_22.id_goto[n4];
    }

    public static void id_break(fJ_2 fJ_22) {
        rrbO_2.id_class(id_final, fJ_22);
        rrbO_2.id_class(id_package, fJ_22);
        id_this = rrbO_2.id_class(fJ_22, id_implements);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static wK_2[] id_break(rrbM_2 rrbM_22, rRq_1 rRq_12, xc_3 xc_32, rfH_2 rfH_22, int n, int n2, wK_2 wK_22, int n3, rrxF_2 rrxF_22) {
        Object var13_28;
        if (!wK_22.id_final()) {
            return null;
        }
        fj_3 fj_32 = wK_22.id_case();
        rrGa_1[] rrGa_1Array = rrbO_2.id_break(n2, n);
        boolean[] blArray = rrxF_22.id_implements();
        for (int i = 0; i < 4; ++i) {
            blArray[i] = rrbO_2.id_class(rrbM_22, rRq_12, xc_32, rrGa_1Array[i].id_class(rfH_22), n2, fj_32, n3);
        }
        rrJp_1 rrJp_12 = rrxF_22.id_class(rrbM_22.id_char);
        try {
            if (!(blArray[0] && blArray[1] && blArray[2] && blArray[3])) {
                if (blArray[0] && blArray[1] && blArray[2]) {
                    rrJp_12.id_class(rrbO_2.id_class(rrbM_22.id_goto[5], wK_22, rrbM_22.id_throw), rrbM_22.id_interface);
                    wK_2[] wK_2Array = null;
                    return wK_2Array;
                }
                if (blArray[0] && blArray[2] && blArray[3]) {
                    rrJp_12.id_class(rrbO_2.id_class(rrbM_22.id_goto[6], wK_22, rrbM_22.id_throw), rrbM_22.id_interface);
                    wK_2[] wK_2Array = null;
                    return wK_2Array;
                }
                if (blArray[1] && blArray[2] && blArray[3]) {
                    rrJp_12.id_class(rrbO_2.id_class(rrbM_22.id_goto[12], wK_22, rrbM_22.id_throw), rrbM_22.id_interface);
                    wK_2[] wK_2Array = null;
                    return wK_2Array;
                }
                if (blArray[0] && blArray[1] && blArray[3]) {
                    rrJp_12.id_class(rrbO_2.id_class(rrbM_22.id_goto[13], wK_22, rrbM_22.id_throw), rrbM_22.id_interface);
                    wK_2[] wK_2Array = null;
                    return wK_2Array;
                }
                rrGa_1[] rrGa_1Array2 = rrbO_2.id_byte(n2, n);
                boolean[] blArray2 = rrxF_22.id_finally();
                for (int i = 0; i < 4; ++i) {
                    blArray2[i] = rrbO_2.id_class(rrbM_22, rRq_12, xc_32, rrGa_1Array2[i].id_class(rfH_22), n2, fj_32, n3);
                }
                if (blArray[1] && blArray[2]) {
                    rrJp_12.id_class(rrbO_2.id_class(rrbM_22.id_goto[3], wK_22, rrbM_22.id_throw), rrbM_22.id_interface);
                    if (blArray2[3]) {
                        rrJp_12.id_class(rrbO_2.id_class(rrbM_22.id_goto[16], wK_22, rrbM_22.id_throw), rrbM_22.id_interface);
                    }
                    wK_2[] wK_2Array = null;
                    return wK_2Array;
                }
                if (blArray[0] && blArray[2]) {
                    rrJp_12.id_class(rrbO_2.id_class(rrbM_22.id_goto[4], wK_22, rrbM_22.id_throw), rrbM_22.id_interface);
                    if (blArray2[2]) {
                        rrJp_12.id_class(rrbO_2.id_class(rrbM_22.id_goto[14], wK_22, rrbM_22.id_throw), rrbM_22.id_interface);
                    }
                    wK_2[] wK_2Array = null;
                    return wK_2Array;
                }
                if (blArray[1] && blArray[3]) {
                    rrJp_12.id_class(rrbO_2.id_class(rrbM_22.id_goto[10], wK_22, rrbM_22.id_throw), rrbM_22.id_interface);
                    if (blArray2[1]) {
                        rrJp_12.id_class(rrbO_2.id_class(rrbM_22.id_goto[2], wK_22, rrbM_22.id_throw), rrbM_22.id_interface);
                    }
                    wK_2[] wK_2Array = null;
                    return wK_2Array;
                }
                if (blArray[0] && blArray[3]) {
                    rrJp_12.id_class(rrbO_2.id_class(rrbM_22.id_goto[11], wK_22, rrbM_22.id_throw), rrbM_22.id_interface);
                    if (blArray2[0]) {
                        rrJp_12.id_class(rrbO_2.id_class(rrbM_22.id_goto[0], wK_22, rrbM_22.id_throw), rrbM_22.id_interface);
                    }
                    wK_2[] wK_2Array = null;
                    return wK_2Array;
                }
                boolean[] blArray3 = rrxF_22.id_extends();
                for (int i = 0; i < 4; ++i) {
                    blArray3[i] = rrbO_2.id_break(rrbM_22, rRq_12, xc_32, rrGa_1Array[i].id_class(rfH_22), n2, fj_32, n3);
                }
                if (blArray[0]) {
                    rrJp_12.id_class(rrbO_2.id_class(rrbM_22.id_goto[9], wK_22, rrbM_22.id_throw), rrbM_22.id_interface);
                }
                if (blArray[1]) {
                    rrJp_12.id_class(rrbO_2.id_class(rrbM_22.id_goto[7], wK_22, rrbM_22.id_throw), rrbM_22.id_interface);
                }
                if (blArray[2]) {
                    rrJp_12.id_class(rrbO_2.id_class(rrbM_22.id_goto[1], wK_22, rrbM_22.id_throw), rrbM_22.id_interface);
                }
                if (blArray[3]) {
                    rrJp_12.id_class(rrbO_2.id_class(rrbM_22.id_goto[15], wK_22, rrbM_22.id_throw), rrbM_22.id_interface);
                }
                if (blArray2[0] && (blArray3[1] || blArray3[2]) && !blArray[1] && !blArray[2]) {
                    rrJp_12.id_class(rrbO_2.id_class(rrbM_22.id_goto[0], wK_22, rrbM_22.id_throw), rrbM_22.id_interface);
                }
                if (blArray2[1] && (blArray3[0] || blArray3[2]) && !blArray[0] && !blArray[2]) {
                    rrJp_12.id_class(rrbO_2.id_class(rrbM_22.id_goto[2], wK_22, rrbM_22.id_throw), rrbM_22.id_interface);
                }
                if (blArray2[2] && (blArray3[1] || blArray3[3]) && !blArray[1] && !blArray[3]) {
                    rrJp_12.id_class(rrbO_2.id_class(rrbM_22.id_goto[14], wK_22, rrbM_22.id_throw), rrbM_22.id_interface);
                }
                if (blArray2[3] && (blArray3[0] || blArray3[3]) && !blArray[0] && !blArray[3]) {
                    rrJp_12.id_class(rrbO_2.id_class(rrbM_22.id_goto[16], wK_22, rrbM_22.id_throw), rrbM_22.id_interface);
                }
                wK_2[] wK_2Array = null;
                return wK_2Array;
            }
            rrJp_12.id_class(rrbO_2.id_class(rrbM_22.id_goto[8], wK_22, rrbM_22.id_throw), rrbM_22.id_interface);
            var13_28 = null;
        }
        finally {
            if (rrJp_12.id_class() > 0) {
                rrxF_22.id_class(true);
            }
        }
        return var13_28;
    }

    private static boolean id_break() {
        Object object;
        int n;
        ArrayList<rrbM_2> arrayList = new ArrayList<rrbM_2>();
        for (n = 0; n < id_package.length; ++n) {
            object = id_package[n];
            if (object == null) continue;
            arrayList.addAll(Arrays.asList(object));
        }
        for (n = 0; n < id_final.length; ++n) {
            object = id_final[n];
            if (object == null) continue;
            arrayList.addAll(Arrays.asList(object));
        }
        rrbM_2[] rrbM_2Array = arrayList.toArray(new rrbM_2[arrayList.size()]);
        object = new HashSet();
        HashSet<fj_3> hashSet = new HashSet<fj_3>();
        for (int i = 0; i < rrbM_2Array.length; ++i) {
            rrbM_2 rrbM_22 = rrbM_2Array[i];
            if (rrbM_22.id_public != null) {
                object.addAll(Arrays.asList(rrbM_22.id_public));
            }
            if (rrbM_22.id_goto == null) continue;
            hashSet.addAll(Arrays.asList(rrbM_22.id_goto));
        }
        object.retainAll(hashSet);
        return !object.isEmpty();
    }

    private static fj_3 id_throws(rrbM_2 rrbM_22, rRq_1 rRq_12, xc_3 xc_32, rfH_2 rfH_22, int n, int n2, fj_3 fj_32, int n3) {
        boolean bl = false;
        switch (n) {
            case 0: {
                if (n2 == 1 || n2 == 0) {
                    return null;
                }
                bl = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_final(), n2, fj_32, n3);
                break;
            }
            case 1: {
                if (n2 == 3 || n2 == 2) {
                    return null;
                }
                bl = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_protected(), n2, fj_32, n3);
                break;
            }
            case 2: {
                if (n2 == 5 || n2 == 4) {
                    return null;
                }
                bl = rrbO_2.id_byte(rrbM_22, rRq_12, xc_32, rfH_22.id_extends(), n2, fj_32, n3);
            }
        }
        return bl ? rrbM_22.id_goto[0] : null;
    }

    private static fj_3 id_protected(rrbM_2 rrbM_22, rRq_1 rRq_12, xc_3 xc_32, rfH_2 rfH_22, int n, int n2, fj_3 fj_32, int n3) {
        fj_3[] fj_3Array = rrbM_22.id_goto;
        fj_3 fj_33 = rrbO_2.id_break(rrbM_22, rRq_12, xc_32, rfH_22, n, n2, fj_32, n3);
        if (fj_33 != null && fj_33 != fj_32 && fj_33 != fj_3Array[3]) {
            return fj_33;
        }
        fj_3 fj_34 = rrbO_2.id_class(rrbM_22, rRq_12, xc_32, rfH_22, n, n2, fj_32, n3);
        if (fj_34 == fj_3Array[0]) {
            return fj_3Array[4];
        }
        if (fj_34 == fj_3Array[1]) {
            return fj_3Array[5];
        }
        return fj_34 == fj_3Array[2] ? fj_3Array[6] : fj_34;
    }
}

