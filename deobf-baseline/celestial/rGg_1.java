package celestial;

public class rGg_1 extends rEi_1 {
   protected static final rut_3<Byte> id_class = rmE_2.id_class(rGg_1.class, ruw_3.id_class);
   is_3 id_break;
   private rfH_2 id_protected;
   private boolean id_super;
   private int id_this;

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.de;
   }

   public rGg_1(aI_2<? extends rGg_1> var1, rYB var2) {
      super(var1, var2);
      this.id_native = new rGo_1(this, this);
      this.id_finally = 3;
   }

   public void id_this(boolean var1) {
      this.id_class(1, var1);
   }

   @Override
   public void id_this() {
      Boolean var5 = true;
      this.id_throws[38] = var5;
      super.id_this();
      Boolean var6 = false;
      this.id_throws[38] = var6;
      this.id_finally(true);
      if (this.id_super && --this.id_this <= 0) {
         this.id_this = 20;
         this.id_break(rye_3.id_implements, 1.0F);
      }
   }

   public void id_class(is_3 var1) {
      this.id_break = var1;
   }

   @Override
   protected void id_class(rRh_1 var1) {
      this.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.Oy));
      this.id_class(rXQ.MAINHAND, 0.0F);
   }

   private void id_class(int var1, boolean var2) {
      int var3 = ((rmE_2)this.id_throws[49]).id_class(id_class);
      if (var2) {
         var3 |= var1;
      } else {
         var3 &= ~var1;
      }

      ((rmE_2)this.id_throws[49]).id_break(id_class, (byte)(var3 & 0xFF));
   }

   public void id_class(int var1) {
      this.id_super = true;
      this.id_this = var1;
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      this.id_class(var2);
      this.id_break(var2);
      return super.id_class(var1, var2, var3, var4, var5);
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      if (this.id_protected != null) {
         var1.id_break("BoundX", this.id_protected.b_());
         var1.id_break("BoundY", this.id_protected.c_());
         var1.id_break("BoundZ", this.id_protected.d_());
      }

      if (this.id_super) {
         var1.id_break("LifeTicks", this.id_this);
      }
   }

   @Override
   public void id_class(iG_2 var1, rjU_2 var2) {
      super.id_class(var1, var2);
      this.Px();
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      if (var1.id_throws("BoundX")) {
         this.id_protected = new rfH_2(var1.id_private("BoundX"), var1.id_private("BoundY"), var1.id_private("BoundZ"));
      }

      if (var1.id_throws("LifeTicks")) {
         this.id_class(var1.id_private("LifeTicks"));
      }
   }

   private boolean id_break(int var1) {
      byte var2 = ((rmE_2)this.id_throws[49]).id_class(id_class);
      return (var2 & var1) != 0;
   }

   public static iz_3 id_throws() {
      return rEi_1.sm().id_class(iQ_2.id_class, 14.0).id_class(iQ_2.id_case, 4.0);
   }

   public is_3 L() {
      return this.id_break;
   }

   public boolean sx() {
      return this.id_break(1);
   }

   public void id_implements(rfH_2 var1) {
      this.id_protected = var1;
   }

   @Override
   protected rqA_2 id_static() {
      return rqn_3.dK;
   }

   @Override
   protected void id_final() {
      super.id_final();
      this.id_package.id_class(0, new rSb_1(this));
      this.id_package.id_class(4, new rGR(this));
      this.id_package.id_class(8, new rGK(this));
      this.id_package.id_class(9, new rBA(this, rhd_3.class, 3.0F, 1.0F));
      this.id_package.id_class(10, new rBA(this, is_3.class, 8.0F));
      this.id_int.id_class(1, new rBc_1(this, rEB.class).id_class());
      this.id_int.id_class(2, new rGY(this, this));
      this.id_int.id_class(3, new rBI<>(this, rhd_3.class, true));
   }

   @Override
   public float rX() {
      return 1.0F;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.dU;
   }

   public rfH_2 sJ() {
      return this.id_protected;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_class, (byte)0);
   }
}
