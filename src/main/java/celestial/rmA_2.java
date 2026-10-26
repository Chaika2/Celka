/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.AH;
import celestial.ruS_2;
import celestial.ruu_3;
import celestial.ryK_2;
import celestial.ryo_3;
import java.io.IOException;
import java.security.PublicKey;

public class rmA_2
implements ruS_2<AH> {
    private String id_class;
    private byte[] id_break;
    private byte[] id_byte;

    public PublicKey id_byte() throws ryo_3 {
        return ryK_2.id_class(this.id_break);
    }

    public rmA_2() {
    }

    public rmA_2(String string, byte[] byArray, byte[] byArray2) {
        this.id_class = string;
        this.id_break = byArray;
        this.id_byte = byArray2;
    }

    @Override
    public void id_class(AH aH) {
        aH.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_throws(20);
        this.id_break = ruu_32.id_class();
        this.id_byte = ruu_32.id_class();
    }

    public String id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
        ruu_32.id_class(this.id_break);
        ruu_32.id_class(this.id_byte);
    }

    public byte[] id_protected() {
        return this.id_byte;
    }
}

