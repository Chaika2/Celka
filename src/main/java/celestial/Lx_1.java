/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.LE;
import celestial.LS;
import celestial.Lb_1;
import celestial.Ld_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.cY_2;
import celestial.ch_3;
import celestial.gm_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rnB_2;
import com.google.common.collect.Lists;
import java.util.List;

public class Lx_1
implements LE,
LS {
    private static final rgP_2 id_class = new rgn_3("spectatorMenu.team_teleport");
    private static final rgP_2 id_break = new rgn_3("spectatorMenu.team_teleport.prompt");
    private final List<LS> id_byte = Lists.newArrayList();

    @Override
    public rgP_2 id_byte() {
        return id_class;
    }

    public Lx_1() {
        QY qY = QY.id_instanceof();
        for (rnB_2 rnB_22 : ((gm_3)qY.id_class[56]).id_package().id_throws()) {
            this.id_byte.add(new Ld_1(this, rnB_22));
        }
    }

    @Override
    public void id_class(Ml_1 ml_1, float f, int n) {
        QY.id_instanceof().A().id_class(cY_2.id_class);
        ch_3.id_class(ml_1, 0, 0, 16.0f, 0.0f, 16, 16, 256, 256);
    }

    @Override
    public List<LS> id_class() {
        return this.id_byte;
    }

    @Override
    public void id_class(Lb_1 lb_1) {
        lb_1.id_class(this);
    }

    @Override
    public rgP_2 id_break() {
        return id_break;
    }

    @Override
    public boolean id_protected() {
        for (LS lS : this.id_byte) {
            if (!lS.id_protected()) continue;
            return true;
        }
        return false;
    }
}

