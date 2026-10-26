package celestial;

import com.google.gson.JsonElement;
import java.util.function.Consumer;

abstract class JG {
   private final String class_;

   public JG(String var1) {
      this.class_ = var1;
   }

   public void class_(rCF<?, ?> var1, Consumer<String> var2) {
      rCZ var3 = var1.class_(this.class_);
      if (var3 == null) {
         var2.accept(this.class_);
      }
   }

   public abstract JsonElement class_();

   protected abstract <T extends Comparable<T>> boolean class_(rCn_1<?, ?> var1, rCZ<T> var2);

   public <S extends rCn_1<?, S>> boolean class_(rCF<?, S> var1, S var2) {
      rCZ var3 = var1.class_(this.class_);
      return var3 == null ? false : this.class_(var2, var3);
   }

   public String break_() {
      return this.class_;
   }
}
