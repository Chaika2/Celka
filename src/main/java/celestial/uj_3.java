/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.Ml_1;
import celestial.QY;
import celestial.cd_3;
import celestial.ch_3;
import celestial.cm_3;
import celestial.rFL;
import celestial.rFv_1;
import celestial.rRG;
import celestial.rRM;
import celestial.rgP_2;
import celestial.rqO_2;
import celestial.rrbN_2;
import celestial.rrbb_3;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

public class uj_3
extends ch_3 {
    private static final rqO_2 id_class = new rqO_2("textures/gui/bars.png");
    private final QY id_throws;
    private final Map<UUID, cd_3> id_case = Maps.newLinkedHashMap();

    public uj_3(QY qY) {
        this.id_throws = qY;
    }

    public boolean id_class(String ... stringArray) {
        Iterator<cd_3> iterator;
        if (!this.id_case.isEmpty() && (iterator = this.id_case.values().iterator()).hasNext()) {
            rRG rRG2 = iterator.next();
            String string = rRG2.id_implements().id_byte().toLowerCase();
            boolean bl = true;
            for (String string2 : stringArray) {
                if (string.contains(string2.toLowerCase())) continue;
                bl = false;
                break;
            }
            return bl;
        }
        return false;
    }

    public void id_class(Ml_1 ml_1) {
        if (!this.id_case.isEmpty()) {
            int n = this.id_throws.id_else().id_super();
            int n2 = 12;
            for (cd_3 cd_32 : this.id_case.values()) {
                int n3 = n / 2 - 91;
                RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
                int n4 = 19;
                this.id_throws.A().id_class(id_class);
                this.id_class(ml_1, n3, n2, cd_32);
                rgP_2 rgP_22 = cd_32.id_implements();
                int n5 = ((cm_3)this.id_throws.id_class[15]).id_class(rgP_22);
                int n6 = n / 2 - n5 / 2;
                int n7 = n2 - 9;
                int n8 = 0xFFFFFF;
                if (rrbb_3.K()) {
                    n8 = rrbN_2.id_break(n8);
                }
                ((cm_3)this.id_throws.id_class[15]).id_break(ml_1, rgP_22, (float)n6, (float)n7, n8);
                if ((n2 += n4) < this.id_throws.id_else().id_this() / 3) continue;
                break;
            }
        }
    }

    public boolean id_class(String string) {
        if (!this.id_case.isEmpty()) {
            string = string.toLowerCase();
            for (rRG rRG2 : this.id_case.values()) {
                String string2 = rRG2.id_implements().id_byte().toLowerCase();
                if (!string2.contains(string)) continue;
                return true;
            }
        }
        return false;
    }

    private void id_class(Ml_1 ml_1, int n, int n2, rRG rRG2) {
        int n3;
        this.id_break(ml_1, n, n2, 0, rRG2.id_finally().ordinal() * 5 * 2, 182, 5);
        if (rRG2.id_extends() != rRM.PROGRESS) {
            this.id_break(ml_1, n, n2, 0, 80 + (rRG2.id_extends().ordinal() - 1) * 5 * 2, 182, 5);
        }
        if ((n3 = (int)(rRG2.id_class() * 183.0f)) > 0) {
            this.id_break(ml_1, n, n2, 0, rRG2.id_finally().ordinal() * 5 * 2 + 5, n3, 5);
            if (rRG2.id_extends() != rRM.PROGRESS) {
                this.id_break(ml_1, n, n2, 0, 80 + (rRG2.id_extends().ordinal() - 1) * 5 * 2 + 5, n3, 5);
            }
        }
    }

    public void id_class(rFv_1 rFv_12) {
        if (rFv_12.id_byte() == rFL.ADD) {
            this.id_case.put(rFv_12.id_break(), new cd_3(rFv_12));
        } else if (rFv_12.id_byte() == rFL.REMOVE) {
            this.id_case.remove(rFv_12.id_break());
        } else {
            this.id_case.get(rFv_12.id_break()).id_class(rFv_12);
        }
    }

    public void id_class() {
        this.id_case.clear();
    }

    public boolean id_break(String ... stringArray) {
        if (!this.id_case.isEmpty()) {
            for (rRG rRG2 : this.id_case.values()) {
                String string = rRG2.id_implements().id_byte().toLowerCase();
                for (String string2 : stringArray) {
                    if (!string.contains(string2.toLowerCase())) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean id_throws() {
        if (!this.id_case.isEmpty()) {
            for (rRG rRG2 : this.id_case.values()) {
                if (!rRG2.id_native()) continue;
                return true;
            }
        }
        return false;
    }

    public Map<UUID, cd_3> id_catch() {
        return this.id_case;
    }

    public boolean id_case() {
        if (!this.id_case.isEmpty()) {
            for (rRG rRG2 : this.id_case.values()) {
                if (!rRG2.id_final()) continue;
                return true;
            }
        }
        return false;
    }

    public boolean id_protected() {
        if (!this.id_case.isEmpty()) {
            for (rRG rRG2 : this.id_case.values()) {
                if (!rRG2.id_volatile()) continue;
                return true;
            }
        }
        return false;
    }
}

