package celestial;

public class rrkR implements rrko_1 {
   private rrkY class_;
   private rrkY break_;
   private rrkY byte_;
   private rrkY protected_;

   public rrkR(rrkY var1, rrkY var2, rrkY var3, rrkY var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
   }

   @Override
   public int class_(int var1, int var2, int var3, int var4) {
      int var5 = var1 >> 24 & 0xFF;
      int var6 = var1 >> 16 & 0xFF;
      int var7 = var1 >> 8 & 0xFF;
      int var8 = var1 & 0xFF;
      int var9 = var2 >> 24 & 0xFF;
      int var10 = var2 >> 16 & 0xFF;
      int var11 = var2 >> 8 & 0xFF;
      int var12 = var2 & 0xFF;
      int var13 = var3 >> 24 & 0xFF;
      int var14 = var3 >> 16 & 0xFF;
      int var15 = var3 >> 8 & 0xFF;
      int var16 = var3 & 0xFF;
      int var17 = var4 >> 24 & 0xFF;
      int var18 = var4 >> 16 & 0xFF;
      int var19 = var4 >> 8 & 0xFF;
      int var20 = var4 & 0xFF;
      int var21 = this.protected_.class_(var5, var9, var13, var17);
      int var22 = this.class_.class_(var6, var10, var14, var18);
      int var23 = this.break_.class_(var7, var11, var15, var19);
      int var24 = this.byte_.class_(var8, var12, var16, var20);
      return var21 << 24 | var22 << 16 | var23 << 8 | var24;
   }
}
