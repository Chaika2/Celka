package celestial;

public class vA_2 extends vL_2 {
   private static final rgP_2 byte_ = new rgn_3("lanServer.title");
   private static final rgP_2 protected_ = new rgn_3("selectServer.hiddenAddress");
   private final vG_2 throws_;
   protected final QY class_;
   protected final AZ break_;
   private long case_;

   protected vA_2(vG_2 var1, AZ var2) {
      this.throws_ = var1;
      this.break_ = var2;
      this.class_ = QY.instanceof_();
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      ((cm_3)this.class_.class_[15]).byte_(var1, byte_, (float)(var4 + 32 + 3), (float)(var3 + 1), 16777215);
      ((cm_3)this.class_.class_[15]).break_(var1, this.break_.class_(), (float)(var4 + 32 + 3), (float)(var3 + 12), 8421504);
      if (((Qw_1)this.class_.class_[20]).package_) {
         ((cm_3)this.class_.class_[15]).byte_(var1, protected_, (float)(var4 + 32 + 3), (float)(var3 + 12 + 11), 3158064);
      } else {
         ((cm_3)this.class_.class_[15]).break_(var1, this.break_.break_(), (float)(var4 + 32 + 3), (float)(var3 + 12 + 11), 3158064);
      }
   }

   public AZ class_() {
      return this.break_;
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      this.throws_.class_(this);
      if (rqR_2.break_() - this.case_ < 250L) {
         this.throws_.finally_();
      }

      this.case_ = rqR_2.break_();
      return false;
   }
}
