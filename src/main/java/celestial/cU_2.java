/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hz_1;
import celestial.Ml_1;
import celestial.ch_3;
import celestial.rdn_3;

public final class cU_2
extends Enum<cU_2> {
    public static final /* enum */ cU_2 ABOVE = new cU_2(0, 0, 28, 32, 8);
    public static final /* enum */ cU_2 BELOW = new cU_2(84, 0, 28, 32, 8);
    public static final /* enum */ cU_2 LEFT = new cU_2(0, 64, 32, 28, 5);
    public static final /* enum */ cU_2 RIGHT = new cU_2(96, 64, 32, 28, 5);
    private final int textureX;
    private final int textureY;
    private final int width;
    private final int height;
    private final int max;
    private static final /* synthetic */ cU_2[] $VALUES;

    private cU_2(int n2, int n3, int n4, int n5, int n6) {
        this.textureX = n2;
        this.textureY = n3;
        this.width = n4;
        this.height = n5;
        this.max = n6;
    }

    static {
        $VALUES = cU_2.id_break();
    }

    public static cU_2[] values() {
        return (cU_2[])$VALUES.clone();
    }

    public static cU_2 valueOf(String string) {
        return Enum.valueOf(cU_2.class, string);
    }

    public int id_class(int n) {
        switch (this) {
            case ABOVE: {
                return (this.width + 4) * n;
            }
            case BELOW: {
                return (this.width + 4) * n;
            }
            case LEFT: {
                return -this.width + 4;
            }
            case RIGHT: {
                return 248;
            }
        }
        throw new UnsupportedOperationException("Don't know what this tab type is!" + this);
    }

    public boolean id_class(int n, int n2, int n3, double d, double d2) {
        int n4 = n + this.id_class(n3);
        int n5 = n2 + this.id_break(n3);
        return d > (double)n4 && d < (double)(n4 + this.width) && d2 > (double)n5 && d2 < (double)(n5 + this.height);
    }

    public void id_class(int n, int n2, int n3, Hz_1 hz_1, rdn_3 rdn_32) {
        int n4 = n + this.id_class(n3);
        int n5 = n2 + this.id_break(n3);
        switch (this) {
            case ABOVE: {
                n4 += 6;
                n5 += 9;
                break;
            }
            case BELOW: {
                n4 += 6;
                n5 += 6;
                break;
            }
            case LEFT: {
                n4 += 10;
                n5 += 5;
                break;
            }
            case RIGHT: {
                n4 += 6;
                n5 += 5;
            }
        }
        hz_1.id_break(rdn_32, n4, n5);
    }

    public void id_class(Ml_1 ml_1, ch_3 ch_32, int n, int n2, boolean bl, int n3) {
        int n4 = this.textureX;
        if (n3 > 0) {
            n4 += this.width;
        }
        if (n3 == this.max - 1) {
            n4 += this.width;
        }
        int n5 = bl ? this.textureY + this.height : this.textureY;
        ch_32.id_break(ml_1, n + this.id_class(n3), n2 + this.id_break(n3), n4, n5, this.width, this.height);
    }

    public int id_class() {
        return this.max;
    }

    public int id_break(int n) {
        switch (this) {
            case ABOVE: {
                return -this.height + 4;
            }
            case BELOW: {
                return 136;
            }
            case LEFT: {
                return this.height * n;
            }
            case RIGHT: {
                return this.height * n;
            }
        }
        throw new UnsupportedOperationException("Don't know what this tab type is!" + this);
    }

    private static /* synthetic */ cU_2[] id_break() {
        return new cU_2[]{ABOVE, BELOW, LEFT, RIGHT};
    }
}

