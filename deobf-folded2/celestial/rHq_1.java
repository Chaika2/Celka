package celestial;

public class rHq_1 extends ryO_2 implements rHf_1, rHw_1 {
   public float id_class;
   public float id_break;
   public int id_byte;
   private int id_protected;

   public rHq_1() {
      super(ryW_2.id_protected);
   }

   public boolean id_class(rhd_3 var1) {
      return this.id_extends.id_class(this.id_native) != this
         ? false
         : !(var1.id_class((double)this.id_native.b_() + 0.5, (double)this.id_native.c_() + 0.5, (double)this.id_native.d_() + 0.5) > 64.0);
   }

   @Override
   public float id_class(float var1) {
      return rfU_2.id_catch(var1, this.id_break, this.id_class);
   }

   @Override
   public void id_throws() {
      if (++this.id_protected % 20 * 4 == 0) {
         this.id_extends.id_class(this.id_native, xu_3.SW, 1, this.id_byte);
      }

      this.id_break = this.id_class;
      int var1 = this.id_native.b_();
      int var2 = this.id_native.c_();
      int var3 = this.id_native.d_();
      float var4 = 0.1F;
      if (this.id_byte > 0 && this.id_class == 0.0F) {
         double var5 = (double)var1 + 0.5;
         double var7 = (double)var3 + 0.5;
         this.id_extends.id_class((rhd_3)null, var5, (double)var2 + 0.5, var7, rqn_3.Bc, rqL_2.BLOCKS, 0.5F, this.id_extends.id_int.nextFloat() * 0.1F + 0.9F);
      }

      if (this.id_byte == 0 && this.id_class > 0.0F || this.id_byte > 0 && this.id_class < 1.0F) {
         float var11 = this.id_class;
         if (this.id_byte > 0) {
            this.id_class += 0.1F;
         } else {
            this.id_class -= 0.1F;
         }

         if (this.id_class > 1.0F) {
            this.id_class = 1.0F;
         }

         float var6 = 0.5F;
         if (this.id_class < 0.5F && var11 >= 0.5F) {
            double var12 = (double)var1 + 0.5;
            double var9 = (double)var3 + 0.5;
            this.id_extends
               .id_class((rhd_3)null, var12, (double)var2 + 0.5, var9, rqn_3.BN, rqL_2.BLOCKS, 0.5F, this.id_extends.id_int.nextFloat() * 0.1F + 0.9F);
         }

         if (this.id_class < 0.0F) {
            this.id_class = 0.0F;
         }
      }
   }

   public void id_catch() {
      this.id_byte++;
      this.id_extends.id_class(this.id_native, xu_3.SW, 1, this.id_byte);
   }

   public void id_private() {
      this.id_byte--;
      this.id_extends.id_class(this.id_native, xu_3.SW, 1, this.id_byte);
   }

   @Override
   public void aa_() {
      this.id_float();
      super.aa_();
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
}
