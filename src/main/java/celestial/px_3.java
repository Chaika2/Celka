/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.ju_3;
import celestial.lD_2;
import celestial.rfH_2;
import celestial.yD_2;
import celestial.yX_2;
import celestial.yb_3;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class px_3
implements yD_2 {
    private final List<rfH_2> id_class = Lists.newArrayList();
    private final List<Float> id_break = Lists.newArrayList();
    private final List<Float> id_byte = Lists.newArrayList();
    private final List<Float> id_protected = Lists.newArrayList();
    private final List<Float> id_throws = Lists.newArrayList();
    private final List<Float> id_case = Lists.newArrayList();

    public void id_class(rfH_2 rfH_22, float f, float f2, float f3, float f4, float f5) {
        this.id_class.add(rfH_22);
        this.id_break.add(Float.valueOf(f));
        this.id_byte.add(Float.valueOf(f5));
        this.id_protected.add(Float.valueOf(f2));
        this.id_throws.add(Float.valueOf(f3));
        this.id_case.add(Float.valueOf(f4));
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, double d, double d2, double d3) {
        RenderSystem.pushMatrix();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableTexture();
        yb_3 yb_32 = yb_3.id_class();
        lD_2 lD_22 = yb_32.id_byte();
        lD_22.id_class(5, ju_3.id_this);
        for (int i = 0; i < this.id_class.size(); ++i) {
            rfH_2 rfH_22 = this.id_class.get(i);
            Float f = this.id_break.get(i);
            float f2 = f.floatValue() / 2.0f;
            yX_2.id_class(lD_22, (double)((float)rfH_22.b_() + 0.5f - f2) - d, (double)((float)rfH_22.c_() + 0.5f - f2) - d2, (double)((float)rfH_22.d_() + 0.5f - f2) - d3, (double)((float)rfH_22.b_() + 0.5f + f2) - d, (double)((float)rfH_22.c_() + 0.5f + f2) - d2, (double)((float)rfH_22.d_() + 0.5f + f2) - d3, this.id_protected.get(i).floatValue(), this.id_throws.get(i).floatValue(), this.id_case.get(i).floatValue(), this.id_byte.get(i).floatValue());
        }
        yb_32.id_break();
        RenderSystem.enableTexture();
        RenderSystem.popMatrix();
    }
}

