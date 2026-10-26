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
   public float class_(Iq_1 var1) {
      switch (this) {
         case POS_X:
            return var1.byte_;
         case POS_Y:
            return var1.protected_;
         case POS_Z:
            return var1.throws_;
         case ANGLE_X:
            return var1.case_;
         case ANGLE_Y:
            return var1.catch_;
         case ANGLE_Z:
            return var1.private_;
         case SCALE_X:
            return var1.package_;
         case SCALE_Y:
            return var1.int_;
         case SCALE_Z:
            return var1.new_;
         default:
            rrbb_3.protected_("GetFloat not supported for: " + this);
            return 0.0F;
      }
   }

   public static rrXk_1 class_(String var0) {
      for (int var1 = 0; var1 < VALUES.length; var1++) {
         rrXk_1 var2 = VALUES[var1];
         if (var2.class_().equals(var0)) {
            return var2;
         }
      }

      return null;
   }

   public void class_(Iq_1 var1, float var2) {
      switch (this) {
         case POS_X:
            var1.byte_ = var2;
            return;
         case POS_Y:
            var1.protected_ = var2;
            return;
         case POS_Z:
            var1.throws_ = var2;
            return;
         case ANGLE_X:
            var1.case_ = var2;
            return;
         case ANGLE_Y:
            var1.catch_ = var2;
            return;
         case ANGLE_Z:
            var1.private_ = var2;
            return;
         case SCALE_X:
            var1.package_ = var2;
            return;
         case SCALE_Y:
            var1.int_ = var2;
            return;
         case SCALE_Z:
            var1.new_ = var2;
            return;
         default:
            rrbb_3.protected_("SetFloat not supported for: " + this);
      }
   }

   public String class_() {
      return this.name;
   }
}
