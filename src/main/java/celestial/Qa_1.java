/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.glfw.GLFWVidMode
 *  org.lwjgl.glfw.GLFWVidMode$Buffer
 */
package celestial;

import celestial.rrzN_2;
import celestial.yM_2;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;

public final class Qa_1 {
    private final long id_class;
    private final List<yM_2> id_break;
    private yM_2 id_byte;
    private int id_protected;
    private int id_throws;

    public int id_byte() {
        return this.id_protected;
    }

    public Qa_1(long l) {
        this.id_class = l;
        this.id_break = Lists.newArrayList();
        this.id_class();
    }

    public String toString() {
        return String.format("Monitor[%s %sx%s %s]", this.id_class, this.id_protected, this.id_throws, this.id_byte);
    }

    public static yM_2 id_class(List<yM_2> list, int n, int n2) {
        for (yM_2 yM_22 : list) {
            if (yM_22.id_class() != n || yM_22.id_break() != n2) continue;
            return yM_22;
        }
        return null;
    }

    public yM_2 id_class(int n) {
        return this.id_break.get(n);
    }

    public void id_class() {
        Object object2;
        RenderSystem.assertThread(RenderSystem::isInInitPhase);
        this.id_break.clear();
        GLFWVidMode.Buffer buffer = GLFW.glfwGetVideoModes((long)this.id_class);
        GLFWVidMode gLFWVidMode = GLFW.glfwGetVideoMode((long)this.id_class);
        yM_2 yM_22 = new yM_2(gLFWVidMode);
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (int i = buffer.limit() - 1; i >= 0; --i) {
            buffer.position(i);
            object2 = new yM_2(buffer);
            if (((yM_2)object2).id_byte() < 8 || ((yM_2)object2).id_protected() < 8 || ((yM_2)object2).id_throws() < 8) continue;
            if (((yM_2)object2).id_case() < yM_22.id_case()) {
                arrayList.add(object2);
                continue;
            }
            this.id_break.add((yM_2)object2);
        }
        arrayList.sort(new rrzN_2().reversed());
        for (Object object2 : arrayList) {
            if (Qa_1.id_class(this.id_break, ((yM_2)object2).id_class(), ((yM_2)object2).id_break()) != null) continue;
            this.id_break.add((yM_2)object2);
        }
        this.id_break.sort(new rrzN_2());
        Object object3 = new int[1];
        object2 = new int[1];
        GLFW.glfwGetMonitorPos((long)this.id_class, (int[])object3, (int[])object2);
        this.id_protected = (int)object3[0];
        this.id_throws = (int)object2[0];
        GLFWVidMode gLFWVidMode2 = GLFW.glfwGetVideoMode((long)this.id_class);
        this.id_byte = new yM_2(gLFWVidMode2);
    }

    public int id_class(yM_2 yM_22) {
        RenderSystem.assertThread(RenderSystem::isInInitPhase);
        return this.id_break.indexOf(yM_22);
    }

    public yM_2 id_class(Optional<yM_2> optional) {
        RenderSystem.assertThread(RenderSystem::isInInitPhase);
        if (optional.isPresent()) {
            yM_2 yM_22 = optional.get();
            for (yM_2 yM_23 : this.id_break) {
                if (!yM_23.equals(yM_22)) continue;
                return yM_23;
            }
        }
        return this.id_break();
    }

    public yM_2 id_break() {
        return this.id_byte;
    }

    public int id_throws() {
        return this.id_break.size();
    }

    public long id_case() {
        return this.id_class;
    }

    public int id_protected() {
        return this.id_throws;
    }
}

