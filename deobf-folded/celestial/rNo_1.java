package celestial;

public class rNo_1 extends rzO_2 {
   final rqO_2 id_break;
   final long id_byte;

   rNo_1(rQz_1[] var1, rqO_2 var2, long var3) {
      super(var1);
      this.id_break = var2;
      this.id_byte = var3;
   }

   @Override
   public void id_class(rQs_1 var1) {
      if (var1.id_class(this.id_break)) {
         var1.id_class("Table " + this.id_break + " is recursively called");
      } else {
         super.id_class(var1);
         rzL_2 var2 = var1.id_byte(this.id_break);
         if (var2 == null) {
            var1.id_class("Unknown loot table called " + this.id_break);
         } else {
            var2.id_class(var1.id_class("->{" + this.id_break + "}", this.id_break));
         }
      }
   }

   @Override
   public rzx_3 id_break() {
      return rNl_1.id_new;
   }

   @Override
   public rdn_3 id_break(rdn_3 var1, rzr_3 var2) {
      if (var1.id_class()) {
         return var1;
      } else {
         rcd_3 var3 = new rcd_3();
         var3.id_class("LootTable", this.id_break.toString());
         if (this.id_byte != 0L) {
            var3.id_class("LootTableSeed", this.id_byte);
         }

         var1.id_int().id_class("BlockEntityTag", var3);
         return var1;
      }
   }
}
