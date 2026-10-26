package celestial;

import com.google.common.collect.ImmutableList;

public class wz_3 extends wN_2<rGx_1> {
   private final Iq_1 id_class;
   private final Iq_1 id_break;
   private final Iq_1 id_byte;
   private final Iq_1 id_protected;
   private final Iq_1 id_throws;
   private final Iq_1 id_case;
   private final Iq_1 id_catch;
   private final Iq_1 id_private;

   public wz_3() {
      this.id_return = 128;
      this.id_public = 128;
      byte var1 = 16;
      float var2 = 0.0F;
      this.id_private = new Iq_1(this);
      this.id_private.id_class(0.0F, -7.0F, -1.5F);
      this.id_private.id_class(68, 73).id_class(-5.0F, -1.0F, -18.0F, 10.0F, 10.0F, 18.0F, 0.0F);
      this.id_class = new Iq_1(this);
      this.id_class.id_class(0.0F, 16.0F, -17.0F);
      this.id_class.id_class(0, 0).id_class(-8.0F, -20.0F, -14.0F, 16.0F, 20.0F, 16.0F, 0.0F);
      this.id_class.id_class(0, 0).id_class(-2.0F, -6.0F, -18.0F, 4.0F, 8.0F, 4.0F, 0.0F);
      Iq_1 var3 = new Iq_1(this);
      var3.id_class(-10.0F, -14.0F, -8.0F);
      var3.id_class(74, 55).id_class(0.0F, -14.0F, -2.0F, 2.0F, 14.0F, 4.0F, 0.0F);
      var3.id_case = 1.0995574F;
      this.id_class.id_break(var3);
      Iq_1 var4 = new Iq_1(this);
      var4.id_implements = true;
      var4.id_class(8.0F, -14.0F, -8.0F);
      var4.id_class(74, 55).id_class(0.0F, -14.0F, -2.0F, 2.0F, 14.0F, 4.0F, 0.0F);
      var4.id_case = 1.0995574F;
      this.id_class.id_break(var4);
      this.id_break = new Iq_1(this);
      this.id_break.id_class(0.0F, -2.0F, 2.0F);
      this.id_break.id_class(0, 36).id_class(-8.0F, 0.0F, -16.0F, 16.0F, 3.0F, 16.0F, 0.0F);
      this.id_class.id_break(this.id_break);
      this.id_private.id_break(this.id_class);
      this.id_byte = new Iq_1(this);
      this.id_byte.id_class(0, 55).id_class(-7.0F, -10.0F, -7.0F, 14.0F, 16.0F, 20.0F, 0.0F);
      this.id_byte.id_class(0, 91).id_class(-6.0F, 6.0F, -7.0F, 12.0F, 13.0F, 18.0F, 0.0F);
      this.id_byte.id_class(0.0F, 1.0F, 2.0F);
      this.id_protected = new Iq_1(this, 96, 0);
      this.id_protected.id_class(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, 0.0F);
      this.id_protected.id_class(-8.0F, -13.0F, 18.0F);
      this.id_throws = new Iq_1(this, 96, 0);
      this.id_throws.id_implements = true;
      this.id_throws.id_class(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, 0.0F);
      this.id_throws.id_class(8.0F, -13.0F, 18.0F);
      this.id_case = new Iq_1(this, 64, 0);
      this.id_case.id_class(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, 0.0F);
      this.id_case.id_class(-8.0F, -13.0F, -5.0F);
      this.id_catch = new Iq_1(this, 64, 0);
      this.id_catch.id_implements = true;
      this.id_catch.id_class(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F, 0.0F);
      this.id_catch.id_class(8.0F, -13.0F, -5.0F);
   }

   public void id_class(rGx_1 var1, float var2, float var3, float var4) {
      super.id_class(var1, var2, var3, var4);
      int var5 = var1.sc();
      int var6 = var1.sn();
      byte var7 = 20;
      int var8 = var1.sN();
      byte var9 = 10;
      if (var8 > 0) {
         float var10 = rfU_2.id_throws((float)var8 - var4, 10.0F);
         float var11 = (1.0F + var10) * 0.5F;
         float var12 = var11 * var11 * var11 * 12.0F;
         float var13 = var12 * rfU_2.id_class(this.id_private.id_case);
         this.id_private.id_throws = -6.5F + var12;
         this.id_private.id_protected = -7.0F - var13;
         float var14 = rfU_2.id_class(((float)var8 - var4) / 10.0F * (float) Math.PI * 0.25F);
         this.id_break.id_case = (float) (Math.PI / 2) * var14;
         if (var8 > 5) {
            this.id_break.id_case = rfU_2.id_class(((float)(-4 + var8) - var4) / 4.0F) * (float) Math.PI * 0.4F;
         } else {
            this.id_break.id_case = (float) (Math.PI / 20) * rfU_2.id_class((float) Math.PI * ((float)var8 - var4) / 10.0F);
         }
      } else {
         float var15 = -1.0F;
         float var16 = -1.0F * rfU_2.id_class(this.id_private.id_case);
         this.id_private.id_byte = 0.0F;
         this.id_private.id_protected = -7.0F - var16;
         this.id_private.id_throws = 5.5F;
         boolean var17 = var5 > 0;
         this.id_private.id_case = var17 ? 0.2199115F : 0.0F;
         this.id_break.id_case = (float) Math.PI * (var17 ? 0.05F : 0.01F);
         if (var17) {
            double var18 = (double)var5 / 40.0;
            this.id_private.id_byte = (float)Math.sin(var18 * 10.0) * 3.0F;
         } else if (var6 > 0) {
            float var19 = rfU_2.id_class(((float)(20 - var6) - var4) / 20.0F * (float) Math.PI * 0.25F);
            this.id_break.id_case = (float) (Math.PI / 2) * var19;
         }
      }
   }

   public void id_class(rGx_1 var1, float var2, float var3, float var4, float var5, float var6) {
      this.id_class.id_case = var6 * (float) (Math.PI / 180.0);
      this.id_class.id_catch = var5 * (float) (Math.PI / 180.0);
      this.id_byte.id_case = (float) (Math.PI / 2);
      float var7 = 0.4F * var3;
      this.id_protected.id_case = rfU_2.id_break(var2 * 0.6662F) * var7;
      this.id_throws.id_case = rfU_2.id_break(var2 * 0.6662F + (float) Math.PI) * var7;
      this.id_case.id_case = rfU_2.id_break(var2 * 0.6662F + (float) Math.PI) * var7;
      this.id_catch.id_case = rfU_2.id_break(var2 * 0.6662F) * var7;
   }

   @Override
   public Iterable<Iq_1> id_class() {
      return ImmutableList.of(this.id_private, this.id_byte, this.id_protected, this.id_throws, this.id_case, this.id_catch);
   }
}
