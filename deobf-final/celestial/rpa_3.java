package celestial;

public enum rpa_3 {
   NONE(rjg_3.IDENTITY),
   LEFT_RIGHT(rjg_3.INVERT_Z),
   FRONT_BACK(rjg_3.INVERT_X);

   private final rjg_3 orientation;

   private rpa_3(rjg_3 var3) {
      this.orientation = var3;
   }

   public rqd_3 class_(rpr_3 var1) {
      rpB_2 var2 = var1.final_();
      return this == LEFT_RIGHT && var2 == rpB_2.Z || this == FRONT_BACK && var2 == rpB_2.X ? rqd_3.CLOCKWISE_180 : rqd_3.NONE;
   }

   public rjg_3 class_() {
      return this.orientation;
   }

   public int class_(int var1, int var2) {
      int var3 = var2 / 2;
      int var4 = var1 > var3 ? var1 - var2 : var1;
      switch (this) {
         case FRONT_BACK:
            return (var2 - var4) % var2;
         case LEFT_RIGHT:
            return (var3 - var4 + var2) % var2;
         default:
            return var1;
      }
   }

   public rpr_3 break_(rpr_3 var1) {
      if (this == FRONT_BACK && var1.final_() == rpB_2.X) {
         return var1.case_();
      } else {
         return this == LEFT_RIGHT && var1.final_() == rpB_2.Z ? var1.case_() : var1;
      }
   }
}
