/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.QY;
import celestial.VC;
import celestial.VT;
import celestial.ju_3;
import celestial.lD_2;
import celestial.rAL;
import celestial.rjV_2;
import celestial.yb_3;
import celestial.yk_3;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.util.List;
import java.util.function.IntSupplier;

public class Vy_1
implements AutoCloseable {
    private final VT id_byte;
    public final VC id_class;
    public final VC id_break;
    private final List<IntSupplier> id_protected = Lists.newArrayList();
    private final List<String> id_throws = Lists.newArrayList();
    private final List<Integer> id_case = Lists.newArrayList();
    private final List<Integer> id_catch = Lists.newArrayList();
    private rjV_2 id_private;

    public Vy_1(rAL rAL2, String string, VC vC, VC vC2) throws IOException {
        this.id_byte = new VT(rAL2, string);
        this.id_class = vC;
        this.id_break = vC2;
    }

    public void id_class(rjV_2 rjV_22) {
        this.id_private = rjV_22;
    }

    public void id_class(float f) {
        this.id_class.id_throws();
        float f2 = this.id_break.id_class;
        float f3 = this.id_break.id_break;
        RenderSystem.viewport(0, 0, (int)f2, (int)f3);
        this.id_byte.id_class("DiffuseSampler", this.id_class::id_case);
        for (int i = 0; i < this.id_protected.size(); ++i) {
            this.id_byte.id_class(this.id_throws.get(i), this.id_protected.get(i));
            this.id_byte.id_break("AuxSize" + i).id_class(this.id_case.get(i).intValue(), this.id_catch.get(i).intValue());
        }
        this.id_byte.id_break("ProjMat").id_class(this.id_private);
        this.id_byte.id_break("InSize").id_class(this.id_class.id_class, this.id_class.id_break);
        this.id_byte.id_break("OutSize").id_class(f2, f3);
        this.id_byte.id_break("Time").id_class(f);
        QY qY = QY.id_instanceof();
        this.id_byte.id_break("ScreenSize").id_class(qY.id_else().id_extends(), qY.id_else().id_native());
        this.id_byte.id_case();
        this.id_break.id_break((Boolean)QY.id_break[2]);
        this.id_break.id_class(false);
        RenderSystem.depthFunc(519);
        lD_2 lD_22 = yb_3.id_class().id_byte();
        lD_22.id_class(7, ju_3.id_this);
        lD_22.id_class(0.0, 0.0, 500.0).id_break(255, 255, 255, 255).id_class();
        lD_22.id_class((double)f2, 0.0, 500.0).id_break(255, 255, 255, 255).id_class();
        lD_22.id_class((double)f2, (double)f3, 500.0).id_break(255, 255, 255, 255).id_class();
        lD_22.id_class(0.0, (double)f3, 500.0).id_break(255, 255, 255, 255).id_class();
        lD_22.id_finally();
        yk_3.id_class(lD_22);
        RenderSystem.depthFunc(515);
        this.id_byte.id_throws();
        this.id_break.id_throws();
        this.id_class.id_protected();
        for (IntSupplier intSupplier : this.id_protected) {
            if (!(intSupplier instanceof VC)) continue;
            ((VC)((Object)intSupplier)).id_protected();
        }
    }

    public VT id_class() {
        return this.id_byte;
    }

    public void id_class(String string, IntSupplier intSupplier, int n, int n2) {
        this.id_throws.add(this.id_throws.size(), string);
        this.id_protected.add(this.id_protected.size(), intSupplier);
        this.id_case.add(this.id_case.size(), n);
        this.id_catch.add(this.id_catch.size(), n2);
    }

    @Override
    public void close() {
        this.id_byte.close();
    }
}

