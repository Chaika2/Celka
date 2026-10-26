package celestial;

class NR implements Nc_1<Nq_1> {
   public Nq_1 byte_() {
      NI var1 = this.byte_.class_.get(this.class_);
      if (var1 == null) {
         return Nf_1.class_;
      } else {
         Nq_1 var2 = var1.byte_();
         return new Nq_1(
            var2.byte_().toString(),
            var2.throws_() * this.break_.throws_(),
            var2.case_() * this.break_.case_(),
            this.break_.class_(),
            NT.FILE,
            var2.implements_() || this.break_.implements_(),
            var2.finally_(),
            var2.extends_()
         );
      }
   }

   NR(Ng_1 var1, rqO_2 var2, Nq_1 var3) {
      this.byte_ = var1;
      this.class_ = var2;
      this.break_ = var3;
   }

   @Override
   public int class_() {
      NI var1 = this.byte_.class_.get(this.class_);
      return var1 == null ? 0 : var1.class_();
   }

   @Override
   public void class_(Nt_1 var1) {
      NI var2 = this.byte_.class_.get(this.class_);
      if (var2 != null) {
         var2.class_(var1);
      }
   }
}
