package celestial;

import java.util.function.Consumer;

class rTJ implements rTX<Msg> {
   rTJ(String var1, Consumer var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public String toString() {
      return this.id_class;
   }

   @Override
   public void id_class(Msg var1) {
      this.id_break.accept(var1);
   }

   @Override
   public String j_() {
      return this.id_class;
   }
}
