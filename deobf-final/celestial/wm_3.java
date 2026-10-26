package celestial;

public class wm_3 extends In_1 {
   private final Iq_1 class_;
   private final Iq_1 break_;

   public wm_3() {
      super(HU::break_);
      this.return_ = 64;
      this.public_ = 64;
      this.class_ = new Iq_1(this, 0, 0);
      this.class_.class_(-6.0F, -11.0F, -2.0F, 12.0F, 22.0F, 1.0F, 0.0F);
      this.break_ = new Iq_1(this, 26, 0);
      this.break_.class_(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 6.0F, 0.0F);
   }

   @Override
   public void class_(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.class_.class_(var1, var2, var3, var4, var5, var6, var7, var8);
      this.break_.class_(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public Iq_1 class_() {
      return this.class_;
   }

   public Iq_1 break_() {
      return this.break_;
   }
}
