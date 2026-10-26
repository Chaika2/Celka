/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.FC;
import celestial.FH;
import celestial.FO;
import celestial.FQ;
import celestial.Fc_1;
import celestial.Fh_1;
import celestial.Fl_1;
import celestial.Fm_1;
import celestial.Fn_1;
import celestial.Fq_1;
import celestial.Fu_1;
import celestial.Fv_1;
import celestial.Fy_1;
import celestial.QY;
import celestial.ZV;
import celestial.Zn_1;
import celestial.an_3;
import celestial.cb_3;
import celestial.gm_3;
import celestial.rAC;
import celestial.rAI;
import celestial.rRR;
import celestial.rfH_2;
import celestial.rqO_2;
import celestial.rrJf_1;
import celestial.rrbL_2;
import celestial.rrbb_3;
import celestial.rrbn_3;
import celestial.rrzE_2;
import celestial.rrzM_2;
import celestial.vm_3;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class rrbl_3 {
    private static QY id_byte = rrbb_3.X();
    private static rrJf_1 id_protected = null;
    private static rrbL_2[][] id_throws = null;
    public static boolean id_class = rrbl_3.id_byte();
    public static boolean id_break = rrbl_3.id_protected();

    private static boolean id_byte() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(2) + 1 == 12 && calendar.get(5) >= 24 && calendar.get(5) <= 26;
    }

    private static rqO_2 id_class(rrbn_3 rrbn_32, rfH_2 rfH_22, rRR rRR2, rqO_2 rqO_22, vm_3 vm_32) {
        rrbL_2[] rrbL_2Array = id_throws[rrbn_32.ordinal()];
        if (rrbL_2Array == null) {
            return rqO_22;
        }
        for (int i = 0; i < rrbL_2Array.length; ++i) {
            rrbL_2 rrbL_22 = rrbL_2Array[i];
            if (!rrbL_22.id_class(rrbn_32, rfH_22, rRR2, vm_32)) continue;
            return rrbL_22.id_class(rqO_22);
        }
        return rqO_22;
    }

    private static void id_class(rrbL_2 rrbL_22, List<List<rrbL_2>> list) {
        if (rrbL_22.id_class() == null) {
            rrbl_3.id_class("Invalid container: " + rrbL_22.id_class());
        } else {
            int n = rrbL_22.id_class().ordinal();
            while (list.size() <= n) {
                list.add(null);
            }
            List<rrbL_2> list2 = list.get(n);
            if (list2 == null) {
                list2 = new ArrayList<rrbL_2>();
                list.set(n, list2);
            }
            list2.add(rrbL_22);
        }
    }

    public static void id_class(rrJf_1 rrJf_12) {
        id_protected = rrJf_12;
    }

    public static rqO_2 id_class(rqO_2 rqO_22) {
        if (id_throws == null) {
            return rqO_22;
        }
        vm_3 vm_32 = (vm_3)rrbl_3.id_byte.id_class[73];
        if (!(vm_32 instanceof Fu_1)) {
            return rqO_22;
        }
        if (rqO_22.id_byte().equals("minecraft") && rqO_22.id_break().startsWith("textures/gui/")) {
            an_3 an_32;
            if (id_protected == null) {
                return rqO_22;
            }
            gm_3 gm_32 = (gm_3)rrbl_3.id_byte.id_class[56];
            if (gm_32 == null) {
                return rqO_22;
            }
            if (vm_32 instanceof Fv_1) {
                return rrbl_3.id_class(rrbn_3.CREATIVE, ((cb_3)rrbl_3.id_byte.id_class[57]).Bs(), gm_32, rqO_22, vm_32);
            }
            if (vm_32 instanceof FH) {
                return rrbl_3.id_class(rrbn_3.INVENTORY, ((cb_3)rrbl_3.id_byte.id_class[57]).Bs(), gm_32, rqO_22, vm_32);
            }
            rfH_2 rfH_22 = id_protected.id_continue();
            if (rfH_22 != null) {
                if (vm_32 instanceof FO) {
                    return rrbl_3.id_class(rrbn_3.ANVIL, rfH_22, gm_32, rqO_22, vm_32);
                }
                if (vm_32 instanceof Fh_1) {
                    return rrbl_3.id_class(rrbn_3.BEACON, rfH_22, gm_32, rqO_22, vm_32);
                }
                if (vm_32 instanceof FQ) {
                    return rrbl_3.id_class(rrbn_3.BREWING_STAND, rfH_22, gm_32, rqO_22, vm_32);
                }
                if (vm_32 instanceof Fc_1) {
                    return rrbl_3.id_class(rrbn_3.CHEST, rfH_22, gm_32, rqO_22, vm_32);
                }
                if (vm_32 instanceof Fm_1) {
                    return rrbl_3.id_class(rrbn_3.CRAFTING, rfH_22, gm_32, rqO_22, vm_32);
                }
                if (vm_32 instanceof Fn_1) {
                    return rrbl_3.id_class(rrbn_3.DISPENSER, rfH_22, gm_32, rqO_22, vm_32);
                }
                if (vm_32 instanceof Zn_1) {
                    return rrbl_3.id_class(rrbn_3.ENCHANTMENT, rfH_22, gm_32, rqO_22, vm_32);
                }
                if (vm_32 instanceof FC) {
                    return rrbl_3.id_class(rrbn_3.FURNACE, rfH_22, gm_32, rqO_22, vm_32);
                }
                if (vm_32 instanceof ZV) {
                    return rrbl_3.id_class(rrbn_3.HOPPER, rfH_22, gm_32, rqO_22, vm_32);
                }
                if (vm_32 instanceof Fq_1) {
                    return rrbl_3.id_class(rrbn_3.SHULKER_BOX, rfH_22, gm_32, rqO_22, vm_32);
                }
            }
            if ((an_32 = id_protected.id_super()) != null) {
                if (vm_32 instanceof Fl_1) {
                    return rrbl_3.id_class(rrbn_3.HORSE, an_32, gm_32, rqO_22);
                }
                if (vm_32 instanceof Fy_1) {
                    return rrbl_3.id_class(rrbn_3.VILLAGER, an_32, gm_32, rqO_22);
                }
            }
            return rqO_22;
        }
        return rqO_22;
    }

    private static void id_class(String string) {
        rrbb_3.id_protected("[CustomGuis] " + string);
    }

    private static rqO_2 id_class(rrbn_3 rrbn_32, an_3 an_32, rRR rRR2, rqO_2 rqO_22) {
        rrbL_2[] rrbL_2Array = id_throws[rrbn_32.ordinal()];
        if (rrbL_2Array == null) {
            return rqO_22;
        }
        for (int i = 0; i < rrbL_2Array.length; ++i) {
            rrbL_2 rrbL_22 = rrbL_2Array[i];
            if (!rrbL_22.id_class(rrbn_32, an_32, rRR2)) continue;
            return rrbL_22.id_class(rqO_22);
        }
        return rqO_22;
    }

    public static void id_class() {
        id_throws = null;
        if (rrbb_3.rl()) {
            ArrayList<List<rrbL_2>> arrayList = new ArrayList<List<rrbL_2>>();
            rAC[] rACArray = rrbb_3.d();
            for (int i = rACArray.length - 1; i >= 0; --i) {
                rAC rAC2 = rACArray[i];
                rrbl_3.id_class(rAC2, arrayList);
            }
            id_throws = rrbl_3.id_class(arrayList);
        }
    }

    private static rrbL_2[][] id_class(List<List<rrbL_2>> list) {
        if (list.isEmpty()) {
            return null;
        }
        rrbL_2[][] rrbL_2Array = new rrbL_2[rrbn_3.values().length][];
        for (int i = 0; i < rrbL_2Array.length; ++i) {
            List<rrbL_2> list2;
            if (list.size() <= i || (list2 = list.get(i)) == null) continue;
            rrbL_2[] rrbL_2Array2 = list2.toArray(new rrbL_2[list2.size()]);
            rrbL_2Array[i] = rrbL_2Array2;
        }
        return rrbL_2Array;
    }

    private static void id_class(rAC rAC2, List<List<rrbL_2>> list) {
        String[] stringArray = rrzM_2.id_class(rAC2, "optifine/gui/container/", ".properties", (String[])null);
        Arrays.sort(stringArray);
        for (int i = 0; i < stringArray.length; ++i) {
            String string = stringArray[i];
            rrbb_3.id_byte("CustomGuis: " + string);
            try {
                rqO_2 rqO_22 = new rqO_2(string);
                InputStream inputStream = rAC2.id_class(rAI.CLIENT_RESOURCES, rqO_22);
                if (inputStream == null) {
                    rrbb_3.id_protected("CustomGuis file not found: " + string);
                    continue;
                }
                rrzE_2 rrzE_22 = new rrzE_2();
                rrzE_22.load(inputStream);
                inputStream.close();
                rrbL_2 rrbL_22 = new rrbL_2(rrzE_22, string);
                if (!rrbL_22.id_class(string)) continue;
                rrbl_3.id_class(rrbL_22, list);
                continue;
            }
            catch (FileNotFoundException fileNotFoundException) {
                rrbb_3.id_protected("CustomGuis file not found: " + string);
                continue;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public static rrJf_1 id_break() {
        return id_protected;
    }

    private static boolean id_protected() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(2) + 1 == 4 && calendar.get(5) == 1;
    }
}

