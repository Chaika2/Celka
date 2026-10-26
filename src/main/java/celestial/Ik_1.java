/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.IL;
import celestial.IQ;

public class Ik_1 {
    public static final Ik_1 id_class = new Ik_1();
    public final IL id_break;
    public final IL id_byte;
    public final IL id_protected;
    public final IL id_throws;
    public final IL id_case;
    public final IL id_catch;
    public final IL id_private;
    public final IL id_implements;

    public Ik_1(IL iL, IL iL2, IL iL3, IL iL4, IL iL5, IL iL6, IL iL7, IL iL8) {
        this.id_break = iL;
        this.id_byte = iL2;
        this.id_protected = iL3;
        this.id_throws = iL4;
        this.id_case = iL5;
        this.id_catch = iL6;
        this.id_private = iL7;
        this.id_implements = iL8;
    }

    public Ik_1(Ik_1 ik_1) {
        this.id_break = ik_1.id_break;
        this.id_byte = ik_1.id_byte;
        this.id_protected = ik_1.id_protected;
        this.id_throws = ik_1.id_throws;
        this.id_case = ik_1.id_case;
        this.id_catch = ik_1.id_catch;
        this.id_private = ik_1.id_private;
        this.id_implements = ik_1.id_implements;
    }

    private Ik_1() {
        this(IL.id_class, IL.id_class, IL.id_class, IL.id_class, IL.id_class, IL.id_class, IL.id_class, IL.id_class);
    }

    public IL id_class(IQ iQ) {
        switch (iQ) {
            case THIRD_PERSON_LEFT_HAND: {
                return this.id_break;
            }
            case THIRD_PERSON_RIGHT_HAND: {
                return this.id_byte;
            }
            case FIRST_PERSON_LEFT_HAND: {
                return this.id_protected;
            }
            case FIRST_PERSON_RIGHT_HAND: {
                return this.id_throws;
            }
            case HEAD: {
                return this.id_case;
            }
            case GUI: {
                return this.id_catch;
            }
            case GROUND: {
                return this.id_private;
            }
            case FIXED: {
                return this.id_implements;
            }
        }
        return IL.id_class;
    }

    public boolean id_break(IQ iQ) {
        return this.id_class(iQ) != IL.id_class;
    }
}

