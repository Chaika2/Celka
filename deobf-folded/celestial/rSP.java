package celestial;

import java.util.List;

public class rSP<T extends is_3 & ag_3> extends rBk_1 {
   private final T id_class;
   private final boolean id_break;
   private int id_byte;

   @Override
   public void id_byte() {
      this.id_byte = this.id_class.Sb();
      this.id_class.id_case();
      if (this.id_break) {
         this.id_private().stream().filter(var1 -> var1 != this.id_class).map(var0 -> (ag_3)var0).forEach(ag_3::id_case);
      }

      super.id_byte();
   }

   public rSP(T var1, boolean var2) {
      this.id_class = (T)var1;
      this.id_break = var2;
   }

   @Override
   public boolean id_class() {
      return ((rYB)this.id_class.id_throws[7]).B().id_break(rRu_1.id_long) && this.id_catch();
   }

   private boolean id_catch() {
      return this.id_class.Sr() != null && this.id_class.Sr().BC() == aI_2.rM && this.id_class.Sb() > this.id_byte;
   }

   private List<is_3> id_private() {
      double var1 = this.id_class.id_class(iQ_2.id_break);
      rfl_3 var3 = rfl_3.id_class(this.id_class.Ps()).id_byte(var1, 10.0, var1);
      return ((rYB)this.id_class.id_throws[7]).id_break((Class<? extends is_3>)this.id_class.getClass(), var3);
   }
}
