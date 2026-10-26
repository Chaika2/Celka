package celestial;

public enum rrXk_1 {
   POS_X("tx"),
   POS_Y("ty"),
   POS_Z("tz"),
   ANGLE_X("rx"),
   ANGLE_Y("ry"),
   ANGLE_Z("rz"),
   SCALE_X("sx"),
   SCALE_Y("sy"),
   SCALE_Z("sz");

   private String name;
   public static rrXk_1[] VALUES = values();

   private rrXk_1(String var3) {
      this.name = var3;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public float id_class(Iq_1 var1) {
      switch (this) {
         case POS_X:
            return var1.id_byte;
         case POS_Y:
            return var1.id_protected;
         case POS_Z:
            return var1.id_throws;
         case ANGLE_X:
            return var1.id_case;
         case ANGLE_Y:
            return var1.id_catch;
         case ANGLE_Z:
            return var1.id_private;
         case SCALE_X:
            return var1.id_package;
         case SCALE_Y:
            return var1.id_int;
         case SCALE_Z:
            return var1.id_new;
         default:
            rrbb_3.id_protected("GetFloat not supported for: " + this);
            return 0.0F;
      }
   }

   public static rrXk_1 id_class(String var0) {
      for (int var1 = 0; var1 < VALUES.length; var1++) {
         rrXk_1 var2 = VALUES[var1];
         if (var2.id_class().equals(var0)) {
            return var2;
         }
      }

      return null;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void id_class(Iq_1 var1, float var2) {
      switch (this) {
         case POS_X:
            var1.id_byte = var2;
            return;
         case POS_Y:
            var1.id_protected = var2;
            return;
         case POS_Z:
            var1.id_throws = var2;
            return;
         case ANGLE_X:
            var1.id_case = var2;
            return;
         case ANGLE_Y:
            var1.id_catch = var2;
            return;
         case ANGLE_Z:
            var1.id_private = var2;
            return;
         case SCALE_X:
            var1.id_package = var2;
            return;
         case SCALE_Y:
            var1.id_int = var2;
            return;
         case SCALE_Z:
            var1.id_new = var2;
            return;
         default:
            rrbb_3.id_protected("SetFloat not supported for: " + this);
      }
   }

   public String id_class() {
      return this.name;
   }
}
