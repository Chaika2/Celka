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
      this.renderManager = QY.id_instanceof().id_case();
   }

   public static rrkc_1 id_class(String var0) {
      if (var0 == null) {
         return null;
      } else {
         for (int var1 = 0; var1 < VALUES.length; var1++) {
            rrkc_1 var2 = VALUES[var1];
            if (var2.id_class().equals(var0)) {
               return var2;
            }
         }

         return null;
      }
   }

   public String id_class() {
      return this.name;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public boolean id_break() {
      if (QY.id_instanceof().id_catch() instanceof iB_2 var2) {
         switch (this) {
            case IS_ALIVE:
               return var2.BM();
            case IS_BURNING:
               return var2.Pz();
            case IS_CHILD:
               return var2.n_();
            case IS_GLOWING:
               return var2.w();
            case IS_HURT:
               return (Integer)var2.id_private[10] > 0;
            case IS_IN_LAVA:
               return var2.ry();
            case IS_IN_WATER:
               return var2.rT();
            case IS_INVISIBLE:
               return var2.Pp();
            case IS_ON_GROUND:
               return var2.BL();
            case IS_RIDDEN:
               return var2.BP();
            case IS_RIDING:
               return var2.Pm();
            case IS_SNEAKING:
               return var2.x();
            case IS_SPRINTING:
               return var2.PF();
            case IS_WET:
               return var2.Pf();
         }
      }

      return false;
   }
}
