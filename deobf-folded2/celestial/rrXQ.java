package celestial;

public enum rrXQ implements rrXw_1 {
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
   private static final rrXQ[] VALUES = values();

   private rrXQ(String var3) {
      this.name = var3;
      this.renderManager = QY.id_instanceof().id_case();
   }

   public static rrXQ id_class(String var0) {
      if (var0 == null) {
         return null;
      } else {
         for (int var1 = 0; var1 < VALUES.length; var1++) {
            rrXQ var2 = VALUES[var1];
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

   @Override
   public boolean id_break() {
      pV_2 var1 = this.renderManager.id_throws;
      if (var1 == null) {
         return false;
      } else {
         if (var1 instanceof qd_3 var2) {
            iB_2 var3 = var2.id_catch;
            if (var3 == null) {
               return false;
            }

            switch (this) {
               case IS_ALIVE:
                  return var3.BM();
               case IS_BURNING:
                  return var3.Pz();
               case IS_CHILD:
                  return var3.n_();
               case IS_GLOWING:
                  return var3.w();
               case IS_HURT:
                  return (Integer)var3.id_private[10] > 0;
               case IS_IN_LAVA:
                  return var3.ry();
               case IS_IN_WATER:
                  return var3.rT();
               case IS_INVISIBLE:
                  return var3.Pp();
               case IS_ON_GROUND:
                  return var3.BL();
               case IS_RIDDEN:
                  return var3.BP();
               case IS_RIDING:
                  return var3.Pm();
               case IS_SNEAKING:
                  return var3.x();
               case IS_SPRINTING:
                  return var3.PF();
               case IS_WET:
                  return var3.Pf();
            }
         }

         return false;
      }
   }
}
