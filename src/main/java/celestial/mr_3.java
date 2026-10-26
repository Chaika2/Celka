/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.Hz_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.ch_3;
import celestial.cm_3;
import celestial.mP_2;
import celestial.rdn_3;
import celestial.rkg_3;
import celestial.rkw_3;
import celestial.vm_3;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class mr_3 {
    private rkw_3<?> id_class;
    private final List<mP_2> id_break = Lists.newArrayList();
    public float id_byte;

    public rkw_3<?> id_byte() {
        return this.id_class;
    }

    public void id_class(rkw_3<?> rkw_32) {
        this.id_class = rkw_32;
    }

    public void id_class(Ml_1 ml_1, QY qY, int n, int n2, boolean bl, float f) {
        if (!vm_3.id_else()) {
            this.id_byte += f;
        }
        for (int i = 0; i < this.id_break.size(); ++i) {
            mP_2 mP_22 = this.id_break.get(i);
            int n3 = mP_22.id_class() + n;
            int n4 = mP_22.id_break() + n2;
            if (i == 0 && bl) {
                ch_3.id_class(ml_1, n3 - 4, n4 - 4, n3 + 20, n4 + 20, 0x30FF0000);
            } else {
                ch_3.id_class(ml_1, n3, n4, n3 + 16, n4 + 16, 0x30FF0000);
            }
            rdn_3 rdn_32 = mP_22.id_byte();
            Hz_1 hz_1 = qY.id_float();
            hz_1.id_break(rdn_32, n3, n4);
            RenderSystem.depthFunc(516);
            ch_3.id_class(ml_1, n3, n4, n3 + 16, n4 + 16, 0x30FFFFFF);
            RenderSystem.depthFunc(515);
            if (i != 0) continue;
            hz_1.id_class((cm_3)qY.id_class[15], rdn_32, (float)n3, (float)n4);
        }
    }

    public void id_class() {
        this.id_class = null;
        this.id_break.clear();
        this.id_byte = 0.0f;
    }

    public void id_class(rkg_3 rkg_32, int n, int n2) {
        this.id_break.add(new mP_2(this, rkg_32, n, n2));
    }

    public mP_2 id_class(int n) {
        return this.id_break.get(n);
    }

    public int id_break() {
        return this.id_break.size();
    }
}

