package celestial;

import java.util.Comparator;

class mj_3 extends LV<mV_2> {
   mj_3(mf_3 var1) {
      super(var1.id_volatile, var1.id_package, var1.id_int, 40, var1.id_int - 37, 16);
      this.id_class = var1;
      var1.id_catch
         .id_throws()
         .stream()
         .sorted(Comparator.comparing(var0 -> var0.getKey().id_class().toString()))
         .forEach(var1x -> this.id_break(new mV_2(this, var1x.getValue())));
   }

   public void id_class(mV_2 var1) {
      super.id_class(var1);
      if (var1 != null) {
         this.id_class.id_implements = var1.id_break;
      }

      this.id_class.id_finally();
   }

   @Override
   protected boolean id_class() {
      return this.id_class.id_catch() == this;
   }
}
