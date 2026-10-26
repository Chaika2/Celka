/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfa_3;
import celestial.rjY_2;
import celestial.rje_3;
import java.nio.FloatBuffer;
import java.util.Random;

public final class rjV_2
implements rfa_3 {
    public float id_class;
    public float id_break;
    public float id_byte;
    public float id_protected;
    public float id_throws;
    public float id_case;
    public float id_catch;
    public float id_private;
    public float id_implements;
    public float id_finally;
    public float id_extends;
    public float id_native;
    public float id_volatile;
    public float id_final;
    public float id_package;
    public float id_int;

    public float id_byte() {
        float f = this.id_class * this.id_case - this.id_break * this.id_throws;
        float f2 = this.id_class * this.id_catch - this.id_byte * this.id_throws;
        float f3 = this.id_class * this.id_private - this.id_protected * this.id_throws;
        float f4 = this.id_break * this.id_catch - this.id_byte * this.id_case;
        float f5 = this.id_break * this.id_private - this.id_protected * this.id_case;
        float f6 = this.id_byte * this.id_private - this.id_protected * this.id_catch;
        float f7 = this.id_implements * this.id_final - this.id_finally * this.id_volatile;
        float f8 = this.id_implements * this.id_package - this.id_extends * this.id_volatile;
        float f9 = this.id_implements * this.id_int - this.id_native * this.id_volatile;
        float f10 = this.id_finally * this.id_package - this.id_extends * this.id_final;
        float f11 = this.id_finally * this.id_int - this.id_native * this.id_final;
        float f12 = this.id_extends * this.id_int - this.id_native * this.id_package;
        float f13 = this.id_case * f12 - this.id_catch * f11 + this.id_private * f10;
        float f14 = -this.id_throws * f12 + this.id_catch * f9 - this.id_private * f8;
        float f15 = this.id_throws * f11 - this.id_case * f9 + this.id_private * f7;
        float f16 = -this.id_throws * f10 + this.id_case * f8 - this.id_catch * f7;
        float f17 = -this.id_break * f12 + this.id_byte * f11 - this.id_protected * f10;
        float f18 = this.id_class * f12 - this.id_byte * f9 + this.id_protected * f8;
        float f19 = -this.id_class * f11 + this.id_break * f9 - this.id_protected * f7;
        float f20 = this.id_class * f10 - this.id_break * f8 + this.id_byte * f7;
        float f21 = this.id_final * f6 - this.id_package * f5 + this.id_int * f4;
        float f22 = -this.id_volatile * f6 + this.id_package * f3 - this.id_int * f2;
        float f23 = this.id_volatile * f5 - this.id_final * f3 + this.id_int * f;
        float f24 = -this.id_volatile * f4 + this.id_final * f2 - this.id_package * f;
        float f25 = -this.id_finally * f6 + this.id_extends * f5 - this.id_native * f4;
        float f26 = this.id_implements * f6 - this.id_extends * f3 + this.id_native * f2;
        float f27 = -this.id_implements * f5 + this.id_finally * f3 - this.id_native * f;
        float f28 = this.id_implements * f4 - this.id_finally * f2 + this.id_extends * f;
        this.id_class = f13;
        this.id_throws = f14;
        this.id_implements = f15;
        this.id_volatile = f16;
        this.id_break = f17;
        this.id_case = f18;
        this.id_finally = f19;
        this.id_final = f20;
        this.id_byte = f21;
        this.id_catch = f22;
        this.id_extends = f23;
        this.id_package = f24;
        this.id_protected = f25;
        this.id_private = f26;
        this.id_native = f27;
        this.id_int = f28;
        return f * f12 - f2 * f11 + f3 * f10 + f4 * f9 - f5 * f8 + f6 * f7;
    }

    @Override
    public float id_byte(float f, float f2, float f3) {
        return this.id_throws * f + this.id_case * f2 + this.id_catch * f3 + this.id_private;
    }

    public float id_byte(float f, float f2, float f3, float f4) {
        return this.id_throws * f + this.id_case * f2 + this.id_catch * f3 + this.id_private * f4;
    }

    public void id_byte(rjV_2 rjV_22) {
        this.id_class += rjV_22.id_class;
        this.id_break += rjV_22.id_break;
        this.id_byte += rjV_22.id_byte;
        this.id_protected += rjV_22.id_protected;
        this.id_throws += rjV_22.id_throws;
        this.id_case += rjV_22.id_case;
        this.id_catch += rjV_22.id_catch;
        this.id_private += rjV_22.id_private;
        this.id_implements += rjV_22.id_implements;
        this.id_finally += rjV_22.id_finally;
        this.id_extends += rjV_22.id_extends;
        this.id_native += rjV_22.id_native;
        this.id_volatile += rjV_22.id_volatile;
        this.id_final += rjV_22.id_final;
        this.id_package += rjV_22.id_package;
        this.id_int += rjV_22.id_int;
    }

    private void id_byte(rjY_2 rjY_22) {
        float f = rjY_22.id_class();
        float f2 = rjY_22.id_protected();
        float f3 = 2.0f * f * f;
        float f4 = 1.0f - f3;
        float f5 = 1.0f - f3;
        float f6 = f * f2;
        float f7 = 2.0f * f6;
        float f8 = 2.0f * -f6;
        float f9 = this.id_break * f4 + this.id_byte * f7;
        float f10 = this.id_break * f8 + this.id_byte * f5;
        float f11 = this.id_case * f4 + this.id_catch * f7;
        float f12 = this.id_case * f8 + this.id_catch * f5;
        float f13 = this.id_finally * f4 + this.id_extends * f7;
        float f14 = this.id_finally * f8 + this.id_extends * f5;
        float f15 = this.id_final * f4 + this.id_package * f7;
        float f16 = this.id_final * f8 + this.id_package * f5;
        this.id_break = f9;
        this.id_byte = f10;
        this.id_case = f11;
        this.id_catch = f12;
        this.id_finally = f13;
        this.id_extends = f14;
        this.id_final = f15;
        this.id_package = f16;
    }

    public rjV_2(float[] fArray) {
        this.id_class = fArray[0];
        this.id_break = fArray[1];
        this.id_byte = fArray[2];
        this.id_protected = fArray[3];
        this.id_throws = fArray[4];
        this.id_case = fArray[5];
        this.id_catch = fArray[6];
        this.id_private = fArray[7];
        this.id_implements = fArray[8];
        this.id_finally = fArray[9];
        this.id_extends = fArray[10];
        this.id_native = fArray[11];
        this.id_volatile = fArray[12];
        this.id_final = fArray[13];
        this.id_package = fArray[14];
        this.id_int = fArray[15];
    }

    public rjV_2(rjV_2 rjV_22) {
        this.id_class = rjV_22.id_class;
        this.id_break = rjV_22.id_break;
        this.id_byte = rjV_22.id_byte;
        this.id_protected = rjV_22.id_protected;
        this.id_throws = rjV_22.id_throws;
        this.id_case = rjV_22.id_case;
        this.id_catch = rjV_22.id_catch;
        this.id_private = rjV_22.id_private;
        this.id_implements = rjV_22.id_implements;
        this.id_finally = rjV_22.id_finally;
        this.id_extends = rjV_22.id_extends;
        this.id_native = rjV_22.id_native;
        this.id_volatile = rjV_22.id_volatile;
        this.id_final = rjV_22.id_final;
        this.id_package = rjV_22.id_package;
        this.id_int = rjV_22.id_int;
    }

    public rjV_2() {
    }

    public rjV_2(rjY_2 rjY_22) {
        float f = rjY_22.id_class();
        float f2 = rjY_22.id_break();
        float f3 = rjY_22.id_byte();
        float f4 = rjY_22.id_protected();
        float f5 = 2.0f * f * f;
        float f6 = 2.0f * f2 * f2;
        float f7 = 2.0f * f3 * f3;
        this.id_class = 1.0f - f6 - f7;
        this.id_case = 1.0f - f7 - f5;
        this.id_extends = 1.0f - f5 - f6;
        this.id_int = 1.0f;
        float f8 = f * f2;
        float f9 = f2 * f3;
        float f10 = f3 * f;
        float f11 = f * f4;
        float f12 = f2 * f4;
        float f13 = f3 * f4;
        this.id_throws = 2.0f * (f8 + f13);
        this.id_break = 2.0f * (f8 - f13);
        this.id_implements = 2.0f * (f10 - f12);
        this.id_byte = 2.0f * (f10 + f12);
        this.id_finally = 2.0f * (f9 + f11);
        this.id_catch = 2.0f * (f9 - f11);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            rjV_2 rjV_22 = (rjV_2)object;
            return Float.compare(rjV_22.id_class, this.id_class) == 0 && Float.compare(rjV_22.id_break, this.id_break) == 0 && Float.compare(rjV_22.id_byte, this.id_byte) == 0 && Float.compare(rjV_22.id_protected, this.id_protected) == 0 && Float.compare(rjV_22.id_throws, this.id_throws) == 0 && Float.compare(rjV_22.id_case, this.id_case) == 0 && Float.compare(rjV_22.id_catch, this.id_catch) == 0 && Float.compare(rjV_22.id_private, this.id_private) == 0 && Float.compare(rjV_22.id_implements, this.id_implements) == 0 && Float.compare(rjV_22.id_finally, this.id_finally) == 0 && Float.compare(rjV_22.id_extends, this.id_extends) == 0 && Float.compare(rjV_22.id_native, this.id_native) == 0 && Float.compare(rjV_22.id_volatile, this.id_volatile) == 0 && Float.compare(rjV_22.id_final, this.id_final) == 0 && Float.compare(rjV_22.id_package, this.id_package) == 0 && Float.compare(rjV_22.id_int, this.id_int) == 0;
        }
        return false;
    }

    public String toString() {
        String string = "Matrix4f:\n" + this.id_class + " " + this.id_break + " " + this.id_byte + " " + this.id_protected + "\n" + this.id_throws + " " + this.id_case + " " + this.id_catch + " " + this.id_private + "\n" + this.id_implements + " " + this.id_finally + " " + this.id_extends + " " + this.id_native + "\n" + this.id_volatile + " " + this.id_final + " " + this.id_package + " " + this.id_int + "\n";
        return string;
    }

    public int hashCode() {
        int n = this.id_class != 0.0f ? Float.floatToIntBits(this.id_class) : 0;
        n = 31 * n + (this.id_break != 0.0f ? Float.floatToIntBits(this.id_break) : 0);
        n = 31 * n + (this.id_byte != 0.0f ? Float.floatToIntBits(this.id_byte) : 0);
        n = 31 * n + (this.id_protected != 0.0f ? Float.floatToIntBits(this.id_protected) : 0);
        n = 31 * n + (this.id_throws != 0.0f ? Float.floatToIntBits(this.id_throws) : 0);
        n = 31 * n + (this.id_case != 0.0f ? Float.floatToIntBits(this.id_case) : 0);
        n = 31 * n + (this.id_catch != 0.0f ? Float.floatToIntBits(this.id_catch) : 0);
        n = 31 * n + (this.id_private != 0.0f ? Float.floatToIntBits(this.id_private) : 0);
        n = 31 * n + (this.id_implements != 0.0f ? Float.floatToIntBits(this.id_implements) : 0);
        n = 31 * n + (this.id_finally != 0.0f ? Float.floatToIntBits(this.id_finally) : 0);
        n = 31 * n + (this.id_extends != 0.0f ? Float.floatToIntBits(this.id_extends) : 0);
        n = 31 * n + (this.id_native != 0.0f ? Float.floatToIntBits(this.id_native) : 0);
        n = 31 * n + (this.id_volatile != 0.0f ? Float.floatToIntBits(this.id_volatile) : 0);
        n = 31 * n + (this.id_final != 0.0f ? Float.floatToIntBits(this.id_final) : 0);
        n = 31 * n + (this.id_package != 0.0f ? Float.floatToIntBits(this.id_package) : 0);
        return 31 * n + (this.id_int != 0.0f ? Float.floatToIntBits(this.id_int) : 0);
    }

    public static rjV_2 id_class(float f, float f2, float f3, float f4) {
        rjV_2 rjV_22 = new rjV_2();
        rjV_22.id_class = 2.0f / f;
        rjV_22.id_case = 2.0f / f2;
        float f5 = f4 - f3;
        rjV_22.id_extends = -2.0f / f5;
        rjV_22.id_int = 1.0f;
        rjV_22.id_protected = -1.0f;
        rjV_22.id_private = -1.0f;
        rjV_22.id_native = -(f4 + f3) / f5;
        return rjV_22;
    }

    public void id_class(rje_3 rje_32) {
        this.id_protected += rje_32.id_class();
        this.id_private += rje_32.id_break();
        this.id_native += rje_32.id_byte();
    }

    @Override
    public void id_class(rjY_2 rjY_22) {
        boolean bl;
        boolean bl2 = rjY_22.id_class() != 0.0f;
        boolean bl3 = rjY_22.id_break() != 0.0f;
        boolean bl4 = bl = rjY_22.id_byte() != 0.0f;
        if (bl2) {
            if (!bl3 && !bl) {
                this.id_byte(rjY_22);
            } else {
                this.id_case(rjY_22);
            }
        } else if (bl3) {
            if (!bl) {
                this.id_protected(rjY_22);
            } else {
                this.id_case(rjY_22);
            }
        } else if (bl) {
            this.id_throws(rjY_22);
        }
    }

    public void id_class(Random random) {
        this.id_class = random.nextFloat();
        this.id_break = random.nextFloat();
        this.id_byte = random.nextFloat();
        this.id_protected = random.nextFloat();
        this.id_throws = random.nextFloat();
        this.id_case = random.nextFloat();
        this.id_catch = random.nextFloat();
        this.id_private = random.nextFloat();
        this.id_implements = random.nextFloat();
        this.id_finally = random.nextFloat();
        this.id_extends = random.nextFloat();
        this.id_native = random.nextFloat();
        this.id_volatile = random.nextFloat();
        this.id_final = random.nextFloat();
        this.id_package = random.nextFloat();
        this.id_int = random.nextFloat();
    }

    public void id_class(float[] fArray) {
        fArray[0] = this.id_class;
        fArray[1] = this.id_break;
        fArray[2] = this.id_byte;
        fArray[3] = this.id_protected;
        fArray[4] = this.id_throws;
        fArray[5] = this.id_case;
        fArray[6] = this.id_catch;
        fArray[7] = this.id_private;
        fArray[8] = this.id_implements;
        fArray[9] = this.id_finally;
        fArray[10] = this.id_extends;
        fArray[11] = this.id_native;
        fArray[12] = this.id_volatile;
        fArray[13] = this.id_final;
        fArray[14] = this.id_package;
        fArray[15] = this.id_int;
    }

    public void id_class() {
        this.id_class = 1.0f;
        this.id_break = 0.0f;
        this.id_byte = 0.0f;
        this.id_protected = 0.0f;
        this.id_throws = 0.0f;
        this.id_case = 1.0f;
        this.id_catch = 0.0f;
        this.id_private = 0.0f;
        this.id_implements = 0.0f;
        this.id_finally = 0.0f;
        this.id_extends = 1.0f;
        this.id_native = 0.0f;
        this.id_volatile = 0.0f;
        this.id_final = 0.0f;
        this.id_package = 0.0f;
        this.id_int = 1.0f;
    }

    public void id_class(FloatBuffer floatBuffer) {
        if (floatBuffer.remaining() < 16) {
            throw new IllegalArgumentException("Not enough space in buffer");
        }
        this.id_break(floatBuffer);
    }

    public void id_class(rjV_2 rjV_22) {
        float f = this.id_class * rjV_22.id_class + this.id_break * rjV_22.id_throws + this.id_byte * rjV_22.id_implements + this.id_protected * rjV_22.id_volatile;
        float f2 = this.id_class * rjV_22.id_break + this.id_break * rjV_22.id_case + this.id_byte * rjV_22.id_finally + this.id_protected * rjV_22.id_final;
        float f3 = this.id_class * rjV_22.id_byte + this.id_break * rjV_22.id_catch + this.id_byte * rjV_22.id_extends + this.id_protected * rjV_22.id_package;
        float f4 = this.id_class * rjV_22.id_protected + this.id_break * rjV_22.id_private + this.id_byte * rjV_22.id_native + this.id_protected * rjV_22.id_int;
        float f5 = this.id_throws * rjV_22.id_class + this.id_case * rjV_22.id_throws + this.id_catch * rjV_22.id_implements + this.id_private * rjV_22.id_volatile;
        float f6 = this.id_throws * rjV_22.id_break + this.id_case * rjV_22.id_case + this.id_catch * rjV_22.id_finally + this.id_private * rjV_22.id_final;
        float f7 = this.id_throws * rjV_22.id_byte + this.id_case * rjV_22.id_catch + this.id_catch * rjV_22.id_extends + this.id_private * rjV_22.id_package;
        float f8 = this.id_throws * rjV_22.id_protected + this.id_case * rjV_22.id_private + this.id_catch * rjV_22.id_native + this.id_private * rjV_22.id_int;
        float f9 = this.id_implements * rjV_22.id_class + this.id_finally * rjV_22.id_throws + this.id_extends * rjV_22.id_implements + this.id_native * rjV_22.id_volatile;
        float f10 = this.id_implements * rjV_22.id_break + this.id_finally * rjV_22.id_case + this.id_extends * rjV_22.id_finally + this.id_native * rjV_22.id_final;
        float f11 = this.id_implements * rjV_22.id_byte + this.id_finally * rjV_22.id_catch + this.id_extends * rjV_22.id_extends + this.id_native * rjV_22.id_package;
        float f12 = this.id_implements * rjV_22.id_protected + this.id_finally * rjV_22.id_private + this.id_extends * rjV_22.id_native + this.id_native * rjV_22.id_int;
        float f13 = this.id_volatile * rjV_22.id_class + this.id_final * rjV_22.id_throws + this.id_package * rjV_22.id_implements + this.id_int * rjV_22.id_volatile;
        float f14 = this.id_volatile * rjV_22.id_break + this.id_final * rjV_22.id_case + this.id_package * rjV_22.id_finally + this.id_int * rjV_22.id_final;
        float f15 = this.id_volatile * rjV_22.id_byte + this.id_final * rjV_22.id_catch + this.id_package * rjV_22.id_extends + this.id_int * rjV_22.id_package;
        float f16 = this.id_volatile * rjV_22.id_protected + this.id_final * rjV_22.id_private + this.id_package * rjV_22.id_native + this.id_int * rjV_22.id_int;
        this.id_class = f;
        this.id_break = f2;
        this.id_byte = f3;
        this.id_protected = f4;
        this.id_throws = f5;
        this.id_case = f6;
        this.id_catch = f7;
        this.id_private = f8;
        this.id_implements = f9;
        this.id_finally = f10;
        this.id_extends = f11;
        this.id_native = f12;
        this.id_volatile = f13;
        this.id_final = f14;
        this.id_package = f15;
        this.id_int = f16;
    }

    public static rjV_2 id_class(double d, float f, float f2, float f3) {
        float f4 = (float)(1.0 / Math.tan(d * 0.01745329238474369 / 2.0));
        rjV_2 rjV_22 = new rjV_2();
        rjV_22.id_class = f4 / f;
        rjV_22.id_case = f4;
        rjV_22.id_extends = (f3 + f2) / (f2 - f3);
        rjV_22.id_package = -1.0f;
        rjV_22.id_native = 2.0f * f3 * f2 / (f2 - f3);
        return rjV_22;
    }

    public void id_class(float f) {
        this.id_class *= f;
        this.id_break *= f;
        this.id_byte *= f;
        this.id_protected *= f;
        this.id_throws *= f;
        this.id_case *= f;
        this.id_catch *= f;
        this.id_private *= f;
        this.id_implements *= f;
        this.id_finally *= f;
        this.id_extends *= f;
        this.id_native *= f;
        this.id_volatile *= f;
        this.id_final *= f;
        this.id_package *= f;
        this.id_int *= f;
    }

    @Override
    public void id_class(float f, float f2, float f3) {
        this.id_protected = this.id_class * f + this.id_break * f2 + this.id_byte * f3 + this.id_protected;
        this.id_private = this.id_throws * f + this.id_case * f2 + this.id_catch * f3 + this.id_private;
        this.id_native = this.id_implements * f + this.id_finally * f2 + this.id_extends * f3 + this.id_native;
        this.id_int = this.id_volatile * f + this.id_final * f2 + this.id_package * f3 + this.id_int;
    }

    public void id_break(rjV_2 rjV_22) {
        this.id_class = rjV_22.id_class;
        this.id_break = rjV_22.id_break;
        this.id_byte = rjV_22.id_byte;
        this.id_protected = rjV_22.id_protected;
        this.id_throws = rjV_22.id_throws;
        this.id_case = rjV_22.id_case;
        this.id_catch = rjV_22.id_catch;
        this.id_private = rjV_22.id_private;
        this.id_implements = rjV_22.id_implements;
        this.id_finally = rjV_22.id_finally;
        this.id_extends = rjV_22.id_extends;
        this.id_native = rjV_22.id_native;
        this.id_volatile = rjV_22.id_volatile;
        this.id_final = rjV_22.id_final;
        this.id_package = rjV_22.id_package;
        this.id_int = rjV_22.id_int;
    }

    private void id_break(FloatBuffer floatBuffer) {
        floatBuffer.put(0, this.id_class);
        floatBuffer.put(1, this.id_throws);
        floatBuffer.put(2, this.id_implements);
        floatBuffer.put(3, this.id_volatile);
        floatBuffer.put(4, this.id_break);
        floatBuffer.put(5, this.id_case);
        floatBuffer.put(6, this.id_finally);
        floatBuffer.put(7, this.id_final);
        floatBuffer.put(8, this.id_byte);
        floatBuffer.put(9, this.id_catch);
        floatBuffer.put(10, this.id_extends);
        floatBuffer.put(11, this.id_package);
        floatBuffer.put(12, this.id_protected);
        floatBuffer.put(13, this.id_private);
        floatBuffer.put(14, this.id_native);
        floatBuffer.put(15, this.id_int);
    }

    @Override
    public float id_break(float f, float f2, float f3) {
        return this.id_class * f + this.id_break * f2 + this.id_byte * f3 + this.id_protected;
    }

    public void id_break(rjY_2 rjY_22) {
        boolean bl;
        boolean bl2 = rjY_22.id_class() != 0.0f;
        boolean bl3 = rjY_22.id_break() != 0.0f;
        boolean bl4 = bl = rjY_22.id_byte() != 0.0f;
        if (bl2) {
            if (!bl3 && !bl) {
                this.id_byte(rjY_22);
            } else {
                this.id_case(rjY_22);
            }
        } else if (bl3) {
            if (!bl) {
                this.id_protected(rjY_22);
            } else {
                this.id_case(rjY_22);
            }
        } else if (bl) {
            this.id_throws(rjY_22);
        }
    }

    public float id_break(float f, float f2, float f3, float f4) {
        return this.id_class * f + this.id_break * f2 + this.id_byte * f3 + this.id_protected * f4;
    }

    public boolean id_break() {
        return this.id_class == 1.0f && this.id_break == 0.0f && this.id_byte == 0.0f && this.id_protected == 0.0f && this.id_throws == 0.0f && this.id_case == 1.0f && this.id_catch == 0.0f && this.id_private == 0.0f && this.id_implements == 0.0f && this.id_finally == 0.0f && this.id_extends == 1.0f && this.id_native == 0.0f && this.id_volatile == 0.0f && this.id_final == 0.0f && this.id_package == 0.0f && this.id_int == 1.0f;
    }

    private void id_throws(rjY_2 rjY_22) {
        float f = rjY_22.id_byte();
        float f2 = rjY_22.id_protected();
        float f3 = 2.0f * f * f;
        float f4 = 1.0f - f3;
        float f5 = 1.0f - f3;
        float f6 = f * f2;
        float f7 = 2.0f * f6;
        float f8 = 2.0f * -f6;
        float f9 = this.id_class * f4 + this.id_break * f7;
        float f10 = this.id_class * f8 + this.id_break * f5;
        float f11 = this.id_throws * f4 + this.id_case * f7;
        float f12 = this.id_throws * f8 + this.id_case * f5;
        float f13 = this.id_implements * f4 + this.id_finally * f7;
        float f14 = this.id_implements * f8 + this.id_finally * f5;
        float f15 = this.id_volatile * f4 + this.id_final * f7;
        float f16 = this.id_volatile * f8 + this.id_final * f5;
        this.id_class = f9;
        this.id_break = f10;
        this.id_throws = f11;
        this.id_case = f12;
        this.id_implements = f13;
        this.id_finally = f14;
        this.id_volatile = f15;
        this.id_final = f16;
    }

    public static rjV_2 id_throws(float f, float f2, float f3) {
        rjV_2 rjV_22 = new rjV_2();
        rjV_22.id_class = f;
        rjV_22.id_case = f2;
        rjV_22.id_extends = f3;
        rjV_22.id_int = 1.0f;
        return rjV_22;
    }

    public float id_throws(float f, float f2, float f3, float f4) {
        return this.id_volatile * f + this.id_final * f2 + this.id_package * f3 + this.id_int * f4;
    }

    public boolean id_throws() {
        float f = this.id_byte();
        if (Math.abs(f) > 1.0E-6f) {
            this.id_class(f);
            return true;
        }
        return false;
    }

    public float id_catch() {
        return (float)Math.sqrt(this.id_class * this.id_class + this.id_throws * this.id_throws + this.id_implements * this.id_implements);
    }

    public void id_catch(float f, float f2, float f3) {
        this.id_protected += this.id_class * f + this.id_break * f2 + this.id_byte * f3;
        this.id_private += this.id_throws * f + this.id_case * f2 + this.id_catch * f3;
        this.id_native += this.id_implements * f + this.id_finally * f2 + this.id_extends * f3;
        this.id_int += this.id_volatile * f + this.id_final * f2 + this.id_package * f3;
    }

    private void id_case(rjY_2 rjY_22) {
        float f = rjY_22.id_class();
        float f2 = rjY_22.id_break();
        float f3 = rjY_22.id_byte();
        float f4 = rjY_22.id_protected();
        float f5 = 2.0f * f * f;
        float f6 = 2.0f * f2 * f2;
        float f7 = 2.0f * f3 * f3;
        float f8 = 1.0f - f6 - f7;
        float f9 = 1.0f - f7 - f5;
        float f10 = 1.0f - f5 - f6;
        float f11 = f * f2;
        float f12 = f2 * f3;
        float f13 = f3 * f;
        float f14 = f * f4;
        float f15 = f2 * f4;
        float f16 = f3 * f4;
        float f17 = 2.0f * (f11 + f16);
        float f18 = 2.0f * (f11 - f16);
        float f19 = 2.0f * (f13 - f15);
        float f20 = 2.0f * (f13 + f15);
        float f21 = 2.0f * (f12 + f14);
        float f22 = 2.0f * (f12 - f14);
        float f23 = this.id_class * f8 + this.id_break * f17 + this.id_byte * f19;
        float f24 = this.id_class * f18 + this.id_break * f9 + this.id_byte * f21;
        float f25 = this.id_class * f20 + this.id_break * f22 + this.id_byte * f10;
        float f26 = this.id_throws * f8 + this.id_case * f17 + this.id_catch * f19;
        float f27 = this.id_throws * f18 + this.id_case * f9 + this.id_catch * f21;
        float f28 = this.id_throws * f20 + this.id_case * f22 + this.id_catch * f10;
        float f29 = this.id_implements * f8 + this.id_finally * f17 + this.id_extends * f19;
        float f30 = this.id_implements * f18 + this.id_finally * f9 + this.id_extends * f21;
        float f31 = this.id_implements * f20 + this.id_finally * f22 + this.id_extends * f10;
        float f32 = this.id_volatile * f8 + this.id_final * f17 + this.id_package * f19;
        float f33 = this.id_volatile * f18 + this.id_final * f9 + this.id_package * f21;
        float f34 = this.id_volatile * f20 + this.id_final * f22 + this.id_package * f10;
        this.id_class = f23;
        this.id_break = f24;
        this.id_byte = f25;
        this.id_throws = f26;
        this.id_case = f27;
        this.id_catch = f28;
        this.id_implements = f29;
        this.id_finally = f30;
        this.id_extends = f31;
        this.id_volatile = f32;
        this.id_final = f33;
        this.id_package = f34;
    }

    public static rjV_2 id_case(float f, float f2, float f3) {
        rjV_2 rjV_22 = new rjV_2();
        rjV_22.id_class = 1.0f;
        rjV_22.id_case = 1.0f;
        rjV_22.id_extends = 1.0f;
        rjV_22.id_int = 1.0f;
        rjV_22.id_protected = f;
        rjV_22.id_private = f2;
        rjV_22.id_native = f3;
        return rjV_22;
    }

    public rjV_2 id_case() {
        return new rjV_2(this);
    }

    public void id_protected() {
        float f = this.id_throws;
        this.id_throws = this.id_break;
        this.id_break = f;
        f = this.id_implements;
        this.id_implements = this.id_byte;
        this.id_byte = f;
        f = this.id_finally;
        this.id_finally = this.id_catch;
        this.id_catch = f;
        f = this.id_volatile;
        this.id_volatile = this.id_protected;
        this.id_protected = f;
        f = this.id_final;
        this.id_final = this.id_private;
        this.id_private = f;
        f = this.id_package;
        this.id_package = this.id_native;
        this.id_native = f;
    }

    @Override
    public float id_protected(float f, float f2, float f3) {
        return this.id_implements * f + this.id_finally * f2 + this.id_extends * f3 + this.id_native;
    }

    public float id_protected(float f, float f2, float f3, float f4) {
        return this.id_implements * f + this.id_finally * f2 + this.id_extends * f3 + this.id_native * f4;
    }

    private void id_protected(rjY_2 rjY_22) {
        float f = rjY_22.id_break();
        float f2 = rjY_22.id_protected();
        float f3 = 2.0f * f * f;
        float f4 = 1.0f - f3;
        float f5 = 1.0f - f3;
        float f6 = f * f2;
        float f7 = 2.0f * -f6;
        float f8 = 2.0f * f6;
        float f9 = this.id_class * f4 + this.id_byte * f7;
        float f10 = this.id_class * f8 + this.id_byte * f5;
        float f11 = this.id_throws * f4 + this.id_catch * f7;
        float f12 = this.id_throws * f8 + this.id_catch * f5;
        float f13 = this.id_implements * f4 + this.id_extends * f7;
        float f14 = this.id_implements * f8 + this.id_extends * f5;
        float f15 = this.id_volatile * f4 + this.id_package * f7;
        float f16 = this.id_volatile * f8 + this.id_package * f5;
        this.id_class = f9;
        this.id_byte = f10;
        this.id_throws = f11;
        this.id_catch = f12;
        this.id_implements = f13;
        this.id_extends = f14;
        this.id_volatile = f15;
        this.id_package = f16;
    }

    public void id_private(float f, float f2, float f3) {
        this.id_class *= f;
        this.id_break *= f2;
        this.id_byte *= f3;
        this.id_throws *= f;
        this.id_case *= f2;
        this.id_catch *= f3;
        this.id_implements *= f;
        this.id_finally *= f2;
        this.id_extends *= f3;
        this.id_volatile *= f;
        this.id_final *= f2;
        this.id_package *= f3;
    }
}

