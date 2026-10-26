package celestial;

import java.util.function.Consumer;

class rTJ implements rTX<Msg> {
   rTJ(String var1, Consumer var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public String toString() {
      return this.class_;
   }

   @Override
   public void class_(Msg var1) {
      this.break_.accept(var1);
   }

   @Override
   public String j_() {
      return this.class_;
   }
}
