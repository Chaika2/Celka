package celestial;

public enum rrkc_1 implements rrXw_1 {
   IS_ALIVE("is_alive"),
   IS_BURNING("is_burning"),
   IS_CHILD("is_child"),
   IS_GLOWING("is_glowing"),
   IS_HURT("is_hurt"),
   IS_IN_LAVA("is_in_lava"),
   IS_IN_WATER("is_in_water"),
   IS_INVISIBLE("is_invisible"),
   IS_ON_GROUND("is_on_ground"),
   IS_RIDDEN("is_ridden"),
   IS_RIDING("is_riding"),
   IS_SNEAKING("is_sneaking"),
   IS_SPRINTING("is_sprinting"),
   IS_WET("is_wet");

   private String name;
   private pg_3 renderManager;
   private static final rrkc_1[] VALUES = values();

   private rrkc_1(String var3) {
      this.name = var3;
      this.renderManager = QY.instanceof_().case_();
   }

   public static rrkc_1 class_(String var0) {
      if (var0 == null) {
         return null;
      } else {
         for (int var1 = 0; var1 < VALUES.length; var1++) {
            rrkc_1 var2 = VALUES[var1];
            if (var2.class_().equals(var0)) {
               return var2;
            }
         }

         return null;
      }
   }

   public String class_() {
      return this.name;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public boolean break_() {
      if (QY.instanceof_().catch_() instanceof iB_2 var2) {
         switch (rrku_1.class_[this.ordinal()]) {
            case 1:
               return var2.BM();
            case 2:
               return var2.Pz();
            case 3:
               return var2.n_();
            case 4:
               return var2.w();
            case 5:
               return (Integer)var2.private_[10] > 0;
            case 6:
               return var2.ry();
            case 7:
               return var2.rT();
            case 8:
               return var2.Pp();
            case 9:
               return var2.BL();
            case 10:
               return var2.BP();
            case 11:
               return var2.Pm();
            case 12:
               return var2.x();
            case 13:
               return var2.PF();
            case 14:
               return var2.Pf();
         }
      }

      return false;
   }
}
