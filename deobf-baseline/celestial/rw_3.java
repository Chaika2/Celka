package celestial;

public interface rw_3 extends rq_3 {
   xc_3 id_class(int var1, int var2, int var3);

   default xc_3[] id_class(int var1, int var2) {
      xc_3[] var3 = new xc_3[this.id_class()];

      for (int var4 = 0; var4 < this.id_class(); var4++) {
         var3[var4] = this.id_class(var1, var4, var2);
      }

      return var3;
   }
}
