package celestial;

public interface rw_3 extends rq_3 {
   xc_3 class_(int var1, int var2, int var3);

   default xc_3[] class_(int var1, int var2) {
      xc_3[] var3 = new xc_3[this.class_()];

      for (int var4 = 0; var4 < this.class_(); var4++) {
         var3[var4] = this.class_(var1, var4, var2);
      }

      return var3;
   }
}
