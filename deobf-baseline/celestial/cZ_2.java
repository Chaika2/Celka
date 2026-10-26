package celestial;

import com.google.common.collect.Lists;
import java.util.List;

class cZ_2 implements rpv_3 {
   final Hx_1 id_class;
   private final boolean id_byte;
   private final float id_protected;
   private final float id_throws;
   private final float id_case;
   private final float id_catch;
   private final float id_private;
   private final rjV_2 id_implements;
   private final boolean id_finally;
   private final int id_extends;
   private float id_native;
   private float id_volatile;
   private List<uk_3> id_final;
   private rgc_3 id_package;
   private uG_2 id_int;

   public cZ_2(cm_3 var1, Hx_1 var2, float var3, float var4, int var5, boolean var6, rjV_2 var7, boolean var8, int var9) {
      this.id_break = var1;
      this.id_class = var2;
      this.id_native = var3;
      this.id_volatile = var4;
      this.id_byte = var6;
      this.id_protected = var6 ? 0.25F : 1.0F;
      this.id_throws = (float)(var5 >> 16 & 0xFF) / 255.0F * this.id_protected;
      this.id_case = (float)(var5 >> 8 & 0xFF) / 255.0F * this.id_protected;
      this.id_catch = (float)(var5 & 0xFF) / 255.0F * this.id_protected;
      this.id_private = (float)(var5 >> 24 & 0xFF) / 255.0F;
      this.id_implements = var7.id_break() ? ud_3.id_class : var7;
      this.id_finally = var8;
      this.id_extends = var9;
   }

   public float id_class(int var1, float var2) {
      if (var1 != 0) {
         float var3 = (float)(var1 >> 24 & 0xFF) / 255.0F;
         float var4 = (float)(var1 >> 16 & 0xFF) / 255.0F;
         float var5 = (float)(var1 >> 8 & 0xFF) / 255.0F;
         float var6 = (float)(var1 & 0xFF) / 255.0F;
         this.id_class(new uk_3(var2 - 1.0F, this.id_volatile + 9.0F, this.id_native + 1.0F, this.id_volatile - 1.0F, 0.01F, var4, var5, var6, var3));
      }

      if (this.id_final != null) {
         ud_3 var7 = this.id_break.id_class(rgc_3.id_break).id_class();
         Ok_1 var8 = this.id_class.getBuffer(var7.id_class(this.id_finally));

         for (uk_3 var10 : this.id_final) {
            var7.id_class(var10, this.id_implements, var8, this.id_extends);
         }
      }

      return this.id_native;
   }

   private uG_2 id_class(rgc_3 var1) {
      if (var1 == this.id_package) {
         return this.id_int;
      } else {
         this.id_package = var1;
         this.id_int = this.id_break.id_class(var1.id_extends());
         return this.id_int;
      }
   }

   private void id_class(uk_3 var1) {
      if (this.id_final == null) {
         this.id_final = Lists.newArrayList();
      }

      this.id_final.add(var1);
   }

   @Override
   public boolean accept(int var1, rgc_3 var2, int var3) {
      uG_2 var4 = this.id_class(var2);
      uX_2 var5 = var4.id_class(var3);
      ud_3 var6 = var2.id_case() && var3 != 32 ? var4.id_class(var5) : var4.id_break(var3);
      boolean var7 = var2.id_break();
      float var8 = this.id_private;
      rVa_1 var9 = var2.id_class();
      float var10;
      float var11;
      float var12;
      if (var9 != null) {
         int var13 = var9.id_class();
         var10 = (float)(var13 >> 16 & 0xFF) / 255.0F * this.id_protected;
         var11 = (float)(var13 >> 8 & 0xFF) / 255.0F * this.id_protected;
         var12 = (float)(var13 & 0xFF) / 255.0F * this.id_protected;
      } else {
         var10 = this.id_throws;
         var11 = this.id_case;
         var12 = this.id_catch;
      }

      if (!(var6 instanceof uE_2)) {
         float var16 = var7 ? var5.id_case() : 0.0F;
         float var14 = this.id_byte ? var5.id_catch() : 0.0F;
         Ok_1 var15 = this.id_class.getBuffer(var6.id_class(this.id_finally));
         this.id_break
            .id_class(
               var6,
               var7,
               var2.id_byte(),
               var16,
               this.id_native + var14,
               this.id_volatile + var14,
               this.id_implements,
               var15,
               var10,
               var11,
               var12,
               var8,
               this.id_extends
            );
      }

      float var17 = var5.id_class(var7);
      float var18 = this.id_byte ? 1.0F : 0.0F;
      if (var2.id_protected()) {
         this.id_class(
            new uk_3(
               this.id_native + var18 - 1.0F,
               this.id_volatile + var18 + 4.5F,
               this.id_native + var18 + var17,
               this.id_volatile + var18 + 4.5F - 1.0F,
               0.01F,
               var10,
               var11,
               var12,
               var8
            )
         );
      }

      if (var2.id_throws()) {
         this.id_class(
            new uk_3(
               this.id_native + var18 - 1.0F,
               this.id_volatile + var18 + 9.0F,
               this.id_native + var18 + var17,
               this.id_volatile + var18 + 9.0F - 1.0F,
               0.01F,
               var10,
               var11,
               var12,
               var8
            )
         );
      }

      this.id_native += var17;
      return true;
   }
}
