package celestial;

public class rhR_2 extends rhv_3 {
   public rhR_2(rYB var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(aI_2.l, var2, var4, var6, var8, var10, var12, var1);
   }

   public rhR_2(rYB var1, iB_2 var2, double var3, double var5, double var7) {
      super(aI_2.l, var2, var3, var5, var7, var1);
   }

   public rhR_2(aI_2<? extends rhR_2> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   protected void id_class(rjG_2 var1) {
      super.id_class(var1);
      if (!((rYB)this.id_throws[7]).id_continue) {
         this.PD();
      }
   }

   @Override
   protected void id_class(rff_3 var1) {
      super.id_class(var1);
      if (!((rYB)this.id_throws[7]).id_continue) {
         an_3 var2 = this.id_else();
         if (var2 == null || !(var2 instanceof is_3) || ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_break)) {
            rfH_2 var3 = var1.id_class().id_break(var1.id_break());
            if (((rYB)this.id_throws[7]).id_finally(var3)) {
               ((rYB)this.id_throws[7]).id_break(var3, Jj_1.id_class((rYB)this.id_throws[7], var3));
            }
         }
      }
   }

   @Override
   protected void id_class(rfo_3 var1) {
      super.id_class(var1);
      if (!((rYB)this.id_throws[7]).id_continue) {
         an_3 var2 = var1.id_class();
         if (!var2.q()) {
            an_3 var3 = this.id_else();
            int var4 = var2.ru();
            var2.id_case(5);
            boolean var5 = var2.id_break(rye_3.id_class((rhv_3)this, var3), 5.0F);
            if (!var5) {
               var2.id_protected(var4);
            } else if (var3 instanceof iB_2) {
               this.id_class((iB_2)var3, var2);
            }
         }
      }
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      return false;
   }

   @Override
   public boolean rY() {
      return false;
   }
}
