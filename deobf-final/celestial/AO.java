package celestial;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.function.BooleanSupplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AO extends roX_2 {
   private static final Logger class_ = LogManager.getLogger();
   private final roJ_2 break_;
   private final rrse_3 byte_;
   private volatile Ah_1 protected_;
   final gm_3 throws_;

   @Override
   public String byte_() {
      return "Client Chunk Cache: " + this.protected_.break_.length() + ", " + this.protected_();
   }

   @Override
   public boolean byte_(int var1, int var2) {
      return this.case_(var1 >> 4, var2 >> 4);
   }

   public AO(gm_3 var1, int var2) {
      this.throws_ = var1;
      this.break_ = new ron_3(var1, new rfj_3(0, 0));
      this.byte_ = new rrse_3(this, true, var1.default_().break_());
      this.protected_ = new Ah_1(this, break_(var2));
   }

   @Override
   public boolean class_(rfH_2 var1) {
      return this.case_(var1.b_() >> 4, var1.d_() >> 4);
   }

   @Override
   public void class_(rRo_1 var1, rjh_3 var2) {
      ((yX_2)QY.instanceof_().class_[8]).break_(var2.break_(), var2.byte_(), var2.protected_());
   }

   public void class_(int var1, int var2) {
      if (this.protected_.break_(var1, var2)) {
         int var3 = this.protected_.class_(var1, var2);
         roJ_2 var4 = this.protected_.class_(var3);
         if (class_(var4, var1, var2)) {
            var4.class_(false);
            this.protected_.class_(var3, var4, (roJ_2)null);
         }
      }
   }

   private static boolean class_(roJ_2 var0, int var1, int var2) {
      if (var0 == null) {
         return false;
      } else {
         rfj_3 var3 = var0.private_();
         return var3.break_ == var1 && var3.byte_ == var2;
      }
   }

   @Override
   public boolean class_(rfj_3 var1) {
      return this.case_(var1.break_, var1.byte_);
   }

   @Override
   public rrse_3 class_() {
      return this.byte_;
   }

   @Override
   public boolean class_(an_3 var1) {
      return this.case_(rfU_2.byte_(var1.rx()) >> 4, rfU_2.byte_(var1.BO()) >> 4);
   }

   public roJ_2 class_(int var1, int var2, rYZ var3, ruu_3 var4, rcd_3 var5, int var6, boolean var7) {
      if (!this.protected_.break_(var1, var2)) {
         class_.warn("Ignoring chunk since it's not in the view range: {}, {}", var1, var2);
         return null;
      } else {
         int var8 = this.protected_.class_(var1, var2);
         Object var9 = this.protected_.break_.get(var8);
         if (!var7 && class_((roJ_2)var9, var1, var2)) {
            boolean var10 = false;
            if (var9 instanceof rrbS_2 var11 && var4.break_("ChunkDataOF") instanceof rrbB_2 var13) {
               var11.class_(var13);
               roQ_2.class_.set(var13);
               var10 = true;
            }

            ((roJ_2)var9).class_(var3, var4, var5, var6);
            if (var10) {
               roQ_2.class_.set((rrbB_2)null);
            }
         } else {
            if (var3 == null) {
               class_.warn("Ignoring chunk since we don't have complete data: {}, {}", var1, var2);
               return null;
            }

            if (var9 != null) {
               ((roJ_2)var9).class_(false);
            }

            var9 = new rrbS_2(this.throws_, new rfj_3(var1, var2), var3);
            ((roJ_2)var9).class_(var3, var4, var5, var6);
            this.protected_.class_(var8, (roJ_2)var9);
         }

         roQ_2[] var14 = ((roJ_2)var9).byte_();
         rrse_3 var15 = this.class_();
         var15.class_(new rfj_3(var1, var2), true);

         for (int var16 = 0; var16 < var14.length; var16++) {
            roQ_2 var17 = var14[var16];
            var15.class_(rjh_3.class_(var1, var16, var2), roQ_2.class_(var17));
         }

         this.throws_.class_(var1, var2);
         ((roJ_2)var9).class_(true);
         return (roJ_2)var9;
      }
   }

   public roJ_2 class_(int var1, int var2, roN_2 var3, boolean var4) {
      if (this.protected_.break_(var1, var2)) {
         roJ_2 var5 = this.protected_.class_(this.protected_.class_(var1, var2));
         if (class_(var5, var1, var2)) {
            return var5;
         }
      }

      return var4 ? this.break_ : null;
   }

   public void class_(int var1) {
      int var2 = this.protected_.byte_;
      int var3 = break_(var1);
      if (var2 != var3) {
         Ah_1 var4 = new Ah_1(this, var3);
         var4.throws_ = this.protected_.throws_;
         var4.case_ = this.protected_.case_;

         for (int var5 = 0; var5 < this.protected_.break_.length(); var5++) {
            roJ_2 var6 = this.protected_.break_.get(var5);
            if (var6 != null) {
               rfj_3 var7 = var6.private_();
               if (var4.break_(var7.break_, var7.byte_)) {
                  var4.class_(var4.class_(var7.break_, var7.byte_), var6);
               }
            }
         }

         this.protected_ = var4;
      }
   }

   public void class_(BooleanSupplier var1) {
   }

   @Override
   public rRq_1 break_() {
      return this.throws_;
   }

   public void break_(int var1, int var2) {
      this.protected_.throws_ = var1;
      this.protected_.case_ = var2;
   }

   private static int break_(int var0) {
      return Math.max(2, var0) + 3;
   }

   public AO throws_() {
      Ah_1 var1 = this.case_();
      AO var2 = new AO(this.throws_, var1.byte_() - 3);
      Ah_1 var3 = var2.case_();
      var3.class_(var1);
      if (var3.byte_() != var1.byte_()) {
         throw new IllegalStateException(var3.byte_() + " " + var1.byte_());
      } else {
         return var2;
      }
   }

   public Ah_1 case_() {
      for (Field var4 : AO.class.getDeclaredFields()) {
         if (Ah_1.class.isAssignableFrom(var4.getType())) {
            try {
               return (Ah_1)var4.get(this);
            } catch (IllegalAccessException var6) {
               throw new RuntimeException(var6);
            }
         }
      }

      throw new RuntimeException(Arrays.toString((Object[])AO.class.getDeclaredFields()));
   }

   public int protected_() {
      return this.protected_.catch_;
   }
}
