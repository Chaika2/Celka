package celestial;

public class rHu_1 extends rHK implements rHf_1, rHw_1 {
   private rqs_3<rdn_3> id_case = rqs_3.id_class(27, rdn_3.id_break);
   protected float id_class;
   protected float id_break;
   protected int id_byte;
   private int id_catch;

   protected rHu_1(ryW_2<?> var1) {
      super(var1);
   }

   public rHu_1() {
      this(ryW_2.id_break);
   }

   private void id_class(rqA_2 var1) {
      rCt_1 var2 = this.id_abstract().id_byte(xt_3.id_package);
      if (var2 != rCt_1.LEFT) {
         double var3 = (double)this.id_native.b_() + 0.5;
         double var5 = (double)this.id_native.c_() + 0.5;
         double var7 = (double)this.id_native.d_() + 0.5;
         if (var2 == rCt_1.RIGHT) {
            rpr_3 var9 = xt_3.id_implements(this.id_abstract());
            var3 += (double)var9.id_implements() * 0.5;
            var7 += (double)var9.id_extends() * 0.5;
         }

         this.id_extends.id_class((rhd_3)null, var3, var5, var7, var1, rqL_2.BLOCKS, 0.5F, this.id_extends.id_int.nextFloat() * 0.1F + 0.9F);
      }
   }

   public static void id_class(rHu_1 var0, rHu_1 var1) {
      rqs_3 var2 = var0.ad_();
      var0.id_class(var1.ad_());
      var1.id_class(var2);
   }

   public static int id_class(rYB var0, rHD var1, int var2, int var3, int var4) {
      int var5 = 0;
      float var6 = 5.0F;

      for (rhd_3 var8 : var0.id_class(
         rhd_3.class,
         new rfl_3(
            (double)((float)var2 - 5.0F),
            (double)((float)var3 - 5.0F),
            (double)((float)var4 - 5.0F),
            (double)((float)(var2 + 1) + 5.0F),
            (double)((float)(var3 + 1) + 5.0F),
            (double)((float)(var4 + 1) + 5.0F)
         )
      )) {
         if ((rJr_1)var8.id_implements[4] instanceof rXe_1) {
            rXu_1 var9 = ((rXe_1)((rJr_1)var8.id_implements[4])).id_class();
            if (var9 == var1 || var9 instanceof rXW && ((rXW)var9).id_class(var1)) {
               var5++;
            }
         }
      }

      return var5;
   }

   public static int id_class(rRq_1 var0, rfH_2 var1) {
      xc_3 var2 = var0.id_byte(var1);
      if (var2.id_break().id_protected()) {
         ryO_2 var3 = var0.id_class(var1);
         if (var3 instanceof rHu_1) {
            return ((rHu_1)var3).id_byte;
         }
      }

      return 0;
   }

   @Override
   public float id_class(float var1) {
      return rfU_2.id_catch(var1, this.id_break, this.id_class);
   }

   @Override
   protected void id_class(rqs_3<rdn_3> var1) {
      this.id_case = var1;
   }

   @Override
   public void id_class(xc_3 var1, rcd_3 var2) {
      super.id_class(var1, var2);
      this.id_case = rqs_3.id_class(this.id_else(), rdn_3.id_break);
      if (!this.id_break(var2)) {
         rXC.id_break(var2, this.id_case);
      }
   }

   @Override
   public rcd_3 id_class(rcd_3 var1) {
      super.id_class(var1);
      if (!this.id_byte(var1)) {
         rXC.id_class(var1, this.id_case);
      }

      return var1;
   }

   @Override
   protected rJr_1 id_class(int var1, rhz_3 var2) {
      return rXe_1.id_class(var1, var2, this);
   }

   public static int id_class(rYB var0, rHD var1, int var2, int var3, int var4, int var5, int var6) {
      if (!var0.id_continue && var6 != 0 && (var2 + var3 + var4 + var5) % 200 == 0) {
         var6 = id_class(var0, var1, var3, var4, var5);
      }

      return var6;
   }

   @Override
   public void id_break(rhd_3 var1) {
      if (!var1.id_native()) {
         this.id_byte--;
         this.id_catch();
      }
   }

   @Override
   public void id_throws() {
      int var1 = this.id_native.b_();
      int var2 = this.id_native.c_();
      int var3 = this.id_native.d_();
      this.id_catch++;
      this.id_byte = id_class(this.id_extends, this, this.id_catch, var1, var2, var3, this.id_byte);
      this.id_break = this.id_class;
      float var4 = 0.1F;
      if (this.id_byte > 0 && this.id_class == 0.0F) {
         this.id_class(rqn_3.rI);
      }

      if (this.id_byte == 0 && this.id_class > 0.0F || this.id_byte > 0 && this.id_class < 1.0F) {
         float var5 = this.id_class;
         if (this.id_byte > 0) {
            this.id_class += 0.1F;
         } else {
            this.id_class -= 0.1F;
         }

         if (this.id_class > 1.0F) {
            this.id_class = 1.0F;
         }

         float var6 = 0.5F;
         if (this.id_class < 0.5F && var5 >= 0.5F) {
            this.id_class(rqn_3.rt);
         }

         if (this.id_class < 0.0F) {
            this.id_class = 0.0F;
         }
      }
   }

   protected void id_catch() {
      xd_3 var1 = this.id_abstract().id_break();
      if (var1 instanceof xt_3) {
         this.id_extends.id_class(this.id_native, var1, 1, this.id_byte);
         this.id_extends.id_break(this.id_native, var1);
      }
   }

   @Override
   public int id_else() {
      return 27;
   }

   public int id_private() {
      return this.id_byte;
   }

   @Override
   public boolean a_(int var1, int var2) {
      if (var1 == 1) {
         this.id_byte = var2;
         return true;
      } else {
         return super.a_(var1, var2);
      }
   }

   @Override
   protected rqs_3<rdn_3> ad_() {
      return this.id_case;
   }

   @Override
   public void b_(rhd_3 var1) {
      if (!var1.id_native()) {
         if (this.id_byte < 0) {
            this.id_byte = 0;
         }

         this.id_byte++;
         this.id_catch();
      }
   }

   @Override
   protected rgP_2 X_() {
      return new rgn_3("container.chest");
   }
}
