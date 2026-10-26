/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfj_3;
import celestial.roe_3;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public class roa_3
extends ByteArrayOutputStream {
    private final rfj_3 id_break;
    public final /* synthetic */ roe_3 id_class;

    public roa_3(roe_3 roe_32, rfj_3 rfj_32) {
        this.id_class = roe_32;
        super(8096);
        super.write(0);
        super.write(0);
        super.write(0);
        super.write(0);
        super.write(roe_32.id_case.id_class());
        this.id_break = rfj_32;
    }

    @Override
    public void close() throws IOException {
        ByteBuffer byteBuffer = ByteBuffer.wrap(this.buf, 0, this.count);
        byteBuffer.putInt(0, this.count - 5 + 1);
        this.id_class.id_class(this.id_break, byteBuffer);
    }
}

