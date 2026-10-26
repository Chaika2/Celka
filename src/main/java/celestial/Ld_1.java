/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.Aw_1;
import celestial.LJ;
import celestial.LS;
import celestial.Lb_1;
import celestial.Lx_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.cG_2;
import celestial.ch_3;
import celestial.jH_2;
import celestial.rfU_2;
import celestial.rgP_2;
import celestial.rnB_2;
import celestial.rqO_2;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Random;

public class Ld_1
implements LS {
    private final rnB_2 id_class;
    private final rqO_2 id_break;
    private final List<Aw_1> id_byte;

    @Override
    public rgP_2 id_byte() {
        return this.id_class.id_break();
    }

    public Ld_1(Lx_1 lx_1, rnB_2 rnB_22) {
        this.id_class = rnB_22;
        this.id_byte = Lists.newArrayList();
        for (String string : rnB_22.id_case()) {
            Aw_1 aw_1 = QY.id_instanceof().id_void().id_class(string);
            if (aw_1 == null) continue;
            this.id_byte.add(aw_1);
        }
        if (this.id_byte.isEmpty()) {
            this.id_break = jH_2.id_class();
        } else {
            String string = this.id_byte.get(new Random().nextInt(this.id_byte.size())).id_class().getName();
            this.id_break = cG_2.id_class(string);
            cG_2.id_class(this.id_break, string);
        }
    }

    @Override
    public void id_class(Lb_1 lb_1) {
        lb_1.id_class(new LJ(this.id_byte));
    }

    @Override
    public void id_class(Ml_1 ml_1, float f, int n) {
        Integer n2 = this.id_class.id_volatile().id_protected();
        if (n2 != null) {
            float f2 = (float)(n2 >> 16 & 0xFF) / 255.0f;
            float f3 = (float)(n2 >> 8 & 0xFF) / 255.0f;
            float f4 = (float)(n2 & 0xFF) / 255.0f;
            ch_3.id_class(ml_1, 1, 1, 15, 15, rfU_2.id_throws(f2 * f, f3 * f, f4 * f) | n << 24);
        }
        QY.id_instanceof().A().id_class(this.id_break);
        RenderSystem.color4f(f, f, f, (float)n / 255.0f);
        ch_3.id_class(ml_1, 2, 2, 12, 12, 8.0f, 8.0f, 8, 8, 64, 64);
        ch_3.id_class(ml_1, 2, 2, 12, 12, 40.0f, 8.0f, 8, 8, 64, 64);
    }

    @Override
    public boolean id_protected() {
        return !this.id_byte.isEmpty();
    }
}

