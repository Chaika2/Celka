/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  org.apache.commons.lang3.tuple.Triple
 */
package celestial;

import celestial.rfU_2;
import celestial.rfe_3;
import celestial.rjP_2;
import celestial.rjV_2;
import celestial.rjY_2;
import celestial.rja_3;
import celestial.rje_3;
import celestial.rpr_3;
import com.mojang.datafixers.util.Pair;
import java.util.Random;
import org.apache.commons.lang3.tuple.Triple;

public final class rjj_3
implements rfe_3 {
    private static final float id_finally = 3.0f + 2.0f * (float)Math.sqrt(2.0);
    private static final float id_extends = (float)Math.cos(0.39269908169872414);
    private static final float id_native = (float)Math.sin(0.39269908169872414);
    private static final float id_volatile = 1.0f / (float)Math.sqrt(2.0);
    protected float id_class;
    protected float id_break;
    protected float id_byte;
    protected float id_protected;
    protected float id_throws;
    protected float id_case;
    protected float id_catch;
    protected float id_private;
    protected float id_implements;

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
        float f11 = this.id_throws * f4 + this.id_case * f7;
        float f12 = this.id_throws * f8 + this.id_case * f5;
        float f13 = this.id_private * f4 + this.id_implements * f7;
        float f14 = this.id_private * f8 + this.id_implements * f5;
        this.id_break = f9;
        this.id_byte = f10;
        this.id_throws = f11;
        this.id_case = f12;
        this.id_private = f13;
        this.id_implements = f14;
    }

    public void id_byte(rjj_3 rjj_32) {
        rjj_3 rjj_33 = rjj_32.id_case();
        rjj_33.id_break(this);
        this.id_class(rjj_33);
    }

    @Override
    public float id_byte(float f, float f2, float f3) {
        return this.id_catch * f + this.id_private * f2 + this.id_implements * f3;
    }

    public void id_byte() {
        this.id_class = 1.0f;
        this.id_break = 0.0f;
        this.id_byte = 0.0f;
        this.id_protected = 0.0f;
        this.id_throws = 1.0f;
        this.id_case = 0.0f;
        this.id_catch = 0.0f;
        this.id_private = 0.0f;
        this.id_implements = 1.0f;
    }

    public rjj_3() {
    }

    public rjj_3(rjY_2 rjY_22) {
        float f = rjY_22.id_class();
        float f2 = rjY_22.id_break();
        float f3 = rjY_22.id_byte();
        float f4 = rjY_22.id_protected();
        float f5 = 2.0f * f * f;
        float f6 = 2.0f * f2 * f2;
        float f7 = 2.0f * f3 * f3;
        this.id_class = 1.0f - f6 - f7;
        this.id_throws = 1.0f - f7 - f5;
        this.id_implements = 1.0f - f5 - f6;
        float f8 = f * f2;
        float f9 = f2 * f3;
        float f10 = f3 * f;
        float f11 = f * f4;
        float f12 = f2 * f4;
        float f13 = f3 * f4;
        this.id_protected = 2.0f * (f8 + f13);
        this.id_break = 2.0f * (f8 - f13);
        this.id_catch = 2.0f * (f10 - f12);
        this.id_byte = 2.0f * (f10 + f12);
        this.id_private = 2.0f * (f9 + f11);
        this.id_case = 2.0f * (f9 - f11);
    }

    public rjj_3(rjV_2 rjV_22) {
        this.id_class = rjV_22.id_class;
        this.id_break = rjV_22.id_break;
        this.id_byte = rjV_22.id_byte;
        this.id_protected = rjV_22.id_throws;
        this.id_throws = rjV_22.id_case;
        this.id_case = rjV_22.id_catch;
        this.id_catch = rjV_22.id_implements;
        this.id_private = rjV_22.id_finally;
        this.id_implements = rjV_22.id_extends;
    }

    public rjj_3(rjj_3 rjj_32) {
        this.id_class = rjj_32.id_class;
        this.id_break = rjj_32.id_break;
        this.id_byte = rjj_32.id_byte;
        this.id_protected = rjj_32.id_protected;
        this.id_throws = rjj_32.id_throws;
        this.id_case = rjj_32.id_case;
        this.id_catch = rjj_32.id_catch;
        this.id_private = rjj_32.id_private;
        this.id_implements = rjj_32.id_implements;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            rjj_3 rjj_32 = (rjj_3)object;
            return Float.compare(rjj_32.id_class, this.id_class) == 0 && Float.compare(rjj_32.id_break, this.id_break) == 0 && Float.compare(rjj_32.id_byte, this.id_byte) == 0 && Float.compare(rjj_32.id_protected, this.id_protected) == 0 && Float.compare(rjj_32.id_throws, this.id_throws) == 0 && Float.compare(rjj_32.id_case, this.id_case) == 0 && Float.compare(rjj_32.id_catch, this.id_catch) == 0 && Float.compare(rjj_32.id_private, this.id_private) == 0 && Float.compare(rjj_32.id_implements, this.id_implements) == 0;
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Matrix3f:\n");
        stringBuilder.append(this.id_class);
        stringBuilder.append(" ");
        stringBuilder.append(this.id_break);
        stringBuilder.append(" ");
        stringBuilder.append(this.id_byte);
        stringBuilder.append("\n");
        stringBuilder.append(this.id_protected);
        stringBuilder.append(" ");
        stringBuilder.append(this.id_throws);
        stringBuilder.append(" ");
        stringBuilder.append(this.id_case);
        stringBuilder.append("\n");
        stringBuilder.append(this.id_catch);
        stringBuilder.append(" ");
        stringBuilder.append(this.id_private);
        stringBuilder.append(" ");
        stringBuilder.append(this.id_implements);
        stringBuilder.append("\n");
        return stringBuilder.toString();
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
        return 31 * n + (this.id_implements != 0.0f ? Float.floatToIntBits(this.id_implements) : 0);
    }

    private static Pair<Float, Float> id_class(float f, float f2) {
        float f3;
        float f4 = (float)Math.hypot(f, f2);
        float f5 = f4 > 1.0E-6f ? f2 : 0.0f;
        float f6 = Math.abs(f) + Math.max(f4, 1.0E-6f);
        if (f < 0.0f) {
            f3 = f5;
            f5 = f6;
            f6 = f3;
        }
        f3 = rfU_2.id_implements(f6 * f6 + f5 * f5);
        return Pair.of((Object)Float.valueOf(f5 *= f3), (Object)Float.valueOf(f6 *= f3));
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

    public void id_class(int n, int n2, float f) {
        if (n == 0) {
            if (n2 == 0) {
                this.id_class = f;
            } else if (n2 == 1) {
                this.id_break = f;
            } else {
                this.id_byte = f;
            }
        } else if (n == 1) {
            if (n2 == 0) {
                this.id_protected = f;
            } else if (n2 == 1) {
                this.id_throws = f;
            } else {
                this.id_case = f;
            }
        } else if (n2 == 0) {
            this.id_catch = f;
        } else if (n2 == 1) {
            this.id_private = f;
        } else {
            this.id_implements = f;
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
    }

    public void id_class(rjj_3 rjj_32) {
        this.id_class = rjj_32.id_class;
        this.id_break = rjj_32.id_break;
        this.id_byte = rjj_32.id_byte;
        this.id_protected = rjj_32.id_protected;
        this.id_throws = rjj_32.id_throws;
        this.id_case = rjj_32.id_case;
        this.id_catch = rjj_32.id_catch;
        this.id_private = rjj_32.id_private;
        this.id_implements = rjj_32.id_implements;
    }

    @Override
    public int id_class(rpr_3 rpr_32) {
        rja_3 rja_32 = rpr_32.id_int();
        float f = rja_32.b_();
        float f2 = rja_32.c_();
        float f3 = rja_32.d_();
        float f4 = this.id_class * f + this.id_break * f2 + this.id_byte * f3;
        float f5 = this.id_protected * f + this.id_throws * f2 + this.id_case * f3;
        float f6 = this.id_catch * f + this.id_private * f2 + this.id_implements * f3;
        return rjP_2.id_class(f4, f5, f6);
    }

    @Override
    public float id_class(float f, float f2, float f3) {
        return this.id_class * f + this.id_break * f2 + this.id_byte * f3;
    }

    public void id_class() {
        float f = this.id_break;
        this.id_break = this.id_protected;
        this.id_protected = f;
        f = this.id_byte;
        this.id_byte = this.id_catch;
        this.id_catch = f;
        f = this.id_case;
        this.id_case = this.id_private;
        this.id_private = f;
    }

    public void id_break(rjj_3 rjj_32) {
        float f = this.id_class * rjj_32.id_class + this.id_break * rjj_32.id_protected + this.id_byte * rjj_32.id_catch;
        float f2 = this.id_class * rjj_32.id_break + this.id_break * rjj_32.id_throws + this.id_byte * rjj_32.id_private;
        float f3 = this.id_class * rjj_32.id_byte + this.id_break * rjj_32.id_case + this.id_byte * rjj_32.id_implements;
        float f4 = this.id_protected * rjj_32.id_class + this.id_throws * rjj_32.id_protected + this.id_case * rjj_32.id_catch;
        float f5 = this.id_protected * rjj_32.id_break + this.id_throws * rjj_32.id_throws + this.id_case * rjj_32.id_private;
        float f6 = this.id_protected * rjj_32.id_byte + this.id_throws * rjj_32.id_case + this.id_case * rjj_32.id_implements;
        float f7 = this.id_catch * rjj_32.id_class + this.id_private * rjj_32.id_protected + this.id_implements * rjj_32.id_catch;
        float f8 = this.id_catch * rjj_32.id_break + this.id_private * rjj_32.id_throws + this.id_implements * rjj_32.id_private;
        float f9 = this.id_catch * rjj_32.id_byte + this.id_private * rjj_32.id_case + this.id_implements * rjj_32.id_implements;
        this.id_class = f;
        this.id_break = f2;
        this.id_byte = f3;
        this.id_protected = f4;
        this.id_throws = f5;
        this.id_case = f6;
        this.id_catch = f7;
        this.id_private = f8;
        this.id_implements = f9;
    }

    @Override
    public float id_break(float f, float f2, float f3) {
        return this.id_protected * f + this.id_throws * f2 + this.id_case * f3;
    }

    public Triple<rjY_2, rje_3, rjY_2> id_break() {
        rjY_2 rjY_22 = rjY_2.id_class.id_catch();
        rjY_2 rjY_23 = rjY_2.id_class.id_catch();
        rjj_3 rjj_32 = this.id_case();
        rjj_32.id_class();
        rjj_32.id_break(this);
        for (int i = 0; i < 5; ++i) {
            rjY_23.id_class(rjj_3.id_protected(rjj_32));
        }
        rjY_23.id_case();
        rjj_3 rjj_33 = new rjj_3(this);
        rjj_33.id_break(new rjj_3(rjY_23));
        float f = 1.0f;
        Pair<Float, Float> pair = rjj_3.id_class(rjj_33.id_class, rjj_33.id_protected);
        Float f2 = (Float)pair.getFirst();
        Float f3 = (Float)pair.getSecond();
        float f4 = f3.floatValue() * f3.floatValue() - f2.floatValue() * f2.floatValue();
        float f5 = -2.0f * f2.floatValue() * f3.floatValue();
        float f6 = f3.floatValue() * f3.floatValue() + f2.floatValue() * f2.floatValue();
        rjY_2 rjY_24 = new rjY_2(0.0f, 0.0f, f2.floatValue(), f3.floatValue());
        rjY_22.id_class(rjY_24);
        rjj_3 rjj_34 = new rjj_3();
        rjj_34.id_byte();
        rjj_34.id_class = f4;
        rjj_34.id_throws = f4;
        rjj_34.id_protected = f5;
        rjj_34.id_break = -f5;
        rjj_34.id_implements = f6;
        f *= f6;
        rjj_34.id_break(rjj_33);
        pair = rjj_3.id_class(rjj_34.id_class, rjj_34.id_catch);
        float f7 = -((Float)pair.getFirst()).floatValue();
        Float f8 = (Float)pair.getSecond();
        float f9 = f8.floatValue() * f8.floatValue() - f7 * f7;
        float f10 = -2.0f * f7 * f8.floatValue();
        float f11 = f8.floatValue() * f8.floatValue() + f7 * f7;
        rjY_2 rjY_25 = new rjY_2(0.0f, f7, 0.0f, f8.floatValue());
        rjY_22.id_class(rjY_25);
        rjj_3 rjj_35 = new rjj_3();
        rjj_35.id_byte();
        rjj_35.id_class = f9;
        rjj_35.id_implements = f9;
        rjj_35.id_catch = -f10;
        rjj_35.id_byte = f10;
        rjj_35.id_throws = f11;
        f *= f11;
        rjj_35.id_break(rjj_34);
        pair = rjj_3.id_class(rjj_35.id_throws, rjj_35.id_private);
        Float f12 = (Float)pair.getFirst();
        Float f13 = (Float)pair.getSecond();
        float f14 = f13.floatValue() * f13.floatValue() - f12.floatValue() * f12.floatValue();
        float f15 = -2.0f * f12.floatValue() * f13.floatValue();
        float f16 = f13.floatValue() * f13.floatValue() + f12.floatValue() * f12.floatValue();
        rjY_2 rjY_26 = new rjY_2(f12.floatValue(), 0.0f, 0.0f, f13.floatValue());
        rjY_22.id_class(rjY_26);
        rjj_3 rjj_36 = new rjj_3();
        rjj_36.id_byte();
        rjj_36.id_throws = f14;
        rjj_36.id_implements = f14;
        rjj_36.id_private = f15;
        rjj_36.id_case = -f15;
        rjj_36.id_class = f16;
        f *= f16;
        rjj_36.id_break(rjj_35);
        f = 1.0f / f;
        rjY_22.id_class((float)Math.sqrt(f));
        rje_3 rje_32 = new rje_3(rjj_36.id_class * f, rjj_36.id_throws * f, rjj_36.id_implements * f);
        return Triple.of((Object)rjY_22, (Object)rje_32, (Object)rjY_23);
    }

    public void id_break(rjY_2 rjY_22) {
        float f = rjY_22.id_class();
        float f2 = rjY_22.id_break();
        float f3 = rjY_22.id_byte();
        float f4 = rjY_22.id_protected();
        float f5 = 2.0f * f * f;
        float f6 = 2.0f * f2 * f2;
        float f7 = 2.0f * f3 * f3;
        float f8 = f * f2;
        float f9 = f2 * f3;
        float f10 = f3 * f;
        float f11 = f * f4;
        float f12 = f2 * f4;
        float f13 = f3 * f4;
        float f14 = 1.0f - f6 - f7;
        float f15 = 2.0f * (f8 - f13);
        float f16 = 2.0f * (f10 + f12);
        float f17 = 2.0f * (f8 + f13);
        float f18 = 1.0f - f7 - f5;
        float f19 = 2.0f * (f9 - f11);
        float f20 = 2.0f * (f10 - f12);
        float f21 = 2.0f * (f9 + f11);
        float f22 = 1.0f - f5 - f6;
        float f23 = this.id_class * f14 + this.id_break * f17 + this.id_byte * f20;
        float f24 = this.id_class * f15 + this.id_break * f18 + this.id_byte * f21;
        float f25 = this.id_class * f16 + this.id_break * f19 + this.id_byte * f22;
        float f26 = this.id_protected * f14 + this.id_throws * f17 + this.id_case * f20;
        float f27 = this.id_protected * f15 + this.id_throws * f18 + this.id_case * f21;
        float f28 = this.id_protected * f16 + this.id_throws * f19 + this.id_case * f22;
        float f29 = this.id_catch * f14 + this.id_private * f17 + this.id_implements * f20;
        float f30 = this.id_catch * f15 + this.id_private * f18 + this.id_implements * f21;
        float f31 = this.id_catch * f16 + this.id_private * f19 + this.id_implements * f22;
        this.id_class = f23;
        this.id_break = f24;
        this.id_byte = f25;
        this.id_protected = f26;
        this.id_throws = f27;
        this.id_case = f28;
        this.id_catch = f29;
        this.id_private = f30;
        this.id_implements = f31;
    }

    private void id_throws(rjY_2 rjY_22) {
        float f = rjY_22.id_byte();
        float f2 = rjY_22.id_protected();
        float f3 = 2.0f * f * f;
        float f4 = 1.0f - f3;
        float f5 = 1.0f - f3;
        float f6 = f * f2;
        float f7 = 2.0f * (0.0f + f6);
        float f8 = 2.0f * (0.0f - f6);
        float f9 = this.id_class * f4 + this.id_break * f7;
        float f10 = this.id_class * f8 + this.id_break * f5;
        float f11 = this.id_protected * f4 + this.id_throws * f7;
        float f12 = this.id_protected * f8 + this.id_throws * f5;
        float f13 = this.id_catch * f4 + this.id_private * f7;
        float f14 = this.id_catch * f8 + this.id_private * f5;
        this.id_class = f9;
        this.id_break = f10;
        this.id_protected = f11;
        this.id_throws = f12;
        this.id_catch = f13;
        this.id_private = f14;
    }

    public boolean id_throws() {
        float f = this.id_protected();
        if (Math.abs(f) > 1.0E-6f) {
            this.id_class(f);
            return true;
        }
        return false;
    }

    public float id_throws(float f, float f2, float f3) {
        return this.id_class * f + this.id_break * f2 + this.id_byte * f3;
    }

    public float id_catch(float f, float f2, float f3) {
        return this.id_catch * f + this.id_private * f2 + this.id_implements * f3;
    }

    public float id_case(float f, float f2, float f3) {
        return this.id_protected * f + this.id_throws * f2 + this.id_case * f3;
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
        float f26 = this.id_protected * f8 + this.id_throws * f17 + this.id_case * f19;
        float f27 = this.id_protected * f18 + this.id_throws * f9 + this.id_case * f21;
        float f28 = this.id_protected * f20 + this.id_throws * f22 + this.id_case * f10;
        float f29 = this.id_catch * f8 + this.id_private * f17 + this.id_implements * f19;
        float f30 = this.id_catch * f18 + this.id_private * f9 + this.id_implements * f21;
        float f31 = this.id_catch * f20 + this.id_private * f22 + this.id_implements * f10;
        this.id_class = f23;
        this.id_break = f24;
        this.id_byte = f25;
        this.id_protected = f26;
        this.id_throws = f27;
        this.id_case = f28;
        this.id_catch = f29;
        this.id_private = f30;
        this.id_implements = f31;
    }

    public rjj_3 id_case() {
        return new rjj_3(this);
    }

    public static rjj_3 id_protected(float f, float f2, float f3) {
        rjj_3 rjj_32 = new rjj_3();
        rjj_32.id_class = f;
        rjj_32.id_throws = f2;
        rjj_32.id_implements = f3;
        return rjj_32;
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
        float f11 = this.id_protected * f4 + this.id_case * f7;
        float f12 = this.id_protected * f8 + this.id_case * f5;
        float f13 = this.id_catch * f4 + this.id_implements * f7;
        float f14 = this.id_catch * f8 + this.id_implements * f5;
        this.id_class = f9;
        this.id_byte = f10;
        this.id_protected = f11;
        this.id_case = f12;
        this.id_catch = f13;
        this.id_implements = f14;
    }

    public float id_protected() {
        float f = this.id_throws * this.id_implements - this.id_case * this.id_private;
        float f2 = -(this.id_protected * this.id_implements - this.id_case * this.id_catch);
        float f3 = this.id_protected * this.id_private - this.id_throws * this.id_catch;
        float f4 = -(this.id_break * this.id_implements - this.id_byte * this.id_private);
        float f5 = this.id_class * this.id_implements - this.id_byte * this.id_catch;
        float f6 = -(this.id_class * this.id_private - this.id_break * this.id_catch);
        float f7 = this.id_break * this.id_case - this.id_byte * this.id_throws;
        float f8 = -(this.id_class * this.id_case - this.id_byte * this.id_protected);
        float f9 = this.id_class * this.id_throws - this.id_break * this.id_protected;
        float f10 = this.id_class * f + this.id_break * f2 + this.id_byte * f3;
        this.id_class = f;
        this.id_protected = f2;
        this.id_catch = f3;
        this.id_break = f4;
        this.id_throws = f5;
        this.id_private = f6;
        this.id_byte = f7;
        this.id_case = f8;
        this.id_implements = f9;
        return f10;
    }

    private static rjY_2 id_protected(rjj_3 rjj_32) {
        float f;
        float f2;
        float f3;
        rjY_2 rjY_22;
        Float f4;
        Float f5;
        Pair<Float, Float> pair;
        rjj_3 rjj_33 = new rjj_3();
        rjY_2 rjY_23 = rjY_2.id_class.id_catch();
        if (rjj_32.id_break * rjj_32.id_break + rjj_32.id_protected * rjj_32.id_protected > 1.0E-6f) {
            pair = rjj_3.id_private(rjj_32.id_class, 0.5f * (rjj_32.id_break + rjj_32.id_protected), rjj_32.id_throws);
            f5 = (Float)pair.getFirst();
            f4 = (Float)pair.getSecond();
            rjY_22 = new rjY_2(0.0f, 0.0f, f5.floatValue(), f4.floatValue());
            f3 = f4.floatValue() * f4.floatValue() - f5.floatValue() * f5.floatValue();
            f2 = -2.0f * f5.floatValue() * f4.floatValue();
            f = f4.floatValue() * f4.floatValue() + f5.floatValue() * f5.floatValue();
            rjY_23.id_class(rjY_22);
            rjj_33.id_byte();
            rjj_33.id_class = f3;
            rjj_33.id_throws = f3;
            rjj_33.id_protected = -f2;
            rjj_33.id_break = f2;
            rjj_33.id_implements = f;
            rjj_32.id_break(rjj_33);
            rjj_33.id_class();
            rjj_33.id_break(rjj_32);
            rjj_32.id_class(rjj_33);
        }
        if (rjj_32.id_byte * rjj_32.id_byte + rjj_32.id_catch * rjj_32.id_catch > 1.0E-6f) {
            pair = rjj_3.id_private(rjj_32.id_class, 0.5f * (rjj_32.id_byte + rjj_32.id_catch), rjj_32.id_implements);
            float f6 = -((Float)pair.getFirst()).floatValue();
            f4 = (Float)pair.getSecond();
            rjY_22 = new rjY_2(0.0f, f6, 0.0f, f4.floatValue());
            f3 = f4.floatValue() * f4.floatValue() - f6 * f6;
            f2 = -2.0f * f6 * f4.floatValue();
            f = f4.floatValue() * f4.floatValue() + f6 * f6;
            rjY_23.id_class(rjY_22);
            rjj_33.id_byte();
            rjj_33.id_class = f3;
            rjj_33.id_implements = f3;
            rjj_33.id_catch = f2;
            rjj_33.id_byte = -f2;
            rjj_33.id_throws = f;
            rjj_32.id_break(rjj_33);
            rjj_33.id_class();
            rjj_33.id_break(rjj_32);
            rjj_32.id_class(rjj_33);
        }
        if (rjj_32.id_case * rjj_32.id_case + rjj_32.id_private * rjj_32.id_private > 1.0E-6f) {
            pair = rjj_3.id_private(rjj_32.id_throws, 0.5f * (rjj_32.id_case + rjj_32.id_private), rjj_32.id_implements);
            f5 = (Float)pair.getFirst();
            f4 = (Float)pair.getSecond();
            rjY_22 = new rjY_2(f5.floatValue(), 0.0f, 0.0f, f4.floatValue());
            f3 = f4.floatValue() * f4.floatValue() - f5.floatValue() * f5.floatValue();
            f2 = -2.0f * f5.floatValue() * f4.floatValue();
            f = f4.floatValue() * f4.floatValue() + f5.floatValue() * f5.floatValue();
            rjY_23.id_class(rjY_22);
            rjj_33.id_byte();
            rjj_33.id_throws = f3;
            rjj_33.id_implements = f3;
            rjj_33.id_private = -f2;
            rjj_33.id_case = f2;
            rjj_33.id_class = f;
            rjj_32.id_break(rjj_33);
            rjj_33.id_class();
            rjj_33.id_break(rjj_32);
            rjj_32.id_class(rjj_33);
        }
        return rjY_23;
    }

    private static Pair<Float, Float> id_private(float f, float f2, float f3) {
        float f4 = 2.0f * (f - f3);
        if (id_finally * f2 * f2 < f4 * f4) {
            float f5 = rfU_2.id_implements(f2 * f2 + f4 * f4);
            return Pair.of((Object)Float.valueOf(f5 * f2), (Object)Float.valueOf(f5 * f4));
        }
        return Pair.of((Object)Float.valueOf(id_native), (Object)Float.valueOf(id_extends));
    }
}

