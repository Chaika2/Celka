package celestial;

public enum rrXc_1 implements rrXf_1 {
   LIMB_SWING("limb_swing"),
   LIMB_SWING_SPEED("limb_speed"),
   AGE("age"),
   HEAD_YAW("head_yaw"),
   HEAD_PITCH("head_pitch"),
   HEALTH("health"),
   HURT_TIME("hurt_time"),
   IDLE_TIME("idle_time"),
   MAX_HEALTH("max_health"),
   MOVE_FORWARD("move_forward"),
   MOVE_STRAFING("move_strafing"),
   PARTIAL_TICKS("partial_ticks"),
   POS_X("pos_x"),
   POS_Y("pos_y"),
   POS_Z("pos_z"),
   REVENGE_TIME("revenge_time"),
   SWING_PROGRESS("swing_progress");

   private String name;
   private pg_3 renderManager;
   private static final rrXc_1[] VALUES = values();

   private rrXc_1(String var3) {
      this.name = var3;
      this.renderManager = QY.id_instanceof().id_case();
   }

   @Override
   public float id_class() {
      pV_2 var1 = this.renderManager.id_throws;
      if (var1 == null) {
         return 0.0F;
      } else {
         if (var1 instanceof qd_3 var2) {
            switch (this) {
               case LIMB_SWING:
                  return var2.id_private;
               case LIMB_SWING_SPEED:
                  return var2.id_implements;
               case AGE:
                  return var2.id_finally;
               case HEAD_YAW:
                  return var2.id_extends;
               case HEAD_PITCH:
                  return var2.id_native;
               default:
                  iB_2 var3 = var2.id_catch;
                  if (var3 == null) {
                     return 0.0F;
                  }

                  switch (this) {
                     case HEALTH:
                        return var3.Ss();
                     case HURT_TIME:
                        return (float)((Integer)var3.id_private[10]).intValue();
                     case IDLE_TIME:
                        return (float)var3.BI();
                     case MAX_HEALTH:
                        return var3.SK();
                     case MOVE_FORWARD:
                        return (Float)var3.id_private[44];
                     case MOVE_STRAFING:
                        return (Float)var3.id_private[42];
                     case POS_X:
                        return (float)var3.rx();
                     case POS_Y:
                        return (float)var3.re();
                     case POS_Z:
                        return (float)var3.BO();
                     case REVENGE_TIME:
                        return (float)var3.Sb();
                     case SWING_PROGRESS:
                        return var3.id_goto(var2.id_volatile);
                  }
            }
         }

         return 0.0F;
      }
   }

   public static rrXc_1 id_class(String var0) {
      if (var0 == null) {
         return null;
      } else {
         for (int var1 = 0; var1 < VALUES.length; var1++) {
            rrXc_1 var2 = VALUES[var1];
            if (var2.id_break().equals(var0)) {
               return var2;
            }
         }

         return null;
      }
   }

   public String id_break() {
      return this.name;
   }
}
