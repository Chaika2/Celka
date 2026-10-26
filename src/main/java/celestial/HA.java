/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QY;
import celestial.fY_2;
import celestial.ju_3;
import celestial.lD_2;
import celestial.rjV_2;
import celestial.rqO_2;
import celestial.yb_3;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class HA {
    private final rqO_2[] id_class = new rqO_2[6];

    public HA(rqO_2 rqO_22) {
        for (int i = 0; i < 6; ++i) {
            this.id_class[i] = new rqO_2(rqO_22.id_byte(), rqO_22.id_break() + "_" + i + ".png");
        }
    }

    public void id_class(QY qY, float f, float f2, float f3) {
        yb_3 yb_32 = yb_3.id_class();
        lD_2 lD_22 = yb_32.id_byte();
        RenderSystem.matrixMode(5889);
        RenderSystem.pushMatrix();
        RenderSystem.loadIdentity();
        RenderSystem.multMatrix(rjV_2.id_class(85.0, (float)qY.id_else().id_extends() / (float)qY.id_else().id_native(), 0.05f, 10.0f));
        RenderSystem.matrixMode(5888);
        RenderSystem.pushMatrix();
        RenderSystem.loadIdentity();
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.rotatef(180.0f, 1.0f, 0.0f, 0.0f);
        RenderSystem.enableBlend();
        RenderSystem.disableAlphaTest();
        RenderSystem.disableCull();
        RenderSystem.depthMask(false);
        RenderSystem.defaultBlendFunc();
        int n = 2;
        for (int i = 0; i < 4; ++i) {
            RenderSystem.pushMatrix();
            float f4 = ((float)(i % 2) / 2.0f - 0.5f) / 256.0f;
            float f5 = ((float)(i / 2) / 2.0f - 0.5f) / 256.0f;
            RenderSystem.translatef(f4, f5, 0.0f);
            RenderSystem.rotatef(f, 1.0f, 0.0f, 0.0f);
            RenderSystem.rotatef(f2, 0.0f, 1.0f, 0.0f);
            for (int j = 0; j < 6; ++j) {
                qY.A().id_class(this.id_class[j]);
                lD_22.id_class(7, ju_3.id_public);
                int n2 = Math.round(255.0f * f3) / (i + 1);
                if (j == 0) {
                    lD_22.id_class(-1.0, -1.0, 1.0).id_class(0.0f, 0.0f).id_break(255, 255, 255, n2).id_class();
                    lD_22.id_class(-1.0, 1.0, 1.0).id_class(0.0f, 1.0f).id_break(255, 255, 255, n2).id_class();
                    lD_22.id_class(1.0, 1.0, 1.0).id_class(1.0f, 1.0f).id_break(255, 255, 255, n2).id_class();
                    lD_22.id_class(1.0, -1.0, 1.0).id_class(1.0f, 0.0f).id_break(255, 255, 255, n2).id_class();
                }
                if (j == 1) {
                    lD_22.id_class(1.0, -1.0, 1.0).id_class(0.0f, 0.0f).id_break(255, 255, 255, n2).id_class();
                    lD_22.id_class(1.0, 1.0, 1.0).id_class(0.0f, 1.0f).id_break(255, 255, 255, n2).id_class();
                    lD_22.id_class(1.0, 1.0, -1.0).id_class(1.0f, 1.0f).id_break(255, 255, 255, n2).id_class();
                    lD_22.id_class(1.0, -1.0, -1.0).id_class(1.0f, 0.0f).id_break(255, 255, 255, n2).id_class();
                }
                if (j == 2) {
                    lD_22.id_class(1.0, -1.0, -1.0).id_class(0.0f, 0.0f).id_break(255, 255, 255, n2).id_class();
                    lD_22.id_class(1.0, 1.0, -1.0).id_class(0.0f, 1.0f).id_break(255, 255, 255, n2).id_class();
                    lD_22.id_class(-1.0, 1.0, -1.0).id_class(1.0f, 1.0f).id_break(255, 255, 255, n2).id_class();
                    lD_22.id_class(-1.0, -1.0, -1.0).id_class(1.0f, 0.0f).id_break(255, 255, 255, n2).id_class();
                }
                if (j == 3) {
                    lD_22.id_class(-1.0, -1.0, -1.0).id_class(0.0f, 0.0f).id_break(255, 255, 255, n2).id_class();
                    lD_22.id_class(-1.0, 1.0, -1.0).id_class(0.0f, 1.0f).id_break(255, 255, 255, n2).id_class();
                    lD_22.id_class(-1.0, 1.0, 1.0).id_class(1.0f, 1.0f).id_break(255, 255, 255, n2).id_class();
                    lD_22.id_class(-1.0, -1.0, 1.0).id_class(1.0f, 0.0f).id_break(255, 255, 255, n2).id_class();
                }
                if (j == 4) {
                    lD_22.id_class(-1.0, -1.0, -1.0).id_class(0.0f, 0.0f).id_break(255, 255, 255, n2).id_class();
                    lD_22.id_class(-1.0, -1.0, 1.0).id_class(0.0f, 1.0f).id_break(255, 255, 255, n2).id_class();
                    lD_22.id_class(1.0, -1.0, 1.0).id_class(1.0f, 1.0f).id_break(255, 255, 255, n2).id_class();
                    lD_22.id_class(1.0, -1.0, -1.0).id_class(1.0f, 0.0f).id_break(255, 255, 255, n2).id_class();
                }
                if (j == 5) {
                    lD_22.id_class(-1.0, 1.0, 1.0).id_class(0.0f, 0.0f).id_break(255, 255, 255, n2).id_class();
                    lD_22.id_class(-1.0, 1.0, -1.0).id_class(0.0f, 1.0f).id_break(255, 255, 255, n2).id_class();
                    lD_22.id_class(1.0, 1.0, -1.0).id_class(1.0f, 1.0f).id_break(255, 255, 255, n2).id_class();
                    lD_22.id_class(1.0, 1.0, 1.0).id_class(1.0f, 0.0f).id_break(255, 255, 255, n2).id_class();
                }
                yb_32.id_break();
            }
            RenderSystem.popMatrix();
            RenderSystem.colorMask(true, true, true, false);
        }
        RenderSystem.colorMask(true, true, true, true);
        RenderSystem.matrixMode(5889);
        RenderSystem.popMatrix();
        RenderSystem.matrixMode(5888);
        RenderSystem.popMatrix();
        RenderSystem.depthMask(true);
        RenderSystem.enableCull();
        RenderSystem.enableDepthTest();
    }

    public CompletableFuture<Void> id_class(fY_2 fY_22, Executor executor) {
        CompletableFuture[] completableFutureArray = new CompletableFuture[6];
        for (int i = 0; i < completableFutureArray.length; ++i) {
            completableFutureArray[i] = fY_22.id_class(this.id_class[i], executor);
        }
        return CompletableFuture.allOf(completableFutureArray);
    }
}

