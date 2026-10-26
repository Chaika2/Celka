package celestial;

public class gC_2 extends gF_2 {
   public gC_2() {
      super(128.0F, true, gA_2.NORMAL, false, false);
   }

   @Override
   public rjU_2 id_class(rjU_2 var1, float var2) {
      return var1.id_throws((double)(var2 * 0.94F + 0.06F), (double)(var2 * 0.94F + 0.06F), (double)(var2 * 0.91F + 0.09F));
   }

   @Override
   public boolean id_class(int var1, int var2) {
      return false;
   }
}
