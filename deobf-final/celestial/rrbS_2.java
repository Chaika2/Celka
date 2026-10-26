package celestial;

public class rrbS_2 extends roJ_2 {
   private rrbB_2 break_;
   private boolean byte_;
   private boolean protected_;

   @Override
   public void byte_(boolean var1) {
      this.byte_ = var1;
      super.byte_(var1);
   }

   public boolean long_() {
      return this.byte_;
   }

   public rrbS_2(rYB var1, rfj_3 var2, rYZ var3) {
      super(var1, var2, var3);
   }

   @Override
   public void class_(boolean var1) {
      this.protected_ = var1;
      super.class_(var1);
   }

   @Override
   public void class_(an_3 var1) {
      this.byte_ = true;
      super.class_(var1);
   }

   public static rrbB_2 class_(roJ_2 var0) {
      rrbE_2[] var1 = null;
      roQ_2 var2 = var0.interface_();
      if (var2 != null) {
         int var3 = (var2.catch_() >> 4) + 1;
         var1 = new rrbE_2[var3];
         roQ_2[] var4 = var0.byte_();

         for (int var5 = 0; var5 < var3; var5++) {
            roQ_2 var6 = var4[var5];
            if (var6 != null) {
               short var7 = var6.extends_();
               short var8 = var6.native_();
               short var9 = var6.volatile_();
               var1[var5] = new rrbE_2(var7, var8, var9);
            }
         }
      }

      return new rrbB_2(var1);
   }

   public void class_(rrbB_2 var1) {
      this.break_ = var1;
   }

   @Override
   public boolean finally_() {
      return this.protected_;
   }

   public rrbB_2 abstract_() {
      return this.break_;
   }
}
