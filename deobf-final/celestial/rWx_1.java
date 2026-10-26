package celestial;

public abstract class rWx_1 implements rkw_3<rXu_1> {
   protected final rkg_3 class_;
   protected final rdn_3 break_;
   private final rkj_3<?> throws_;
   private final rkf_3<?> case_;
   protected final rqO_2 byte_;
   protected final String protected_;

   @Override
   public rdn_3 byte_() {
      return this.break_;
   }

   public rWx_1(rkj_3<?> var1, rkf_3<?> var2, rqO_2 var3, String var4, rkg_3 var5, rdn_3 var6) {
      this.throws_ = var1;
      this.case_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.class_ = var5;
      this.break_ = var6;
   }

   @Override
   public rdn_3 class_(rXu_1 var1) {
      return this.break_.implements_();
   }

   @Override
   public rqs_3<rkg_3> class_() {
      rqs_3 var1 = rqs_3.class_();
      var1.add(this.class_);
      return var1;
   }

   @Override
   public boolean class_(int var1, int var2) {
      return true;
   }

   @Override
   public rkj_3<?> catch_() {
      return this.throws_;
   }

   @Override
   public rqO_2 case_() {
      return this.byte_;
   }

   @Override
   public String protected_() {
      return this.protected_;
   }

   @Override
   public rkf_3<?> W_() {
      return this.case_;
   }
}
