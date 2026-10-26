package celestial;

import java.util.function.Consumer;

public abstract class rzt_3 extends rzE_2 {
   protected final rzE_2[] id_protected;
   private final rWV id_throws;

   protected rzt_3(rzE_2[] var1, rQz_1[] var2) {
      super(var2);
      this.id_protected = var1;
      this.id_throws = this.id_class(var1);
   }

   @Override
   public final boolean expand(rzr_3 var1, Consumer<rWR> var2) {
      return !this.id_class(var1) ? false : this.id_throws.expand(var1, var2);
   }

   public static <T extends rzt_3> rzb_3<T> id_class(rzI_2<T> var0) {
      return new rzw_3(var0);
   }

   protected abstract rWV id_class(rWV[] var1);

   @Override
   public void id_class(rQs_1 var1) {
      super.id_class(var1);
      if (this.id_protected.length == 0) {
         var1.id_class("Empty children list");
      }

      for (int var2 = 0; var2 < this.id_protected.length; var2++) {
         this.id_protected[var2].id_class(var1.id_break(".entry[" + var2 + "]"));
      }
   }
}
