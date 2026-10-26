/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.system.MemoryUtil
 */
package celestial;

import celestial.fL_2;
import java.io.EOFException;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import org.lwjgl.system.MemoryUtil;

public class fA_2
extends fL_2 {
    private final ReadableByteChannel id_break;
    private long id_byte = MemoryUtil.nmemAlloc((long)128L);
    private int id_protected = 128;
    private int id_throws;
    private int id_case;

    public fA_2(ReadableByteChannel readableByteChannel) {
        this.id_break = readableByteChannel;
    }

    @Override
    public void id_class(int n) throws IOException {
        if (n > 0) {
            this.id_break(n);
            if (n + this.id_case > this.id_throws) {
                throw new EOFException("Can't skip past the EOF.");
            }
        }
        if (this.id_case + n < 0) {
            throw new IOException("Can't seek before the beginning: " + (this.id_case + n));
        }
        this.id_case += n;
    }

    @Override
    public void close() throws IOException {
        MemoryUtil.nmemFree((long)this.id_byte);
        this.id_break.close();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void id_break(int n) throws IOException {
        ByteBuffer byteBuffer = MemoryUtil.memByteBuffer((long)this.id_byte, (int)this.id_protected);
        if (n + this.id_case > this.id_protected) {
            this.id_protected = n + this.id_case;
            byteBuffer = MemoryUtil.memRealloc((ByteBuffer)byteBuffer, (int)this.id_protected);
            this.id_byte = MemoryUtil.memAddress((ByteBuffer)byteBuffer);
        }
        ((Buffer)byteBuffer).position(this.id_throws);
        while (n + this.id_case > this.id_throws) {
            try {
                int n2 = this.id_break.read(byteBuffer);
                if (n2 != -1) continue;
                break;
            }
            finally {
                this.id_throws = byteBuffer.position();
            }
        }
    }

    @Override
    public int id_break(long l, int n) throws IOException {
        this.id_break(n);
        if (n + this.id_case > this.id_throws) {
            n = this.id_throws - this.id_case;
        }
        MemoryUtil.memCopy((long)(this.id_byte + (long)this.id_case), (long)l, (long)n);
        this.id_case += n;
        return n;
    }
}

