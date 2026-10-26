package celestial;

import java.util.function.Consumer;

public class NJ {
   NK id_break;
   private boolean id_byte;

   public NJ(NX var1, NK var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public void id_class(Consumer<NK> var1) {
      this.id_class.id_byte.execute(() -> {
         if (this.id_break != null) {
            var1.accept(this.id_break);
         }
      });
   }

   public boolean id_class() {
      return this.id_byte;
   }

   public void id_break() {
      this.id_byte = true;
      this.id_class.id_break.id_class(this.id_break);
      this.id_break = null;
   }
}
