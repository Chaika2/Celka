package celestial;

import java.util.HashMap;
import java.util.Map;

public enum rrXq_1 {
   PLUS(10, rrXC.FLOAT, "+", rrXC.FLOAT, rrXC.FLOAT),
   MINUS(10, rrXC.FLOAT, "-", rrXC.FLOAT, rrXC.FLOAT),
   MUL(11, rrXC.FLOAT, "*", rrXC.FLOAT, rrXC.FLOAT),
   DIV(11, rrXC.FLOAT, "/", rrXC.FLOAT, rrXC.FLOAT),
   MOD(11, rrXC.FLOAT, "%", rrXC.FLOAT, rrXC.FLOAT),
   NEG(12, rrXC.FLOAT, "neg", rrXC.FLOAT),
   PI(rrXC.FLOAT, "pi"),
   SIN(rrXC.FLOAT, "sin", rrXC.FLOAT),
   COS(rrXC.FLOAT, "cos", rrXC.FLOAT),
   ASIN(rrXC.FLOAT, "asin", rrXC.FLOAT),
   ACOS(rrXC.FLOAT, "acos", rrXC.FLOAT),
   TAN(rrXC.FLOAT, "tan", rrXC.FLOAT),
   ATAN(rrXC.FLOAT, "atan", rrXC.FLOAT),
   ATAN2(rrXC.FLOAT, "atan2", rrXC.FLOAT, rrXC.FLOAT),
   TORAD(rrXC.FLOAT, "torad", rrXC.FLOAT),
   TODEG(rrXC.FLOAT, "todeg", rrXC.FLOAT),
   MIN(rrXC.FLOAT, "min", new rrXY().class_(rrXC.FLOAT).break_(rrXC.FLOAT)),
   MAX(rrXC.FLOAT, "max", new rrXY().class_(rrXC.FLOAT).break_(rrXC.FLOAT)),
   CLAMP(rrXC.FLOAT, "clamp", rrXC.FLOAT, rrXC.FLOAT, rrXC.FLOAT),
   ABS(rrXC.FLOAT, "abs", rrXC.FLOAT),
   FLOOR(rrXC.FLOAT, "floor", rrXC.FLOAT),
   CEIL(rrXC.FLOAT, "ceil", rrXC.FLOAT),
   EXP(rrXC.FLOAT, "exp", rrXC.FLOAT),
   FRAC(rrXC.FLOAT, "frac", rrXC.FLOAT),
   LOG(rrXC.FLOAT, "log", rrXC.FLOAT),
   POW(rrXC.FLOAT, "pow", rrXC.FLOAT, rrXC.FLOAT),
   RANDOM(rrXC.FLOAT, "random"),
   ROUND(rrXC.FLOAT, "round", rrXC.FLOAT),
   SIGNUM(rrXC.FLOAT, "signum", rrXC.FLOAT),
   SQRT(rrXC.FLOAT, "sqrt", rrXC.FLOAT),
   FMOD(rrXC.FLOAT, "fmod", rrXC.FLOAT, rrXC.FLOAT),
   TIME(rrXC.FLOAT, "time"),
   IF(rrXC.FLOAT, "if", new rrXY().class_(rrXC.BOOL, rrXC.FLOAT).break_(rrXC.BOOL, rrXC.FLOAT).byte_(rrXC.FLOAT)),
   NOT(12, rrXC.BOOL, "!", rrXC.BOOL),
   AND(3, rrXC.BOOL, "&&", rrXC.BOOL, rrXC.BOOL),
   OR(2, rrXC.BOOL, "||", rrXC.BOOL, rrXC.BOOL),
   GREATER(8, rrXC.BOOL, ">", rrXC.FLOAT, rrXC.FLOAT),
   GREATER_OR_EQUAL(8, rrXC.BOOL, ">=", rrXC.FLOAT, rrXC.FLOAT),
   SMALLER(8, rrXC.BOOL, "<", rrXC.FLOAT, rrXC.FLOAT),
   SMALLER_OR_EQUAL(8, rrXC.BOOL, "<=", rrXC.FLOAT, rrXC.FLOAT),
   EQUAL(7, rrXC.BOOL, "==", rrXC.FLOAT, rrXC.FLOAT),
   NOT_EQUAL(7, rrXC.BOOL, "!=", rrXC.FLOAT, rrXC.FLOAT),
   BETWEEN(7, rrXC.BOOL, "between", rrXC.FLOAT, rrXC.FLOAT, rrXC.FLOAT),
   EQUALS(7, rrXC.BOOL, "equals", rrXC.FLOAT, rrXC.FLOAT, rrXC.FLOAT),
   IN(rrXC.BOOL, "in", new rrXY().class_(rrXC.FLOAT).break_(rrXC.FLOAT).byte_(rrXC.FLOAT)),
   SMOOTH(rrXC.FLOAT, "smooth", new rrXY().class_(rrXC.FLOAT).break_(rrXC.FLOAT).class_(4)),
   TRUE(rrXC.BOOL, "true"),
   FALSE(rrXC.BOOL, "false"),
   VEC2(rrXC.FLOAT_ARRAY, "vec2", rrXC.FLOAT, rrXC.FLOAT),
   VEC3(rrXC.FLOAT_ARRAY, "vec3", rrXC.FLOAT, rrXC.FLOAT, rrXC.FLOAT),
   VEC4(rrXC.FLOAT_ARRAY, "vec4", rrXC.FLOAT, rrXC.FLOAT, rrXC.FLOAT, rrXC.FLOAT);

