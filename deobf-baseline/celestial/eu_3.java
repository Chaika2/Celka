package celestial;

public class eu_3 extends ev_3 {
   private static final String[] id_protected = new String[]{"all", "undead", "arthropods"};
   private static final int[] id_throws = new int[]{1, 5, 5};
   private static final int[] id_case = new int[]{11, 8, 8};
   private static final int[] id_catch = new int[]{20, 20, 20};
   public final int id_class;

   public eu_3(eF_2 var1, int var2, rXQ... var3) {
      super(var1, eC_2.WEAPON, var3);
      this.id_class = var2;
   }

   @Override
   public void id_class(iB_2 var1, an_3 var2, int var3) {
      if (var2 instanceof iB_2 var4 && this.id_class == 2 && var4.sG() == aL_2.id_byte) {
         int var5 = 20 + var1.Sa().nextInt(10 * var3);
         var4.id_break(new rLY(rLD.id_break, var5, 3));
      }
   }

   @Override
   public boolean id_class(rdn_3 var1) {
      return var1.id_break() instanceof rxM_2 ? true : super.id_class(var1);
   }

   @Override
   public float id_class(int var1, aL_2 var2) {
      if (this.id_class == 0) {
         return 1.0F + (float)Math.max(0, var1 - 1) * 0.5F;
      } else if (this.id_class == 1 && var2 == aL_2.id_break) {
         return (float)var1 * 2.5F;
      } else {
         return this.id_class == 2 && var2 == aL_2.id_byte ? (float)var1 * 2.5F : 0.0F;
      }
   }

   @Override
   public boolean id_class(ev_3 var1) {
      return !(var1 instanceof eu_3);
   }

   @Override
   public int id_class() {
      return 5;
   }

   @Override
   public int id_class(int var1) {
      return id_throws[this.id_class] + (var1 - 1) * id_case[this.id_class];
   }

   @Override
   public int id_break(int var1) {
      return this.id_class(var1) + id_catch[this.id_class];
   }
}
