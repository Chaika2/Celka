package celestial;

class rET extends rPY {
   private final rEy_1 id_implements;
   private int id_finally;

   public rET(rEy_1 var1) {
      super(var1);
      this.id_implements = var1;
   }

   @Override
   public void id_class() {
      if (this.id_private == rPo_1.MOVE_TO && this.id_finally-- <= 0) {
         this.id_finally = this.id_finally + this.id_implements.Sa().nextInt(5) + 2;
         rjU_2 var1 = new rjU_2(this.id_break - this.id_implements.rx(), this.id_byte - this.id_implements.re(), this.id_protected - this.id_implements.BO());
         double var2 = var1.id_case();
         var1 = var1.id_protected();
         if (this.id_class(var1, rfU_2.id_throws(var2))) {
            this.id_implements.id_byte(this.id_implements.rv().id_throws(var1.id_class(0.1)));
         } else {
            this.id_private = rPo_1.WAIT;
         }
      }
   }

   private boolean id_class(rjU_2 var1, int var2) {
      rfl_3 var3 = this.id_implements.rN();

      for (int var4 = 1; var4 < var2; var4++) {
         var3 = var3.id_protected(var1);
         if (!((rYB)this.id_implements.id_throws[7]).a_(this.id_implements, var3)) {
            return false;
         }
      }

      return true;
   }
}
