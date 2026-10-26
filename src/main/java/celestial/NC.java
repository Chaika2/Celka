/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.NH;
import celestial.Nl_1;
import celestial.Nz_1;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.sound.sampled.AudioFormat;

public class NC
implements Nz_1 {
    private final Nl_1 id_class;
    private Nz_1 id_break;
    private final BufferedInputStream id_byte;

    public NC(Nl_1 nl_1, InputStream inputStream) throws IOException {
        this.id_class = nl_1;
        this.id_byte = new BufferedInputStream(inputStream);
        this.id_byte.mark(Integer.MAX_VALUE);
        this.id_break = nl_1.create(new NH(this.id_byte));
    }

    @Override
    public ByteBuffer id_class(int n) throws IOException {
        ByteBuffer byteBuffer = this.id_break.id_class(n);
        if (!byteBuffer.hasRemaining()) {
            this.id_break.close();
            this.id_byte.reset();
            this.id_break = this.id_class.create(new NH(this.id_byte));
            byteBuffer = this.id_break.id_class(n);
        }
        return byteBuffer;
    }

    @Override
    public AudioFormat id_class() {
        return this.id_break.id_class();
    }

    @Override
    public void close() throws IOException {
        this.id_break.close();
        this.id_byte.close();
    }
}

