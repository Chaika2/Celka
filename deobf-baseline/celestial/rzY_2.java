package celestial;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class rzY_2 extends rzE_2 {
   protected final int id_protected;
   protected final int id_throws;
   protected final rNL[] id_case;
   final BiFunction<rdn_3, rzr_3, rdn_3> id_catch;
   private final rWR id_private = new rzo_3(this);

   protected rzY_2(int var1, int var2, rQz_1[] var3, rNL[] var4) {
      super(var3);
      this.id_protected = var1;
      this.id_throws = var2;
      this.id_case = var4;
      this.id_catch = rNl_1.id_class(var4);
   }

   @Override
   public boolean expand(rzr_3 var1, Consumer<rWR> var2) {
      if (this.id_class(var1)) {
         var2.accept(this.id_private);
         return true;
      } else {
         return false;
      }
   }

   public static rzK_2<?> id_class(rze_3 var0) {
      return new rzD_2(var0);
   }

   protected abstract void id_class(Consumer<rdn_3> var1, rzr_3 var2);

   @Override
   public void id_class(rQs_1 var1) {
      super.id_class(var1);

      for (int var2 = 0; var2 < this.id_case.length; var2++) {
         this.id_case[var2].id_class(var1.id_break(".functions[" + var2 + "]"));
      }
   }
}
