package celestial;

public abstract class rGp_1 extends rsi_3 {
   private static final rut_3<Byte> id_super = rmE_2.id_class(rGp_1.class, ruw_3.id_class);
   protected int id_protected;
   private rGT id_this = rGT.NONE;

   @Override
   protected void id_double() {
      super.id_double();
      if (this.id_protected > 0) {
         this.id_protected--;
      }
   }

   protected rGp_1(aI_2<? extends rGp_1> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void id_this() {
      super.id_this();
      if (((rYB)this.id_throws[7]).id_continue && this.sn()) {
         rGT var1 = this.sC();
         double var2 = var1.particleSpeed[0];
         double var4 = var1.particleSpeed[1];
         double var6 = var1.particleSpeed[2];
         float var8 = (Float)this.id_private[23] * (float) (Math.PI / 180.0)
            + rfU_2.id_break((float)((Integer)this.id_throws[41]).intValue() * 0.6662F) * 0.25F;
         float var9 = rfU_2.id_break(var8);
         float var10 = rfU_2.id_class(var8);
         ((rYB)this.id_throws[7]).id_class(rLQ.id_else, this.rx() + (double)var9 * 0.6, this.re() + 1.8, this.BO() + (double)var10 * 0.6, var2, var4, var6);
         ((rYB)this.id_throws[7]).id_class(rLQ.id_else, this.rx() - (double)var9 * 0.6, this.re() + 1.8, this.BO() - (double)var10 * 0.6, var2, var4, var6);
      }
   }

   protected int sl() {
      return this.id_protected;
   }

   public void id_class(rGT var1) {
      this.id_this = var1;
      ((rmE_2)this.id_throws[49]).id_break(id_super, (byte)var1.id);
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("SpellTicks", this.id_protected);
   }

   protected abstract rqA_2 sc();

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_protected = var1.id_private("SpellTicks");
   }

   @Override
   public rEr_1 id_throws() {
      if (this.sn()) {
         return rEr_1.SPELLCASTING;
      } else {
         return this.sW() ? rEr_1.CELEBRATING : rEr_1.CROSSED;
      }
   }

   public boolean sn() {
      return ((rYB)this.id_throws[7]).id_continue ? ((rmE_2)this.id_throws[49]).id_class(id_super) > 0 : this.id_protected > 0;
   }

   protected rGT sC() {
      return !((rYB)this.id_throws[7]).id_continue ? this.id_this : rGT.id_class(((rmE_2)this.id_throws[49]).id_class(id_super));
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_super, (byte)0);
   }
}
