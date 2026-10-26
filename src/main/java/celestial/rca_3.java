/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVi_1;
import celestial.rcZ_2;
import celestial.rci_3;
import celestial.rcv_3;
import celestial.rgN_2;
import celestial.rgP_2;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Objects;

public class rca_3
implements rcZ_2 {
    public static final rcv_3<rca_3> id_class = new rci_3();
    private static final rca_3 id_break = new rca_3("");
    private final String id_byte;

    @Override
    public /* synthetic */ rcZ_2 id_byte() {
        return this.id_protected();
    }

    private rca_3(String string) {
        Objects.requireNonNull(string, "Null string not allowed");
        this.id_byte = string;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof rca_3 && Objects.equals(this.id_byte, ((rca_3)object).id_byte);
    }

    @Override
    public String toString() {
        return rca_3.id_break(this.id_byte);
    }

    public int hashCode() {
        return this.id_byte.hashCode();
    }

    public static rca_3 id_class(String string) {
        return string.isEmpty() ? id_break : new rca_3(string);
    }

    @Override
    public byte id_class() {
        return 8;
    }

    @Override
    public rgP_2 id_class(String string, int n) {
        String string2 = rca_3.id_break(this.id_byte);
        String string3 = string2.substring(0, 1);
        rVi_1 rVi_12 = new rgN_2(string2.substring(1, string2.length() - 1)).id_class(id_throws);
        return new rgN_2(string3).id_class(rVi_12).id_break(string3);
    }

    @Override
    public void id_class(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(this.id_byte);
    }

    public static String id_break(String string) {
        StringBuilder stringBuilder = new StringBuilder(" ");
        char c = '\u0000';
        for (int i = 0; i < string.length(); ++i) {
            char c2 = string.charAt(i);
            if (c2 == '\\') {
                stringBuilder.append('\\');
            } else if (c2 == '\"' || c2 == '\'') {
                if (c == '\u0000') {
                    c = (char)(c2 == '\"' ? 39 : 34);
                }
                if (c == c2) {
                    stringBuilder.append('\\');
                }
            }
            stringBuilder.append(c2);
        }
        if (c == '\u0000') {
            c = '\"';
        }
        stringBuilder.setCharAt(0, c);
        stringBuilder.append(c);
        return stringBuilder.toString();
    }

    public rcv_3<rca_3> id_break() {
        return id_class;
    }

    public rca_3 id_protected() {
        return this;
    }

    @Override
    public String id_native() {
        return this.id_byte;
    }
}

