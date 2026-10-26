package celestial;

import java.lang.invoke.StringConcatFactory;

public class rrdg_1 {
   private rrdR class_;
   private String break_;
   private String byte_;
   private String protected_;

   public boolean byte_(String var1) {
      return this.final_() && var1.equals(this.break_);
   }

   public String byte_() {
      return this.byte_;
   }

   public float int_() {
      try {
         return Float.parseFloat(this.byte_);
      } catch (NumberFormatException var2) {
         throw new NumberFormatException("Invalid float: " + this.byte_ + ", line: " + this.protected_);
      }
   }

   public rrdg_1(rrdR var1, String var2, String var3, String var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
   }

   @Override
   public String toString() {
      return StringConcatFactory.makeConcatWithConstants<"makeConcatWithConstants","\u0001">(this.protected_);
   }

   public boolean this_() {
      String var1 = this.byte_.toLowerCase();
      if (!var1.equals("true") && !var1.equals("false")) {
         throw new RuntimeException("Invalid boolean: " + this.byte_ + ", line: " + this.protected_);
      } else {
         return Boolean.valueOf(this.byte_);
      }
   }

   public rrdR class_() {
      return this.class_;
   }

   public boolean class_(String var1, String var2, String var3, boolean var4) {
      return this.class_(var1, var2, var3) && this.this_() == var4;
   }

   public boolean class_(String var1, String var2, String var3) {
      return this.implements_(var1) || this.implements_(var2) || this.implements_(var3);
   }

   public boolean class_(String var1, String var2, boolean var3) {
      return this.break_(var1, var2) && this.this_() == var3;
   }

   public boolean class_(String var1) {
      return this.protected_() && var1.equals(this.break_);
   }

   public boolean class_(String var1, String var2) {
      return this.protected_(var1) && var2.equals(this.byte_);
   }

   public boolean class_(String var1, boolean var2) {
      return this.extends_(var1) && this.this_() == var2;
   }

   public boolean break_(String var1, boolean var2) {
      return this.implements_(var1) && this.this_() == var2;
   }

   public String break_() {
      return this.break_;
   }

   public boolean break_(String var1, String var2) {
      return this.implements_(var1) || this.implements_(var2);
   }

   public boolean break_(String var1) {
      return this.throws_() && var1.equals(this.break_);
   }

   public boolean throws_(String var1) {
      return this.catch_() && var1.equals(this.break_);
   }

   public boolean throws_() {
      return this.class_ == rrdR.ATTRIBUTE;
   }

   public boolean finally_(String var1) {
      return this.finally_() && var1.equals(this.break_);
   }

   public boolean finally_() {
      return this.class_ == rrdR.EXTENSION;
   }

   public boolean catch_(String var1) {
      return this.volatile_() && var1.equals(this.break_);
   }

   public boolean catch_() {
      return this.class_ == rrdR.CONST_INT;
   }

   public boolean extends_(String var1) {
      return this.implements_() && this.break_.endsWith(var1);
   }

   public boolean extends_() {
      return this.class_ == rrdR.CONST_VEC2;
   }

   public boolean case_() {
      return this.class_ == rrdR.PROPERTY;
   }

   public boolean case_(String var1) {
      return this.catch_() && this.break_.endsWith(var1);
   }

   public rjK_2 continue_() {
      if (this.byte_ == null) {
         return null;
      } else {
         String var1 = this.byte_.trim();
         var1 = rrzX_2.protected_(var1, "vec2");
         var1 = rrzX_2.private_(var1, " ()");
         String[] var2 = rrbb_3.class_(var1, ", ");
         if (var2.length != 2) {
            return null;
         } else {
            float[] var3 = new float[2];

            for (int var4 = 0; var4 < var2.length; var4++) {
               String var5 = var2[var4];
               var5 = rrzX_2.byte_(var5, new String[]{"F", "f"});
               float var6 = rrbb_3.class_(var5, Float.MAX_VALUE);
               if (var6 == Float.MAX_VALUE) {
                  return null;
               }

               var3[var4] = var6;
            }

            return new rjK_2(var3[0], var3[1]);
         }
      }
   }

   public boolean implements_(String var1) {
      return this.implements_() && var1.equals(this.break_);
   }

   public boolean implements_() {
      return this.class_ == rrdR.CONST_BOOL;
   }

   public rja_3 new_() {
      if (this.byte_ == null) {
         return null;
      } else {
         String var1 = this.byte_.trim();
         var1 = rrzX_2.protected_(var1, "ivec3");
         var1 = rrzX_2.private_(var1, " ()");
         String[] var2 = rrbb_3.class_(var1, ", ");
         if (var2.length != 3) {
            return null;
         } else {
            int[] var3 = new int[3];

            for (int var4 = 0; var4 < var2.length; var4++) {
               String var5 = var2[var4];
               int var6 = rrbb_3.class_(var5, Integer.MIN_VALUE);
               if (var6 == Integer.MIN_VALUE) {
                  return null;
               }

               var3[var4] = var6;
            }

            return new rja_3(var3[0], var3[1], var3[2]);
         }
      }
   }

   public int package_() {
      try {
         return Integer.parseInt(this.byte_);
      } catch (NumberFormatException var2) {
         throw new NumberFormatException("Invalid integer: " + this.byte_ + ", line: " + this.protected_);
      }
   }

   public rji_3 super_() {
      if (this.byte_ == null) {
         return null;
      } else {
         String var1 = this.byte_.trim();
         var1 = rrzX_2.protected_(var1, "vec4");
         var1 = rrzX_2.private_(var1, " ()");
         String[] var2 = rrbb_3.class_(var1, ", ");
         if (var2.length != 4) {
            return null;
         } else {
            float[] var3 = new float[4];

            for (int var4 = 0; var4 < var2.length; var4++) {
               String var5 = var2[var4];
               var5 = rrzX_2.byte_(var5, new String[]{"F", "f"});
               float var6 = rrbb_3.class_(var5, Float.MAX_VALUE);
               if (var6 == Float.MAX_VALUE) {
                  return null;
               }

               var3[var4] = var6;
            }

            return new rji_3(var3[0], var3[1], var3[2], var3[3]);
         }
      }
   }

   public boolean protected_() {
      return this.class_ == rrdR.UNIFORM;
   }

   public boolean protected_(String var1) {
      return this.case_() && var1.equals(this.break_);
   }

   public boolean private_() {
      return this.class_ == rrdR.CONST_FLOAT;
   }

   public boolean private_(String var1) {
      return this.private_() && var1.equals(this.break_);
   }

   public boolean final_() {
      return this.class_ == rrdR.LAYOUT;
   }

   public boolean volatile_() {
      return this.class_ == rrdR.CONST_IVEC3;
   }

   public boolean volatile_(String var1) {
      return this.native_() && this.break_.endsWith(var1);
   }

   public boolean native_() {
      return this.class_ == rrdR.CONST_VEC4;
   }

   public boolean native_(String var1) {
      return this.extends_() && var1.equals(this.break_);
   }
}
