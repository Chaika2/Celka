/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.aL_2;
import celestial.an_3;
import celestial.eC_2;
import celestial.eF_2;
import celestial.iB_2;
import celestial.rVL;
import celestial.rXQ;
import celestial.rdn_3;
import celestial.rgF_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rqR_2;
import celestial.rye_3;
import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.Map;

public abstract class ev_3 {
    private final rXQ[] id_class;
    private final eF_2 id_protected;
    public final eC_2 id_break;
    protected String id_byte;

    public boolean id_byte() {
        return false;
    }

    public static ev_3 id_byte(int n) {
        return (ev_3)rVL.id_boolean.id_class(n);
    }

    protected ev_3(eF_2 eF_22, eC_2 eC_22, rXQ[] rXQArray) {
        this.id_protected = eF_22;
        this.id_break = eC_22;
        this.id_class = rXQArray;
    }

    public float id_class(int n, aL_2 aL_22) {
        return 0.0f;
    }

    protected boolean id_class(ev_3 ev_32) {
        return this != ev_32;
    }

    public int id_class(int n, rye_3 rye_32) {
        return 0;
    }

    public boolean id_class(rdn_3 rdn_32) {
        return this.id_break.id_class(rdn_32.id_break());
    }

    public void id_class(iB_2 iB_22, an_3 an_32, int n) {
    }

    public int id_class() {
        return 1;
    }

    public int id_class(int n) {
        return 1 + n * 10;
    }

    public Map<rXQ, rdn_3> id_class(iB_2 iB_22) {
        EnumMap enumMap = Maps.newEnumMap(rXQ.class);
        for (rXQ rXQ2 : this.id_class) {
            rdn_3 rdn_32 = iB_22.id_class(rXQ2);
            if (rdn_32.id_class()) continue;
            enumMap.put(rXQ2, rdn_32);
        }
        return enumMap;
    }

    public boolean id_break() {
        return false;
    }

    public void id_break(iB_2 iB_22, an_3 an_32, int n) {
    }

    public int id_break(int n) {
        return this.id_class(n) + 5;
    }

    public final boolean id_break(ev_3 ev_32) {
        return this.id_class(ev_32) && ev_32.id_class(this);
    }

    public int id_throws() {
        return 1;
    }

    public String id_catch() {
        return this.id_case();
    }

    protected String id_case() {
        if (this.id_byte == null) {
            this.id_byte = rqR_2.id_class("enchantment", rVL.id_boolean.id_break(this));
        }
        return this.id_byte;
    }

    public boolean id_implements() {
        return true;
    }

    public rgP_2 id_protected(int n) {
        rgn_3 rgn_32 = new rgn_3(this.id_catch());
        if (this.id_byte()) {
            rgn_32.id_class(rgF_2.RED);
        } else {
            rgn_32.id_class(rgF_2.GRAY);
        }
        if (n != 1 || this.id_class() != 1) {
            rgn_32.id_break(" ").id_class(new rgn_3("enchantment.level." + n));
        }
        return rgn_32;
    }

    public eF_2 id_protected() {
        return this.id_protected;
    }

    public boolean id_private() {
        return true;
    }
}

