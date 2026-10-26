package celestial;

class rEl_1 extends rGt_1 {
   private final ay_3 id_throws;

   rEl_1(rEA var1) {
      super(var1);
      this.id_class = var1;
      this.id_throws = new ay_3().id_class(16.0).id_byte().id_throws().id_class().id_break();
   }

   @Override
   public boolean id_class() {
      if (!super.id_class()) {
         return false;
      } else {
         int var1 = ((rYB)this.id_class.id_throws[7]).id_class(rGg_1.class, this.id_throws, this.id_class, this.id_class.rN().id_class(16.0)).size();
         return rEA.id_class(this.id_class).nextInt(8) + 1 > var1;
      }
   }

   @Override
   protected void id_finally() {
      rrEm_1 var1 = (rrEm_1)((rYB)this.id_class.id_throws[7]);

      for (int var2 = 0; var2 < 3; var2++) {
         rfH_2 var3 = this.id_class.Bs().id_break(-2 + rEA.id_break(this.id_class).nextInt(5), 1, -2 + rEA.id_byte(this.id_class).nextInt(5));
         rGg_1 var4 = aI_2.K.id_class((rYB)this.id_class.id_throws[7]);
         var4.id_class(var3, 0.0F, 0.0F);
         var4.id_class(var1, ((rYB)this.id_class.id_throws[7]).id_throws(var3), iO_2.MOB_SUMMONED, (aU_2)null, (rcd_3)null);
         var4.id_class(this.id_class);
         var4.id_implements(var3);
         var4.id_class(20 * (30 + rEA.id_protected(this.id_class).nextInt(90)));
         var1.id_class(var4);
      }
   }

   @Override
   protected int id_catch() {
      return 100;
   }

   @Override
   protected rqA_2 id_extends() {
      return rqn_3.Bi;
   }

   @Override
   protected int id_private() {
      return 340;
   }

   @Override
   protected rGT id_native() {
      return rGT.SUMMON_VEX;
   }
}
