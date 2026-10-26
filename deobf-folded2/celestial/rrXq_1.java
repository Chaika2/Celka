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
   MIN(rrXC.FLOAT, "min", new rrXY().id_class(rrXC.FLOAT).id_break(rrXC.FLOAT)),
   MAX(rrXC.FLOAT, "max", new rrXY().id_class(rrXC.FLOAT).id_break(rrXC.FLOAT)),
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
   IF(rrXC.FLOAT, "if", new rrXY().id_class(rrXC.BOOL, rrXC.FLOAT).id_break(rrXC.BOOL, rrXC.FLOAT).id_byte(rrXC.FLOAT)),
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
   IN(rrXC.BOOL, "in", new rrXY().id_class(rrXC.FLOAT).id_break(rrXC.FLOAT).id_byte(rrXC.FLOAT)),
   SMOOTH(rrXC.FLOAT, "smooth", new rrXY().id_class(rrXC.FLOAT).id_break(rrXC.FLOAT).id_class(4)),
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

   public rrXC id_byte() {
      return this.expressionType;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public float id_byte(rrXt_1[] var1) {
      switch (this) {
         case PLUS:
            return id_class(var1, 0) + id_class(var1, 1);
         case MINUS:
            return id_class(var1, 0) - id_class(var1, 1);
         case MUL:
            return id_class(var1, 0) * id_class(var1, 1);
         case DIV:
            return id_class(var1, 0) / id_class(var1, 1);
         case MOD:
            float var2 = id_class(var1, 0);
            float var3 = id_class(var1, 1);
            return var2 - var3 * (float)((int)(var2 / var3));
         case NEG:
            return -id_class(var1, 0);
         case PI:
            return rfU_2.id_break;
         case SIN:
            return rfU_2.id_class(id_class(var1, 0));
         case COS:
            return rfU_2.id_break(id_class(var1, 0));
         case ASIN:
            return rrWD.id_class(id_class(var1, 0));
         case ACOS:
            return rrWD.id_break(id_class(var1, 0));
         case TAN:
            return (float)Math.tan((double)id_class(var1, 0));
         case ATAN:
            return (float)Math.atan((double)id_class(var1, 0));
         case ATAN2:
            return (float)rfU_2.id_protected((double)id_class(var1, 0), (double)id_class(var1, 1));
         case TORAD:
            return rrWD.id_protected(id_class(var1, 0));
         case TODEG:
            return rrWD.id_byte(id_class(var1, 0));
         case MIN:
            return this.id_case(var1);
         case MAX:
            return this.id_catch(var1);
         case CLAMP:
            return rfU_2.id_class(id_class(var1, 0), id_class(var1, 1), id_class(var1, 2));
         case ABS:
            return rfU_2.id_throws(id_class(var1, 0));
         case EXP:
            return (float)Math.exp((double)id_class(var1, 0));
         case FLOOR:
            return (float)rfU_2.id_protected(id_class(var1, 0));
         case CEIL:
            return (float)rfU_2.id_case(id_class(var1, 0));
         case FRAC:
            return rfU_2.id_private(id_class(var1, 0));
         case LOG:
            return (float)Math.log((double)id_class(var1, 0));
         case POW:
            return (float)Math.pow((double)id_class(var1, 0), (double)id_class(var1, 1));
         case RANDOM:
            return (float)Math.random();
         case ROUND:
            return (float)Math.round(id_class(var1, 0));
         case SIGNUM:
            return Math.signum(id_class(var1, 0));
         case SQRT:
            return rfU_2.id_byte(id_class(var1, 0));
         case FMOD:
            float var4 = id_class(var1, 0);
            float var5 = id_class(var1, 1);
            return var4 - var5 * (float)rfU_2.id_protected(var4 / var5);
         case TIME:
            QY var6 = QY.id_instanceof();
            gm_3 var7 = (gm_3)var6.id_class[56];
            if (var7 == null) {
               return 0.0F;
            }

            return (float)(var7.r() % 24000L) + var6.X();
         case IF:
            int var8 = (var1.length - 1) / 2;

            for (int var13 = 0; var13 < var8; var13++) {
               int var14 = var13 * 2;
               if (id_break(var1, var14)) {
                  return id_class(var1, var14 + 1);
               }
            }

            return id_class(var1, var8 * 2);
         case SMOOTH:
            int var9 = (int)id_class(var1, 0);
            float var10 = id_class(var1, 1);
            float var11 = var1.length > 2 ? id_class(var1, 2) : 1.0F;
            float var12 = var1.length > 3 ? id_class(var1, 3) : var11;
            return rrkT.id_class(var9, var10, var11, var12);
         default:
            rrbb_3.id_protected("Unknown function type: " + this);
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

   public String id_class() {
      return this.name;
   }

   private static float id_class(rrXt_1[] var0, int var1) {
      rrXf_1 var2 = (rrXf_1)var0[var1];
      return var2.id_class();
   }

   public static rrXq_1 id_class(String var0) {
      for (int var1 = 0; var1 < VALUES.length; var1++) {
         rrXq_1 var2 = VALUES[var1];
         if (var2.id_class().equals(var0)) {
            return var2;
         }
      }

      return null;
   }

   public int id_class(rrXt_1[] var1) {
      return this.parameters.id_class(var1).length;
   }

   public int id_break() {
      return this.precedence;
   }

   private static boolean id_break(rrXt_1[] var0, int var1) {
      rrXw_1 var2 = (rrXw_1)var0[var1];
      return var2.id_break();
   }

   public rrXC[] id_break(rrXt_1[] var1) {
      return this.parameters.id_class(var1);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public float[] id_throws(rrXt_1[] var1) {
      switch (this) {
         case VEC2:
            return new float[]{id_class(var1, 0), id_class(var1, 1)};
         case VEC3:
            return new float[]{id_class(var1, 0), id_class(var1, 1), id_class(var1, 2)};
         case VEC4:
            return new float[]{id_class(var1, 0), id_class(var1, 1), id_class(var1, 2), id_class(var1, 3)};
         default:
            rrbb_3.id_protected("Unknown function type: " + this);
            return null;
      }
   }

   private float id_catch(rrXt_1[] var1) {
      if (var1.length == 2) {
         return Math.max(id_class(var1, 0), id_class(var1, 1));
      } else {
         float var2 = id_class(var1, 0);

         for (int var3 = 1; var3 < var1.length; var3++) {
            float var4 = id_class(var1, var3);
            if (var4 > var2) {
               var2 = var4;
            }
         }

         return var2;
      }
   }

   private float id_case(rrXt_1[] var1) {
      if (var1.length == 2) {
         return Math.min(id_class(var1, 0), id_class(var1, 1));
      } else {
         float var2 = id_class(var1, 0);

         for (int var3 = 1; var3 < var1.length; var3++) {
            float var4 = id_class(var1, var3);
            if (var4 < var2) {
               var2 = var4;
            }
         }

         return var2;
      }
   }

   public rrXg_1 id_protected() {
      return this.parameters;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean id_protected(rrXt_1[] var1) {
      switch (this) {
         case TRUE:
            return true;
         case FALSE:
            return false;
         case NOT:
            return !id_break(var1, 0);
         case AND:
            return id_break(var1, 0) && id_break(var1, 1);
         case OR:
            return id_break(var1, 0) || id_break(var1, 1);
         case GREATER:
            return id_class(var1, 0) > id_class(var1, 1);
         case GREATER_OR_EQUAL:
            return id_class(var1, 0) >= id_class(var1, 1);
         case SMALLER:
            return id_class(var1, 0) < id_class(var1, 1);
         case SMALLER_OR_EQUAL:
            return id_class(var1, 0) <= id_class(var1, 1);
         case EQUAL:
            return id_class(var1, 0) == id_class(var1, 1);
         case NOT_EQUAL:
            return id_class(var1, 0) != id_class(var1, 1);
         case BETWEEN:
            float var2 = id_class(var1, 0);
            return var2 >= id_class(var1, 1) && var2 <= id_class(var1, 2);
         case EQUALS:
            float var3 = id_class(var1, 0) - id_class(var1, 1);
            float var4 = id_class(var1, 2);
            return Math.abs(var3) <= var4;
         case IN:
            float var5 = id_class(var1, 0);

            for (int var6 = 1; var6 < var1.length; var6++) {
               float var7 = id_class(var1, var6);
               if (var5 == var7) {
                  return true;
               }
            }

            return false;
         default:
            rrbb_3.id_protected("Unknown function type: " + this);
            return false;
      }
   }
}
