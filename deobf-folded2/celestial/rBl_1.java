package celestial;

import java.util.EnumSet;

public class rBl_1 extends rBk_1 {
   protected final aA_2 id_class;
   private final double id_break;
   private final boolean id_byte;
   private rLC id_protected;
   private double id_throws;
   private double id_case;
   private double id_catch;
   private int id_private;
   private int id_implements;
   private final int id_finally = 20;
   private long id_extends;

   @Override
   public void id_byte() {
      this.id_class.id_public().id_class(this.id_protected, this.id_break);
      this.id_class.id_case(true);
      this.id_private = 0;
      this.id_implements = 0;
   }

   public rBl_1(aA_2 var1, double var2, boolean var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var4;
      this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
   }

   protected double id_class(iB_2 var1) {
      return (double)(this.id_class.PN() * 2.0F * this.id_class.PN() * 2.0F + var1.PN());
   }

   protected void id_class(iB_2 var1, double var2) {
      double var4 = this.id_class(var1);
      if (var2 <= var4 && this.id_implements <= 0) {
         this.id_catch();
         this.id_class.id_class(rpm_3.MAIN_HAND);
         this.id_class.id_public(var1);
      }
   }

   @Override
   public boolean id_class() {
      long var1 = ((rYB)this.id_class.id_throws[7]).r();
      if (var1 - this.id_extends < 20L) {
         return false;
      } else {
         this.id_extends = var1;
         iB_2 var3 = this.id_class.I_();
         if (var3 == null) {
            return false;
         } else if (!var3.BM()) {
            return false;
         } else {
            this.id_protected = this.id_class.id_public().id_class(var3, 0);
            return this.id_protected != null ? true : this.id_class(var3) >= this.id_class.id_class(var3.rx(), var3.re(), var3.BO());
         }
      }
   }

   @Override
   public boolean id_break() {
      iB_2 var1 = this.id_class.I_();
      if (var1 == null) {
         return false;
      } else if (!var1.BM()) {
         return false;
      } else if (!this.id_byte) {
         return !this.id_class.id_public().id_native();
      } else {
         return !this.id_class.id_private(var1.Bs()) ? false : !(var1 instanceof rhd_3) || !var1.id_native() && !((rhd_3)var1).id_implements();
      }
   }

   @Override
   public void id_throws() {
      iB_2 var1 = this.id_class.I_();
      this.id_class.id_continue().id_class(var1, 30.0F, 30.0F);
      double var2 = this.id_class.id_class(var1.rx(), var1.re(), var1.BO());
      this.id_private = Math.max(this.id_private - 1, 0);
      if ((this.id_byte || this.id_class.id_goto().id_class(var1))
         && this.id_private <= 0
         && (
            this.id_throws == 0.0 && this.id_case == 0.0 && this.id_catch == 0.0
               || var1.id_class(this.id_throws, this.id_case, this.id_catch) >= 1.0
               || this.id_class.Sa().nextFloat() < 0.05F
         )) {
         this.id_throws = var1.rx();
         this.id_case = var1.re();
         this.id_catch = var1.BO();
         this.id_private = 4 + this.id_class.Sa().nextInt(7);
         if (var2 > 1024.0) {
            this.id_private += 10;
         } else if (var2 > 256.0) {
            this.id_private += 5;
         }

         if (!this.id_class.id_public().id_class(var1, this.id_break)) {
            this.id_private += 15;
         }
      }

      this.id_implements = Math.max(this.id_implements - 1, 0);
      this.id_class(var1, var2);
   }

   protected int id_finally() {
      return this.id_implements;
   }

   protected void id_catch() {
      this.id_implements = 20;
   }

   protected int id_extends() {
      return 20;
   }

   @Override
   public void id_protected() {
      iB_2 var1 = this.id_class.I_();
      if (!rpJ_2.id_throws.test(var1)) {
         this.id_class.id_byte((iB_2)null);
      }

      this.id_class.id_case(false);
      this.id_class.id_public().id_final();
   }

   protected boolean id_private() {
      return this.id_implements <= 0;
   }
}
