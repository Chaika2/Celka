/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.glfw.GLFWErrorCallback
 *  org.lwjgl.glfw.GLFWErrorCallbackI
 *  org.lwjgl.system.MemoryUtil
 */
package celestial;

import celestial.rgL_2;
import com.google.common.base.Charsets;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWErrorCallbackI;
import org.lwjgl.system.MemoryUtil;

public class Ql_1 {
    private final ByteBuffer id_class = BufferUtils.createByteBuffer((int)8192);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void id_class(long l, String string) {
        byte[] byArray = string.getBytes(Charsets.UTF_8);
        int n = byArray.length + 1;
        if (n < this.id_class.capacity()) {
            Ql_1.id_class(l, this.id_class, byArray);
        } else {
            ByteBuffer byteBuffer = MemoryUtil.memAlloc((int)n);
            try {
                Ql_1.id_class(l, byteBuffer, byArray);
            }
            finally {
                MemoryUtil.memFree((Buffer)byteBuffer);
            }
        }
    }

    private static void id_class(long l, ByteBuffer byteBuffer, byte[] byArray) {
        ((Buffer)byteBuffer).clear();
        byteBuffer.put(byArray);
        byteBuffer.put((byte)0);
        ((Buffer)byteBuffer).flip();
        GLFW.glfwSetClipboardString((long)l, (ByteBuffer)byteBuffer);
    }

    public String id_class(long l, GLFWErrorCallbackI gLFWErrorCallbackI) {
        GLFWErrorCallback gLFWErrorCallback = GLFW.glfwSetErrorCallback((GLFWErrorCallbackI)gLFWErrorCallbackI);
        String string = GLFW.glfwGetClipboardString((long)l);
        string = string != null ? rgL_2.id_class(string) : "";
        GLFWErrorCallback gLFWErrorCallback2 = GLFW.glfwSetErrorCallback((GLFWErrorCallbackI)gLFWErrorCallback);
        if (gLFWErrorCallback2 != null) {
            gLFWErrorCallback2.free();
        }
        return string;
    }
}

