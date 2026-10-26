package celestial;

import java.util.Random;

public class rGB extends aV_2 implements rEK {
   private static final rut_3<Integer> id_class = rmE_2.id_class(rGB.class, ruw_3.id_break);
   rjU_2 id_break = rjU_2.id_class;
   rfH_2 id_protected;
   rGS id_super;

   @Override
   protected boolean id_boolean() {
      return true;
   }

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.OR;
   }

   @Override
   protected void id_double() {
      super.id_double();
   }

   public rGB(aI_2<? extends rGB> var1, rYB var2) {
      super(var1, var2);
      this.id_protected = rfH_2.id_protected;
      this.id_super = rGS.CIRCLE;
      this.id_finally = 5;
      this.id_native = new rGM(this, this);
      this.id_extends = new rGG(this, this);
   }

   @Override
   public void id_this() {
      super.id_this();
      if (((rYB)this.id_throws[7]).id_continue) {
         float var1 = rfU_2.id_break((float)(this.V() * 3 + (Integer)this.id_throws[41]) * 0.13F + (float) Math.PI);
         float var2 = rfU_2.id_break((float)(this.V() * 3 + (Integer)this.id_throws[41] + 1) * 0.13F + (float) Math.PI);
         if (var1 > 0.0F && var2 <= 0.0F) {
            ((rYB)this.id_throws[7])
               .id_class(
                  this.rx(),
                  this.re(),
                  this.BO(),
                  rqn_3.Og,
                  this.Pr(),
                  0.95F + ((Random)this.id_throws[40]).nextFloat() * 0.05F,
                  0.95F + ((Random)this.id_throws[40]).nextFloat() * 0.05F,
                  false
               );
         }

         int var3 = this.id_throws();
         float var4 = rfU_2.id_break((Float)this.id_throws[15] * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)var3);
         float var5 = rfU_2.id_class((Float)this.id_throws[15] * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)var3);
         float var6 = (0.3F + var1 * 0.45F) * ((float)var3 * 0.2F + 1.0F);
         ((rYB)this.id_throws[7]).id_class(rLQ.id_const, this.rx() + (double)var4, this.re() + (double)var6, this.BO() + (double)var5, 0.0, 0.0, 0.0);
         ((rYB)this.id_throws[7]).id_class(rLQ.id_const, this.rx() - (double)var4, this.re() + (double)var6, this.BO() - (double)var5, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      this.id_protected = this.Bs().id_break(5);
      this.id_class(0);
      return super.id_class(var1, var2, var3, var4, var5);
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("AX", this.id_protected.b_());
      var1.id_break("AY", this.id_protected.c_());
      var1.id_break("AZ", this.id_protected.d_());
      var1.id_break("Size", this.id_throws());
   }

   @Override
   public boolean id_class(double var1) {
      return true;
   }

   @Override
   public boolean id_class(aI_2<?> var1) {
      return true;
   }

   public void id_class(int var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_class, rfU_2.id_class(var1, 0, 64));
   }

   @Override
   public void id_class(rut_3<?> var1) {
      if (id_class.equals(var1)) {
         this.id_catch();
      }

      super.id_class(var1);
   }

   @Override
   public void id_default() {
      if (this.BM() && this.F()) {
         this.id_case(8);
      }

      super.id_default();
   }

   @Override
   protected float id_break(iM_2 var1, ap_3 var2) {
      return var2.id_break * 0.35F;
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      if (var1.id_throws("AX")) {
         this.id_protected = new rfH_2(var1.id_private("AX"), var1.id_private("AY"), var1.id_private("AZ"));
      }

      this.id_class(var1.id_private("Size"));
   }

   public int id_throws() {
      return ((rmE_2)this.id_throws[49]).id_class(id_class);
   }

   private void id_catch() {
      this.q_();
      this.id_byte(iQ_2.id_case).id_class((double)(6 + this.id_throws()));
   }

   @Override
   protected rPf_1 id_new() {
      return new rGE(this, this);
   }

   @Override
   protected rqA_2 id_static() {
      return rqn_3.Of;
   }

   @Override
   protected void id_final() {
      this.id_package.id_class(1, new rGh_1(this));
      this.id_package.id_class(2, new rGX(this));
      this.id_package.id_class(3, new rGO(this));
      this.id_int.id_class(1, new rGs_1(this));
   }

   @Override
   public rqL_2 Pr() {
      return rqL_2.HOSTILE;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.OV;
   }

   @Override
   public aL_2 sG() {
      return aL_2.id_break;
   }

   @Override
   protected float Si() {
      return 1.0F;
   }

   @Override
   public ap_3 a_(iM_2 var1) {
      int var2 = this.id_throws();
      ap_3 var3 = super.a_(var1);
      float var4 = (var3.id_class + 0.2F * (float)var2) / var3.id_class;
      return var3.id_class(var4);
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_class, 0);
   }
}
