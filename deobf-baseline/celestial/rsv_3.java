package celestial;

import java.util.Random;

public class rsv_3 extends rsJ_2 {
   private int id_class = -1;

   @Override
   public xc_3 id_int() {
      return xu_3.rf.id_continue();
   }

   public rsv_3(aI_2<? extends rsv_3> var1, rYB var2) {
      super(var1, var2);
   }

   public rsv_3(rYB var1, double var2, double var4, double var6) {
      super(aI_2.E, var1, var2, var4, var6);
   }

   @Override
   public void id_this() {
      super.id_this();
      if (this.id_class > 0) {
         this.id_class--;
         ((rYB)this.id_throws[7]).id_class(rLQ.id_double, this.rx(), this.re() + 0.5, this.BO(), 0.0, 0.0, 0.0);
      } else if (this.id_class == 0) {
         this.id_private(id_case(this.rv()));
      }

      if ((Boolean)this.id_throws[23]) {
         double var1 = id_case(this.rv());
         if (var1 >= 0.01F) {
            this.id_private(var1);
         }
      }
   }

   @Override
   public void id_class(int var1, int var2, int var3, boolean var4) {
      if (var4 && this.id_class < 0) {
         this.id_else();
      }
   }

   @Override
   public void id_class(byte var1) {
      if (var1 == 10) {
         this.id_else();
      } else {
         super.id_class(var1);
      }
   }

   @Override
   public float id_class(rRW var1, rRq_1 var2, rfH_2 var3, xc_3 var4, rXE var5, float var6) {
      return this.id_public() && (var4.id_class(rls_3.id_float) || var2.id_byte(var3.id_final()).id_class(rls_3.id_float))
         ? 0.0F
         : super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean id_class(rRW var1, rRq_1 var2, rfH_2 var3, xc_3 var4, float var5) {
      return this.id_public() && (var4.id_class(rls_3.id_float) || var2.id_byte(var3.id_final()).id_class(rls_3.id_float))
         ? false
         : super.id_class(var1, var2, var3, var4, var5);
   }

   @Override
   protected void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("TNTFuse", this.id_class);
   }

   @Override
   public boolean id_class(float var1, float var2) {
      if (var1 >= 3.0F) {
         float var3 = var1 / 10.0F;
         this.id_private((double)(var3 * var3));
      }

      return super.id_class(var1, var2);
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      if (var1.id_finally() instanceof rhm_3 var4 && var4.Pz()) {
         this.id_private(var4.rv().id_catch());
      }

      return super.id_break(var1, var2);
   }

   @Override
   public void id_break(rye_3 var1) {
      double var2 = id_case(this.rv());
      if (!var1.id_int() && !var1.id_protected() && !(var2 >= 0.01F)) {
         super.id_break(var1);
         if (!var1.id_protected() && ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_catch)) {
            this.id_class(xu_3.rf);
         }
      } else if (this.id_class < 0) {
         this.id_else();
         this.id_class = ((Random)this.id_throws[40]).nextInt(20) + ((Random)this.id_throws[40]).nextInt(20);
      }
   }

   @Override
   protected void id_break(rcd_3 var1) {
      super.id_break(var1);
      if (var1.id_byte("TNTFuse", 99)) {
         this.id_class = var1.id_private("TNTFuse");
      }
   }

   public void id_else() {
      this.id_class = 80;
      if (!((rYB)this.id_throws[7]).id_continue) {
         ((rYB)this.id_throws[7]).id_class(this, (byte)10);
         if (!this.BF()) {
            ((rYB)this.id_throws[7]).id_class((rhd_3)null, this.rx(), this.re(), this.BO(), rqn_3.db, rqL_2.BLOCKS, 1.0F, 1.0F);
         }
      }
   }

   public int id_return() {
      return this.id_class;
   }

   public boolean id_public() {
      return this.id_class > -1;
   }

   protected void id_private(double var1) {
      if (!((rYB)this.id_throws[7]).id_continue) {
         double var3 = Math.sqrt(var1);
         if (var3 > 5.0) {
            var3 = 5.0;
         }

         ((rYB)this.id_throws[7])
            .id_class(this, this.rx(), this.re(), this.BO(), (float)(4.0 + ((Random)this.id_throws[40]).nextDouble() * 1.5 * var3), rRz_1.BREAK);
         this.PD();
      }
   }

   @Override
   public rsd_3 id_final() {
      return rsd_3.TNT;
   }
}
