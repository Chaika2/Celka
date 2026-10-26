package celestial;

public class yx_3 {
   public final yQ_2 class_;
   rpr_3 break_;
   int byte_;
   int protected_;

   public yx_3(yQ_2 var1, rpr_3 var2, int var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   void class_(rpr_3 var1, int var2, int var3) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
   }

   public boolean class_(rpr_3 var1) {
      return (this.byte_ & 1 << var1.ordinal()) > 0;
   }

   public void class_(byte var1, rpr_3 var2) {
      this.byte_ = this.byte_ | var1 | 1 << this.break_.ordinal();
   }
}
