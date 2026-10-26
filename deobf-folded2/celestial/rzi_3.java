package celestial;

import java.util.function.Consumer;

public class rzi_3 extends rzY_2 {
   final rqO_2 id_catch;

   rzi_3(rqO_2 var1, int var2, int var3, rQz_1[] var4, rNL[] var5) {
      super(var2, var3, var4, var5);
      this.id_catch = var1;
   }

   @Override
   public void id_class(rQs_1 var1) {
      if (var1.id_class(this.id_catch)) {
         var1.id_class("Table " + this.id_catch + " is recursively called");
      } else {
         super.id_class(var1);
         rzL_2 var2 = var1.id_byte(this.id_catch);
         if (var2 == null) {
            var1.id_class("Unknown loot table called " + this.id_catch);
         } else {
            var2.id_class(var1.id_class("->{" + this.id_catch + "}", this.id_catch));
         }
      }
   }

   public static rzK_2<?> id_class(rqO_2 var0) {
      return id_class((var1, var2, var3, var4) -> new rzi_3(var0, var1, var2, var3, var4));
   }

   @Override
   public void id_class(Consumer<rdn_3> var1, rzr_3 var2) {
      rzL_2 var3 = var2.id_class(this.id_catch);
      var3.id_class(var2, var1);
   }

   @Override
   public rzm_3 id_class() {
      return rzM_2.id_byte;
   }
}
