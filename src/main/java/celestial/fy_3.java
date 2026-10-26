/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Vs_1;
import celestial.fH_2;
import celestial.fN_2;
import celestial.rAF;
import celestial.rAL;
import celestial.rqO_2;
import java.io.Closeable;
import java.io.IOException;

public class fy_3
implements Closeable {
    private final Vs_1 id_class;
    private final fN_2 id_break;
    private final IOException id_byte;

    public void id_byte() throws IOException {
        if (this.id_byte != null) {
            throw this.id_byte;
        }
    }

    public fy_3(IOException iOException) {
        this.id_byte = iOException;
        this.id_class = null;
        this.id_break = null;
    }

    public fy_3(Vs_1 vs_1, fN_2 fN_22) {
        this.id_byte = null;
        this.id_class = vs_1;
        this.id_break = fN_22;
    }

    public Vs_1 id_class() {
        return this.id_class;
    }

    public static fy_3 id_class(rAL rAL2, rqO_2 rqO_22) {
        fy_3 fy_32;
        block10: {
            rAF rAF2 = rAL2.id_class(rqO_22);
            try {
                fN_2 fN_22 = fN_2.id_class(rAF2.id_break());
                Vs_1 vs_1 = null;
                try {
                    vs_1 = rAF2.id_class(Vs_1.id_class);
                }
                catch (RuntimeException runtimeException) {
                    fH_2.id_class.warn("Failed reading metadata of: {}", (Object)rqO_22, (Object)runtimeException);
                }
                fy_32 = new fy_3(vs_1, fN_22);
                if (rAF2 == null) break block10;
            }
            catch (Throwable throwable) {
                try {
                    if (rAF2 != null) {
                        try {
                            rAF2.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException iOException) {
                    return new fy_3(iOException);
                }
            }
            rAF2.close();
        }
        return fy_32;
    }

    @Override
    public void close() {
        if (this.id_break != null) {
            this.id_break.close();
        }
    }

    public fN_2 id_break() throws IOException {
        if (this.id_byte != null) {
            throw this.id_byte;
        }
        return this.id_break;
    }
}

