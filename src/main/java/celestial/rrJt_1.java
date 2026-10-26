/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpr_3;

public class rrJt_1 {
    private float id_class = Float.MAX_VALUE;
    private float id_break = Float.MAX_VALUE;
    private float id_byte = Float.MAX_VALUE;
    private float id_protected = -3.4028235E38f;
    private float id_throws = -3.4028235E38f;
    private float id_case = -3.4028235E38f;

    public float id_byte() {
        return this.id_byte;
    }

    public rrJt_1(int[] nArray) {
        int n = nArray.length / 4;
        for (int i = 0; i < 4; ++i) {
            int n2 = i * n;
            float f = Float.intBitsToFloat(nArray[n2 + 0]);
            float f2 = Float.intBitsToFloat(nArray[n2 + 1]);
            float f3 = Float.intBitsToFloat(nArray[n2 + 2]);
            if (this.id_class > f) {
                this.id_class = f;
            }
            if (this.id_break > f2) {
                this.id_break = f2;
            }
            if (this.id_byte > f3) {
                this.id_byte = f3;
            }
            if (this.id_protected < f) {
                this.id_protected = f;
            }
            if (this.id_throws < f2) {
                this.id_throws = f2;
            }
            if (!(this.id_case < f3)) continue;
            this.id_case = f3;
        }
    }

    public boolean id_class(rpr_3 rpr_32) {
        float f;
        float f2;
        float f3;
        switch (rpr_32) {
            case DOWN: {
                f3 = this.id_break();
                f2 = this.id_throws();
                f = 0.0f;
                break;
            }
            case UP: {
                f3 = this.id_break();
                f2 = this.id_throws();
                f = 1.0f;
                break;
            }
            case NORTH: {
                f3 = this.id_byte();
                f2 = this.id_case();
                f = 0.0f;
                break;
            }
            case SOUTH: {
                f3 = this.id_byte();
                f2 = this.id_case();
                f = 1.0f;
                break;
            }
            case WEST: {
                f3 = this.id_class();
                f2 = this.id_protected();
                f = 0.0f;
                break;
            }
            case EAST: {
                f3 = this.id_class();
                f2 = this.id_protected();
                f = 1.0f;
                break;
            }
            default: {
                return false;
            }
        }
        return f3 == f && f2 == f;
    }

    public float id_class() {
        return this.id_class;
    }

    public boolean id_break(rpr_3 rpr_32) {
        float f;
        float f2;
        float f3;
        float f4;
        switch (rpr_32) {
            case DOWN: 
            case UP: {
                f4 = this.id_class();
                f3 = this.id_protected();
                f2 = this.id_byte();
                f = this.id_case();
                break;
            }
            case NORTH: 
            case SOUTH: {
                f4 = this.id_class();
                f3 = this.id_protected();
                f2 = this.id_break();
                f = this.id_throws();
                break;
            }
            case WEST: 
            case EAST: {
                f4 = this.id_break();
                f3 = this.id_throws();
                f2 = this.id_byte();
                f = this.id_case();
                break;
            }
            default: {
                return false;
            }
        }
        return f4 == 0.0f && f3 == 1.0f && f2 == 0.0f && f == 1.0f;
    }

    public float id_break() {
        return this.id_break;
    }

    public float id_throws() {
        return this.id_throws;
    }

    public float id_case() {
        return this.id_case;
    }

    public float id_protected() {
        return this.id_protected;
    }
}

