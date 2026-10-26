/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Lv_1;
import celestial.MK;
import celestial.Ml_1;
import celestial.OP;
import celestial.QY;
import celestial.cm_3;
import celestial.rfU_2;
import celestial.rgP_2;
import celestial.rqO_2;
import com.mojang.blaze3d.systems.RenderSystem;

public class LC
extends Lv_1 {
    private static final rqO_2 id_class = new rqO_2("textures/gui/checkbox.png");
    private boolean id_throws;
    private final boolean id_case;

    public LC(int n, int n2, int n3, int n4, rgP_2 rgP_22, boolean bl) {
        this(n, n2, n3, n4, rgP_22, bl, true);
    }

    public LC(int n, int n2, int n3, int n4, rgP_2 rgP_22, boolean bl, boolean bl2) {
        super(n, n2, n3, n4, rgP_22);
        this.id_throws = bl;
        this.id_case = bl2;
    }

    @Override
    public void id_break(Ml_1 ml_1, int n, int n2, float f) {
        QY qY = QY.id_instanceof();
        qY.A().id_class(id_class);
        RenderSystem.enableDepthTest();
        cm_3 cm_32 = (cm_3)qY.id_class[15];
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, this.id_continue);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.blendFunc(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA);
        LC.id_class(ml_1, this.id_volatile, this.id_final, this.aO_() ? 20.0f : 0.0f, this.id_throws ? 20.0f : 0.0f, 20, this.id_native, 64, 64);
        this.id_class(ml_1, qY, n, n2);
        if (this.id_case) {
            LC.id_break(ml_1, cm_32, this.C_(), this.id_volatile + 24, this.id_final + (this.id_native - 8) / 2, 0xE0E0E0 | rfU_2.id_case(this.id_continue * 255.0f) << 24);
        }
    }

    @Override
    public void id_catch() {
        this.id_throws = !this.id_throws;
    }

    public boolean id_private() {
        return this.id_throws;
    }
}

