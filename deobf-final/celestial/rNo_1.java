package celestial;

public class rNo_1 extends rzO_2 {
   final rqO_2 break_;
   final long byte_;

   rNo_1(rQz_1[] var1, rqO_2 var2, long var3) {
      super(var1);
      this.break_ = var2;
      this.byte_ = var3;
   }

   @Override
   public void class_(rQs_1 var1) {
      if (var1.class_(this.break_)) {
         var1.class_("Table " + this.break_ + " is recursively called");
      } else {
         super.class_(var1);
         rzL_2 var2 = var1.byte_(this.break_);
         if (var2 == null) {
            var1.class_("Unknown loot table called " + this.break_);
         } else {
            var2.class_(var1.class_("->{" + this.break_ + "}", this.break_));
         }
      }
   }

   @Override
   public rzx_3 break_() {
      return rNl_1.new_;
   }

   @Override
   public rdn_3 break_(rdn_3 var1, rzr_3 var2) {
      if (var1.class_()) {
         return var1;
      } else {
         rcd_3 var3 = new rcd_3();
         var3.class_("LootTable", this.break_.toString());
         if (this.byte_ != 0L) {
            var3.class_("LootTableSeed", this.byte_);
         }

         var1.int_().class_("BlockEntityTag", var3);
         return var1;
      }
   }
}
