package celestial;

public class rGw_1 extends rEi_1 {
   private static final rut_3<Byte> id_class = rmE_2.id_class(rGw_1.class, ruw_3.id_class);

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.xq;
   }

   public rGw_1(aI_2<? extends rGw_1> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void id_this() {
      super.id_this();
      if (!((rYB)this.id_throws[7]).id_continue) {
         this.id_this((Boolean)this.id_throws[23]);
      }
   }

   public void id_this(boolean var1) {
      byte var2 = ((rmE_2)this.id_throws[49]).id_class(id_class);
      if (var1) {
         var2 = (byte)(var2 | 1);
      } else {
         var2 = (byte)(var2 & -2);
      }

      ((rmE_2)this.id_throws[49]).id_break(id_class, var2);
   }

   @Override
   public void id_class(xc_3 var1, rjU_2 var2) {
      if (!var1.id_class(xu_3.U)) {
         super.id_class(var1, var2);
      }
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      var4 = super.id_class(var1, var2, var3, var4, var5);
      if (var1.id_long().nextInt(100) == 0) {
         rGL var6 = aI_2.A.id_class((rYB)this.id_throws[7]);
         var6.id_class(this.rx(), this.re(), this.BO(), (Float)this.id_throws[15], 0.0F);
         var6.id_class(var1, var2, var3, (aU_2)null, (rcd_3)null);
         var6.id_this(this);
      }

      if (var4 == null) {
         var4 = new rGf_1();
         if (var1.id_abstract() == rRO.HARD && var1.id_long().nextFloat() < 0.1F * var2.id_byte()) {
            ((rGf_1)var4).id_class(var1.id_long());
         }
      }

      if (var4 instanceof rGf_1) {
         rLR var8 = ((rGf_1)var4).id_class;
         if (var8 != null) {
            this.id_break(new rLY(var8, Integer.MAX_VALUE));
         }
      }

      return var4;
   }

   @Override
   protected void id_break(rfH_2 var1, xc_3 var2) {
      this.id_class(rqn_3.xT, 0.15F, 1.0F);
   }

   @Override
   protected float id_break(iM_2 var1, ap_3 var2) {
      return 0.65F;
   }

   @Override
   protected rLy_1 id_break(rYB var1) {
      return new rLZ(this, var1);
   }

   @Override
   public boolean id_throws(rLY var1) {
      return var1.id_class() == rLD.id_super ? false : super.id_throws(var1);
   }

   public static iz_3 L() {
      return rEi_1.sm().id_class(iQ_2.id_class, 16.0).id_class(iQ_2.id_protected, 0.3F);
   }

   @Override
   protected rqA_2 id_static() {
      return rqn_3.xy;
   }

   @Override
   protected void id_final() {
      this.id_package.id_class(1, new rSb_1(this));
      this.id_package.id_class(3, new rBv_1(this, 0.4F));
      this.id_package.id_class(4, new rGI(this));
      this.id_package.id_class(5, new rSk_1(this, 0.8));
      this.id_package.id_class(6, new rBA(this, rhd_3.class, 8.0F));
      this.id_package.id_class(6, new rBC(this));
      this.id_int.id_class(1, new rBc_1(this));
      this.id_int.id_class(2, new rGj_1<>(this, rhd_3.class));
      this.id_int.id_class(3, new rGj_1<>(this, rMZ.class));
   }

   @Override
   public double PS() {
      return (double)(this.Bm() * 0.5F);
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.xp;
   }

   public boolean sJ() {
      return (((rmE_2)this.id_throws[49]).id_class(id_class) & 1) != 0;
   }

   @Override
   public aL_2 sG() {
      return aL_2.id_byte;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_class, (byte)0);
   }

   @Override
   public boolean o_() {
      return this.sJ();
   }
}
