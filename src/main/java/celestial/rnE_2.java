/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rAi_1;
import celestial.rVi_1;
import celestial.rca_3;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rgB_2;
import celestial.rgF_2;
import celestial.rgP_2;
import celestial.rnB_2;
import celestial.rnP_2;
import celestial.rnX_2;
import celestial.rnh_3;
import celestial.rnr_3;
import celestial.rns_3;
import celestial.rrGc_1;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rnE_2
extends rrGc_1 {
    private static final Logger id_class = LogManager.getLogger();
    private rns_3 id_break;
    private rcd_3 id_byte;

    @Override
    public rcd_3 id_byte(rcd_3 rcd_32) {
        if (this.id_break == null) {
            id_class.warn("Tried to save scoreboard without having a scoreboard...");
            return rcd_32;
        }
        rcd_32.id_class("Objectives", this.id_break());
        rcd_32.id_class("PlayerScores", this.id_break.id_private());
        rcd_32.id_class("Teams", this.id_class());
        this.id_protected(rcd_32);
        return rcd_32;
    }

    public rnE_2() {
        super("scoreboard");
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        if (this.id_break == null) {
            this.id_byte = rcd_32;
        } else {
            this.id_break(rcd_32.id_protected("Objectives", 10));
            this.id_break.id_class(rcd_32.id_protected("PlayerScores", 10));
            if (rcd_32.id_byte("DisplaySlots", 10)) {
                this.id_break(rcd_32.id_int("DisplaySlots"));
            }
            if (rcd_32.id_byte("Teams", 9)) {
                this.id_class(rcd_32.id_protected("Teams", 10));
            }
        }
    }

    public void id_class(rns_3 rns_32) {
        this.id_break = rns_32;
        if (this.id_byte != null) {
            this.id_class(this.id_byte);
        }
    }

    protected rcy_3 id_class() {
        rcy_3 rcy_32 = new rcy_3();
        for (rnB_2 rnB_22 : this.id_break.id_throws()) {
            rcd_3 rcd_32 = new rcd_3();
            rcd_32.id_class("Name", rnB_22.id_class());
            rcd_32.id_class("DisplayName", rgB_2.id_class(rnB_22.id_break()));
            if (rnB_22.id_volatile().id_class() >= 0) {
                rcd_32.id_class("TeamColor", rnB_22.id_volatile().id_throws());
            }
            rcd_32.id_class("AllowFriendlyFire", rnB_22.id_catch());
            rcd_32.id_class("SeeFriendlyInvisibles", rnB_22.id_private());
            rcd_32.id_class("MemberNamePrefix", rgB_2.id_class(rnB_22.id_protected()));
            rcd_32.id_class("MemberNameSuffix", rgB_2.id_class(rnB_22.id_throws()));
            rcd_32.id_class("NameTagVisibility", rnB_22.id_implements().internalName);
            rcd_32.id_class("DeathMessageVisibility", rnB_22.id_finally().internalName);
            rcd_32.id_class("CollisionRule", rnB_22.id_extends().name);
            rcy_3 rcy_33 = new rcy_3();
            for (String string : rnB_22.id_case()) {
                rcy_33.add(rca_3.id_class(string));
            }
            rcd_32.id_class("Players", rcy_33);
            rcy_32.add(rcd_32);
        }
        return rcy_32;
    }

    protected void id_class(rcy_3 rcy_32) {
        for (int i = 0; i < rcy_32.size(); ++i) {
            Object object;
            rcd_3 rcd_32 = rcy_32.id_class(i);
            String string = rcd_32.id_native("Name");
            if (string.length() > 16) {
                string = string.substring(0, 16);
            }
            rnB_2 rnB_22 = this.id_break.id_case(string);
            rVi_1 rVi_12 = rgB_2.id_class(rcd_32.id_native("DisplayName"));
            if (rVi_12 != null) {
                rnB_22.id_class(rVi_12);
            }
            if (rcd_32.id_byte("TeamColor", 8)) {
                rnB_22.id_class(rgF_2.id_break(rcd_32.id_native("TeamColor")));
            }
            if (rcd_32.id_byte("AllowFriendlyFire", 99)) {
                rnB_22.id_class(rcd_32.id_new("AllowFriendlyFire"));
            }
            if (rcd_32.id_byte("SeeFriendlyInvisibles", 99)) {
                rnB_22.id_break(rcd_32.id_new("SeeFriendlyInvisibles"));
            }
            if (rcd_32.id_byte("MemberNamePrefix", 8) && (object = rgB_2.id_class(rcd_32.id_native("MemberNamePrefix"))) != null) {
                rnB_22.id_break((rgP_2)object);
            }
            if (rcd_32.id_byte("MemberNameSuffix", 8) && (object = rgB_2.id_class(rcd_32.id_native("MemberNameSuffix"))) != null) {
                rnB_22.id_byte((rgP_2)object);
            }
            if (rcd_32.id_byte("NameTagVisibility", 8) && (object = rnX_2.id_class(rcd_32.id_native("NameTagVisibility"))) != null) {
                rnB_22.id_class((rnX_2)((Object)object));
            }
            if (rcd_32.id_byte("DeathMessageVisibility", 8) && (object = rnX_2.id_class(rcd_32.id_native("DeathMessageVisibility"))) != null) {
                rnB_22.id_break((rnX_2)((Object)object));
            }
            if (rcd_32.id_byte("CollisionRule", 8) && (object = rnh_3.id_class(rcd_32.id_native("CollisionRule"))) != null) {
                rnB_22.id_class((rnh_3)((Object)object));
            }
            this.id_class(rnB_22, rcd_32.id_protected("Players", 8));
        }
    }

    protected void id_class(rnB_2 rnB_22, rcy_3 rcy_32) {
        for (int i = 0; i < rcy_32.size(); ++i) {
            this.id_break.id_class(rcy_32.id_implements(i), rnB_22);
        }
    }

    protected rcy_3 id_break() {
        rcy_3 rcy_32 = new rcy_3();
        for (rnP_2 rnP_22 : this.id_break.id_class()) {
            if (rnP_22.id_byte() == null) continue;
            rcd_3 rcd_32 = new rcd_3();
            rcd_32.id_class("Name", rnP_22.id_break());
            rcd_32.id_class("CriteriaName", rnP_22.id_byte().id_class());
            rcd_32.id_class("DisplayName", rgB_2.id_class(rnP_22.id_protected()));
            rcd_32.id_class("RenderType", rnP_22.id_case().id_class());
            rcy_32.add(rcd_32);
        }
        return rcy_32;
    }

    protected void id_break(rcy_3 rcy_32) {
        for (int i = 0; i < rcy_32.size(); ++i) {
            rcd_3 rcd_32 = rcy_32.id_class(i);
            rAi_1.id_class(rcd_32.id_native("CriteriaName")).ifPresent(rAi_12 -> {
                String string = rcd_32.id_native("Name");
                if (string.length() > 16) {
                    string = string.substring(0, 16);
                }
                rVi_1 rVi_12 = rgB_2.id_class(rcd_32.id_native("DisplayName"));
                rnr_3 rnr_32 = rnr_3.id_class(rcd_32.id_native("RenderType"));
                this.id_break.id_class(string, (rAi_1)rAi_12, rVi_12, rnr_32);
            });
        }
    }

    protected void id_break(rcd_3 rcd_32) {
        for (int i = 0; i < 19; ++i) {
            if (!rcd_32.id_byte("slot_" + i, 8)) continue;
            String string = rcd_32.id_native("slot_" + i);
            rnP_2 rnP_22 = this.id_break.id_byte(string);
            this.id_break.id_class(i, rnP_22);
        }
    }

    protected void id_protected(rcd_3 rcd_32) {
        rcd_3 rcd_33 = new rcd_3();
        boolean bl = false;
        for (int i = 0; i < 19; ++i) {
            rnP_2 rnP_22 = this.id_break.id_class(i);
            if (rnP_22 == null) continue;
            rcd_33.id_class("slot_" + i, rnP_22.id_break());
            bl = true;
        }
        if (bl) {
            rcd_32.id_class("DisplaySlots", rcd_33);
        }
    }
}

