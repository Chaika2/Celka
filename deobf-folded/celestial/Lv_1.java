package celestial;

public abstract class Lv_1 extends LZ {
   @Override
   public void id_byte(double var1, double var3) {
      this.id_catch();
   }

   public Lv_1(int var1, int var2, int var3, int var4, rgP_2 var5) {
      super(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      if (!this.id_int || !this.id_new) {
         return false;
      } else if (var1 != 257 && var1 != 32 && var1 != 335) {
         return false;
      } else {
         this.id_class(QY.id_instanceof().c());
         this.id_catch();
         return true;
      }
   }

   public abstract void id_catch();
}
