/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rCt_1;
import celestial.rHC;
import celestial.rHO;
import celestial.rHl_1;
import celestial.rHq_1;
import celestial.rHu_1;
import celestial.rOD;
import celestial.rOa_1;
import celestial.rOi_1;
import celestial.rRR;
import celestial.rRp_1;
import celestial.rYG;
import celestial.rfH_2;
import celestial.rgP_2;
import celestial.rhE_2;
import celestial.rhP_2;
import celestial.rqO_2;
import celestial.rrMC;
import celestial.rrMH;
import celestial.rrMk_1;
import celestial.rrMl_1;
import celestial.rrMq_1;
import celestial.rrMz_1;
import celestial.rrbC_2;
import celestial.rrbb_3;
import celestial.rrbl_3;
import celestial.rrbn_3;
import celestial.rrzJ_2;
import celestial.rrzX_2;
import celestial.rsT_2;
import celestial.rsp_3;
import celestial.rsq_3;
import celestial.rxL_2;
import celestial.ryO_2;
import celestial.ryQ_2;
import celestial.ryr_3;
import celestial.vm_3;
import celestial.xc_3;
import celestial.xt_3;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class rrbL_2 {
    private String id_class = null;
    private String id_break = null;
    private rrbn_3 id_byte = null;
    private Map<rqO_2, rqO_2> id_protected = null;
    private rrMH id_throws = null;
    private rrMk_1[] id_case = null;
    private rrMq_1 id_catch = null;
    private Boolean id_private = null;
    private Boolean id_implements = null;
    private Boolean id_finally = null;
    private Boolean id_extends = null;
    private rrMq_1 id_native = null;
    private rrMC[] id_volatile = null;
    private rrbC_2[] id_final = null;
    private rxL_2[] id_package = null;
    private static final rrbC_2[] id_int = new rrbC_2[]{rrbC_2.HORSE, rrbC_2.DONKEY, rrbC_2.MULE, rrbC_2.LLAMA};
    private static final rrbC_2[] id_new = new rrbC_2[]{rrbC_2.DISPENSER, rrbC_2.DROPPER};
    private static final rrbC_2[] id_continue = new rrbC_2[0];
    private static final rxL_2[] id_super = new rxL_2[0];
    private static final rqO_2 id_this = new rqO_2("textures/gui/container/anvil.png");
    private static final rqO_2 id_else = new rqO_2("textures/gui/container/beacon.png");
    private static final rqO_2 id_synchronized = new rqO_2("textures/gui/container/brewing_stand.png");
    private static final rqO_2 id_return = new rqO_2("textures/gui/container/generic_54.png");
    private static final rqO_2 id_public = new rqO_2("textures/gui/container/crafting_table.png");
    private static final rqO_2 id_goto = new rqO_2("textures/gui/container/horse.png");
    private static final rqO_2 id_while = new rqO_2("textures/gui/container/dispenser.png");
    private static final rqO_2 id_try = new rqO_2("textures/gui/container/enchanting_table.png");
    private static final rqO_2 id_instanceof = new rqO_2("textures/gui/container/furnace.png");
    private static final rqO_2 id_throw = new rqO_2("textures/gui/container/hopper.png");
    private static final rqO_2 id_interface = new rqO_2("textures/gui/container/inventory.png");
    private static final rqO_2 id_char = new rqO_2("textures/gui/container/shulker_box.png");
    private static final rqO_2 id_abstract = new rqO_2("textures/gui/container/villager2.png");

    private static rxL_2 id_byte(String string) {
        if (string == null) {
            return null;
        }
        rxL_2[] rxL_2Array = rxL_2.values();
        for (int i = 0; i < rxL_2Array.length; ++i) {
            rxL_2 rxL_22 = rxL_2Array[i];
            if (rxL_22.id_class().equals(string)) {
                return rxL_22;
            }
            if (!rxL_22.id_byte().equals(string)) continue;
            return rxL_22;
        }
        return null;
    }

    private boolean id_byte(rfH_2 rfH_22, rRp_1 rRp_12) {
        rrbC_2 rrbC_22;
        ryO_2 ryO_22 = rRp_12.id_class(rfH_22);
        if (!(ryO_22 instanceof rHC)) {
            return false;
        }
        rHC rHC2 = (rHC)ryO_22;
        return this.id_final == null || rrbb_3.id_class((Object)(rrbC_22 = this.id_class(rHC2)), (Object[])this.id_final);
    }

    public rrbL_2(Properties properties, String string) {
        rrMz_1 rrMz_12 = new rrMz_1("CustomGuis");
        this.id_class = rrMz_12.id_class(string);
        this.id_break = rrMz_12.id_break(string);
        this.id_byte = (rrbn_3)rrMz_12.id_class(properties.getProperty("container"), rrbn_3.values(), "container");
        this.id_protected = rrbL_2.id_class(properties, "texture", this.id_byte, "textures/gui/", this.id_break);
        this.id_throws = rrMz_12.id_break("name", properties.getProperty("name"));
        this.id_case = rrMz_12.id_case(properties.getProperty("biomes"));
        this.id_catch = rrMz_12.id_native(properties.getProperty("heights"));
        this.id_private = rrMz_12.id_volatile(properties.getProperty("large"));
        this.id_implements = rrMz_12.id_volatile(properties.getProperty("trapped"));
        this.id_finally = rrMz_12.id_volatile(properties.getProperty("christmas"));
        this.id_extends = rrMz_12.id_volatile(properties.getProperty("ender"));
        this.id_native = rrMz_12.id_native(properties.getProperty("levels"));
        this.id_volatile = rrMz_12.id_final(properties.getProperty("professions"));
        Enum[] enumArray = rrbL_2.id_class(this.id_byte);
        this.id_final = (rrbC_2[])rrMz_12.id_class(properties.getProperty("variants"), enumArray, "variants", id_continue);
        this.id_package = rrbL_2.id_break(properties.getProperty("colors"));
    }

    public String toString() {
        return "name: " + this.id_class + ", container: " + this.id_byte + ", textures: " + this.id_protected;
    }

    private static rrbC_2[] id_class(rrbn_3 rrbn_32) {
        if (rrbn_32 == rrbn_3.HORSE) {
            return id_int;
        }
        return rrbn_32 == rrbn_3.DISPENSER ? id_new : new rrbC_2[]{};
    }

    private rrbC_2 id_class(rHC rHC2) {
        return rHC2 instanceof rHl_1 ? rrbC_2.DROPPER : rrbC_2.DISPENSER;
    }

    public boolean id_class(rrbn_3 rrbn_32, an_3 an_32, rRR rRR2) {
        String string;
        if (!this.id_class(rrbn_32, an_32.Bs(), rRR2)) {
            return false;
        }
        if (this.id_throws != null && !this.id_throws.id_class(string = an_32.i())) {
            return false;
        }
        switch (rrbn_32) {
            case HORSE: {
                return this.id_break(an_32, (rRp_1)rRR2);
            }
            case VILLAGER: {
                return this.id_class(an_32, (rRp_1)rRR2);
            }
        }
        return true;
    }

    private boolean id_class(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        if (this.id_private != null && this.id_private != bl) {
            return false;
        }
        if (this.id_implements != null && this.id_implements != bl2) {
            return false;
        }
        if (this.id_finally != null && this.id_finally != bl3) {
            return false;
        }
        return this.id_extends == null || this.id_extends == bl4;
    }

    private boolean id_class(rHq_1 rHq_12, rfH_2 rfH_22, rRp_1 rRp_12) {
        return this.id_class(false, false, false, true);
    }

    private boolean id_class(rHu_1 rHu_12, rfH_2 rfH_22, rRp_1 rRp_12) {
        xc_3 xc_32 = rRp_12.id_byte(rfH_22);
        rCt_1 rCt_12 = xc_32.id_break(xt_3.id_package) ? xc_32.id_byte(xt_3.id_package) : rCt_1.SINGLE;
        boolean bl = rCt_12 != rCt_1.SINGLE;
        boolean bl2 = rHu_12 instanceof ryQ_2;
        boolean bl3 = rrbl_3.id_class;
        boolean bl4 = false;
        return this.id_class(bl, bl2, bl3, bl4);
    }

    public rqO_2 id_class(rqO_2 rqO_22) {
        rqO_2 rqO_23 = this.id_protected.get(rqO_22);
        return rqO_23 == null ? rqO_22 : rqO_23;
    }

    public rrbn_3 id_class() {
        return this.id_byte;
    }

    private rrbC_2 id_class(rOD rOD2) {
        if (rOD2 instanceof rOi_1) {
            return rrbC_2.HORSE;
        }
        if (rOD2 instanceof rOa_1) {
            return rrbC_2.DONKEY;
        }
        if (rOD2 instanceof rhE_2) {
            return rrbC_2.MULE;
        }
        return rOD2 instanceof rhP_2 ? rrbC_2.LLAMA : null;
    }

    private boolean id_class(an_3 an_32, rRp_1 rRp_12) {
        int n;
        rsp_3 rsp_32;
        rsT_2 rsT_22;
        if (!(an_32 instanceof rsq_3)) {
            return false;
        }
        rsq_3 rsq_32 = (rsq_3)an_32;
        return this.id_volatile == null || rrMC.id_class(rsT_22 = (rsp_32 = rsq_32.su()).id_break(), n = rsp_32.id_byte(), this.id_volatile);
    }

    public boolean id_class(rrbn_3 rrbn_32, rfH_2 rfH_22, rRR rRR2, vm_3 vm_32) {
        String string;
        if (!this.id_class(rrbn_32, rfH_22, rRR2)) {
            return false;
        }
        if (this.id_throws != null && !this.id_throws.id_class(string = rrbL_2.id_class(vm_32))) {
            return false;
        }
        switch (rrbn_32) {
            case BEACON: {
                return this.id_class(rfH_22, (rRp_1)rRR2);
            }
            case CHEST: {
                return this.id_break(rfH_22, (rRp_1)rRR2);
            }
            case DISPENSER: {
                return this.id_byte(rfH_22, rRR2);
            }
            case SHULKER_BOX: {
                return this.id_protected(rfH_22, rRR2);
            }
        }
        return true;
    }

    private static rqO_2 id_class(String string, String string2) {
        if (string == null) {
            return null;
        }
        Object object = rrzJ_2.id_class(string = string.trim(), string2);
        if (!((String)object).endsWith(".png")) {
            object = (String)object + ".png";
        }
        return new rqO_2(string2 + "/" + (String)object);
    }

    public boolean id_class(String string) {
        if (this.id_class != null && this.id_class.length() > 0) {
            if (this.id_break == null) {
                rrbL_2.id_protected("No base path found: " + string);
                return false;
            }
            if (this.id_byte == null) {
                rrbL_2.id_protected("No container found: " + string);
                return false;
            }
            if (this.id_protected.isEmpty()) {
                rrbL_2.id_protected("No texture found: " + string);
                return false;
            }
            if (this.id_volatile == rrMz_1.id_class) {
                rrbL_2.id_protected("Invalid professions or careers: " + string);
                return false;
            }
            if (this.id_final == id_continue) {
                rrbL_2.id_protected("Invalid variants: " + string);
                return false;
            }
            if (this.id_package == id_super) {
                rrbL_2.id_protected("Invalid colors: " + string);
                return false;
            }
            return true;
        }
        rrbL_2.id_protected("No name found: " + string);
        return false;
    }

    private static Map<rqO_2, rqO_2> id_class(Properties properties, String string, rrbn_3 rrbn_32, String string2, String string3) {
        Object object;
        HashMap<rqO_2, rqO_2> hashMap = new HashMap<rqO_2, rqO_2>();
        String string4 = properties.getProperty(string);
        if (string4 != null) {
            object = rrbL_2.id_break(rrbn_32);
            rqO_2 rqO_22 = rrbL_2.id_class(string4, string3);
            if (object != null && rqO_22 != null) {
                hashMap.put((rqO_2)object, rqO_22);
            }
        }
        object = string + ".";
        for (String string5 : properties.keySet()) {
            if (!string5.startsWith((String)object)) continue;
            String string6 = string5.substring(((String)object).length());
            string6 = string6.replace('\\', '/');
            string6 = rrzX_2.id_byte(string6, "/", ".png");
            String string7 = string2 + string6 + ".png";
            String string8 = properties.getProperty(string5);
            rqO_2 rqO_23 = new rqO_2(string7);
            rqO_2 rqO_24 = rrbL_2.id_class(string8, string3);
            hashMap.put(rqO_23, rqO_24);
        }
        return hashMap;
    }

    private boolean id_class(rfH_2 rfH_22, rRp_1 rRp_12) {
        int n;
        ryO_2 ryO_22 = rRp_12.id_class(rfH_22);
        if (!(ryO_22 instanceof rHO)) {
            return false;
        }
        rHO rHO2 = (rHO)ryO_22;
        return this.id_native == null || this.id_native.id_class(n = rHO2.id_private());
    }

    public static String id_class(vm_3 vm_32) {
        rgP_2 rgP_22 = vm_32.id_new();
        return rgP_22 == null ? null : rgP_22.id_break();
    }

    private boolean id_class(rrbn_3 rrbn_32, rfH_2 rfH_22, rRR rRR2) {
        rYG rYG2;
        if (this.id_byte != rrbn_32) {
            return false;
        }
        if (this.id_case != null && !rrMl_1.id_class(rYG2 = rRR2.id_implements(rfH_22), this.id_case)) {
            return false;
        }
        return this.id_catch == null || this.id_catch.id_class(rfH_22.c_());
    }

    private static rqO_2 id_break(rrbn_3 rrbn_32) {
        if (rrbn_32 == null) {
            return null;
        }
        switch (rrbn_32) {
            case ANVIL: {
                return id_this;
            }
            case BEACON: {
                return id_else;
            }
            case BREWING_STAND: {
                return id_synchronized;
            }
            case CHEST: {
                return id_return;
            }
            case CRAFTING: {
                return id_public;
            }
            case CREATIVE: {
                return null;
            }
            case DISPENSER: {
                return id_while;
            }
            case ENCHANTMENT: {
                return id_try;
            }
            case FURNACE: {
                return id_instanceof;
            }
            case HOPPER: {
                return id_throw;
            }
            case HORSE: {
                return id_goto;
            }
            case INVENTORY: {
                return id_interface;
            }
            case SHULKER_BOX: {
                return id_char;
            }
            case VILLAGER: {
                return id_abstract;
            }
        }
        return null;
    }

    private boolean id_break(rfH_2 rfH_22, rRp_1 rRp_12) {
        ryO_2 ryO_22 = rRp_12.id_class(rfH_22);
        if (ryO_22 instanceof rHu_1) {
            rHu_1 rHu_12 = (rHu_1)ryO_22;
            return this.id_class(rHu_12, rfH_22, rRp_12);
        }
        if (ryO_22 instanceof rHq_1) {
            rHq_1 rHq_12 = (rHq_1)ryO_22;
            return this.id_class(rHq_12, rfH_22, rRp_12);
        }
        return false;
    }

    private static rxL_2[] id_break(String string) {
        if (string == null) {
            return null;
        }
        string = string.toLowerCase();
        String[] stringArray = rrbb_3.id_class(string, " ");
        rxL_2[] rxL_2Array = new rxL_2[stringArray.length];
        for (int i = 0; i < stringArray.length; ++i) {
            String string2 = stringArray[i];
            rxL_2 rxL_22 = rrbL_2.id_byte(string2);
            if (rxL_22 == null) {
                rrbL_2.id_protected("Invalid color: " + string2);
                return id_super;
            }
            rxL_2Array[i] = rxL_22;
        }
        return rxL_2Array;
    }

    private boolean id_break(an_3 an_32, rRp_1 rRp_12) {
        rxL_2 rxL_22;
        Object object;
        if (!(an_32 instanceof rOD)) {
            return false;
        }
        rOD rOD2 = (rOD)an_32;
        if (this.id_final != null && !rrbb_3.id_class(object = this.id_class(rOD2), (Object[])this.id_final)) {
            return false;
        }
        return this.id_package == null || !(rOD2 instanceof rhP_2) || rrbb_3.id_class((Object)(rxL_22 = ((rhP_2)(object = (rhP_2)rOD2)).sa()), (Object[])this.id_package);
    }

    private boolean id_protected(rfH_2 rfH_22, rRp_1 rRp_12) {
        rxL_2 rxL_22;
        ryO_2 ryO_22 = rRp_12.id_class(rfH_22);
        if (!(ryO_22 instanceof ryr_3)) {
            return false;
        }
        ryr_3 ryr_32 = (ryr_3)ryO_22;
        return this.id_package == null || rrbb_3.id_class((Object)(rxL_22 = ryr_32.id_finally()), (Object[])this.id_package);
    }

    private static void id_protected(String string) {
        rrbb_3.id_protected("[CustomGuis] " + string);
    }
}

