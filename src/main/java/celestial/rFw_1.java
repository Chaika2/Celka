/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rFf_1;
import celestial.roE_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rFw_1
implements ruS_2<At_1> {
    private rFf_1 id_class;
    private int id_break;
    private double id_byte;
    private double id_protected;
    private double id_throws;
    private double id_case;
    private long id_catch;
    private int id_private;
    private int id_implements;

    public rFw_1() {
    }

    public rFw_1(roE_2 roE_22, rFf_1 rFf_12) {
        this.id_class = rFf_12;
        this.id_byte = roE_22.id_class();
        this.id_protected = roE_22.id_break();
        this.id_case = roE_22.id_implements();
        this.id_throws = roE_22.id_extends();
        this.id_catch = roE_22.id_finally();
        this.id_break = roE_22.id_volatile();
        this.id_implements = roE_22.id_continue();
        this.id_private = roE_22.id_new();
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(roE_2 roE_22) {
        switch (this.id_class) {
            case SET_SIZE: {
                roE_22.id_class(this.id_throws);
                break;
            }
            case LERP_SIZE: {
                roE_22.id_class(this.id_case, this.id_throws, this.id_catch);
                break;
            }
            case SET_CENTER: {
                roE_22.id_break(this.id_byte, this.id_protected);
                break;
            }
            case SET_WARNING_BLOCKS: {
                roE_22.id_byte(this.id_implements);
                break;
            }
            case SET_WARNING_TIME: {
                roE_22.id_break(this.id_private);
                break;
            }
            case INITIALIZE: {
                roE_22.id_break(this.id_byte, this.id_protected);
                if (this.id_catch > 0L) {
                    roE_22.id_class(this.id_case, this.id_throws, this.id_catch);
                } else {
                    roE_22.id_class(this.id_throws);
                }
                roE_22.id_class(this.id_break);
                roE_22.id_byte(this.id_implements);
                roE_22.id_break(this.id_private);
            }
        }
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_class(rFf_1.class);
        switch (this.id_class) {
            case SET_SIZE: {
                this.id_throws = ruu_32.readDouble();
                break;
            }
            case LERP_SIZE: {
                this.id_case = ruu_32.readDouble();
                this.id_throws = ruu_32.readDouble();
                this.id_catch = ruu_32.id_catch();
                break;
            }
            case SET_CENTER: {
                this.id_byte = ruu_32.readDouble();
                this.id_protected = ruu_32.readDouble();
                break;
            }
            case SET_WARNING_BLOCKS: {
                this.id_implements = ruu_32.id_case();
                break;
            }
            case SET_WARNING_TIME: {
                this.id_private = ruu_32.id_case();
                break;
            }
            case INITIALIZE: {
                this.id_byte = ruu_32.readDouble();
                this.id_protected = ruu_32.readDouble();
                this.id_case = ruu_32.readDouble();
                this.id_throws = ruu_32.readDouble();
                this.id_catch = ruu_32.id_catch();
                this.id_break = ruu_32.id_case();
                this.id_implements = ruu_32.id_case();
                this.id_private = ruu_32.id_case();
            }
        }
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
        switch (this.id_class) {
            case SET_SIZE: {
                ruu_32.writeDouble(this.id_throws);
                break;
            }
            case LERP_SIZE: {
                ruu_32.writeDouble(this.id_case);
                ruu_32.writeDouble(this.id_throws);
                ruu_32.id_class(this.id_catch);
                break;
            }
            case SET_CENTER: {
                ruu_32.writeDouble(this.id_byte);
                ruu_32.writeDouble(this.id_protected);
                break;
            }
            case SET_WARNING_BLOCKS: {
                ruu_32.id_protected(this.id_implements);
                break;
            }
            case SET_WARNING_TIME: {
                ruu_32.id_protected(this.id_private);
                break;
            }
            case INITIALIZE: {
                ruu_32.writeDouble(this.id_byte);
                ruu_32.writeDouble(this.id_protected);
                ruu_32.writeDouble(this.id_case);
                ruu_32.writeDouble(this.id_throws);
                ruu_32.id_class(this.id_catch);
                ruu_32.id_protected(this.id_break);
                ruu_32.id_protected(this.id_implements);
                ruu_32.id_protected(this.id_private);
            }
        }
    }
}

