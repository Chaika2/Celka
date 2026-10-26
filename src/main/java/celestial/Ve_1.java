/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.glfw.GLFWCharModsCallbackI
 *  org.lwjgl.glfw.GLFWCursorPosCallbackI
 *  org.lwjgl.glfw.GLFWDropCallbackI
 *  org.lwjgl.glfw.GLFWKeyCallbackI
 *  org.lwjgl.glfw.GLFWMouseButtonCallbackI
 *  org.lwjgl.glfw.GLFWScrollCallbackI
 */
package celestial;

import celestial.Va_1;
import celestial.Vi_1;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWCharModsCallbackI;
import org.lwjgl.glfw.GLFWCursorPosCallbackI;
import org.lwjgl.glfw.GLFWDropCallbackI;
import org.lwjgl.glfw.GLFWKeyCallbackI;
import org.lwjgl.glfw.GLFWMouseButtonCallbackI;
import org.lwjgl.glfw.GLFWScrollCallbackI;

public class Ve_1 {
    private static final MethodHandle id_break;
    private static final int id_byte;
    public static final Va_1 id_class;

    static {
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodType methodType = MethodType.methodType(Boolean.TYPE);
        MethodHandle methodHandle = null;
        int n = 0;
        try {
            methodHandle = lookup.findStatic(GLFW.class, "glfwRawMouseMotionSupported", methodType);
            MethodHandle methodHandle2 = lookup.findStaticGetter(GLFW.class, "GLFW_RAW_MOUSE_MOTION", Integer.TYPE);
            n = methodHandle2.invokeExact();
        }
        catch (NoSuchFieldException | NoSuchMethodException reflectiveOperationException) {
        }
        catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
        id_break = methodHandle;
        id_byte = n;
        id_class = Vi_1.KEYSYM.id_class(-1);
    }

    public static void id_class(long l, GLFWCursorPosCallbackI gLFWCursorPosCallbackI, GLFWMouseButtonCallbackI gLFWMouseButtonCallbackI, GLFWScrollCallbackI gLFWScrollCallbackI, GLFWDropCallbackI gLFWDropCallbackI) {
        GLFW.glfwSetCursorPosCallback((long)l, (GLFWCursorPosCallbackI)gLFWCursorPosCallbackI);
        GLFW.glfwSetMouseButtonCallback((long)l, (GLFWMouseButtonCallbackI)gLFWMouseButtonCallbackI);
        GLFW.glfwSetScrollCallback((long)l, (GLFWScrollCallbackI)gLFWScrollCallbackI);
        GLFW.glfwSetDropCallback((long)l, (GLFWDropCallbackI)gLFWDropCallbackI);
    }

    public static void id_class(long l, int n, double d, double d2) {
        GLFW.glfwSetCursorPos((long)l, (double)d, (double)d2);
        GLFW.glfwSetInputMode((long)l, (int)208897, (int)n);
    }

    public static boolean id_class() {
        try {
            return id_break != null && id_break.invokeExact();
        }
        catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    public static void id_class(long l, boolean bl) {
        if (Ve_1.id_class()) {
            GLFW.glfwSetInputMode((long)l, (int)id_byte, (int)(bl ? 1 : 0));
        }
    }

    public static void id_class(long l, GLFWKeyCallbackI gLFWKeyCallbackI, GLFWCharModsCallbackI gLFWCharModsCallbackI) {
        GLFW.glfwSetKeyCallback((long)l, (GLFWKeyCallbackI)gLFWKeyCallbackI);
        GLFW.glfwSetCharModsCallback((long)l, (GLFWCharModsCallbackI)gLFWCharModsCallbackI);
    }

    public static Va_1 id_class(String string) {
        if (Va_1.id_throws.containsKey(string)) {
            return Va_1.id_throws.get(string);
        }
        for (Vi_1 vi_1 : Vi_1.values()) {
            if (!string.startsWith(vi_1.name)) continue;
            String string2 = string.substring(vi_1.name.length() + 1);
            return vi_1.id_class(Integer.parseInt(string2));
        }
        throw new IllegalArgumentException("Unknown key name: " + string);
    }

    public static boolean id_class(long l, int n) {
        return GLFW.glfwGetKey((long)l, (int)n) == 1;
    }

    public static Va_1 id_class(int n, int n2) {
        return n == -1 ? Vi_1.SCANCODE.id_class(n2) : Vi_1.KEYSYM.id_class(n);
    }

    public static boolean id_break(long l, int n) {
        return GLFW.glfwGetMouseButton((long)l, (int)n) == 1;
    }
}

