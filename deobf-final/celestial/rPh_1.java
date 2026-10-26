package celestial;

public class rPh_1<E extends iB_2> extends rPm_1<E> {
   private boolean class_;
   private boolean byte_;
   private final rqb_3 protected_;
   private final rPm_1<? super E> throws_;
   private int case_;

   @Override
   protected void byte_(rrEm_1 var1, E var2, long var3) {
      this.throws_.byte_(var1, (E)var2, var3);
      this.byte_ = this.throws_.class_() == rPZ.RUNNING;
   }

   public rPh_1(rPm_1<? super E> var1, rqb_3 var2) {
      this(var1, false, var2);
   }

   public rPh_1(rPm_1<? super E> var1, boolean var2, rqb_3 var3) {
      super(var1.break_);
      this.throws_ = var1;
      this.class_ = !var2;
      this.protected_ = var3;
   }

   @Override
   public String toString() {
      return "RunSometimes: " + this.throws_;
   }

   @Override
   protected boolean class_(rrEm_1 var1, E var2) {
      if (!this.throws_.class_(var1, (E)var2)) {
         return false;
      } else {
         if (this.class_) {
            this.class_(var1);
            this.class_ = false;
         }

         if (this.case_ > 0) {
            this.case_--;
         }

         return !this.byte_ && this.case_ == 0;
      }
   }

   private void class_(rrEm_1 var1) {
      this.case_ = this.protected_.class_(var1.int_);
   }

   @Override
   protected boolean class_(long var1) {
      return false;
   }

   @Override
   protected boolean class_(rrEm_1 var1, E var2, long var3) {
      return this.throws_.class_(var1, (E)var2, var3);
   }

   @Override
   protected void break_(rrEm_1 var1, E var2, long var3) {
      this.class_(var1);
      this.throws_.break_(var1, (E)var2, var3);
   }

   @Override
   protected void protected_(rrEm_1 var1, E var2, long var3) {
      this.throws_.protected_(var1, (E)var2, var3);
   }
}
