package celestial;

import java.util.List;
import java.util.function.Function;

abstract class vX_2 implements vd_3 {
   private final rAp_1 id_break;

   @Override
   public rqO_2 id_byte() {
      return this.id_class.id_case.apply(this.id_break);
   }

   public vX_2(vh_3 var1, rAp_1 var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   protected void id_class(int var1) {
      List var2 = this.id_class();
      int var3 = var2.indexOf(this.id_break);
      var2.remove(var3);
      var2.add(var3 + var1, this.id_break);
      this.id_class.id_break.run();
   }

   protected abstract List<rAp_1> id_class();

   protected abstract List<rAp_1> id_break();

   @Override
   public rgP_2 id_throws() {
      return this.id_break.id_class();
   }

   protected void id_finally() {
      this.id_class().remove(this.id_break);
      this.id_break.id_private().id_class(this.id_break(), this.id_break, Function.identity(), true);
      this.id_class.id_break.run();
   }

   @Override
   public rAZ id_catch() {
      return this.id_break.id_implements();
   }

   @Override
   public boolean id_extends() {
      List var1 = this.id_class();
      int var2 = var1.indexOf(this.id_break);
      return var2 > 0 && !((rAp_1)var1.get(var2 - 1)).id_catch();
   }

   @Override
   public rgP_2 id_case() {
      return this.id_break.id_break();
   }

   @Override
   public boolean id_implements() {
      return this.id_break.id_case();
   }

   @Override
   public rAl_1 id_protected() {
      return this.id_break.id_byte();
   }

   @Override
   public boolean id_private() {
      return this.id_break.id_catch();
   }

   @Override
   public void id_final() {
      this.id_class(1);
   }

   @Override
   public boolean id_volatile() {
      List var1 = this.id_class();
      int var2 = var1.indexOf(this.id_break);
      return var2 >= 0 && var2 < var1.size() - 1 && !((rAp_1)var1.get(var2 + 1)).id_catch();
   }

   @Override
   public void id_native() {
      this.id_class(-1);
   }
}
