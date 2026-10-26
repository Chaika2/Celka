/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.an_3;
import celestial.rfU_2;
import celestial.rjU_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rvc_3
implements ruS_2<At_1> {
    private int id_class;
    private int id_break;
    private int id_byte;
    private int id_protected;

    public int id_byte() {
        return this.id_break;
    }

    public void id_byte(int n) {
        this.id_protected = n;
    }

    public rvc_3() {
    }

    public rvc_3(int n, rjU_2 rjU_22) {
        this.id_class = n;
        double d = 3.9;
        double d2 = rfU_2.id_class(rjU_22.id_break, -3.9, 3.9);
        double d3 = rfU_2.id_class(rjU_22.id_byte, -3.9, 3.9);
        double d4 = rfU_2.id_class(rjU_22.id_protected, -3.9, 3.9);
        this.id_break = (int)(d2 * 8000.0);
        this.id_byte = (int)(d3 * 8000.0);
        this.id_protected = (int)(d4 * 8000.0);
    }

    public rvc_3(an_3 an_32) {
        this(an_32.V(), an_32.rv());
    }

    public String toString() {
        return "SEntityVelocityPacket{entityID=" + this.id_class + ", motionX=" + this.id_break + ", motionY=" + this.id_byte + ", motionZ=" + this.id_protected + "}";
    }

    @Override
    public void id_class(int n) {
        this.id_break = n;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_case();
        this.id_break = ruu_32.readShort();
        this.id_byte = ruu_32.readShort();
        this.id_protected = ruu_32.readShort();
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class);
        ruu_32.writeShort(this.id_break);
        ruu_32.writeShort(this.id_byte);
        ruu_32.writeShort(this.id_protected);
    }

    public void id_break(int n) {
        this.id_byte = n;
    }

    public int id_break() {
        return this.id_class;
    }

    public int id_throws() {
        return this.id_protected;
    }

    public int id_protected() {
        return this.id_byte;
    }
}

