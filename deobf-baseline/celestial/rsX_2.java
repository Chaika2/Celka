package celestial;

public class rsX_2 extends an_3 {
   private static final rut_3<Integer> id_class = rmE_2.id_class(rsX_2.class, ruw_3.id_break);
   private iB_2 id_break;
   private int id_protected = 80;

   public rsX_2(aI_2<? extends rsX_2> var1, rYB var2) {
      super(var1, var2);
      Boolean var7 = true;
      this.id_throws[2] = var7;
   }

   public rsX_2(rYB var1, double var2, double var4, double var6, iB_2 var8) {
      this(aI_2.Q, var1);
      this.id_new(var2, var4, var6);
      double var9 = var1.id_int.nextDouble() * (float) (Math.PI * 2);
      this.id_catch(-Math.sin(var9) * 0.02, 0.2F, -Math.cos(var9) * 0.02);
      this.id_class(80);
      Double var15 = var2;
      this.id_throws[8] = var15;
      Double var16 = var4;
      this.id_throws[9] = var16;
      Double var17 = var6;
      this.id_throws[10] = var17;
      this.id_break = var8;
   }

   @Override
   public void id_this() {
      if (!this.rw()) {
         this.id_byte(this.rv().id_break(0.0, -0.04, 0.0));
      }

      this.id_class(iG_2.SELF, this.rv());
      this.id_byte(this.rv().id_class(0.98));
      if ((Boolean)this.id_throws[20]) {
         this.id_byte(this.rv().id_throws(0.7, -0.5, 0.7));
      }

      this.id_protected--;
      if (this.id_protected <= 0) {
         this.PD();
         if (!((rYB)this.id_throws[7]).id_continue) {
            this.id_private();
         }
      } else {
         this.PM();
         if (((rYB)this.id_throws[7]).id_continue) {
            ((rYB)this.id_throws[7]).id_class(rLQ.id_double, this.rx(), this.re() + 0.5, this.BO(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void id_class(rcd_3 var1) {
      var1.id_class("Fuse", (short)this.id_case());
   }

   public void id_class(int var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_class, var1);
      this.id_protected = var1;
   }

   @Override
   public void id_class(rut_3<?> var1) {
      if (id_class.equals(var1)) {
         this.id_protected = this.id_throws();
      }
   }

   @Override
   protected float id_class(iM_2 var1, ap_3 var2) {
      return 0.15F;
   }

   @Override
   protected void id_break(rcd_3 var1) {
      this.id_class(var1.id_catch("Fuse"));
   }

   public int id_throws() {
      return ((rmE_2)this.id_throws[49]).id_class(id_class);
   }

   public float id_catch() {
      float var1 = (float)this.id_throws();
      float var2 = var1 - (float)this.id_case();
      return rfU_2.id_class(var2 / var1, 0.0F, 1.0F);
   }

   public int id_case() {
      return this.id_protected;
   }

   public iB_2 id_protected() {
      return this.id_break;
   }

   private void id_private() {
      ((rYB)this.id_throws[7]).id_class(this, this.rx(), this.id_byte(0.0625), this.BO(), 4.0F, rRz_1.BREAK);
   }

   @Override
   public boolean rY() {
      return !(Boolean)this.id_throws[27];
   }

   @Override
   protected boolean PK() {
      return false;
   }

   @Override
   protected void m_() {
      ((rmE_2)this.id_throws[49]).id_class(id_class, 80);
   }

   @Override
   public ruS_2<?> p_() {
      return new rFJ(this);
   }
}
