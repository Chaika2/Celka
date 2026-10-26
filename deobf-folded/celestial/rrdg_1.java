package celestial;

import java.lang.invoke.StringConcatFactory;

public class rrdg_1 {
   private rrdR id_class;
   private String id_break;
   private String id_byte;
   private String id_protected;

   public boolean id_byte(String var1) {
      return this.id_final() && var1.equals(this.id_break);
   }

   public String id_byte() {
      return this.id_byte;
   }

   public float id_int() {
      try {
         return Float.parseFloat(this.id_byte);
      } catch (NumberFormatException var2) {
         throw new NumberFormatException("Invalid float: " + this.id_byte + ", line: " + this.id_protected);
      }
   }

   public rrdg_1(rrdR var1, String var2, String var3, String var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   @Override
   public String toString() {
      return StringConcatFactory.makeConcatWithConstants<"makeConcatWithConstants","\u0001">(this.id_protected);
   }

   public boolean id_this() {
      String var1 = this.id_byte.toLowerCase();
      if (!var1.equals("true") && !var1.equals("false")) {
         throw new RuntimeException("Invalid boolean: " + this.id_byte + ", line: " + this.id_protected);
      } else {
         return Boolean.valueOf(this.id_byte);
      }
   }

   public rrdR id_class() {
      return this.id_class;
   }

   public boolean id_class(String var1, String var2, String var3, boolean var4) {
      return this.id_class(var1, var2, var3) && this.id_this() == var4;
   }

   public boolean id_class(String var1, String var2, String var3) {
      return this.id_implements(var1) || this.id_implements(var2) || this.id_implements(var3);
   }

   public boolean id_class(String var1, String var2, boolean var3) {
      return this.id_break(var1, var2) && this.id_this() == var3;
   }

   public boolean id_class(String var1) {
      return this.id_protected() && var1.equals(this.id_break);
   }

   public boolean id_class(String var1, String var2) {
      return this.id_protected(var1) && var2.equals(this.id_byte);
   }

   public boolean id_class(String var1, boolean var2) {
      return this.id_extends(var1) && this.id_this() == var2;
   }

   public boolean id_break(String var1, boolean var2) {
      return this.id_implements(var1) && this.id_this() == var2;
   }

   public String id_break() {
      return this.id_break;
   }

   public boolean id_break(String var1, String var2) {
      return this.id_implements(var1) || this.id_implements(var2);
   }

   public boolean id_break(String var1) {
      return this.id_throws() && var1.equals(this.id_break);
   }

   public boolean id_throws(String var1) {
      return this.id_catch() && var1.equals(this.id_break);
   }

   public boolean id_throws() {
      return this.id_class == rrdR.ATTRIBUTE;
   }

   public boolean id_finally(String var1) {
      return this.id_finally() && var1.equals(this.id_break);
   }

   public boolean id_finally() {
      return this.id_class == rrdR.EXTENSION;
   }

   public boolean id_catch(String var1) {
      return this.id_volatile() && var1.equals(this.id_break);
   }

   public boolean id_catch() {
      return this.id_class == rrdR.CONST_INT;
   }

   public boolean id_extends(String var1) {
      return this.id_implements() && this.id_break.endsWith(var1);
   }

   public boolean id_extends() {
      return this.id_class == rrdR.CONST_VEC2;
   }

   public boolean id_case() {
      return this.id_class == rrdR.PROPERTY;
   }

   public boolean id_case(String var1) {
      return this.id_catch() && this.id_break.endsWith(var1);
   }

   public rjK_2 id_continue() {
      if (this.id_byte == null) {
         return null;
      } else {
         String var1 = this.id_byte.trim();
         var1 = rrzX_2.id_protected(var1, "vec2");
         var1 = rrzX_2.id_private(var1, " ()");
         String[] var2 = rrbb_3.id_class(var1, ", ");
         if (var2.length != 2) {
            return null;
         } else {
            float[] var3 = new float[2];

            for (int var4 = 0; var4 < var2.length; var4++) {
               String var5 = var2[var4];
               var5 = rrzX_2.id_byte(var5, new String[]{"F", "f"});
               float var6 = rrbb_3.id_class(var5, Float.MAX_VALUE);
               if (var6 == Float.MAX_VALUE) {
                  return null;
               }

               var3[var4] = var6;
            }

            return new rjK_2(var3[0], var3[1]);
         }
      }
   }

   public boolean id_implements(String var1) {
      return this.id_implements() && var1.equals(this.id_break);
   }

   public boolean id_implements() {
      return this.id_class == rrdR.CONST_BOOL;
   }

   public rja_3 id_new() {
      if (this.id_byte == null) {
         return null;
      } else {
         String var1 = this.id_byte.trim();
         var1 = rrzX_2.id_protected(var1, "ivec3");
         var1 = rrzX_2.id_private(var1, " ()");
         String[] var2 = rrbb_3.id_class(var1, ", ");
         if (var2.length != 3) {
            return null;
         } else {
            int[] var3 = new int[3];

            for (int var4 = 0; var4 < var2.length; var4++) {
               String var5 = var2[var4];
               int var6 = rrbb_3.id_class(var5, Integer.MIN_VALUE);
               if (var6 == Integer.MIN_VALUE) {
                  return null;
               }

               var3[var4] = var6;
            }

            return new rja_3(var3[0], var3[1], var3[2]);
         }
      }
   }

   public int id_package() {
      try {
         return Integer.parseInt(this.id_byte);
      } catch (NumberFormatException var2) {
         throw new NumberFormatException("Invalid integer: " + this.id_byte + ", line: " + this.id_protected);
      }
   }

   public rji_3 id_super() {
      if (this.id_byte == null) {
         return null;
      } else {
         String var1 = this.id_byte.trim();
         var1 = rrzX_2.id_protected(var1, "vec4");
         var1 = rrzX_2.id_private(var1, " ()");
         String[] var2 = rrbb_3.id_class(var1, ", ");
         if (var2.length != 4) {
            return null;
         } else {
            float[] var3 = new float[4];

            for (int var4 = 0; var4 < var2.length; var4++) {
               String var5 = var2[var4];
               var5 = rrzX_2.id_byte(var5, new String[]{"F", "f"});
               float var6 = rrbb_3.id_class(var5, Float.MAX_VALUE);
               if (var6 == Float.MAX_VALUE) {
                  return null;
               }

               var3[var4] = var6;
            }

            return new rji_3(var3[0], var3[1], var3[2], var3[3]);
         }
      }
   }

   public boolean id_protected() {
      return this.id_class == rrdR.UNIFORM;
   }

   public boolean id_protected(String var1) {
      return this.id_case() && var1.equals(this.id_break);
   }

   public boolean id_private() {
      return this.id_class == rrdR.CONST_FLOAT;
   }

   public boolean id_private(String var1) {
      return this.id_private() && var1.equals(this.id_break);
   }

   public boolean id_final() {
      return this.id_class == rrdR.LAYOUT;
   }

   public boolean id_volatile() {
      return this.id_class == rrdR.CONST_IVEC3;
   }

   public boolean id_volatile(String var1) {
      return this.id_native() && this.id_break.endsWith(var1);
   }

   public boolean id_native() {
      return this.id_class == rrdR.CONST_VEC4;
   }

   public boolean id_native(String var1) {
      return this.id_extends() && var1.equals(this.id_break);
   }
}
