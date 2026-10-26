/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.stb.STBIWriteCallback
 */
package celestial;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.lwjgl.stb.STBIWriteCallback;

public class fm_3
extends STBIWriteCallback {
    private final WritableByteChannel id_class;
    private IOException id_break;

    public void invoke(long l, long l2, int n) {
        ByteBuffer byteBuffer = fm_3.getData((long)l2, (int)n);
        try {
            this.id_class.write(byteBuffer);
        }
        catch (IOException iOException) {
            this.id_break = iOException;
        }
    }

    public fm_3(WritableByteChannel writableByteChannel) {
        this.id_class = writableByteChannel;
    }

    public void id_class() throws IOException {
        if (this.id_break != null) {
            throw this.id_break;
        }
    }
}

