package celestial;

public class Zf_1 extends LZ {
   final ZI id_throws;
   private boolean id_case;

   public Zf_1(Zt_1 var1, ZI var2, int var3, int var4) {
      super(var3, var4, 25, 25, var2.id_class());
      this.id_class = var1;
      this.id_throws = var2;
   }

   private void id_class(Ml_1 var1, fY_2 var2) {
      var2.id_class(Zt_1.id_class);
      var1.id_class();
      var1.id_class((double)this.id_volatile, (double)this.id_final, 0.0);
      id_class(var1, 0, 0, 0.0F, 75.0F, 25, 25, 128, 128);
      var1.id_break();
   }

   public void id_class(boolean var1) {
      this.id_case = var1;
   }

   @Override
   public void id_break(Ml_1 var1, int var2, int var3, float var4) {
      QY var5 = QY.id_instanceof();
      this.id_class(var1, var5.A());
      this.id_throws.id_class(this.id_class.id_final, this.id_volatile + 5, this.id_final + 5);
      if (this.id_case) {
         this.id_break(var1, var5.A());
      }
   }

   private void id_break(Ml_1 var1, fY_2 var2) {
      var2.id_class(Zt_1.id_class);
      var1.id_class();
      var1.id_class((double)this.id_volatile, (double)this.id_final, 0.0);
      id_class(var1, 0, 0, 25.0F, 75.0F, 25, 25, 128, 128);
      var1.id_break();
   }

   @Override
   public boolean B_() {
      return super.B_() || this.id_case;
   }
}
