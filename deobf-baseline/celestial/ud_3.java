package celestial;

public class ud_3 {
   private final HU id_break;
   private final HU id_byte;
   private final float id_protected;
   private final float id_throws;
   private final float id_case;
   private final float id_catch;
   private final float id_private;
   private final float id_implements;
   private final float id_finally;
   private final float id_extends;
   public static final rjV_2 id_class = rrWD.id_class();

   public ud_3(HU var1, HU var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
      this.id_case = var5;
      this.id_catch = var6;
      this.id_private = var7;
      this.id_implements = var8;
      this.id_finally = var9;
      this.id_extends = var10;
   }

   public void id_class(boolean var1, float var2, float var3, rjV_2 var4, Ok_1 var5, float var6, float var7, float var8, float var9, int var10) {
      float var11 = var2 + this.id_private;
      float var12 = var2 + this.id_implements;
      float var13 = this.id_finally - 3.0F;
      float var14 = this.id_extends - 3.0F;
      float var15 = var3 + var13;
      float var16 = var3 + var14;
      float var17 = var1 ? 1.0F - 0.25F * var13 : 0.0F;
      float var18 = var1 ? 1.0F - 0.25F * var14 : 0.0F;
      if (var5 instanceof lD_2 var19 && var4 == id_class) {
         int var20 = (int)(var6 * 255.0F);
         int var21 = (int)(var7 * 255.0F);
         int var22 = (int)(var8 * 255.0F);
         int var23 = (int)(var9 * 255.0F);
         int var24 = var10 & 65535;
         int var25 = var10 >> 16 & 65535;
         var19.id_class(var11 + var17, var15, 0.0F, var20, var21, var22, var23, this.id_protected, this.id_case, var24, var25);
         var19.id_class(var11 + var18, var16, 0.0F, var20, var21, var22, var23, this.id_protected, this.id_catch, var24, var25);
         var19.id_class(var12 + var18, var16, 0.0F, var20, var21, var22, var23, this.id_throws, this.id_catch, var24, var25);
         var19.id_class(var12 + var17, var15, 0.0F, var20, var21, var22, var23, this.id_throws, this.id_case, var24, var25);
         return;
      }

      var5.id_class(var4, var11 + var17, var15, 0.0F).id_class(var6, var7, var8, var9).id_class(this.id_protected, this.id_case).id_break(var10).id_class();
      var5.id_class(var4, var11 + var18, var16, 0.0F).id_class(var6, var7, var8, var9).id_class(this.id_protected, this.id_catch).id_break(var10).id_class();
      var5.id_class(var4, var12 + var18, var16, 0.0F).id_class(var6, var7, var8, var9).id_class(this.id_throws, this.id_catch).id_break(var10).id_class();
      var5.id_class(var4, var12 + var17, var15, 0.0F).id_class(var6, var7, var8, var9).id_class(this.id_throws, this.id_case).id_break(var10).id_class();
   }

   public HU id_class(boolean var1) {
      return var1 ? this.id_byte : this.id_break;
   }

   public void id_class(uk_3 var1, rjV_2 var2, Ok_1 var3, int var4) {
      var3.id_class(var2, var1.id_class, var1.id_break, var1.id_throws)
         .id_class(var1.id_case, var1.id_catch, var1.id_private, var1.id_implements)
         .id_class(this.id_protected, this.id_case)
         .id_break(var4)
         .id_class();
      var3.id_class(var2, var1.id_byte, var1.id_break, var1.id_throws)
         .id_class(var1.id_case, var1.id_catch, var1.id_private, var1.id_implements)
         .id_class(this.id_protected, this.id_catch)
         .id_break(var4)
         .id_class();
      var3.id_class(var2, var1.id_byte, var1.id_protected, var1.id_throws)
         .id_class(var1.id_case, var1.id_catch, var1.id_private, var1.id_implements)
         .id_class(this.id_throws, this.id_catch)
         .id_break(var4)
         .id_class();
      var3.id_class(var2, var1.id_class, var1.id_protected, var1.id_throws)
         .id_class(var1.id_case, var1.id_catch, var1.id_private, var1.id_implements)
         .id_class(this.id_throws, this.id_case)
         .id_break(var4)
         .id_class();
   }
}
