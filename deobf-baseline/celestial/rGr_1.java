package celestial;

import java.util.Random;

public abstract class rGr_1 extends rEi_1 {
   private rfH_2 id_class;
   private boolean id_break;
   private boolean id_protected;

   protected rGr_1(aI_2<? extends rGr_1> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      if (var3 != iO_2.PATROL && var3 != iO_2.EVENT && var3 != iO_2.STRUCTURE && ((Random)this.id_throws[40]).nextFloat() < 0.06F && this.su()) {
         this.id_break = true;
      }

      if (this.sF()) {
         this.id_class(rXQ.HEAD, rrEr_1.id_new());
         this.id_class(rXQ.HEAD, 2.0F);
      }

      if (var3 == iO_2.PATROL) {
         this.id_protected = true;
      }

      return super.id_class(var1, var2, var3, var4, var5);
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      if (this.id_class != null) {
         var1.id_class("PatrolTarget", rco_3.id_class(this.id_class));
      }

      var1.id_class("PatrolLeader", this.id_break);
      var1.id_class("Patrolling", this.id_protected);
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      if (var1.id_throws("PatrolTarget")) {
         this.id_class = rco_3.id_break(var1.id_int("PatrolTarget"));
      }

      this.id_break = var1.id_new("PatrolLeader");
      this.id_protected = var1.id_new("Patrolling");
   }

   public static boolean id_break(aI_2<? extends rGr_1> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return var1.id_class(rRo_1.BLOCK, var3) > 8 ? false : id_byte(var0, var1, var2, var3, var4);
   }

   public boolean sv() {
      return this.id_class != null;
   }

   public void id_implements(rfH_2 var1) {
      this.id_class = var1;
      this.id_protected = true;
   }

   protected void id_return(boolean var1) {
      this.id_protected = var1;
   }

   @Override
   public boolean id_private(double var1) {
      return !this.id_protected || var1 > 16384.0;
   }

   @Override
   protected void id_final() {
      super.id_final();
      this.id_package.id_class(4, new rGP<>(this, 0.7, 0.595));
   }

   public void id_synchronized(boolean var1) {
      this.id_break = var1;
      this.id_protected = true;
   }

   @Override
   public double Pv() {
      return -0.45;
   }

   public boolean sJ() {
      return true;
   }

   public void sL() {
      this.id_class = this.Bs().id_break(-500 + ((Random)this.id_throws[40]).nextInt(1000), 0, -500 + ((Random)this.id_throws[40]).nextInt(1000));
      this.id_protected = true;
   }

   public boolean su() {
      return true;
   }

   public rfH_2 sZ() {
      return this.id_class;
   }

   public boolean sF() {
      return this.id_break;
   }

   protected boolean sA() {
      return this.id_protected;
   }
}
