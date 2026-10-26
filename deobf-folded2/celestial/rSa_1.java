package celestial;

import java.util.Optional;
import java.util.Random;

public class rSa_1 extends an_3 {
   private static final rut_3<Optional<rfH_2>> id_break = rmE_2.id_class(rSa_1.class, ruw_3.id_volatile);
   private static final rut_3<Boolean> id_protected = rmE_2.id_class(rSa_1.class, ruw_3.id_implements);
   public int id_class;

   public rSa_1(aI_2<? extends rSa_1> var1, rYB var2) {
      super(var1, var2);
      Boolean var7 = true;
      this.id_throws[2] = var7;
      this.id_class = ((Random)this.id_throws[40]).nextInt(100000);
   }

   public rSa_1(rYB var1, double var2, double var4, double var6) {
      this(aI_2.id_super, var1);
      this.id_new(var2, var4, var6);
   }

   @Override
   public void id_this() {
      this.id_class++;
      if ((rYB)this.id_throws[7] instanceof rrEm_1) {
         rfH_2 var1 = this.Bs();
         if (((rrEm_1)((rYB)this.id_throws[7])).Q() != null && ((rYB)this.id_throws[7]).id_byte(var1).id_catch()) {
            ((rYB)this.id_throws[7]).id_break(var1, Jj_1.id_class((rYB)this.id_throws[7], var1));
         }
      }
   }

   public void id_class(boolean var1) {
      this.BQ().id_break(id_protected, var1);
   }

   public void id_class(rfH_2 var1) {
      this.BQ().id_break(id_break, Optional.ofNullable(var1));
   }

   @Override
   protected void id_class(rcd_3 var1) {
      if (this.id_protected() != null) {
         var1.id_class("BeamTarget", rco_3.id_class(this.id_protected()));
      }

      var1.id_class("ShowBottom", this.id_throws());
   }

   @Override
   public boolean id_class(double var1) {
      return super.id_class(var1) || this.id_protected() != null;
   }

   @Override
   public void j() {
      this.id_break(rye_3.id_final);
      super.j();
   }

   private void id_break(rye_3 var1) {
      if ((rYB)this.id_throws[7] instanceof rrEm_1) {
         rKG var2 = ((rrEm_1)((rYB)this.id_throws[7])).Q();
         if (var2 != null) {
            var2.id_class(this, var1);
         }
      }
   }

   @Override
   protected void id_break(rcd_3 var1) {
      if (var1.id_byte("BeamTarget", 10)) {
         this.id_class(rco_3.id_break(var1.id_int("BeamTarget")));
      }

      if (var1.id_byte("ShowBottom", 1)) {
         this.id_class(var1.id_new("ShowBottom"));
      }
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      if (this.id_class(var1)) {
         return false;
      } else if (var1.id_extends() instanceof rSu_1) {
         return false;
      } else {
         if (!(Boolean)this.id_throws[27] && !((rYB)this.id_throws[7]).id_continue) {
            this.PD();
            if (!var1.id_protected()) {
               ((rYB)this.id_throws[7]).id_class((an_3)null, this.rx(), this.re(), this.BO(), 6.0F, rRz_1.DESTROY);
            }

            this.id_break(var1);
         }

         return true;
      }
   }

   public boolean id_throws() {
      return this.BQ().id_class(id_protected);
   }

   public rfH_2 id_protected() {
      return this.BQ().id_class(id_break).orElse((rfH_2)null);
   }

   @Override
   public boolean rY() {
      return true;
   }

   @Override
   protected boolean PK() {
      return false;
   }

   @Override
   protected void m_() {
      this.BQ().id_class(id_break, Optional.empty());
      this.BQ().id_class(id_protected, true);
   }

   @Override
   public ruS_2<?> p_() {
      return new rFJ(this);
   }
}
