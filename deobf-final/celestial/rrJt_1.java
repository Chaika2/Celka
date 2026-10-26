package celestial;

public class rrJt_1 {
   private float class_ = Float.MAX_VALUE;
   private float break_ = Float.MAX_VALUE;
   private float byte_ = Float.MAX_VALUE;
   private float protected_ = -Float.MAX_VALUE;
   private float throws_ = -Float.MAX_VALUE;
   private float case_ = -Float.MAX_VALUE;

   public float byte_() {
      return this.byte_;
   }

   public rrJt_1(int[] var1) {
      int var2 = var1.length / 4;

      for (int var3 = 0; var3 < 4; var3++) {
         int var4 = var3 * var2;
         float var5 = Float.intBitsToFloat(var1[var4 + 0]);
         float var6 = Float.intBitsToFloat(var1[var4 + 1]);
         float var7 = Float.intBitsToFloat(var1[var4 + 2]);
         if (this.class_ > var5) {
            this.class_ = var5;
         }

         if (this.break_ > var6) {
            this.break_ = var6;
         }

         if (this.byte_ > var7) {
            this.byte_ = var7;
         }

         if (this.protected_ < var5) {
            this.protected_ = var5;
         }

         if (this.throws_ < var6) {
            this.throws_ = var6;
         }

         if (this.case_ < var7) {
            this.case_ = var7;
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean class_(rpr_3 var1) {
      float var2;
      float var3;
      float var4;
      switch (var1) {
         case DOWN:
            var2 = this.break_();
            var3 = this.throws_();
            var4 = 0.0F;
            break;
         case UP:
            var2 = this.break_();
            var3 = this.throws_();
            var4 = 1.0F;
            break;
         case NORTH:
            var2 = this.byte_();
            var3 = this.case_();
            var4 = 0.0F;
            break;
         case SOUTH:
            var2 = this.byte_();
            var3 = this.case_();
            var4 = 1.0F;
            break;
         case WEST:
            var2 = this.class_();
            var3 = this.protected_();
            var4 = 0.0F;
            break;
         case EAST:
            var2 = this.class_();
            var3 = this.protected_();
            var4 = 1.0F;
            break;
         default:
            return false;
      }

      return var2 == var4 && var3 == var4;
   }

   public float class_() {
      return this.class_;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean break_(rpr_3 var1) {
      float var2;
      float var3;
      float var4;
      float var5;
      switch (var1) {
         case DOWN:
         case UP:
            var2 = this.class_();
            var3 = this.protected_();
            var4 = this.byte_();
            var5 = this.case_();
            break;
         case NORTH:
         case SOUTH:
            var2 = this.class_();
            var3 = this.protected_();
            var4 = this.break_();
            var5 = this.throws_();
            break;
         case WEST:
         case EAST:
            var2 = this.break_();
            var3 = this.throws_();
            var4 = this.byte_();
            var5 = this.case_();
            break;
         default:
            return false;
      }

      return var2 == 0.0F && var3 == 1.0F && var4 == 0.0F && var5 == 1.0F;
   }

   public float break_() {
      return this.break_;
   }

   public float throws_() {
      return this.throws_;
   }

   public float case_() {
      return this.case_;
   }

   public float protected_() {
      return this.protected_;
   }
}
