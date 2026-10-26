package celestial;

public class rrGX {
   private final rfH_2 class_;
   private final int break_;
   private final int byte_;

   public int byte_() {
      return this.break_;
   }

   public rrGX(rfH_2 var1, int var2, int var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   public static String class_(rfH_2 var0) {
      return "frame-" + var0.b_() + "," + var0.c_() + "," + var0.d_();
   }

   public static rrGX class_(rcd_3 var0) {
      rfH_2 var1 = rco_3.break_(var0.int_("Pos"));
      int var2 = var0.private_("Rotation");
      int var3 = var0.private_("EntityId");
      return new rrGX(var1, var2, var3);
   }

   public rcd_3 class_() {
      rcd_3 var1 = new rcd_3();
      var1.class_("Pos", rco_3.class_(this.class_));
      var1.break_("Rotation", this.break_);
      var1.break_("EntityId", this.byte_);
      return var1;
   }

   public rfH_2 break_() {
      return this.class_;
   }

   public String throws_() {
      return class_(this.class_);
   }

   public int protected_() {
      return this.byte_;
   }
}
