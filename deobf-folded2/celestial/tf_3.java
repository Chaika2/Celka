package celestial;

import com.google.common.collect.ImmutableList;

public class tf_3 extends wN_2<rEI> {
   private static final float[] id_class = new float[]{1.75F, 0.25F, 0.0F, 0.0F, 0.5F, 0.5F, 0.5F, 0.5F, 1.25F, 0.75F, 0.0F, 0.0F};
   private static final float[] id_break = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 1.75F, 1.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F};
   private static final float[] id_byte = new float[]{0.0F, 0.0F, 0.25F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 1.25F};
   private static final float[] id_protected = new float[]{0.0F, 0.0F, 8.0F, -8.0F, -8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 8.0F, -8.0F};
   private static final float[] id_throws = new float[]{-8.0F, -8.0F, -8.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 8.0F, 8.0F, 8.0F};
   private static final float[] id_case = new float[]{8.0F, -8.0F, 0.0F, 0.0F, -8.0F, -8.0F, 8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F};
   private final Iq_1 id_catch;
   private final Iq_1 id_private;
   private final Iq_1[] id_implements;
   private final Iq_1[] id_finally;

   public tf_3() {
      this.id_return = 64;
      this.id_public = 64;
      this.id_implements = new Iq_1[12];
      this.id_catch = new Iq_1(this);
      this.id_catch.id_class(0, 0).id_class(-6.0F, 10.0F, -8.0F, 12.0F, 12.0F, 16.0F);
      this.id_catch.id_class(0, 28).id_class(-8.0F, 10.0F, -6.0F, 2.0F, 12.0F, 12.0F);
      this.id_catch.id_class(0, 28).id_class(6.0F, 10.0F, -6.0F, 2.0F, 12.0F, 12.0F, true);
      this.id_catch.id_class(16, 40).id_class(-6.0F, 8.0F, -6.0F, 12.0F, 2.0F, 12.0F);
      this.id_catch.id_class(16, 40).id_class(-6.0F, 22.0F, -6.0F, 12.0F, 2.0F, 12.0F);

      for (int var1 = 0; var1 < this.id_implements.length; var1++) {
         this.id_implements[var1] = new Iq_1(this, 0, 0);
         this.id_implements[var1].id_class(-1.0F, -4.5F, -1.0F, 2.0F, 9.0F, 2.0F);
         this.id_catch.id_break(this.id_implements[var1]);
      }

      this.id_private = new Iq_1(this, 8, 0);
      this.id_private.id_class(-1.0F, 15.0F, 0.0F, 2.0F, 2.0F, 1.0F);
      this.id_catch.id_break(this.id_private);
      this.id_finally = new Iq_1[3];
      this.id_finally[0] = new Iq_1(this, 40, 0);
      this.id_finally[0].id_class(-2.0F, 14.0F, 7.0F, 4.0F, 4.0F, 8.0F);
      this.id_finally[1] = new Iq_1(this, 0, 54);
      this.id_finally[1].id_class(0.0F, 14.0F, 0.0F, 3.0F, 3.0F, 7.0F);
      this.id_finally[2] = new Iq_1(this);
      this.id_finally[2].id_class(41, 32).id_class(0.0F, 14.0F, 0.0F, 2.0F, 2.0F, 6.0F);
      this.id_finally[2].id_class(25, 19).id_class(1.0F, 10.5F, 3.0F, 1.0F, 9.0F, 9.0F);
      this.id_catch.id_break(this.id_finally[0]);
      this.id_finally[0].id_break(this.id_finally[1]);
      this.id_finally[1].id_break(this.id_finally[2]);
      this.id_class(0.0F, 0.0F);
   }

   private void id_class(float var1, float var2) {
      for (int var3 = 0; var3 < 12; var3++) {
         this.id_implements[var3].id_case = (float) Math.PI * id_class[var3];
         this.id_implements[var3].id_catch = (float) Math.PI * id_break[var3];
         this.id_implements[var3].id_private = (float) Math.PI * id_byte[var3];
         this.id_implements[var3].id_byte = id_protected[var3] * (1.0F + rfU_2.id_break(var1 * 1.5F + (float)var3) * 0.01F - var2);
         this.id_implements[var3].id_protected = 16.0F + id_throws[var3] * (1.0F + rfU_2.id_break(var1 * 1.5F + (float)var3) * 0.01F - var2);
         this.id_implements[var3].id_throws = id_case[var3] * (1.0F + rfU_2.id_break(var1 * 1.5F + (float)var3) * 0.01F - var2);
      }
   }

   @Override
   public Iterable<Iq_1> id_class() {
      return ImmutableList.of(this.id_catch);
   }

   public void id_class(rEI var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = var4 - (float)((Integer)var1.id_throws[41]).intValue();
      this.id_catch.id_catch = var5 * (float) (Math.PI / 180.0);
      this.id_catch.id_case = var6 * (float) (Math.PI / 180.0);
      float var8 = (1.0F - var1.id_interface(var7)) * 0.55F;
      this.id_class(var4, var8);
      this.id_private.id_throws = -8.25F;
      Object var9 = QY.id_instanceof().id_catch();
      if (var1.sk()) {
         var9 = var1.sW();
      }

      if (var9 != null) {
         rjU_2 var10 = ((an_3)var9).id_new(0.0F);
         rjU_2 var11 = var1.id_new(0.0F);
         double var12 = var10.id_byte - var11.id_byte;
         if (var12 > 0.0) {
            this.id_private.id_protected = 0.0F;
         } else {
            this.id_private.id_protected = 1.0F;
         }

         rjU_2 var14 = var1.id_break(0.0F);
         var14 = new rjU_2(var14.id_break, 0.0, var14.id_protected);
         rjU_2 var15 = new rjU_2(var11.id_break - var10.id_break, 0.0, var11.id_protected - var10.id_protected).id_protected().id_break((float) (Math.PI / 2));
         double var16 = var14.id_break(var15);
         this.id_private.id_byte = rfU_2.id_byte((float)Math.abs(var16)) * 2.0F * (float)Math.signum(var16);
      }

      this.id_private.id_finally = true;
      float var18 = var1.id_throw(var7);
      this.id_finally[0].id_catch = rfU_2.id_class(var18) * (float) Math.PI * 0.05F;
      this.id_finally[1].id_catch = rfU_2.id_class(var18) * (float) Math.PI * 0.1F;
      this.id_finally[1].id_byte = -1.5F;
      this.id_finally[1].id_protected = 0.5F;
      this.id_finally[1].id_throws = 14.0F;
      this.id_finally[2].id_catch = rfU_2.id_class(var18) * (float) Math.PI * 0.15F;
      this.id_finally[2].id_byte = 0.5F;
      this.id_finally[2].id_protected = 0.5F;
      this.id_finally[2].id_throws = 6.0F;
   }
}
