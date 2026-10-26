package celestial;

import com.mojang.brigadier.context.CommandContext;

public abstract class rRC<T extends rRC<T>> {
   protected final rRn_1<T> class_;

   public abstract int byte_();

   public rRC(rRn_1<T> var1) {
      this.class_ = var1;
   }

   @Override
   public String toString() {
      return this.break_();
   }

   protected abstract void class_(CommandContext<gy_3> var1, String var2);

   public abstract void class_(T var1, rnW_2 var2);

   protected void class_(rnW_2 var1) {
      if (var1 != null) {
         this.class_.byte_.accept(var1, this.catch_());
      }
   }

   protected abstract void class_(String var1);

   public abstract String break_();

   public void break_(CommandContext<gy_3> var1, String var2) {
      this.class_(var1, var2);
      this.class_(((gy_3)var1.getSource()).super_());
   }

   protected abstract T catch_();

   protected abstract T case_();
}
