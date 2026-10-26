/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QY;
import celestial.gm_3;
import celestial.rfU_2;
import celestial.rrWD;
import celestial.rrXC;
import celestial.rrXR;
import celestial.rrXY;
import celestial.rrXf_1;
import celestial.rrXg_1;
import celestial.rrXt_1;
import celestial.rrXw_1;
import celestial.rrbb_3;
import celestial.rrkT;
import java.util.HashMap;
import java.util.Map;

public final class rrXq_1
extends Enum<rrXq_1> {
    public static final /* enum */ rrXq_1 PLUS = new rrXq_1(10, rrXC.FLOAT, "+", rrXC.FLOAT, rrXC.FLOAT);
    public static final /* enum */ rrXq_1 MINUS = new rrXq_1(10, rrXC.FLOAT, "-", rrXC.FLOAT, rrXC.FLOAT);
    public static final /* enum */ rrXq_1 MUL = new rrXq_1(11, rrXC.FLOAT, "*", rrXC.FLOAT, rrXC.FLOAT);
    public static final /* enum */ rrXq_1 DIV = new rrXq_1(11, rrXC.FLOAT, "/", rrXC.FLOAT, rrXC.FLOAT);
    public static final /* enum */ rrXq_1 MOD = new rrXq_1(11, rrXC.FLOAT, "%", rrXC.FLOAT, rrXC.FLOAT);
    public static final /* enum */ rrXq_1 NEG = new rrXq_1(12, rrXC.FLOAT, "neg", rrXC.FLOAT);
    public static final /* enum */ rrXq_1 PI = new rrXq_1(rrXC.FLOAT, "pi", new rrXC[0]);
    public static final /* enum */ rrXq_1 SIN = new rrXq_1(rrXC.FLOAT, "sin", rrXC.FLOAT);
    public static final /* enum */ rrXq_1 COS = new rrXq_1(rrXC.FLOAT, "cos", rrXC.FLOAT);
    public static final /* enum */ rrXq_1 ASIN = new rrXq_1(rrXC.FLOAT, "asin", rrXC.FLOAT);
    public static final /* enum */ rrXq_1 ACOS = new rrXq_1(rrXC.FLOAT, "acos", rrXC.FLOAT);
    public static final /* enum */ rrXq_1 TAN = new rrXq_1(rrXC.FLOAT, "tan", rrXC.FLOAT);
    public static final /* enum */ rrXq_1 ATAN = new rrXq_1(rrXC.FLOAT, "atan", rrXC.FLOAT);
    public static final /* enum */ rrXq_1 ATAN2 = new rrXq_1(rrXC.FLOAT, "atan2", rrXC.FLOAT, rrXC.FLOAT);
    public static final /* enum */ rrXq_1 TORAD = new rrXq_1(rrXC.FLOAT, "torad", rrXC.FLOAT);
    public static final /* enum */ rrXq_1 TODEG = new rrXq_1(rrXC.FLOAT, "todeg", rrXC.FLOAT);
    public static final /* enum */ rrXq_1 MIN = new rrXq_1(rrXC.FLOAT, "min", new rrXY().id_class(rrXC.FLOAT).id_break(rrXC.FLOAT));
    public static final /* enum */ rrXq_1 MAX = new rrXq_1(rrXC.FLOAT, "max", new rrXY().id_class(rrXC.FLOAT).id_break(rrXC.FLOAT));
    public static final /* enum */ rrXq_1 CLAMP = new rrXq_1(rrXC.FLOAT, "clamp", rrXC.FLOAT, rrXC.FLOAT, rrXC.FLOAT);
    public static final /* enum */ rrXq_1 ABS = new rrXq_1(rrXC.FLOAT, "abs", rrXC.FLOAT);
    public static final /* enum */ rrXq_1 FLOOR = new rrXq_1(rrXC.FLOAT, "floor", rrXC.FLOAT);
    public static final /* enum */ rrXq_1 CEIL = new rrXq_1(rrXC.FLOAT, "ceil", rrXC.FLOAT);
    public static final /* enum */ rrXq_1 EXP = new rrXq_1(rrXC.FLOAT, "exp", rrXC.FLOAT);
    public static final /* enum */ rrXq_1 FRAC = new rrXq_1(rrXC.FLOAT, "frac", rrXC.FLOAT);
    public static final /* enum */ rrXq_1 LOG = new rrXq_1(rrXC.FLOAT, "log", rrXC.FLOAT);
    public static final /* enum */ rrXq_1 POW = new rrXq_1(rrXC.FLOAT, "pow", rrXC.FLOAT, rrXC.FLOAT);
    public static final /* enum */ rrXq_1 RANDOM = new rrXq_1(rrXC.FLOAT, "random", new rrXC[0]);
    public static final /* enum */ rrXq_1 ROUND = new rrXq_1(rrXC.FLOAT, "round", rrXC.FLOAT);
    public static final /* enum */ rrXq_1 SIGNUM = new rrXq_1(rrXC.FLOAT, "signum", rrXC.FLOAT);
    public static final /* enum */ rrXq_1 SQRT = new rrXq_1(rrXC.FLOAT, "sqrt", rrXC.FLOAT);
    public static final /* enum */ rrXq_1 FMOD = new rrXq_1(rrXC.FLOAT, "fmod", rrXC.FLOAT, rrXC.FLOAT);
    public static final /* enum */ rrXq_1 TIME = new rrXq_1(rrXC.FLOAT, "time", new rrXC[0]);
    public static final /* enum */ rrXq_1 IF = new rrXq_1(rrXC.FLOAT, "if", new rrXY().id_class(rrXC.BOOL, rrXC.FLOAT).id_break(rrXC.BOOL, rrXC.FLOAT).id_byte(rrXC.FLOAT));
    public static final /* enum */ rrXq_1 NOT = new rrXq_1(12, rrXC.BOOL, "!", rrXC.BOOL);
    public static final /* enum */ rrXq_1 AND = new rrXq_1(3, rrXC.BOOL, "&&", rrXC.BOOL, rrXC.BOOL);
    public static final /* enum */ rrXq_1 OR = new rrXq_1(2, rrXC.BOOL, "||", rrXC.BOOL, rrXC.BOOL);
    public static final /* enum */ rrXq_1 GREATER = new rrXq_1(8, rrXC.BOOL, ">", rrXC.FLOAT, rrXC.FLOAT);
    public static final /* enum */ rrXq_1 GREATER_OR_EQUAL = new rrXq_1(8, rrXC.BOOL, ">=", rrXC.FLOAT, rrXC.FLOAT);
    public static final /* enum */ rrXq_1 SMALLER = new rrXq_1(8, rrXC.BOOL, "<", rrXC.FLOAT, rrXC.FLOAT);
    public static final /* enum */ rrXq_1 SMALLER_OR_EQUAL = new rrXq_1(8, rrXC.BOOL, "<=", rrXC.FLOAT, rrXC.FLOAT);
    public static final /* enum */ rrXq_1 EQUAL = new rrXq_1(7, rrXC.BOOL, "==", rrXC.FLOAT, rrXC.FLOAT);
    public static final /* enum */ rrXq_1 NOT_EQUAL = new rrXq_1(7, rrXC.BOOL, "!=", rrXC.FLOAT, rrXC.FLOAT);
    public static final /* enum */ rrXq_1 BETWEEN = new rrXq_1(7, rrXC.BOOL, "between", rrXC.FLOAT, rrXC.FLOAT, rrXC.FLOAT);
    public static final /* enum */ rrXq_1 EQUALS = new rrXq_1(7, rrXC.BOOL, "equals", rrXC.FLOAT, rrXC.FLOAT, rrXC.FLOAT);
    public static final /* enum */ rrXq_1 IN = new rrXq_1(rrXC.BOOL, "in", new rrXY().id_class(rrXC.FLOAT).id_break(rrXC.FLOAT).id_byte(rrXC.FLOAT));
    public static final /* enum */ rrXq_1 SMOOTH = new rrXq_1(rrXC.FLOAT, "smooth", new rrXY().id_class(rrXC.FLOAT).id_break(rrXC.FLOAT).id_class(4));
    public static final /* enum */ rrXq_1 TRUE = new rrXq_1(rrXC.BOOL, "true", new rrXC[0]);
    public static final /* enum */ rrXq_1 FALSE = new rrXq_1(rrXC.BOOL, "false", new rrXC[0]);
    public static final /* enum */ rrXq_1 VEC2 = new rrXq_1(rrXC.FLOAT_ARRAY, "vec2", rrXC.FLOAT, rrXC.FLOAT);
    public static final /* enum */ rrXq_1 VEC3 = new rrXq_1(rrXC.FLOAT_ARRAY, "vec3", rrXC.FLOAT, rrXC.FLOAT, rrXC.FLOAT);
    public static final /* enum */ rrXq_1 VEC4 = new rrXq_1(rrXC.FLOAT_ARRAY, "vec4", rrXC.FLOAT, rrXC.FLOAT, rrXC.FLOAT, rrXC.FLOAT);
    private int precedence;
    private rrXC expressionType;
    private String name;
    private rrXg_1 parameters;
    public static rrXq_1[] VALUES;
    private static final Map<Integer, Float> mapSmooth;
    private static final /* synthetic */ rrXq_1[] $VALUES;

    public rrXC id_byte() {
        return this.expressionType;
    }

    public float id_byte(rrXt_1[] rrXt_1Array) {
        switch (this) {
            case PLUS: {
                return rrXq_1.id_class(rrXt_1Array, 0) + rrXq_1.id_class(rrXt_1Array, 1);
            }
            case MINUS: {
                return rrXq_1.id_class(rrXt_1Array, 0) - rrXq_1.id_class(rrXt_1Array, 1);
            }
            case MUL: {
                return rrXq_1.id_class(rrXt_1Array, 0) * rrXq_1.id_class(rrXt_1Array, 1);
            }
            case DIV: {
                return rrXq_1.id_class(rrXt_1Array, 0) / rrXq_1.id_class(rrXt_1Array, 1);
            }
            case MOD: {
                float f = rrXq_1.id_class(rrXt_1Array, 0);
                float f2 = rrXq_1.id_class(rrXt_1Array, 1);
                return f - f2 * (float)((int)(f / f2));
            }
            case NEG: {
                return -rrXq_1.id_class(rrXt_1Array, 0);
            }
            case PI: {
                return rfU_2.id_break;
            }
            case SIN: {
                return rfU_2.id_class(rrXq_1.id_class(rrXt_1Array, 0));
            }
            case COS: {
                return rfU_2.id_break(rrXq_1.id_class(rrXt_1Array, 0));
            }
            case ASIN: {
                return rrWD.id_class(rrXq_1.id_class(rrXt_1Array, 0));
            }
            case ACOS: {
                return rrWD.id_break(rrXq_1.id_class(rrXt_1Array, 0));
            }
            case TAN: {
                return (float)Math.tan(rrXq_1.id_class(rrXt_1Array, 0));
            }
            case ATAN: {
                return (float)Math.atan(rrXq_1.id_class(rrXt_1Array, 0));
            }
            case ATAN2: {
                return (float)rfU_2.id_protected((double)rrXq_1.id_class(rrXt_1Array, 0), (double)rrXq_1.id_class(rrXt_1Array, 1));
            }
            case TORAD: {
                return rrWD.id_protected(rrXq_1.id_class(rrXt_1Array, 0));
            }
            case TODEG: {
                return rrWD.id_byte(rrXq_1.id_class(rrXt_1Array, 0));
            }
            case MIN: {
                return this.id_case(rrXt_1Array);
            }
            case MAX: {
                return this.id_catch(rrXt_1Array);
            }
            case CLAMP: {
                return rfU_2.id_class(rrXq_1.id_class(rrXt_1Array, 0), rrXq_1.id_class(rrXt_1Array, 1), rrXq_1.id_class(rrXt_1Array, 2));
            }
            case ABS: {
                return rfU_2.id_throws(rrXq_1.id_class(rrXt_1Array, 0));
            }
            case EXP: {
                return (float)Math.exp(rrXq_1.id_class(rrXt_1Array, 0));
            }
            case FLOOR: {
                return rfU_2.id_protected(rrXq_1.id_class(rrXt_1Array, 0));
            }
            case CEIL: {
                return rfU_2.id_case(rrXq_1.id_class(rrXt_1Array, 0));
            }
            case FRAC: {
                return rfU_2.id_private(rrXq_1.id_class(rrXt_1Array, 0));
            }
            case LOG: {
                return (float)Math.log(rrXq_1.id_class(rrXt_1Array, 0));
            }
            case POW: {
                return (float)Math.pow(rrXq_1.id_class(rrXt_1Array, 0), rrXq_1.id_class(rrXt_1Array, 1));
            }
            case RANDOM: {
                return (float)Math.random();
            }
            case ROUND: {
                return Math.round(rrXq_1.id_class(rrXt_1Array, 0));
            }
            case SIGNUM: {
                return Math.signum(rrXq_1.id_class(rrXt_1Array, 0));
            }
            case SQRT: {
                return rfU_2.id_byte(rrXq_1.id_class(rrXt_1Array, 0));
            }
            case FMOD: {
                float f = rrXq_1.id_class(rrXt_1Array, 0);
                float f3 = rrXq_1.id_class(rrXt_1Array, 1);
                return f - f3 * (float)rfU_2.id_protected(f / f3);
            }
            case TIME: {
                QY qY = QY.id_instanceof();
                gm_3 gm_32 = (gm_3)qY.id_class[56];
                if (gm_32 == null) {
                    return 0.0f;
                }
                return (float)(gm_32.r() % 24000L) + qY.X();
            }
            case IF: {
                int n = (rrXt_1Array.length - 1) / 2;
                for (int i = 0; i < n; ++i) {
                    int n2 = i * 2;
                    if (!rrXq_1.id_break(rrXt_1Array, n2)) continue;
                    return rrXq_1.id_class(rrXt_1Array, n2 + 1);
                }
                return rrXq_1.id_class(rrXt_1Array, n * 2);
            }
            case SMOOTH: {
                int n = (int)rrXq_1.id_class(rrXt_1Array, 0);
                float f = rrXq_1.id_class(rrXt_1Array, 1);
                float f4 = rrXt_1Array.length > 2 ? rrXq_1.id_class(rrXt_1Array, 2) : 1.0f;
                float f5 = rrXt_1Array.length > 3 ? rrXq_1.id_class(rrXt_1Array, 3) : f4;
                return rrkT.id_class(n, f, f4, f5);
            }
        }
        rrbb_3.id_protected("Unknown function type: " + this);
        return 0.0f;
    }

    private rrXq_1(rrXC rrXC2, String string2, rrXg_1 rrXg_12) {
        this(0, rrXC2, string2, rrXg_12);
    }

    private rrXq_1(int n2, rrXC rrXC2, String string2, rrXg_1 rrXg_12) {
        this.precedence = n2;
        this.expressionType = rrXC2;
        this.name = string2;
        this.parameters = rrXg_12;
    }

    private rrXq_1(int n2, rrXC rrXC2, String string2, rrXC ... rrXCArray) {
        this(n2, rrXC2, string2, new rrXR(rrXCArray));
    }

    private rrXq_1(rrXC rrXC2, String string2, rrXC ... rrXCArray) {
        this(0, rrXC2, string2, rrXCArray);
    }

    static {
        $VALUES = rrXq_1.id_throws();
        VALUES = rrXq_1.values();
        mapSmooth = new HashMap<Integer, Float>();
    }

    public static rrXq_1[] values() {
        return (rrXq_1[])$VALUES.clone();
    }

    public static rrXq_1 valueOf(String string) {
        return Enum.valueOf(rrXq_1.class, string);
    }

    public String id_class() {
        return this.name;
    }

    private static float id_class(rrXt_1[] rrXt_1Array, int n) {
        rrXf_1 rrXf_12 = (rrXf_1)rrXt_1Array[n];
        return rrXf_12.id_class();
    }

    public static rrXq_1 id_class(String string) {
        for (int i = 0; i < VALUES.length; ++i) {
            rrXq_1 rrXq_12 = VALUES[i];
            if (!rrXq_12.id_class().equals(string)) continue;
            return rrXq_12;
        }
        return null;
    }

    public int id_class(rrXt_1[] rrXt_1Array) {
        return this.parameters.id_class(rrXt_1Array).length;
    }

    public int id_break() {
        return this.precedence;
    }

    private static boolean id_break(rrXt_1[] rrXt_1Array, int n) {
        rrXw_1 rrXw_12 = (rrXw_1)rrXt_1Array[n];
        return rrXw_12.id_break();
    }

    public rrXC[] id_break(rrXt_1[] rrXt_1Array) {
        return this.parameters.id_class(rrXt_1Array);
    }

    private static /* synthetic */ rrXq_1[] id_throws() {
        return new rrXq_1[]{PLUS, MINUS, MUL, DIV, MOD, NEG, PI, SIN, COS, ASIN, ACOS, TAN, ATAN, ATAN2, TORAD, TODEG, MIN, MAX, CLAMP, ABS, FLOOR, CEIL, EXP, FRAC, LOG, POW, RANDOM, ROUND, SIGNUM, SQRT, FMOD, TIME, IF, NOT, AND, OR, GREATER, GREATER_OR_EQUAL, SMALLER, SMALLER_OR_EQUAL, EQUAL, NOT_EQUAL, BETWEEN, EQUALS, IN, SMOOTH, TRUE, FALSE, VEC2, VEC3, VEC4};
    }

    public float[] id_throws(rrXt_1[] rrXt_1Array) {
        switch (this) {
            case VEC2: {
                return new float[]{rrXq_1.id_class(rrXt_1Array, 0), rrXq_1.id_class(rrXt_1Array, 1)};
            }
            case VEC3: {
                return new float[]{rrXq_1.id_class(rrXt_1Array, 0), rrXq_1.id_class(rrXt_1Array, 1), rrXq_1.id_class(rrXt_1Array, 2)};
            }
            case VEC4: {
                return new float[]{rrXq_1.id_class(rrXt_1Array, 0), rrXq_1.id_class(rrXt_1Array, 1), rrXq_1.id_class(rrXt_1Array, 2), rrXq_1.id_class(rrXt_1Array, 3)};
            }
        }
        rrbb_3.id_protected("Unknown function type: " + this);
        return null;
    }

    private float id_catch(rrXt_1[] rrXt_1Array) {
        if (rrXt_1Array.length == 2) {
            return Math.max(rrXq_1.id_class(rrXt_1Array, 0), rrXq_1.id_class(rrXt_1Array, 1));
        }
        float f = rrXq_1.id_class(rrXt_1Array, 0);
        for (int i = 1; i < rrXt_1Array.length; ++i) {
            float f2 = rrXq_1.id_class(rrXt_1Array, i);
            if (!(f2 > f)) continue;
            f = f2;
        }
        return f;
    }

    private float id_case(rrXt_1[] rrXt_1Array) {
        if (rrXt_1Array.length == 2) {
            return Math.min(rrXq_1.id_class(rrXt_1Array, 0), rrXq_1.id_class(rrXt_1Array, 1));
        }
        float f = rrXq_1.id_class(rrXt_1Array, 0);
        for (int i = 1; i < rrXt_1Array.length; ++i) {
            float f2 = rrXq_1.id_class(rrXt_1Array, i);
            if (!(f2 < f)) continue;
            f = f2;
        }
        return f;
    }

    public rrXg_1 id_protected() {
        return this.parameters;
    }

    public boolean id_protected(rrXt_1[] rrXt_1Array) {
        switch (this) {
            case TRUE: {
                return true;
            }
            case FALSE: {
                return false;
            }
            case NOT: {
                return !rrXq_1.id_break(rrXt_1Array, 0);
            }
            case AND: {
                return rrXq_1.id_break(rrXt_1Array, 0) && rrXq_1.id_break(rrXt_1Array, 1);
            }
            case OR: {
                return rrXq_1.id_break(rrXt_1Array, 0) || rrXq_1.id_break(rrXt_1Array, 1);
            }
            case GREATER: {
                return rrXq_1.id_class(rrXt_1Array, 0) > rrXq_1.id_class(rrXt_1Array, 1);
            }
            case GREATER_OR_EQUAL: {
                return rrXq_1.id_class(rrXt_1Array, 0) >= rrXq_1.id_class(rrXt_1Array, 1);
            }
            case SMALLER: {
                return rrXq_1.id_class(rrXt_1Array, 0) < rrXq_1.id_class(rrXt_1Array, 1);
            }
            case SMALLER_OR_EQUAL: {
                return rrXq_1.id_class(rrXt_1Array, 0) <= rrXq_1.id_class(rrXt_1Array, 1);
            }
            case EQUAL: {
                return rrXq_1.id_class(rrXt_1Array, 0) == rrXq_1.id_class(rrXt_1Array, 1);
            }
            case NOT_EQUAL: {
                return rrXq_1.id_class(rrXt_1Array, 0) != rrXq_1.id_class(rrXt_1Array, 1);
            }
            case BETWEEN: {
                float f = rrXq_1.id_class(rrXt_1Array, 0);
                return f >= rrXq_1.id_class(rrXt_1Array, 1) && f <= rrXq_1.id_class(rrXt_1Array, 2);
            }
            case EQUALS: {
                float f = rrXq_1.id_class(rrXt_1Array, 0) - rrXq_1.id_class(rrXt_1Array, 1);
                float f2 = rrXq_1.id_class(rrXt_1Array, 2);
                return Math.abs(f) <= f2;
            }
            case IN: {
                float f = rrXq_1.id_class(rrXt_1Array, 0);
                for (int i = 1; i < rrXt_1Array.length; ++i) {
                    float f3 = rrXq_1.id_class(rrXt_1Array, i);
                    if (f != f3) continue;
                    return true;
                }
                return false;
            }
        }
        rrbb_3.id_protected("Unknown function type: " + this);
        return false;
    }
}