   private int precedence;
   private rrXC expressionType;
   private String name;
   private rrXg_1 parameters;
   public static rrXq_1[] VALUES = values();
   private static final Map<Integer, Float> mapSmooth = new HashMap<>();

   public rrXC byte_() {
      return this.expressionType;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public float byte_(rrXt_1[] var1) {
      switch (this) {
         case PLUS:
            return class_(var1, 0) + class_(var1, 1);
         case MINUS:
            return class_(var1, 0) - class_(var1, 1);
         case MUL:
            return class_(var1, 0) * class_(var1, 1);
         case DIV:
            return class_(var1, 0) / class_(var1, 1);
         case MOD:
            float var2 = class_(var1, 0);
            float var3 = class_(var1, 1);
            return var2 - var3 * (float)((int)(var2 / var3));
         case NEG:
            return -class_(var1, 0);
         case PI:
            return rfU_2.break_;
         case SIN:
            return rfU_2.class_(class_(var1, 0));
         case COS:
            return rfU_2.break_(class_(var1, 0));
         case ASIN:
            return rrWD.class_(class_(var1, 0));
         case ACOS:
            return rrWD.break_(class_(var1, 0));
         case TAN:
            return (float)Math.tan((double)class_(var1, 0));
         case ATAN:
            return (float)Math.atan((double)class_(var1, 0));
         case ATAN2:
            return (float)rfU_2.protected_((double)class_(var1, 0), (double)class_(var1, 1));
         case TORAD:
            return rrWD.protected_(class_(var1, 0));
         case TODEG:
            return rrWD.byte_(class_(var1, 0));
         case MIN:
            return this.case_(var1);
         case MAX:
            return this.catch_(var1);
         case CLAMP:
            return rfU_2.class_(class_(var1, 0), class_(var1, 1), class_(var1, 2));
         case ABS:
            return rfU_2.throws_(class_(var1, 0));
         case EXP:
            return (float)Math.exp((double)class_(var1, 0));
         case FLOOR:
            return (float)rfU_2.protected_(class_(var1, 0));
         case CEIL:
            return (float)rfU_2.case_(class_(var1, 0));
         case FRAC:
            return rfU_2.private_(class_(var1, 0));
         case LOG:
            return (float)Math.log((double)class_(var1, 0));
         case POW:
            return (float)Math.pow((double)class_(var1, 0), (double)class_(var1, 1));
         case RANDOM:
            return (float)Math.random();
         case ROUND:
            return (float)Math.round(class_(var1, 0));
         case SIGNUM:
            return Math.signum(class_(var1, 0));
         case SQRT:
            return rfU_2.byte_(class_(var1, 0));
         case FMOD:
            float var4 = class_(var1, 0);
            float var5 = class_(var1, 1);
            return var4 - var5 * (float)rfU_2.protected_(var4 / var5);
         case TIME:
            QY var6 = QY.instanceof_();
            gm_3 var7 = (gm_3)var6.class_[56];
            if (var7 == null) {
               return 0.0F;
            }

            return (float)(var7.r() % 24000L) + var6.X();
         case IF:
            int var8 = (var1.length - 1) / 2;

            for (int var13 = 0; var13 < var8; var13++) {
               int var14 = var13 * 2;
               if (break_(var1, var14)) {
                  return class_(var1, var14 + 1);
               }
            }

            return class_(var1, var8 * 2);
         case SMOOTH:
            int var9 = (int)class_(var1, 0);
            float var10 = class_(var1, 1);
            float var11 = var1.length > 2 ? class_(var1, 2) : 1.0F;
            float var12 = var1.length > 3 ? class_(var1, 3) : var11;
            return rrkT.class_(var9, var10, var11, var12);
         default:
            rrbb_3.protected_("Unknown function type: " + this);
            return 0.0F;
      }
   }

   private rrXq_1(rrXC var3, String var4, rrXg_1 var5) {
      this(0, var3, var4, var5);
   }

   private rrXq_1(int var3, rrXC var4, String var5, rrXg_1 var6) {
      this.precedence = var3;
      this.expressionType = var4;
      this.name = var5;
      this.parameters = var6;
   }

   private rrXq_1(int var3, rrXC var4, String var5, rrXC... var6) {
      this(var3, var4, var5, new rrXR(var6));
   }

   private rrXq_1(rrXC var3, String var4, rrXC... var5) {
      this(0, var3, var4, var5);
   }

   public String class_() {
      return this.name;
   }

   private static float class_(rrXt_1[] var0, int var1) {
      rrXf_1 var2 = (rrXf_1)var0[var1];
      return var2.class_();
   }

   public static rrXq_1 class_(String var0) {
      for (int var1 = 0; var1 < VALUES.length; var1++) {
         rrXq_1 var2 = VALUES[var1];
         if (var2.class_().equals(var0)) {
            return var2;
         }
      }

      return null;
   }

   public int class_(rrXt_1[] var1) {
      return this.parameters.class_(var1).length;
   }

   public int break_() {
      return this.precedence;
   }

   private static boolean break_(rrXt_1[] var0, int var1) {
      rrXw_1 var2 = (rrXw_1)var0[var1];
      return var2.break_();
   }

   public rrXC[] break_(rrXt_1[] var1) {
      return this.parameters.class_(var1);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public float[] throws_(rrXt_1[] var1) {
      switch (this) {
         case VEC2:
            return new float[]{class_(var1, 0), class_(var1, 1)};
         case VEC3:
            return new float[]{class_(var1, 0), class_(var1, 1), class_(var1, 2)};
         case VEC4:
            return new float[]{class_(var1, 0), class_(var1, 1), class_(var1, 2), class_(var1, 3)};
         default:
            rrbb_3.protected_("Unknown function type: " + this);
            return null;
      }
   }

   private float catch_(rrXt_1[] var1) {
      if (var1.length == 2) {
         return Math.max(class_(var1, 0), class_(var1, 1));
      } else {
         float var2 = class_(var1, 0);

         for (int var3 = 1; var3 < var1.length; var3++) {
            float var4 = class_(var1, var3);
            if (var4 > var2) {
               var2 = var4;
            }
         }

         return var2;
      }
   }

   private float case_(rrXt_1[] var1) {
      if (var1.length == 2) {
         return Math.min(class_(var1, 0), class_(var1, 1));
      } else {
         float var2 = class_(var1, 0);

         for (int var3 = 1; var3 < var1.length; var3++) {
            float var4 = class_(var1, var3);
            if (var4 < var2) {
               var2 = var4;
            }
         }

         return var2;
      }
   }

   public rrXg_1 protected_() {
      return this.parameters;
   }

   public boolean protected_(rrXt_1[] var1) {
      switch (this) {
         case TRUE:
            return true;
         case FALSE:
            return false;
         case NOT:
            return !break_(var1, 0);
         case AND:
            return break_(var1, 0) && break_(var1, 1);
         case OR:
            return break_(var1, 0) || break_(var1, 1);
         case GREATER:
            return class_(var1, 0) > class_(var1, 1);
         case GREATER_OR_EQUAL:
            return class_(var1, 0) >= class_(var1, 1);
         case SMALLER:
            return class_(var1, 0) < class_(var1, 1);
         case SMALLER_OR_EQUAL:
            return class_(var1, 0) <= class_(var1, 1);
         case EQUAL:
            return class_(var1, 0) == class_(var1, 1);
         case NOT_EQUAL:
            return class_(var1, 0) != class_(var1, 1);
         case BETWEEN:
            float var2 = class_(var1, 0);
            return var2 >= class_(var1, 1) && var2 <= class_(var1, 2);
         case EQUALS:
            float var3 = class_(var1, 0) - class_(var1, 1);
            float var4 = class_(var1, 2);
            return Math.abs(var3) <= var4;
         case IN:
            float var5 = class_(var1, 0);

            for (int var6 = 1; var6 < var1.length; var6++) {
               float var7 = class_(var1, var6);
               if (var5 == var7) {
                  return true;
               }
            }

            return false;
         default:
            rrbb_3.protected_("Unknown function type: " + this);
            return false;
      }
   }
}
