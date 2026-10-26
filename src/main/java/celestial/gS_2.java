/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.util.Arrays;

public class gS_2 {
    private final char[] id_class;
    private int id_break;
    private final Runnable id_byte;

    public gS_2(char[] cArray, Runnable runnable) {
        this.id_byte = runnable;
        if (cArray.length < 1) {
            throw new IllegalArgumentException("Must have at least one char");
        }
        this.id_class = cArray;
    }

    public String toString() {
        return "KeyCombo{chars=" + Arrays.toString(this.id_class) + ", matchIndex=" + this.id_break + "}";
    }

    public boolean id_class(char c) {
        if (c == this.id_class[this.id_break++]) {
            if (this.id_break == this.id_class.length) {
                this.id_class();
                this.id_byte.run();
                return true;
            }
        } else {
            this.id_class();
        }
        return false;
    }

    public void id_class() {
        this.id_break = 0;
    }
}

