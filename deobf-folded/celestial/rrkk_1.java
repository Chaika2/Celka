package celestial;

public class rrkk_1 extends rrkX {
   private float id_case;
   public boolean id_throws;
   private rrdD id_catch = null;

   public rrkk_1(int var1, int var2, int var3, int var4, int var5, rrdD var6, String var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
      this.id_case = 1.0F;
      this.id_catch = var6;
      this.id_case = var6.id_new();
      this.id_class(rrkJ.id_class(var6, this.id_extends));
   }

   @Override
   protected void id_class(Ml_1 var1, QY var2, int var3, int var4) {
      if (this.id_new) {
         if (this.id_throws && !vm_3.id_synchronized()) {
            this.id_case = (float)(var3 - (this.id_volatile + 4)) / (float)(this.id_extends - 8);
            this.id_case = rfU_2.id_class(this.id_case, 0.0F, 1.0F);
            this.id_catch.id_class(this.id_case);
            this.id_case = this.id_catch.id_new();
            this.id_class(rrkJ.id_class(this.id_catch, this.id_extends));
         }

         var2.A().id_class(id_finally);
         MT.id_protected(1.0F, 1.0F, 1.0F, 1.0F);
         int var5 = (this.B_() ? 2 : 1) * 20;
         this.id_break(var1, this.id_volatile + (int)(this.id_case * (float)(this.id_extends - 8)), this.id_final, 0, 46 + var5, 4, 20);
         this.id_break(var1, this.id_volatile + (int)(this.id_case * (float)(this.id_extends - 8)) + 4, this.id_final, 196, 46 + var5, 4, 20);
      }
   }

   @Override
   public boolean id_class(double var1, double var3, int var5) {
      this.id_throws = false;
      return true;
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      if (super.id_break(var1, var3, var5)) {
         this.id_case = (float)(var1 - (double)(this.id_volatile + 4)) / (float)(this.id_extends - 8);
         this.id_case = rfU_2.id_class(this.id_case, 0.0F, 1.0F);
         this.id_catch.id_class(this.id_case);
         this.id_class(rrkJ.id_class(this.id_catch, this.id_extends));
         this.id_throws = true;
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean id_extends() {
      return false;
   }

   @Override
   public void id_implements() {
      this.id_case = this.id_catch.id_new();
   }

   @Override
   protected int a_(boolean var1) {
      return 0;
   }
}
