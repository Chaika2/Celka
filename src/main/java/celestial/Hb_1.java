/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class Hb_1 {
    public static FloatBuffer id_byte(int n) {
        return Hb_1.id_class(n << 2).asFloatBuffer();
    }

    public static synchronized ByteBuffer id_class(int n) {
        return ByteBuffer.allocateDirect(n).order(ByteOrder.nativeOrder());
    }

    public static IntBuffer id_break(int n) {
        return Hb_1.id_class(n << 2).asIntBuffer();
    }
}

