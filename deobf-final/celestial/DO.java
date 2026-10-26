package celestial;

class DO {
   private final rqO_2 break_;

   public DO(DG var1, rqO_2 var2, xd_3 var3) {
      this.class_ = var1;
      this.break_ = Uh_1.abstract_.class_(var2, Do_1.new_(var3), var1.break_);
   }

   public DO class_(DD var1, xd_3... var2) {
      for (xd_3 var6 : var2) {
         var1.class_(DK.class_(var6.case_()), Do_1.new_(var6), this.class_.break_);
      }

      return this.class_(var2);
   }

   public DO class_(xd_3... var1) {
      for (xd_3 var5 : var1) {
         this.class_.class_.accept(DG.byte_(var5, this.break_));
      }

      return this;
   }

   public DO break_(xd_3... var1) {
      for (xd_3 var5 : var1) {
         this.class_.class_(var5);
      }

      return this.class_(var1);
   }
}
