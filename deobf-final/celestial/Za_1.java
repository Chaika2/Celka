package celestial;

public class Za_1 extends Lg_1<Za_1> {
   final jj_3 break_;

   public Za_1(Ze_1 var1, jj_3 var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   private void class_() {
      this.class_.class_(this);
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      String var11 = this.break_.toString();
      this.class_
         .class_
         .super_
         .break_(var1, var11, (float)(Ze_1.class_(this.class_) / 2 - this.class_.class_.super_.break_(var11) / 2), (float)var3 + 2.5F, 16777215, true);
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      if (var5 == 0) {
         this.class_();
         return true;
      } else {
         return false;
      }
   }
}
