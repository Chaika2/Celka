/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.io.IOException;

public abstract class fL_2
implements AutoCloseable {
    protected boolean id_class;

    protected abstract void id_class(int var1) throws IOException;

    public int id_class(long l) {
        return this.id_class ? 1 : 0;
    }

    public int id_class(long l, long l2, int n) {
        try {
            return this.id_break(l2, n);
        }
        catch (IOException iOException) {
            this.id_class = true;
            return 0;
        }
    }

    public void id_class(long l, int n) {
        try {
            this.id_class(n);
        }
        catch (IOException iOException) {
            this.id_class = true;
        }
    }

    @Override
    public abstract void close() throws IOException;

    protected abstract int id_break(long var1, int var3) throws IOException;
}

