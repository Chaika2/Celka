package celestial;

public class eu_3 extends ev_3 {
   private static final String[] protected_ = new String[]{"all", "undead", "arthropods"};
   private static final int[] throws_ = new int[]{1, 5, 5};
   private static final int[] case_ = new int[]{11, 8, 8};
   private static final int[] catch_ = new int[]{20, 20, 20};
   public final int class_;

   public eu_3(eF_2 var1, int var2, rXQ... var3) {
      super(var1, eC_2.WEAPON, var3);
      this.class_ = var2;
   }

   @Override
   public void class_(iB_2 var1, an_3 var2, int var3) {
      if (var2 instanceof iB_2 var4 && this.class_ == 2 && var4.sG() == aL_2.byte_) {
         int var5 = 20 + var1.Sa().nextInt(10 * var3);
         var4.break_(new rLY(rLD.break_, var5, 3));
      }
   }

   @Override
   public boolean class_(rdn_3 var1) {
      return var1.break_() instanceof rxM_2 ? true : super.class_(var1);
   }

   @Override
   public float class_(int var1, aL_2 var2) {
      if (this.class_ == 0) {
         return 1.0F + (float)Math.max(0, var1 - 1) * 0.5F;
      } else if (this.class_ == 1 && var2 == aL_2.break_) {
         return (float)var1 * 2.5F;
      } else {
         return this.class_ == 2 && var2 == aL_2.byte_ ? (float)var1 * 2.5F : 0.0F;
      }
   }

   @Override
   public boolean class_(ev_3 var1) {
      return !(var1 instanceof eu_3);
   }

   @Override
   public int class_() {
      return 5;
   }

   @Override
   public int class_(int var1) {
      return throws_[this.class_] + (var1 - 1) * case_[this.class_];
   }

   @Override
   public int break_(int var1) {
      return this.class_(var1) + catch_[this.class_];
   }
}
