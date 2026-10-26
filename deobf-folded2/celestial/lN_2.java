package celestial;

public abstract class lN_2 extends CH {
   protected float id_throw = 0.1F * (this.id_continue.nextFloat() * 0.5F + 0.5F) * 2.0F;

   protected abstract float id_byte();

   protected lN_2(gm_3 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   protected lN_2(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
   }

   public float id_class(float var1) {
      return this.id_throw;
   }

   @Override
   public void id_class(Ok_1 var1, ly_3 var2, float var3) {
      rjU_2 var4 = var2.id_break();
      float var5 = (float)(rfU_2.id_protected((double)var3, this.id_protected, this.id_catch) - var4.id_class());
      float var6 = (float)(rfU_2.id_protected((double)var3, this.id_throws, this.id_private) - var4.id_break());
      float var7 = (float)(rfU_2.id_protected((double)var3, this.id_case, this.id_implements) - var4.id_byte());
      rjY_2 var8;
      if (this.id_while == 0.0F) {
         var8 = var2.id_case();
      } else {
         var8 = new rjY_2(var2.id_case());
         float var9 = rfU_2.id_catch(var3, this.id_try, this.id_while);
         var8.id_class(rje_3.id_case.id_break(var9));
      }

      rje_3 var17 = new rje_3(-1.0F, -1.0F, 0.0F);
      var17.id_class(var8);
      rje_3[] var10 = new rje_3[]{new rje_3(-1.0F, -1.0F, 0.0F), new rje_3(-1.0F, 1.0F, 0.0F), new rje_3(1.0F, 1.0F, 0.0F), new rje_3(1.0F, -1.0F, 0.0F)};
      float var11 = this.id_class(var3);

      for (int var12 = 0; var12 < 4; var12++) {
         rje_3 var13 = var10[var12];
         var13.id_class(var8);
         var13.id_class(var11);
         var13.id_byte(var5, var6, var7);
      }

      float var18 = this.id_break();
      float var19 = this.id_byte();
      float var14 = this.id_protected();
      float var15 = this.id_throws();
      int var16 = this.id_break(var3);
      var1.id_class((double)var10[0].id_class(), (double)var10[0].id_break(), (double)var10[0].id_byte())
         .id_class(var19, var15)
         .id_class(this.id_synchronized, this.id_return, this.id_public, this.id_goto)
         .id_break(var16)
         .id_class();
      var1.id_class((double)var10[1].id_class(), (double)var10[1].id_break(), (double)var10[1].id_byte())
         .id_class(var19, var14)
         .id_class(this.id_synchronized, this.id_return, this.id_public, this.id_goto)
         .id_break(var16)
         .id_class();
      var1.id_class((double)var10[2].id_class(), (double)var10[2].id_break(), (double)var10[2].id_byte())
         .id_class(var18, var14)
         .id_class(this.id_synchronized, this.id_return, this.id_public, this.id_goto)
         .id_break(var16)
         .id_class();
      var1.id_class((double)var10[3].id_class(), (double)var10[3].id_break(), (double)var10[3].id_byte())
         .id_class(var18, var15)
         .id_class(this.id_synchronized, this.id_return, this.id_public, this.id_goto)
         .id_break(var16)
         .id_class();
   }

   protected abstract float id_break();

   protected abstract float id_throws();

   protected abstract float id_protected();

   @Override
   public CH id_protected(float var1) {
      this.id_throw *= var1;
      return super.id_protected(var1);
   }
}
