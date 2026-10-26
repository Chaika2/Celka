package celestial;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class rzY_2 extends rzE_2 {
   protected final int protected_;
   protected final int throws_;
   protected final rNL[] case_;
   final BiFunction<rdn_3, rzr_3, rdn_3> catch_;
   private final rWR private_ = new rzo_3(this);

   protected rzY_2(int var1, int var2, rQz_1[] var3, rNL[] var4) {
      super(var3);
      this.protected_ = var1;
      this.throws_ = var2;
      this.case_ = var4;
      this.catch_ = rNl_1.class_(var4);
   }

   @Override
   public boolean expand(rzr_3 var1, Consumer<rWR> var2) {
      if (this.class_(var1)) {
         var2.accept(this.private_);
         return true;
      } else {
         return false;
      }
   }

   public static rzK_2<?> class_(rze_3 var0) {
      return new rzD_2(var0);
   }

   protected abstract void class_(Consumer<rdn_3> var1, rzr_3 var2);

   @Override
   public void class_(rQs_1 var1) {
      super.class_(var1);

      for (int var2 = 0; var2 < this.case_.length; var2++) {
         this.case_[var2].class_(var1.break_(".functions[" + var2 + "]"));
      }
   }
}
