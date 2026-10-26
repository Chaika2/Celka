/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import javax.sound.sampled.AudioFormat;

public interface Nz_1
extends Closeable {
    public AudioFormat id_class();

    public ByteBuffer id_class(int var1) throws IOException;
}

