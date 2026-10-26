/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rdf_3;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rvL_2
implements ruS_2<At_1> {
    private int id_class;
    private rdf_3 id_break;
    private int id_byte;
    private int id_protected;
    private boolean id_throws;
    private boolean id_case;

    public rdf_3 id_byte() {
        return this.id_break;
    }

    public rvL_2() {
    }

    public rvL_2(int n, rdf_3 rdf_32, int n2, int n3, boolean bl, boolean bl2) {
        this.id_class = n;
        this.id_break = rdf_32;
        this.id_byte = n2;
        this.id_protected = n3;
        this.id_throws = bl;
        this.id_case = bl2;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_case();
        this.id_break = rdf_3.id_break(ruu_32);
        this.id_byte = ruu_32.id_case();
        this.id_protected = ruu_32.id_case();
        this.id_throws = ruu_32.readBoolean();
        this.id_case = ruu_32.readBoolean();
    }

    public int id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class);
        this.id_break.id_class(ruu_32);
        ruu_32.id_protected(this.id_byte);
        ruu_32.id_protected(this.id_protected);
        ruu_32.writeBoolean(this.id_throws);
        ruu_32.writeBoolean(this.id_case);
    }

    public int id_throws() {
        return this.id_protected;
    }

    public boolean id_catch() {
        return this.id_case;
    }

    public boolean id_case() {
        return this.id_throws;
    }

    public int id_protected() {
        return this.id_byte;
    }
}

