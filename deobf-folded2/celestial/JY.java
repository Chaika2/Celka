package celestial;

import java.util.Random;

public abstract class JY extends xd_3 {
   protected static final rjC_2 id_volatile = xd_3.id_class(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   protected static final rjC_2 id_final = xd_3.id_class(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   protected static final rfl_3 id_package = new rfl_3(0.125, 0.0, 0.125, 0.875, 0.25, 0.875);

   @Override
   public boolean id_byte(xc_3 var1) {
      return true;
   }

   protected JY(Jq_1 var1) {
      super(var1);
   }

   protected void id_class(rYB var1, rfH_2 var2, xc_3 var3, int var4) {
      int var5 = this.id_break(var1, var2);
      boolean var6 = var4 > 0;
      boolean var7 = var5 > 0;
      if (var4 != var5) {
         xc_3 var8 = this.id_class(var3, var5);
         var1.id_class(var2, var8, 2);
         this.id_class(var1, var2);
         var1.id_class(var2, var3, var8);
      }

      if (!var7 && var6) {
         this.id_break((rRg_1)var1, var2);
      } else if (var7 && !var6) {
         this.id_class((rRg_1)var1, var2);
      }

      if (var7) {
         var1.id_finally().id_class(new rfH_2(var2), this, this.id_break());
      }
   }

   protected abstract void id_class(rRg_1 var1, rfH_2 var2);

   protected void id_class(rYB var1, rfH_2 var2) {
      var1.id_break(var2, this);
      var1.id_break(var2.id_break(), this);
   }

   @Override
   public int id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return this.id_catch(var1);
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return this.id_catch(var1) > 0 ? id_volatile : id_final;
   }

   protected abstract xc_3 id_class(xc_3 var1, int var2);

   @Override
   public boolean id_class() {
      return true;
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return var2 == rpr_3.DOWN && !var1.id_class(var4, var5) ? xu_3.id_class.id_continue() : super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      rfH_2 var4 = var3.id_break();
      return id_byte(var2, var4) || id_class(var2, var4, rpr_3.UP);
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      if (!var2.id_continue) {
         int var5 = this.id_catch(var1);
         if (var5 == 0) {
            this.id_class(var2, var3, var1, var5);
         }
      }
   }

   protected int id_break() {
      return 20;
   }

   protected abstract void id_break(rRg_1 var1, rfH_2 var2);

   protected abstract int id_break(rYB var1, rfH_2 var2);

   @Override
   public int id_break(xc_3 var1, rRq_1 var2, rfH_2 var3, rpr_3 var4) {
      return var4 == rpr_3.UP ? this.id_catch(var1) : 0;
   }

   @Override
   public void id_break(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      if (!var5 && !var1.id_class(var4.id_break())) {
         if (this.id_catch(var1) > 0) {
            this.id_class(var2, var3);
         }

         super.id_break(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public void id_break(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      int var5 = this.id_catch(var1);
      if (var5 > 0) {
         this.id_class(var2, var3, var1, var5);
      }
   }

   protected abstract int id_catch(xc_3 var1);

   @Override
   public Qs_1 id_protected(xc_3 var1) {
      return Qs_1.DESTROY;
   }
}
