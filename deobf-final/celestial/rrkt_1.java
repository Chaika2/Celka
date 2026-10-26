package celestial;

public enum rrkt_1 {
   BOOL,
   INT,
   FLOAT,
   VEC2,
   VEC3,
   VEC4;

   private void class_(rrXj_1 var1, rrkC var2) {
      float[] var3 = var1.class_();
      if (var3.length != 3) {
         throw new RuntimeException("Value length is not 3, length: " + var3.length);
      } else {
         var2.class_(var3[0], var3[1], var3[2]);
      }
   }

   private void class_(rrXj_1 var1, rrkl_1 var2) {
      float[] var3 = var1.class_();
      if (var3.length != 4) {
         throw new RuntimeException("Value length is not 4, length: " + var3.length);
      } else {
         var2.class_(var3[0], var3[1], var3[2], var3[3]);
      }
   }

   public boolean class_(rrXC var1) {
      switch (this) {
         case BOOL:
            return var1 == rrXC.BOOL;
         case INT:
            return var1 == rrXC.FLOAT;
         case FLOAT:
            return var1 == rrXC.FLOAT;
         case VEC2:
         case VEC3:
         case VEC4:
            return var1 == rrXC.FLOAT_ARRAY;
         default:
            throw new RuntimeException("Unknown uniform type: " + this);
      }
   }

   private void class_(rrXf_1 var1, rrkF var2) {
      float var3 = var1.class_();
      var2.class_(var3);
   }

   public void class_(rrXt_1 var1, rrky_1 var2) {
      switch (this) {
         case BOOL:
            this.class_((rrXw_1)var1, (rrkL)var2);
            return;
         case INT:
            this.class_((rrXf_1)var1, (rrkL)var2);
            return;
         case FLOAT:
            this.class_((rrXf_1)var1, (rrkF)var2);
            return;
         case VEC2:
            this.class_((rrXj_1)var1, (rrkA)var2);
            return;
         case VEC3:
            this.class_((rrXj_1)var1, (rrkC)var2);
            return;
         case VEC4:
            this.class_((rrXj_1)var1, (rrkl_1)var2);
            return;
         default:
            throw new RuntimeException("Unknown uniform type: " + this);
      }
   }

   public rrky_1 class_(String var1) {
      switch (this) {
         case BOOL:
            return new rrkL(var1);
         case INT:
            return new rrkL(var1);
         case FLOAT:
            return new rrkF(var1);
         case VEC2:
            return new rrkA(var1);
         case VEC3:
            return new rrkC(var1);
         case VEC4:
            return new rrkl_1(var1);
         default:
            throw new RuntimeException("Unknown uniform type: " + this);
      }
   }

   private void class_(rrXw_1 var1, rrkL var2) {
      boolean var3 = var1.break_();
      int var4 = var3 ? 1 : 0;
      var2.break_(var4);
   }

   private void class_(rrXf_1 var1, rrkL var2) {
      int var3 = (int)var1.class_();
      var2.break_(var3);
   }

   private void class_(rrXj_1 var1, rrkA var2) {
      float[] var3 = var1.class_();
      if (var3.length != 2) {
         throw new RuntimeException("Value length is not 2, length: " + var3.length);
      } else {
         var2.class_(var3[0], var3[1]);
      }
   }

   public static rrkt_1 break_(String var0) {
      rrkt_1[] var1 = values();

      for (int var2 = 0; var2 < var1.length; var2++) {
         rrkt_1 var3 = var1[var2];
         if (var3.name().toLowerCase().equals(var0)) {
            return var3;
         }
      }

      return null;
   }
}
