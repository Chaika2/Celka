package celestial;

public class rSm_1 extends an_3 {
   public final rSu_1 class_;
   public final String break_;
   private final ap_3 protected_;

   public rSm_1(rSu_1 var1, String var2, float var3, float var4) {
      super(var1.BC(), (rYB)var1.throws_[7]);
      this.protected_ = ap_3.break_(var3, var4);
      this.q_();
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   protected void class_(rcd_3 var1) {
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      return this.class_(var1) ? false : this.class_.class_(this, var1, var2);
   }

   @Override
   protected void break_(rcd_3 var1) {
   }

   @Override
   public boolean continue_(an_3 var1) {
      return this == var1 || this.class_ == var1;
   }

   @Override
   public boolean rY() {
      return true;
   }

   @Override
   public ap_3 a_(iM_2 var1) {
      return this.protected_;
   }

   @Override
   protected void m_() {
   }

   @Override
   public ruS_2<?> p_() {
      throw new UnsupportedOperationException();
   }
}
