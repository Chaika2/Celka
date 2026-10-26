package celestial;

public abstract class rpj_3 {
   private int class_;

   public boolean byte_() {
      int var1 = this.break_();
      boolean var2 = var1 != this.class_;
      this.class_ = var1;
      return var2;
   }

   public abstract void class_(int var1);

   public static rpj_3 class_() {
      return new rpR_2();
   }

   public static rpj_3 class_(rpF_2 var0, int var1) {
      return new rpV_2(var0, var1);
   }

   public static rpj_3 class_(int[] var0, int var1) {
      return new rpg_3(var0, var1);
   }

   public abstract int break_();
}
