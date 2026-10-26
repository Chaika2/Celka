package celestial;

import java.util.Random;

public abstract class rXs_1 {
   public static final rqE_2<rXE> byte_ = new rqE_2<>();
   protected final rCF<rXs_1, rXE> protected_;
   private rXE class_;

   protected abstract float byte_();

   public abstract boolean byte_(rXE var1);

   protected rXs_1() {
      rCL var1 = new rCL<>(this);
      this.class_(var1);
      this.protected_ = var1.class_(rXs_1::private_, rXE::new);
      this.case_(this.protected_.break_());
   }

   protected abstract boolean class_(rXE var1, rRq_1 var2, rfH_2 var3, rXs_1 var4, rpr_3 var5);

   protected abstract rjU_2 class_(rRq_1 var1, rfH_2 var2, rXE var3);

   public boolean class_(rXs_1 var1) {
      return var1 == this;
   }

   protected void class_(rCL<rXs_1, rXE> var1) {
   }

   public abstract float class_(rXE var1);

   public abstract float class_(rXE var1, rRq_1 var2, rfH_2 var3);

   public abstract int class_(rRR var1);

   public abstract rdb_3 class_();

   protected void class_(rYB var1, rfH_2 var2, rXE var3, Random var4) {
   }

   public boolean class_(rlb_3<rXs_1> var1) {
      return var1.class_(this);
   }

   protected void class_(rYB var1, rfH_2 var2, rXE var3) {
   }

   protected abstract xc_3 break_(rXE var1);

   public abstract rjC_2 break_(rXE var1, rRq_1 var2, rfH_2 var3);

   protected boolean break_() {
      return false;
   }

   protected void break_(rYB var1, rfH_2 var2, rXE var3, Random var4) {
   }

   protected boolean finally_() {
      return false;
   }

   public rCF<rXs_1, rXE> catch_() {
      return this.protected_;
   }

   protected final void case_(rXE var1) {
      this.class_ = var1;
   }

   protected rLx_1 implements_() {
      return null;
   }

   public abstract int protected_(rXE var1);

   public final rXE private_() {
      return this.class_;
   }
}
