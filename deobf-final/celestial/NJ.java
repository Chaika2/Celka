package celestial;

import java.util.function.Consumer;

public class NJ {
   NK break_;
   private boolean byte_;

   public NJ(NX var1, NK var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public void class_(Consumer<NK> var1) {
      this.class_.byte_.execute(() -> {
         if (this.break_ != null) {
            var1.accept(this.break_);
         }
      });
   }

   public boolean class_() {
      return this.byte_;
   }

   public void break_() {
      this.byte_ = true;
      this.class_.break_.class_(this.break_);
      this.break_ = null;
   }
}
