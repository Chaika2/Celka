package celestial;

import java.util.EnumSet;

public class rBB extends rBp_1 {
   private final rbf_3 id_catch;

   @Override
   public void id_byte() {
      super.id_byte();
      this.id_catch.id_public(false);
   }

   public rBB(rbf_3 var1, double var2, int var4) {
      super(var1, var2, var4, 6);
      this.id_catch = var1;
      this.id_case = -2;
      this.id_class(EnumSet.of(rBW.JUMP, rBW.MOVE));
   }

   @Override
   protected boolean id_class(rRR var1, rfH_2 var2) {
      return var1.id_finally(var2.id_final()) && var1.id_byte(var2).id_break().id_class(rls_3.id_short);
   }

   @Override
   protected int id_class(aA_2 var1) {
      return 40;
   }

   @Override
   public boolean id_class() {
      return this.id_catch.sZ() && !this.id_catch.sL() && !this.id_catch.sJ() && super.id_class();
   }

   @Override
   public void id_throws() {
      super.id_throws();
      this.id_catch.id_public(false);
      if (!this.id_native()) {
         this.id_catch.id_this(false);
      } else if (!this.id_catch.sJ()) {
         this.id_catch.id_this(true);
      }
   }

   @Override
   public void id_protected() {
      super.id_protected();
      this.id_catch.id_this(false);
   }
}
