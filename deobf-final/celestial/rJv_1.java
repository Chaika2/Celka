package celestial;

public class rJv_1 extends rJr_1 {
   private final rXu_1 class_;
   private final rpF_2 break_;

   public rJv_1(int var1) {
      this(var1, new rXA(1), new rpI_2(1));
   }

   public rJv_1(int var1, rXu_1 var2, rpF_2 var3) {
      super(rJP.new_, var1);
      class_(var2, 1);
      class_(var3, 1);
      this.class_ = var2;
      this.break_ = var3;
      this.break_(new rJF(this, var2, 0, 0, 0));
      this.class_(var3);
   }

   @Override
   public boolean class_(rhd_3 var1) {
      return this.class_.byte_(var1);
   }

   public rdn_3 class_() {
      return this.class_.extends_(0);
   }

   @Override
   public void class_(int var1, int var2) {
      super.class_(var1, var2);
      this.native_();
   }

   @Override
   public boolean break_(rhd_3 var1, int var2) {
      if (var2 >= 100) {
         int var6 = var2 - 100;
         this.class_(0, var6);
         return true;
      } else {
         switch (var2) {
            case 1:
               int var3 = this.break_.class_(0);
               this.class_(0, var3 - 1);
               return true;
            case 2:
               int var4 = this.break_.class_(0);
               this.class_(0, var4 + 1);
               return true;
            case 3:
               if (!var1.sD()) {
                  return false;
               }

               rdn_3 var5 = this.class_.native_(0);
               this.class_.break_();
               if (!((rhz_3)var1.implements_[1]).throws_(var5)) {
                  var1.class_(var5, false);
               }

               return true;
            default:
               return false;
         }
      }
   }

   public int break_() {
      return this.break_.class_(0);
   }
}
