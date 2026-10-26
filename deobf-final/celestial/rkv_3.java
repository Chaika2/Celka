package celestial;

public abstract class rkv_3 implements rkw_3<rXu_1> {
   protected final rkj_3<?> class_;
   protected final rqO_2 break_;
   protected final String byte_;
   protected final rkg_3 protected_;
   protected final rdn_3 throws_;
   protected final float case_;
   protected final int catch_;

   @Override
   public rdn_3 byte_() {
      return this.throws_;
   }

   public rkv_3(rkj_3<?> var1, rqO_2 var2, String var3, rkg_3 var4, rdn_3 var5, float var6, int var7) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
      this.case_ = var6;
      this.catch_ = var7;
   }

   @Override
   public boolean class_(int var1, int var2) {
      return true;
   }

   @Override
   public rqs_3<rkg_3> class_() {
      rqs_3 var1 = rqs_3.class_();
      var1.add(this.protected_);
      return var1;
   }

   @Override
   public boolean class_(rXu_1 var1, rYB var2) {
      return this.protected_.class_(var1.extends_(0));
   }

   @Override
   public rdn_3 class_(rXu_1 var1) {
      return this.throws_.implements_();
   }

   public float break_() {
      return this.case_;
   }

   public int throws_() {
      return this.catch_;
   }

   @Override
   public rkj_3<?> catch_() {
      return this.class_;
   }

   @Override
   public rqO_2 case_() {
      return this.break_;
   }

   @Override
   public String protected_() {
      return this.byte_;
   }
}
