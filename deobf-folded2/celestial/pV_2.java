package celestial;

public abstract class pV_2<T extends an_3> implements rrMa_1 {
   protected final pg_3 id_break;
   public float id_byte;
   protected float id_protected = 1.0F;
   private aI_2 id_class = null;
   private rqO_2 id_throws = null;

   @Override
   public rrWQ<aI_2, ryW_2> id_byte() {
      return this.id_class == null ? null : rrWQ.id_class(this.id_class);
   }

   protected pV_2(pg_3 var1) {
      this.id_break = var1;
   }

   public void id_class(T var1, float var2, float var3, Ml_1 var4, Hx_1 var5, int var6) {
      if (this.id_break((T)var1) && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_double().id_class(var1)) {
         this.id_class((T)var1, var1.L_(), var4, var5, var6);
      }
   }

   public abstract rqO_2 id_class(T var1);

   protected void id_class(T var1, rgP_2 var2, Ml_1 var3, Hx_1 var4, int var5) {
      double var6 = this.id_break.id_break(var1);
      boolean var8 = !(var6 > 4096.0);
      if (var8) {
         boolean var9 = !var1.Pw();
         float var10 = var1.Bm() + 0.5F;
         var3.id_class();
         var3.id_class(0.0, (double)var10, 0.0);
         var3.id_class(this.id_break.id_byte());
         var3.id_class(-0.025F, -0.025F, 0.025F);
         rjV_2 var11 = var3.id_byte().id_class();
         cm_3 var12 = this.H_();
         float var13 = (float)(-var12.id_class(var2) / 2);
         float var14 = ((Qw_1)QY.id_instanceof().id_class[20]).id_class(0.25F);
         int var15 = (int)(var14 * 255.0F) << 24;
         var12.id_class(var2, var13, 0.0F, 553648127, false, var11, var4, var9, var15, var5);
         if (var9) {
            var12.id_class(var2, var13, 0.0F, -1, false, var11, var4, false, 0, var5);
         }

         var3.id_break();
      }
   }

   @Override
   public void id_class(rqO_2 var1) {
      this.id_throws = var1;
   }

   @Override
   public void id_class(rrWQ<aI_2, ryW_2> var1) {
      this.id_class = (aI_2)var1.id_class().get();
   }

   public boolean id_class(T var1, yt_3 var2, double var3, double var5, double var7) {
      if ((Boolean)var1.id_throws[56]) {
         return true;
      } else if (!var1.id_final(var3, var5, var7)) {
         return false;
      } else {
         rfl_3 var9 = var1.PE().id_class(0.5);
         if (var9.id_throws() || var9.id_class() == 0.0) {
            var9 = new rfl_3(var1.rx() - 2.0, var1.re() - 2.0, var1.BO() - 2.0, var1.rx() + 2.0, var1.re() + 2.0, var1.BO() + 2.0);
         }

         return var2.id_class(var9);
      }
   }

   public rjU_2 id_class(T var1, float var2) {
      return rjU_2.id_class;
   }

   protected int id_class(T var1, rfH_2 var2) {
      return var1.Pz() ? 15 : ((rYB)var1.id_throws[7]).id_class(rRo_1.BLOCK, var2);
   }

   public final int id_break(T var1, float var2) {
      rfH_2 var3 = new rfH_2(var1.id_volatile(var2));
      return HQ.id_class(this.id_class((T)var1, var3), this.id_break((T)var1, var3));
   }

   protected int id_break(T var1, rfH_2 var2) {
      return ((rYB)var1.id_throws[7]).id_class(rRo_1.SKY, var2);
   }

   protected boolean id_break(T var1) {
      return var1.rJ() && var1.Bk();
   }

   public pg_3 id_break() {
      return this.id_break;
   }

   @Override
   public rqO_2 id_protected() {
      return this.id_throws;
   }

   public cm_3 H_() {
      return this.id_break.id_protected();
   }
}
