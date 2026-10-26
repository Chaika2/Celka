package celestial;

import java.util.function.Consumer;

public abstract class rzt_3 extends rzE_2 {
   protected final rzE_2[] protected_;
   private final rWV throws_;

   protected rzt_3(rzE_2[] var1, rQz_1[] var2) {
      super(var2);
      this.protected_ = var1;
      this.throws_ = this.class_(var1);
   }

   @Override
   public final boolean expand(rzr_3 var1, Consumer<rWR> var2) {
      return !this.class_(var1) ? false : this.throws_.expand(var1, var2);
   }

   public static <T extends rzt_3> rzb_3<T> class_(rzI_2<T> var0) {
      return new rzw_3(var0);
   }

   protected abstract rWV class_(rWV[] var1);

   @Override
   public void class_(rQs_1 var1) {
      super.class_(var1);
      if (this.protected_.length == 0) {
         var1.class_("Empty children list");
      }

      for (int var2 = 0; var2 < this.protected_.length; var2++) {
         this.protected_[var2].class_(var1.break_(".entry[" + var2 + "]"));
      }
   }
}
