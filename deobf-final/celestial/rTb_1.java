package celestial;

public class rTb_1 extends rTG {
   private final rcd_3 class_;

   public rTb_1(int var1, rcd_3 var2) {
      super(var1);
      this.class_ = var2;
      rqO_2 var3 = rqO_2.break_(var2.native_("id"));
      if (var3 != null) {
         var2.class_("id", var3.toString());
      } else {
         var2.class_("id", "minecraft:pig");
      }
   }

   public rTb_1(rcd_3 var1) {
      this(var1.byte_("Weight", 99) ? var1.private_("Weight") : 1, var1.int_("Entity"));
   }

   public rTb_1() {
      super(1);
      this.class_ = new rcd_3();
      this.class_.class_("id", "minecraft:pig");
   }

   public rcd_3 class_() {
      rcd_3 var1 = new rcd_3();
      var1.class_("Entity", this.class_);
      var1.break_("Weight", this.byte_);
      return var1;
   }

   public rcd_3 break_() {
      return this.class_;
   }
}
