/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.system.MemoryUtil
 */
package celestial;

import celestial.fL_2;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import org.lwjgl.system.MemoryUtil;

public class fn_3
extends fL_2 {
    private final SeekableByteChannel id_break;

    public fn_3(SeekableByteChannel seekableByteChannel) {
        this.id_break = seekableByteChannel;
    }

    @Override
    public int id_class(long l) {
        return super.id_class(l) != 0 && this.id_break.isOpen() ? 1 : 0;
    }

    @Override
    public void id_class(int n) throws IOException {
        this.id_break.position(this.id_break.position() + (long)n);
    }

    @Override
    public void close() throws IOException {
        this.id_break.close();
    }

    @Override
    public int id_break(long l, int n) throws IOException {
        ByteBuffer byteBuffer = MemoryUtil.memByteBuffer((long)l, (int)n);
        return this.id_break.read(byteBuffer);
    }
}

