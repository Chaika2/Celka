/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rnb_3;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;
import java.util.Objects;

public class rFH
implements ruS_2<At_1> {
    private String id_class = "";
    private String id_break;
    private int id_byte;
    private rnb_3 id_protected;

    public String id_byte() {
        return this.id_break;
    }

    public rFH() {
    }

    public rFH(rnb_3 rnb_32, String string, String string2, int n) {
        if (rnb_32 != rnb_3.REMOVE && string == null) {
            throw new IllegalArgumentException("Need an objective name");
        }
        this.id_class = string2;
        this.id_break = string;
        this.id_byte = n;
        this.id_protected = rnb_32;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_throws(40);
        this.id_protected = ruu_32.id_class(rnb_3.class);
        String string = ruu_32.id_throws(16);
        String string2 = this.id_break = Objects.equals(string, "") ? null : string;
        if (this.id_protected != rnb_3.REMOVE) {
            this.id_byte = ruu_32.id_case();
        }
    }

    public String id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
        ruu_32.id_class(this.id_protected);
        ruu_32.id_class(this.id_break == null ? "" : this.id_break);
        if (this.id_protected != rnb_3.REMOVE) {
            ruu_32.id_protected(this.id_byte);
        }
    }

    public rnb_3 id_throws() {
        return this.id_protected;
    }

    public int id_protected() {
        return this.id_byte;
    }
}

