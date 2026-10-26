/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rFL;
import celestial.rRG;
import celestial.rRM;
import celestial.rRb_1;
import celestial.rgP_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;
import java.util.UUID;

public class rFv_1
implements ruS_2<At_1> {
    private UUID id_class;
    private rFL id_break;
    private rgP_2 id_byte;
    private float id_protected;
    private rRb_1 id_throws;
    private rRM id_case;
    private boolean id_catch;
    private boolean id_private;
    private boolean id_implements;

    public rFL id_byte() {
        return this.id_break;
    }

    public rFv_1() {
    }

    public rFv_1(rFL rFL2, rRG rRG2) {
        this.id_break = rFL2;
        this.id_class = rRG2.id_private();
        this.id_byte = rRG2.id_implements();
        this.id_protected = rRG2.id_class();
        this.id_throws = rRG2.id_finally();
        this.id_case = rRG2.id_extends();
        this.id_catch = rRG2.id_native();
        this.id_private = rRG2.id_volatile();
        this.id_implements = rRG2.id_final();
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    private void id_class(int n) {
        this.id_catch = (n & 1) > 0;
        this.id_private = (n & 2) > 0;
        this.id_implements = (n & 4) > 0;
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_private();
        this.id_break = ruu_32.id_class(rFL.class);
        switch (this.id_break) {
            case ADD: {
                this.id_byte = ruu_32.id_throws();
                this.id_protected = ruu_32.readFloat();
                this.id_throws = ruu_32.id_class(rRb_1.class);
                this.id_case = ruu_32.id_class(rRM.class);
                this.id_class(ruu_32.readUnsignedByte());
            }
            default: {
                break;
            }
            case UPDATE_PCT: {
                this.id_protected = ruu_32.readFloat();
                break;
            }
            case UPDATE_NAME: {
                this.id_byte = ruu_32.id_throws();
                break;
            }
            case UPDATE_STYLE: {
                this.id_throws = ruu_32.id_class(rRb_1.class);
                this.id_case = ruu_32.id_class(rRM.class);
                break;
            }
            case UPDATE_PROPERTIES: {
                this.id_class(ruu_32.readUnsignedByte());
            }
        }
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
        ruu_32.id_class(this.id_break);
        switch (this.id_break) {
            case ADD: {
                ruu_32.id_class(this.id_byte);
                ruu_32.writeFloat(this.id_protected);
                ruu_32.id_class(this.id_throws);
                ruu_32.id_class(this.id_case);
                ruu_32.writeByte(this.id_extends());
            }
            default: {
                break;
            }
            case UPDATE_PCT: {
                ruu_32.writeFloat(this.id_protected);
                break;
            }
            case UPDATE_NAME: {
                ruu_32.id_class(this.id_byte);
                break;
            }
            case UPDATE_STYLE: {
                ruu_32.id_class(this.id_throws);
                ruu_32.id_class(this.id_case);
                break;
            }
            case UPDATE_PROPERTIES: {
                ruu_32.writeByte(this.id_extends());
            }
        }
    }

    public UUID id_break() {
        return this.id_class;
    }

    public float id_throws() {
        return this.id_protected;
    }

    public boolean id_finally() {
        return this.id_implements;
    }

    public rRM id_catch() {
        return this.id_case;
    }

    private int id_extends() {
        int n = 0;
        if (this.id_catch) {
            n |= 1;
        }
        if (this.id_private) {
            n |= 2;
        }
        if (this.id_implements) {
            n |= 4;
        }
        return n;
    }

    public rRb_1 id_case() {
        return this.id_throws;
    }

    public boolean id_implements() {
        return this.id_private;
    }

    public rgP_2 id_protected() {
        return this.id_byte;
    }

    public boolean id_private() {
        return this.id_catch;
    }
}

