package celestial;

import java.util.function.Predicate;

public class roQ_2 {
   private static final rVE<xc_3> break_ = new rVb_1<>(xd_3.char_, xu_3.class_.continue_());
   private final int byte_;
   private short protected_;
   private short throws_;
   private short case_;
   private final rVM<xc_3> catch_;
   public static final ThreadLocal<rrbB_2> class_ = new ThreadLocal<>();

   public boolean byte_() {
      return this.protected_ == 0;
   }

   public roQ_2(int var1) {
      this(var1, (short)0, (short)0, (short)0);
   }

   public roQ_2(int var1, short var2, short var3, short var4) {
      this.byte_ = var1;
      this.protected_ = var2;
      this.throws_ = var3;
      this.case_ = var4;
      this.catch_ = new rVM<>(break_, xd_3.char_, rco_3::byte_, rco_3::class_, xu_3.class_.continue_());
   }

   public static boolean class_(roQ_2 var0) {
      return var0 == roJ_2.class_ || var0.byte_();
   }

   public xc_3 class_(int var1, int var2, int var3) {
      return this.catch_.class_(var1, var2, var3);
   }

   public void class_(ruu_3 var1) {
      this.protected_ = var1.readShort();
      this.catch_.class_(var1);
   }

   public boolean class_(Predicate<xc_3> var1) {
      return this.catch_.class_(var1);
   }

   public void class_() {
      this.catch_.class_();
   }

   public xc_3 class_(int var1, int var2, int var3, xc_3 var4, boolean var5) {
      xc_3 var6;
      if (var5) {
         var6 = this.catch_.class_(var1, var2, var3, var4);
      } else {
         var6 = this.catch_.break_(var1, var2, var3, var4);
      }

      rXE var7 = var6.volatile_();
      rXE var8 = var4.volatile_();
      if (!var6.catch_()) {
         this.protected_--;
         if (var6.final_()) {
            this.throws_--;
         }
      }

      if (!var7.byte_()) {
         this.case_--;
      }

      if (!var4.catch_()) {
         this.protected_++;
         if (var4.final_()) {
            this.throws_++;
         }
      }

      if (!var8.byte_()) {
         this.case_++;
      }

      return var6;
   }

   public xc_3 class_(int var1, int var2, int var3, xc_3 var4) {
      return this.class_(var1, var2, var3, var4, true);
   }

   public rXE break_(int var1, int var2, int var3) {
      return this.catch_.class_(var1, var2, var3).volatile_();
   }

   public void break_() {
      this.catch_.break_();
   }

   public void break_(ruu_3 var1) {
      var1.writeShort(this.protected_);
      this.catch_.break_(var1);
   }

   public boolean throws_() {
      return this.throws_ > 0;
   }

   public int finally_() {
      return 2 + this.catch_.byte_();
   }

   public int catch_() {
      return this.byte_;
   }

   public short extends_() {
      return this.protected_;
   }

   public boolean case_() {
      return this.case_ > 0;
   }

   public rVM<xc_3> implements_() {
      return this.catch_;
   }

   public boolean protected_() {
      return this.throws_() || this.case_();
   }

   public void private_() {
      rrbB_2 var1 = class_.get();
      if (var1 != null) {
         rrbE_2[] var2 = var1.class_();
         if (var2 != null) {
            int var3 = this.byte_ >> 4;
            if (var3 >= 0 && var3 < var2.length) {
               rrbE_2 var4 = var2[var3];
               if (var4 != null) {
                  this.protected_ = var4.class_();
                  this.throws_ = var4.break_();
                  this.case_ = var4.byte_();
                  var2[var3] = null;
                  return;
               }
            }
         }
      }

      this.protected_ = 0;
      this.throws_ = 0;
      this.case_ = 0;
      this.catch_.class_((var1x, var2x) -> {
         rXE var3x = var1x.volatile_();
         if (!var1x.catch_()) {
            this.protected_ = (short)(this.protected_ + var2x);
            if (var1x.final_()) {
               this.throws_ = (short)(this.throws_ + var2x);
            }
         }

         if (!var3x.byte_()) {
            this.protected_ = (short)(this.protected_ + var2x);
            if (var3x.case_()) {
               this.case_ = (short)(this.case_ + var2x);
            }
         }
      });
   }

   public short volatile_() {
      return this.case_;
   }

   public short native_() {
      return this.throws_;
   }
}
