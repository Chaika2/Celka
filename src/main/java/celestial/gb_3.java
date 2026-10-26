/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.system.MemoryUtil
 */
package celestial;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.system.MemoryUtil;

public class gb_3 {
    public static void id_class() {
        MemoryUtil.memSet((long)0L, (int)0, (long)1L);
    }

    public static double id_break() {
        return GLFW.glfwGetTime();
    }
}

