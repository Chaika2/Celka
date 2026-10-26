/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.MT;
import celestial.VH;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Vt_1 {
    private static final Logger id_class = LogManager.getLogger();

    public static int id_class() throws IOException {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        int n = MT.id_int();
        if (n <= 0) {
            throw new IOException("Could not create shader program (returned program ID " + n + ")");
        }
        return n;
    }

    public static void id_class(int n) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        MT.id_catch(n);
    }

    public static void id_class(VH vH) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        vH.id_protected().id_class();
        vH.id_byte().id_class();
        MT.id_private(vH.id_class());
    }

    public static void id_break(VH vH) throws IOException {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        vH.id_protected().id_class(vH);
        vH.id_byte().id_class(vH);
        MT.id_implements(vH.id_class());
        int n = MT.id_byte(vH.id_class(), 35714);
        if (n == 0) {
            id_class.warn("Error encountered when linking program containing VS {} and FS {}. Log output:", (Object)vH.id_byte().id_break(), (Object)vH.id_protected().id_break());
            id_class.warn(MT.id_finally(vH.id_class(), 32768));
        }
    }
}

