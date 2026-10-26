/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  org.apache.commons.io.IOUtils
 */
package celestial;

import celestial.rAF;
import celestial.rAo_1;
import celestial.rpY_2;
import celestial.rqO_2;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.IOUtils;

public class rAR
implements rAF {
    private final String id_class;
    private final rqO_2 id_break;
    private final InputStream id_byte;
    private final InputStream id_protected;
    private boolean id_throws;
    private JsonObject id_case;

    @Override
    public String id_byte() {
        return this.id_class;
    }

    public rAR(String string, rqO_2 rqO_22, InputStream inputStream, InputStream inputStream2) {
        this.id_class = string;
        this.id_break = rqO_22;
        this.id_byte = inputStream;
        this.id_protected = inputStream2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof rAR)) {
            return false;
        }
        rAR rAR2 = (rAR)object;
        if (this.id_break != null ? !this.id_break.equals(rAR2.id_break) : rAR2.id_break != null) {
            return false;
        }
        return !(this.id_class != null ? !this.id_class.equals(rAR2.id_class) : rAR2.id_class != null);
    }

    public int hashCode() {
        int n = this.id_class != null ? this.id_class.hashCode() : 0;
        return 31 * n + (this.id_break != null ? this.id_break.hashCode() : 0);
    }

    @Override
    public <T> T id_class(rAo_1<T> rAo_12) {
        Object object;
        if (!this.id_protected()) {
            return null;
        }
        if (this.id_case == null && !this.id_throws) {
            this.id_throws = true;
            object = null;
            try {
                object = new BufferedReader(new InputStreamReader(this.id_protected, StandardCharsets.UTF_8));
                this.id_case = rpY_2.id_class((Reader)object);
            }
            finally {
                IOUtils.closeQuietly((Reader)object);
            }
        }
        if (this.id_case == null) {
            return null;
        }
        object = rAo_12.id_class();
        return this.id_case.has((String)object) ? (T)rAo_12.id_break(rpY_2.id_native(this.id_case, (String)object)) : null;
    }

    @Override
    public rqO_2 id_class() {
        return this.id_break;
    }

    @Override
    public void close() throws IOException {
        this.id_byte.close();
        if (this.id_protected != null) {
            this.id_protected.close();
        }
    }

    @Override
    public InputStream id_break() {
        return this.id_byte;
    }

    public boolean id_protected() {
        return this.id_protected != null;
    }
}

