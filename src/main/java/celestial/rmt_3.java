/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rXa_1;
import celestial.rdn_3;
import celestial.rmH_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rmt_3
implements ruS_2<rmH_2> {
    private int id_class;
    private int id_break;
    private int id_byte;
    private short id_protected;
    private rdn_3 id_throws = rdn_3.id_break;
    private rXa_1 id_case;

    public int id_byte() {
        return this.id_break;
    }

    public rmt_3() {
    }

    public rmt_3(int n, int n2, int n3, rXa_1 rXa_12, rdn_3 rdn_32, short s) {
        this.id_class = n;
        this.id_break = n2;
        this.id_byte = n3;
        this.id_throws = rdn_32.id_implements();
        this.id_protected = s;
        this.id_case = rXa_12;
    }

    public String toString() {
        return "CClickWindowPacket(window=" + this.id_class + ", slot=" + this.id_break + ", button=" + this.id_byte + ", action=" + this.id_protected + ", mode=" + this.id_case + ", item=" + this.id_throws + ")";
    }

    @Override
    public void id_class(int n) {
        this.id_class = n;
    }

    @Override
    public void id_class(rmH_2 rmH_22) {
        rmH_22.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.readByte();
        this.id_break = ruu_32.readShort();
        this.id_byte = ruu_32.readByte();
        this.id_protected = ruu_32.readShort();
        this.id_case = ruu_32.id_class(rXa_1.class);
        this.id_throws = ruu_32.id_extends();
    }

    public int id_break() {
        return this.id_class;
    }

    public void id_break(int n) {
        this.id_break = n;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeByte(this.id_class);
        ruu_32.writeShort(this.id_break);
        ruu_32.writeByte(this.id_byte);
        ruu_32.writeShort(this.id_protected);
        ruu_32.id_class(this.id_case);
        ruu_32.id_class(this.id_throws);
    }

    public short id_throws() {
        return this.id_protected;
    }

    public rXa_1 id_catch() {
        return this.id_case;
    }

    public rdn_3 id_case() {
        return this.id_throws;
    }

    public int id_protected() {
        return this.id_byte;
    }
}

