/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class rFU {
    private final ByteArrayOutputStream id_class;
    private final DataOutputStream id_break;

    public rFU(int n) {
        this.id_class = new ByteArrayOutputStream(n);
        this.id_break = new DataOutputStream(this.id_class);
    }

    public void id_class(int n) throws IOException {
        this.id_break.write(n);
    }

    public void id_class(short s) throws IOException {
        this.id_break.writeShort(Short.reverseBytes(s));
    }

    public byte[] id_class() {
        return this.id_class.toByteArray();
    }

    public void id_class(String string) throws IOException {
        this.id_break.writeBytes(string);
        this.id_break.write(0);
    }

    public void id_class(byte[] byArray) throws IOException {
        this.id_break.write(byArray, 0, byArray.length);
    }

    public void id_break() {
        this.id_class.reset();
    }
}

