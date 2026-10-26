/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfU_2;
import java.util.function.IntUnaryOperator;

public class rWD
implements IntUnaryOperator {
    public final Integer id_class;
    public final Integer id_break;
    private final IntUnaryOperator id_byte;

    public rWD(Integer n4, Integer n5) {
        this.id_class = n4;
        this.id_break = n5;
        if (n4 == null) {
            if (n5 == null) {
                this.id_byte = n -> n;
            } else {
                int n6 = n5;
                this.id_byte = n2 -> Math.min(n6, n2);
            }
        } else {
            int n7 = n4;
            if (n5 == null) {
                this.id_byte = n2 -> Math.max(n7, n2);
            } else {
                int n8 = n5;
                this.id_byte = n3 -> rfU_2.id_class(n3, n7, n8);
            }
        }
    }

    public static rWD id_class(int n) {
        return new rWD(n, null);
    }

    public static rWD id_class(int n, int n2) {
        return new rWD(n, n2);
    }

    public static rWD id_break(int n) {
        return new rWD(null, n);
    }

    @Override
    public int applyAsInt(int n) {
        return this.id_byte.applyAsInt(n);
    }
}

