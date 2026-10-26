/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.rRM;
import celestial.rRb_1;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rcy_3;
import celestial.rfU_2;
import celestial.rgB_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgp_3;
import celestial.rgv_3;
import celestial.rgy_3;
import celestial.rhN_2;
import celestial.rqO_2;
import celestial.rrEQ;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class rnx_3
extends rrEQ {
    private final rqO_2 id_class;
    private final Set<UUID> id_break = Sets.newHashSet();
    private int id_finally;
    private int id_extends = 100;

    public void id_byte(rhN_2 rhN_22) {
        if (this.id_break.contains(rhN_22.ro())) {
            this.id_class(rhN_22);
        }
    }

    @Override
    public void id_byte() {
        super.id_byte();
        this.id_break.clear();
    }

    public rnx_3(rqO_2 rqO_22, rgP_2 rgP_22) {
        super(rgP_22, rRb_1.WHITE, rRM.PROGRESS);
        this.id_class = rqO_22;
        this.id_class(0.0f);
    }

    public void id_class(int n) {
        this.id_finally = n;
        this.id_class(rfU_2.id_class((float)n / (float)this.id_extends, 0.0f, 1.0f));
    }

    public boolean id_class(Collection<rhN_2> collection) {
        boolean bl;
        HashSet hashSet = Sets.newHashSet();
        HashSet hashSet2 = Sets.newHashSet();
        for (UUID object : this.id_break) {
            bl = false;
            for (rhN_2 rhN_22 : collection) {
                if (!rhN_22.ro().equals(object)) continue;
                bl = true;
                break;
            }
            if (bl) continue;
            hashSet.add(object);
        }
        for (rhN_2 rhN_23 : collection) {
            bl = false;
            for (UUID uUID : this.id_break) {
                if (!rhN_23.ro().equals(uUID)) continue;
                bl = true;
                break;
            }
            if (bl) continue;
            hashSet2.add(rhN_23);
        }
        for (UUID uUID : hashSet) {
            for (rhN_2 rhN_24 : this.id_int()) {
                if (!rhN_24.ro().equals(uUID)) continue;
                this.id_break(rhN_24);
                break;
            }
            this.id_break.remove(uUID);
        }
        for (rhN_2 rhN_25 : hashSet2) {
            this.id_class(rhN_25);
        }
        return !hashSet.isEmpty() || !hashSet2.isEmpty();
    }

    public static rnx_3 id_class(rcd_3 rcd_32, rqO_2 rqO_22) {
        rnx_3 rnx_32 = new rnx_3(rqO_22, rgB_2.id_class(rcd_32.id_native("Name")));
        rnx_32.id_protected(rcd_32.id_new("Visible"));
        rnx_32.id_class(rcd_32.id_private("Value"));
        rnx_32.id_break(rcd_32.id_private("Max"));
        rnx_32.id_class(rRb_1.id_class(rcd_32.id_native("Color")));
        rnx_32.id_class(rRM.id_class(rcd_32.id_native("Overlay")));
        rnx_32.id_class(rcd_32.id_new("DarkenScreen"));
        rnx_32.id_break(rcd_32.id_new("PlayBossMusic"));
        rnx_32.id_byte(rcd_32.id_new("CreateWorldFog"));
        rcy_3 rcy_32 = rcd_32.id_protected("Players", 11);
        for (int i = 0; i < rcy_32.size(); ++i) {
            rnx_32.id_class(rco_3.id_class(rcy_32.id_finally(i)));
        }
        return rnx_32;
    }

    public void id_class(UUID uUID) {
        this.id_break.add(uUID);
    }

    @Override
    public void id_class(rhN_2 rhN_22) {
        super.id_class(rhN_22);
        this.id_break.add(rhN_22.ro());
    }

    public rqO_2 id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(rhN_2 rhN_22) {
        super.id_break(rhN_22);
        this.id_break.remove(rhN_22.ro());
    }

    public void id_break(int n) {
        this.id_extends = n;
        this.id_class(rfU_2.id_class((float)this.id_finally / (float)n, 0.0f, 1.0f));
    }

    public int id_throws() {
        return this.id_extends;
    }

    public rcd_3 id_catch() {
        rcd_3 rcd_32 = new rcd_3();
        rcd_32.id_class("Name", rgB_2.id_class(this.id_byte));
        rcd_32.id_class("Visible", this.id_package());
        rcd_32.id_break("Value", this.id_finally);
        rcd_32.id_break("Max", this.id_extends);
        rcd_32.id_class("Color", this.id_finally().id_break());
        rcd_32.id_class("Overlay", this.id_extends().id_class());
        rcd_32.id_class("DarkenScreen", this.id_native());
        rcd_32.id_class("PlayBossMusic", this.id_volatile());
        rcd_32.id_class("CreateWorldFog", this.id_final());
        rcy_3 rcy_32 = new rcy_3();
        for (UUID uUID : this.id_break) {
            rcy_32.add(rco_3.id_class(uUID));
        }
        rcd_32.id_class("Players", rcy_32);
        return rcd_32;
    }

    public final rgP_2 id_case() {
        return rgv_3.id_class(this.id_implements()).id_class(rgc_32 -> rgc_32.id_class(this.id_finally().id_class()).id_class(new rgy_3(rgp_3.id_class, new rgN_2(this.id_break().toString()))).id_class(this.id_break().toString()));
    }

    public int id_protected() {
        return this.id_finally;
    }

    public void id_protected(rhN_2 rhN_22) {
        super.id_break(rhN_22);
    }
}

