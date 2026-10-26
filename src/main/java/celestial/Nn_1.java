/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.lwjgl.BufferUtils
 */
package celestial;

import celestial.rfU_2;
import com.google.common.collect.Lists;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.List;
import org.lwjgl.BufferUtils;

public class Nn_1 {
    private final List<ByteBuffer> id_class = Lists.newArrayList();
    private final int id_break;
    public int id_byte;
    private ByteBuffer id_protected;

    public Nn_1(int n) {
        this.id_break = n + 1 & 0xFFFFFFFE;
        this.id_break();
    }

    public ByteBuffer id_class() {
        ((Buffer)this.id_protected).flip();
        if (this.id_class.isEmpty()) {
            return this.id_protected;
        }
        ByteBuffer byteBuffer = BufferUtils.createByteBuffer((int)this.id_byte);
        this.id_class.forEach(byteBuffer::put);
        byteBuffer.put(this.id_protected);
        ((Buffer)byteBuffer).flip();
        return byteBuffer;
    }

    public void id_class(float f) {
        if (this.id_protected.remaining() == 0) {
            ((Buffer)this.id_protected).flip();
            this.id_class.add(this.id_protected);
            this.id_break();
        }
        int n = rfU_2.id_class((int)(f * 32767.5f - 0.5f), Short.MIN_VALUE, Short.MAX_VALUE);
        this.id_protected.putShort((short)n);
        this.id_byte += 2;
    }

    private void id_break() {
        this.id_protected = BufferUtils.createByteBuffer((int)this.id_break);
    }
}

