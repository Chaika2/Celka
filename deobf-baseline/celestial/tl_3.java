package celestial;

import com.google.common.collect.ImmutableList;

public class tl_3<T extends iB_2> extends tX_2<T> {
   private final Iq_1 id_class;
   private final Iq_1 id_break = new Iq_1(this, 22, 0);

   public tl_3() {
      this.id_break.id_class(-10.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, 1.0F);
      this.id_class = new Iq_1(this, 22, 0);
      this.id_class.id_implements = true;
      this.id_class.id_class(0.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, 1.0F);
   }

   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = (float) (Math.PI / 12);
      float var8 = (float) (-Math.PI / 12);
      float var9 = 0.0F;
      float var10 = 0.0F;
      if (var1.Sy()) {
         float var11 = 1.0F;
         rjU_2 var12 = var1.rv();
         if (var12.id_byte < 0.0) {
            rjU_2 var13 = var12.id_protected();
            var11 = 1.0F - (float)Math.pow(-var13.id_byte, 1.5);
         }

         var7 = var11 * (float) (Math.PI / 9) + (1.0F - var11) * var7;
         var8 = var11 * (float) (-Math.PI / 2) + (1.0F - var11) * var8;
      } else if (var1.x()) {
         var7 = (float) Math.PI * 2.0F / 9.0F;
         var8 = (float) (-Math.PI / 4);
         var9 = 3.0F;
         var10 = 0.08726646F;
      }

      this.id_break.id_byte = 5.0F;
      this.id_break.id_protected = var9;
      if (var1 instanceof cG_2 var21) {
         Float var18 = (float)((double)((Float)var21.id_class[2]).floatValue() + (double)(var7 - (Float)var21.id_class[2]) * 0.1);
         var21.id_class[2] = var18;
         Float var19 = (float)((double)((Float)var21.id_class[3]).floatValue() + (double)(var10 - (Float)var21.id_class[3]) * 0.1);
         var21.id_class[3] = var19;
         Float var20 = (float)((double)((Float)var21.id_class[4]).floatValue() + (double)(var8 - (Float)var21.id_class[4]) * 0.1);
         var21.id_class[4] = var20;
         this.id_break.id_case = (Float)var21.id_class[2];
         this.id_break.id_catch = (Float)var21.id_class[3];
         this.id_break.id_private = (Float)var21.id_class[4];
      } else {
         this.id_break.id_case = var7;
         this.id_break.id_private = var8;
         this.id_break.id_catch = var10;
      }

      this.id_class.id_byte = -this.id_break.id_byte;
      this.id_class.id_catch = -this.id_break.id_catch;
      this.id_class.id_protected = this.id_break.id_protected;
      this.id_class.id_case = this.id_break.id_case;
      this.id_class.id_private = -this.id_break.id_private;
   }

   @Override
   protected Iterable<Iq_1> id_class() {
      return ImmutableList.of();
   }

   @Override
   protected Iterable<Iq_1> id_break() {
      return ImmutableList.of(this.id_break, this.id_class);
   }
}
