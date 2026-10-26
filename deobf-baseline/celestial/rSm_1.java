package celestial;

public class rSm_1 extends an_3 {
   public final rSu_1 id_class;
   public final String id_break;
   private final ap_3 id_protected;

   public rSm_1(rSu_1 var1, String var2, float var3, float var4) {
      super(var1.BC(), (rYB)var1.id_throws[7]);
      this.id_protected = ap_3.id_break(var3, var4);
      this.q_();
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   protected void id_class(rcd_3 var1) {
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      return this.id_class(var1) ? false : this.id_class.id_class(this, var1, var2);
   }

   @Override
   protected void id_break(rcd_3 var1) {
   }

   @Override
   public boolean id_continue(an_3 var1) {
      return this == var1 || this.id_class == var1;
   }

   @Override
   public boolean rY() {
      return true;
   }

   @Override
   public ap_3 a_(iM_2 var1) {
      return this.id_protected;
   }

   @Override
   protected void m_() {
   }

   @Override
   public ruS_2<?> p_() {
      throw new UnsupportedOperationException();
   }
}
