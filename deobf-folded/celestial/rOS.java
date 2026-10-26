package celestial;

class rOS extends rPY {
   private final rMi_1 id_implements;
   private double id_finally;

   public rOS(rMi_1 var1) {
      super(var1);
      this.id_implements = var1;
   }

   @Override
   public void id_class() {
      if (rMi_1.id_class(this.id_implements) && !rMi_1.id_break(this.id_implements) && !((rOB)rMi_1.id_byte(this.id_implements)).id_byte()) {
         this.id_implements.id_implements(0.0);
      } else if (this.id_break()) {
         this.id_implements.id_implements(this.id_finally);
      }

      super.id_class();
   }

   @Override
   public void id_class(double var1, double var3, double var5, double var7) {
      if (this.id_implements.rT()) {
         var7 = 1.5;
      }

      super.id_class(var1, var3, var5, var7);
      if (var7 > 0.0) {
         this.id_finally = var7;
      }
   }
}
