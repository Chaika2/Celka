package celestial;

import com.mojang.brigadier.context.CommandContext;

public abstract class rRC<T extends rRC<T>> {
   protected final rRn_1<T> id_class;

   public abstract int id_byte();

   public rRC(rRn_1<T> var1) {
      this.id_class = var1;
   }

   @Override
   public String toString() {
      return this.id_break();
   }

   protected abstract void id_class(CommandContext<gy_3> var1, String var2);

   public abstract void id_class(T var1, rnW_2 var2);

   protected void id_class(rnW_2 var1) {
      if (var1 != null) {
         this.id_class.id_byte.accept(var1, this.id_catch());
      }
   }

   protected abstract void id_class(String var1);

   public abstract String id_break();

   public void id_break(CommandContext<gy_3> var1, String var2) {
      this.id_class(var1, var2);
      this.id_class(((gy_3)var1.getSource()).id_super());
   }

   protected abstract T id_catch();

   protected abstract T id_case();
}
