/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rVU;
import celestial.rgP_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;
import java.util.UUID;

public class rZK
implements ruS_2<At_1> {
    private rgP_2 id_class;
    private rVU id_break;
    private UUID id_byte;

    public boolean id_byte() {
        return this.id_break == rVU.SYSTEM || this.id_break == rVU.GAME_INFO;
    }

    public rZK() {
    }

    public rZK(rgP_2 rgP_22, rVU rVU2, UUID uUID) {
        this.id_class = rgP_22;
        this.id_break = rVU2;
        this.id_byte = uUID;
    }

    @Override
    public boolean id_class() {
        return true;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_throws();
        this.id_break = rVU.id_class(ruu_32.readByte());
        this.id_byte = ruu_32.id_private();
    }

    public rgP_2 id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
        ruu_32.writeByte(this.id_break.id_class());
        ruu_32.id_class(this.id_byte);
    }

    public UUID id_throws() {
        return this.id_byte;
    }

    public rVU id_protected() {
        return this.id_break;
    }
}

