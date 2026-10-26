package celestial;

class Fk_1 extends FJ {
   private final rLR id_throws;
   private final fj_3 id_case;
   private final boolean id_catch;
   private final rgP_2 id_private;

   public Fk_1(Fh_1 var1, int var2, int var3, rLR var4, boolean var5) {
      super(var2, var3);
      this.id_class = var1;
      this.id_throws = var4;
      this.id_case = QY.id_instanceof().id_abstract().id_class(var4);
      this.id_catch = var5;
      this.id_private = this.id_class(var4, var5);
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3) {
      this.id_class.id_class(var1, this.id_private, var2, var3);
   }

   @Override
   protected void id_class(Ml_1 var1) {
      QY.id_instanceof().A().id_class(this.id_case.id_extends().id_protected());
      id_class(var1, this.id_volatile + 2, this.id_final + 2, this.h_(), 18, 18, this.id_case);
   }

   private rgP_2 id_class(rLR var1, boolean var2) {
      rgn_3 var3 = new rgn_3(var1.id_byte());
      if (!var2 && var1 != rLD.id_finally) {
         var3.id_break(" II");
      }

      return var3;
   }

   @Override
   public void id_catch() {
      if (!this.id_private()) {
         if (this.id_catch) {
            this.id_class.id_implements = this.id_throws;
         } else {
            this.id_class.id_finally = this.id_throws;
         }

         Fh_1.id_private(this.id_class).clear();
         Fh_1.id_implements(this.id_class).clear();
         this.id_class.v_();
         this.id_class.id_private();
      }
   }
}
