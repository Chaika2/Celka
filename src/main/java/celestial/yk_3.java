/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  org.lwjgl.system.MemoryUtil
 */
package celestial;

import celestial.MT;
import celestial.jZ_2;
import celestial.lD_2;
import celestial.lU_2;
import celestial.rrbb_3;
import celestial.rrdk_1;
import celestial.rrxZ_2;
import celestial.rrxm_3;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;

public class yk_3 {
    private static void id_class(ByteBuffer byteBuffer, int n, jZ_2 jZ_22, int n2, rrxm_3 rrxm_32) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        ((Buffer)byteBuffer).clear();
        if (n2 > 0) {
            boolean bl;
            jZ_22.id_class(MemoryUtil.memAddress((ByteBuffer)byteBuffer));
            boolean bl2 = bl = rrbb_3.rs() && rrdk_1.id_class(jZ_22, byteBuffer);
            if (rrxm_32 != null) {
                rrxZ_2.id_class(n, rrxm_32);
            } else {
                MT.id_case(n, 0, n2);
            }
            if (bl) {
                rrdk_1.id_break();
            }
            jZ_22.id_protected();
        }
    }

    private static void id_class(ByteBuffer byteBuffer, int n, jZ_2 jZ_22, int n2) {
        yk_3.id_class(byteBuffer, n, jZ_22, n2, null);
    }

    public static void id_class(lD_2 lD_22) {
        if (!RenderSystem.isOnRenderThread()) {
            RenderSystem.recordRenderCall(() -> {
                Pair<lU_2, ByteBuffer> pair = lD_22.id_extends();
                lU_2 lU_22 = (lU_2)pair.getFirst();
                yk_3.id_class((ByteBuffer)pair.getSecond(), lU_22.id_protected(), lU_22.id_break(), lU_22.id_byte(), lU_22.id_class());
            });
        } else {
            Pair<lU_2, ByteBuffer> pair = lD_22.id_extends();
            lU_2 lU_22 = (lU_2)pair.getFirst();
            yk_3.id_class((ByteBuffer)pair.getSecond(), lU_22.id_protected(), lU_22.id_break(), lU_22.id_byte(), lU_22.id_class());
        }
    }
}

