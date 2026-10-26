/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.eC_2;
import celestial.rVL;
import celestial.rdJ_2;
import celestial.rdN_2;
import celestial.rdQ_2;
import celestial.rdW_2;
import celestial.rdZ_2;
import celestial.rdb_3;
import celestial.rdc_3;
import celestial.rdd_3;
import celestial.rdk_3;
import celestial.rdm_3;
import celestial.rdn_3;
import celestial.rdu_3;
import celestial.rdx_3;
import celestial.rdz_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rqs_3;

public abstract class rdX_2 {
    public static final rdX_2[] id_class = new rdX_2[12];
    public static final rdX_2 id_break = new rdJ_2(0, "buildingBlocks").id_break("building_blocks");
    public static final rdX_2 id_byte = new rdW_2(1, "decorations");
    public static final rdX_2 id_protected = new rdz_3(2, "redstone");
    public static final rdX_2 id_throws = new rdQ_2(3, "transportation");
    public static final rdX_2 id_case = new rdN_2(6, "misc");
    public static final rdX_2 id_catch = new rdc_3(5, "search").id_class("item_search.png");
    public static final rdX_2 id_private = new rdu_3(7, "food");
    public static final rdX_2 id_implements = new rdm_3(8, "tools").id_class(eC_2.VANISHABLE, eC_2.DIGGER, eC_2.FISHING_ROD, eC_2.BREAKABLE);
    public static final rdX_2 id_finally = new rdZ_2(9, "combat").id_class(eC_2.VANISHABLE, eC_2.ARMOR, eC_2.ARMOR_FEET, eC_2.ARMOR_HEAD, eC_2.ARMOR_LEGS, eC_2.ARMOR_CHEST, eC_2.BOW, eC_2.WEAPON, eC_2.WEARABLE, eC_2.BREAKABLE, eC_2.TRIDENT, eC_2.CROSSBOW);
    public static final rdX_2 id_extends = new rdx_3(10, "brewing");
    public static final rdX_2 id_native = id_case;
    public static final rdX_2 id_volatile = new rdd_3(4, "hotbar");
    public static final rdX_2 id_final = new rdk_3(11, "inventory").id_class("inventory.png").id_finally().id_private();
    private final int id_package;
    private final String id_int;
    private final rgP_2 id_new;
    private String id_continue;
    private String id_super = "items.png";
    private boolean id_this = true;
    private boolean id_else = true;
    private eC_2[] id_synchronized = new eC_2[0];
    private rdn_3 id_return;

    public rgP_2 id_byte() {
        return this.id_new;
    }

    public rdX_2(int n, String string) {
        this.id_package = n;
        this.id_int = string;
        this.id_new = new rgn_3("itemGroup." + string);
        this.id_return = rdn_3.id_break;
        rdX_2.id_class[n] = this;
    }

    public rdX_2 id_class(eC_2 ... eC_2Array) {
        this.id_synchronized = eC_2Array;
        return this;
    }

    public boolean id_class(eC_2 eC_22) {
        if (eC_22 != null) {
            for (eC_2 eC_23 : this.id_synchronized) {
                if (eC_23 != eC_22) continue;
                return true;
            }
        }
        return false;
    }

    public int id_class() {
        return this.id_package;
    }

    public void id_class(rqs_3<rdn_3> rqs_32) {
        for (rdb_3 rdb_32 : rVL.id_for) {
            rdb_32.id_class(this, rqs_32);
        }
    }

    public rdX_2 id_class(String string) {
        this.id_super = string;
        return this;
    }

    public rdX_2 id_break(String string) {
        this.id_continue = string;
        return this;
    }

    public String id_break() {
        return this.id_continue == null ? this.id_int : this.id_continue;
    }

    public abstract rdn_3 id_throws();

    public rdX_2 id_finally() {
        this.id_this = false;
        return this;
    }

    public boolean id_catch() {
        return this.id_else;
    }

    public int id_extends() {
        return this.id_package % 6;
    }

    public String id_case() {
        return this.id_super;
    }

    public boolean id_implements() {
        return this.id_this;
    }

    public rdn_3 id_protected() {
        if (this.id_return.id_class()) {
            this.id_return = this.id_throws();
        }
        return this.id_return;
    }

    public rdX_2 id_private() {
        this.id_else = false;
        return this;
    }

    public eC_2[] id_final() {
        return this.id_synchronized;
    }

    public boolean id_volatile() {
        return this.id_extends() == 5;
    }

    public boolean id_native() {
        return this.id_package < 6;
    }
}

