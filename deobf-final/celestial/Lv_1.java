package celestial;

public abstract class Lv_1 extends LZ {
   @Override
   public void byte_(double var1, double var3) {
      this.catch_();
   }

   public Lv_1(int var1, int var2, int var3, int var4, rgP_2 var5) {
      super(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      if (!this.int_ || !this.new_) {
         return false;
      } else if (var1 != 257 && var1 != 32 && var1 != 335) {
         return false;
      } else {
         this.class_(QY.instanceof_().c());
         this.catch_();
         return true;
      }
   }

   public abstract void catch_();
}
