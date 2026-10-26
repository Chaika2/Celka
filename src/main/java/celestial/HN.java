/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  org.lwjgl.PointerBuffer
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.glfw.GLFWMonitorCallback
 *  org.lwjgl.glfw.GLFWMonitorCallbackI
 */
package celestial;

import celestial.HJ;
import celestial.Qa_1;
import celestial.Qg_1;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWMonitorCallback;
import org.lwjgl.glfw.GLFWMonitorCallbackI;

public class HN {
    private final Long2ObjectMap<Qa_1> id_class = new Long2ObjectOpenHashMap();
    private final HJ id_break;

    public HN(HJ hJ) {
        RenderSystem.assertThread(RenderSystem::isInInitPhase);
        this.id_break = hJ;
        GLFW.glfwSetMonitorCallback(this::id_class);
        PointerBuffer pointerBuffer = GLFW.glfwGetMonitors();
        if (pointerBuffer != null) {
            for (int i = 0; i < pointerBuffer.limit(); ++i) {
                long l = pointerBuffer.get(i);
                this.id_class.put(l, (Object)hJ.createMonitor(l));
            }
        }
    }

    public Qa_1 id_class(Qg_1 qg_1) {
        long l = GLFW.glfwGetWindowMonitor((long)qg_1.id_implements());
        if (l != 0L) {
            return this.id_class(l);
        }
        int n = qg_1.id_else();
        int n2 = n + qg_1.id_new();
        int n3 = qg_1.id_synchronized();
        int n4 = n3 + qg_1.id_continue();
        int n5 = -1;
        Qa_1 qa_1 = null;
        for (Qa_1 qa_12 : this.id_class.values()) {
            int n6;
            int n7 = qa_12.id_byte();
            int n8 = n7 + qa_12.id_break().id_class();
            int n9 = qa_12.id_protected();
            int n10 = n9 + qa_12.id_break().id_break();
            int n11 = HN.id_class(n, n7, n8);
            int n12 = HN.id_class(n2, n7, n8);
            int n13 = HN.id_class(n3, n9, n10);
            int n14 = HN.id_class(n4, n9, n10);
            int n15 = Math.max(0, n12 - n11);
            int n16 = n15 * (n6 = Math.max(0, n14 - n13));
            if (n16 <= n5) continue;
            qa_1 = qa_12;
            n5 = n16;
        }
        return qa_1;
    }

    public static int id_class(int n, int n2, int n3) {
        if (n < n2) {
            return n2;
        }
        return n > n3 ? n3 : n;
    }

    public void id_class() {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        GLFWMonitorCallback gLFWMonitorCallback = GLFW.glfwSetMonitorCallback((GLFWMonitorCallbackI)null);
        if (gLFWMonitorCallback != null) {
            gLFWMonitorCallback.free();
        }
    }

    public Qa_1 id_class(long l) {
        RenderSystem.assertThread(RenderSystem::isInInitPhase);
        return (Qa_1)this.id_class.get(l);
    }

    private void id_class(long l, int n) {
        RenderSystem.assertThread(RenderSystem::isOnRenderThread);
        if (n == 262145) {
            this.id_class.put(l, (Object)this.id_break.createMonitor(l));
        } else if (n == 262146) {
            this.id_class.remove(l);
        }
    }
}

