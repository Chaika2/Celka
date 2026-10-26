package celestial;

public class rrbS_2 extends roJ_2 {
   private rrbB_2 id_break;
   private boolean id_byte;
   private boolean id_protected;

   @Override
   public void id_byte(boolean var1) {
      this.id_byte = var1;
      super.id_byte(var1);
   }

   public boolean id_long() {
      return this.id_byte;
   }

   public rrbS_2(rYB var1, rfj_3 var2, rYZ var3) {
      super(var1, var2, var3);
   }

   @Override
   public void id_class(boolean var1) {
      this.id_protected = var1;
      super.id_class(var1);
   }

   @Override
   public void id_class(an_3 var1) {
      this.id_byte = true;
      super.id_class(var1);
   }

   public static rrbB_2 id_class(roJ_2 var0) {
      rrbE_2[] var1 = null;
      roQ_2 var2 = var0.id_interface();
      if (var2 != null) {
         int var3 = (var2.id_catch() >> 4) + 1;
         var1 = new rrbE_2[var3];
         roQ_2[] var4 = var0.id_byte();

         for (int var5 = 0; var5 < var3; var5++) {
            roQ_2 var6 = var4[var5];
            if (var6 != null) {
               short var7 = var6.id_extends();
               short var8 = var6.id_native();
               short var9 = var6.id_volatile();
               var1[var5] = new rrbE_2(var7, var8, var9);
            }
         }
      }

      return new rrbB_2(var1);
   }

   public void id_class(rrbB_2 var1) {
      this.id_break = var1;
   }

   @Override
   public boolean id_finally() {
      return this.id_protected;
   }

   public rrbB_2 id_abstract() {
      return this.id_break;
   }
}
