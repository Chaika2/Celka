/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rAx_1;
import celestial.rqO_2;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class rAd_1
extends FilterInputStream {
    private final String id_class;
    private boolean id_break;

    public rAd_1(InputStream inputStream, rqO_2 rqO_22, String string) {
        super(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new Exception().printStackTrace(new PrintStream(byteArrayOutputStream));
        this.id_class = "Leaked resource: '" + rqO_22 + "' loaded from pack: '" + string + "'\n" + byteArrayOutputStream;
    }

    protected void finalize() throws Throwable {
        if (!this.id_break) {
            rAx_1.id_break.warn(this.id_class);
        }
        super.finalize();
    }

    @Override
    public void close() throws IOException {
        super.close();
        this.id_break = true;
    }
}

