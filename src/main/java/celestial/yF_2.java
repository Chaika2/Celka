/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpr_3;
import java.util.Set;

public class yF_2 {
    private static final int id_class = rpr_3.values().length;
    private long id_break;

    private void id_byte(int n) {
        this.id_break &= (long)(~(1 << n));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(' ');
        for (rpr_3 rpr_32 : rpr_3.values()) {
            stringBuilder.append(' ').append(rpr_32.toString().toUpperCase().charAt(0));
        }
        stringBuilder.append('\n');
        for (rpr_3 rpr_32 : rpr_3.values()) {
            stringBuilder.append(rpr_32.toString().toUpperCase().charAt(0));
            for (rpr_3 rpr_33 : rpr_3.values()) {
                if (rpr_32 == rpr_33) {
                    stringBuilder.append("  ");
                    continue;
                }
                boolean bl = this.id_class(rpr_32, rpr_33);
                stringBuilder.append(' ').append(bl ? (char)'Y' : 'n');
            }
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }

    private void id_class(int n, boolean bl) {
        if (bl) {
            this.id_break(n);
        } else {
            this.id_byte(n);
        }
    }

    public void id_class(Set<rpr_3> set) {
        for (rpr_3 rpr_32 : set) {
            for (rpr_3 rpr_33 : set) {
                this.id_class(rpr_32, rpr_33, true);
            }
        }
    }

    public void id_class(boolean bl) {
        this.id_break = bl ? -1L : 0L;
    }

    public boolean id_class(rpr_3 rpr_32, rpr_3 rpr_33) {
        return this.id_class(rpr_32.ordinal() + rpr_33.ordinal() * id_class);
    }

    public void id_class(rpr_3 rpr_32, rpr_3 rpr_33, boolean bl) {
        this.id_class(rpr_32.ordinal() + rpr_33.ordinal() * id_class, bl);
        this.id_class(rpr_33.ordinal() + rpr_32.ordinal() * id_class, bl);
    }

    private boolean id_class(int n) {
        return (this.id_break & (long)(1 << n)) != 0L;
    }

    private void id_break(int n) {
        this.id_break |= (long)(1 << n);
    }
}

