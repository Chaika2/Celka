package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtu_3 {
   private static boolean[] break_;
   private static byte[] byte_;
   public Object[] class_;
   private static short[] protected_;

   public void byte_(int var1, int var2, int var3) {
      for (rrtN_2 var5 : (List)this.class_[0]) {
         if (var5.aq_()) {
            var5.break_(var1, var2, var3);

            for (rrtm_3 var7 : var5.strictfp_()) {
               var7.class_(var1, var2, var3);
            }
         }
      }
   }

   public static rrtu_3[] byte_() {
      return new rrtu_3[]{(rrtu_3)ClickGuiScreen.class_[1], (rrtu_3)rrvV.break_[0]};
   }

   public rrtu_3() {
      this.native_();
      CopyOnWriteArrayList var5 = new CopyOnWriteArrayList();
      this.class_[0] = var5;
   }

   static {
      ntfClinit();
   }

   public void class_(char var1, int var2) {
      for (rrtN_2 var4 : (List)this.class_[0]) {
         if (var4.aq_()) {
            var4.class_(var1, var2);

            for (rrtm_3 var6 : var4.strictfp_()) {
               var6.class_(var1, var2);
            }
         }
      }
   }

   public void class_(Ml_1 var1, int var2, int var3, boolean var4) {
      if (this.case_()) {
         rrwb_3.class_(var1, this, MinecraftAccessor.const_.volatile_(), MinecraftAccessor.const_.final_());
      }

      for (rrtN_2 var6 : (List)this.class_[0]) {
         this.class_(var6, !var4 ? true : break_[1]);
         var6.boolean_();
         if (!var6.aq_()) {
            if (var6.protected_()) {
               var6.at_();
               ((List)this.class_[0]).remove(var6);
            }

            var6.for_();
         } else {
            var1.class_();
            RenderSystem.enableAlphaTest();
            var6.class_(var1, this, var2, var3, var4);
            RenderSystem.disableAlphaTest();
            var1.break_();
            var6.break_(var1, this, var2, var3, var4);
         }
      }

      rrwb_3.class_(var1, this);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1879580524;
   }

   public void class_(rrtN_2 var1, boolean var2) {
      if (var2) {
         var1.as_();
      }
   }

   public void class_(rrtN_2 var1, Runnable var2) {
      ((List)this.class_[0]).add(var1);
      var2.run();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 9065764500841392458L;
   }

   public void class_(rrtN_2... var1) {
      ((List)this.class_[0]).addAll(Arrays.asList(var1));
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-58, -28, -95, -56, 83, 100, -95, 86}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public List<rrtN_2> class_() {
      return (List<rrtN_2>)this.class_[0];
   }

   public void class_(int var1, int var2, int var3) {
      for (rrtN_2 var5 : (List)this.class_[0]) {
         if (var5.aq_()) {
            var5.class_(var1, var2, var3);

            for (rrtm_3 var7 : var5.strictfp_()) {
               var7.break_(var1, var2, var3);
            }
         }
      }
   }

   public void class_(rrtN_2 var1) {
      ((List)this.class_[0]).add(var1);
      var1.class_(this);
   }

   public boolean class_(rrtN_2 var1, int var2, int var3) {
      List var4 = this.class_();

      for (rrtN_2 var6 : var4) {
         if (var6 != var1 && var6.aq_()) {
            if (var6.class_(var2, var3)) {
               return var6.class_(var4) > var1.class_(var4) ? true : break_[14];
            }

            for (rrtm_3 var8 : var6.strictfp_()) {
               if (var8.implements_()) {
                  return true;
               }
            }
         }
      }

      return break_[16];
   }

   public static boolean class_(rrtu_3 var0, int var1, int var2) {
      if (var0 == null) {
         return false;
      } else {
         for (rrtN_2 var4 : var0.class_()) {
            if (var4.aq_() && var4.class_(var1, var2)) {
               return true;
            }
         }

         return break_[12];
      }
   }

   public void class_(int var1, int var2, int var3, boolean var4, boolean var5) {
      for (int var6 = ((List)this.class_[0]).size() - 1; var6 >= 0; var6--) {
         rrtN_2 var7 = (rrtN_2)((List)this.class_[0]).get(var6);
         if (var7.aq_()) {
            for (rrtm_3 var9 : var7.strictfp_()) {
               if (!rrtm_3.class_(var9, var7) && (!var9.volatile_().break_((float)var1, (float)var2) || !var7.break_(this, var1, var2))) {
                  var9.class_(this, var1, var2, var3);
               }
            }
         }
      }

      for (int var10 = ((List)this.class_[0]).size() - 1; var10 >= 0; var10--) {
         rrtN_2 var12 = (rrtN_2)((List)this.class_[0]).get(var10);
         if (var12.aq_() && var12.class_(var1, var2)) {
            var12.class_(this, var1, var2, var3, var4, var5);
            break;
         }
      }

      for (int var11 = ((List)this.class_[0]).size() - 1; var11 >= 0; var11--) {
         rrtN_2 var13 = (rrtN_2)((List)this.class_[0]).get(var11);
         if (var13.aq_() && var13.float_().case_() && !var13.break_(this, var1, var2)) {
            var13.break_(this, var1, var2, var3, var4, var5);
         }
      }
   }

   public boolean class_(rrtu_3 var1, int var2, int var3, double var4, boolean var6, boolean var7) {
      for (int var8 = ((List)this.class_[0]).size() - 1; var8 >= 0; var8--) {
         rrtN_2 var9 = (rrtN_2)((List)this.class_[0]).get(var8);
         if (var9.aq_() && var9.class_(this, var2, var3, var4, var6, var7)) {
            return true;
         }
      }

      return break_[7];
   }

   public void break_() {
      for (rrtN_2 var2 : (List)this.class_[0]) {
         if (var2.aq_()) {
            var2.r();

            for (rrtm_3 var4 : var2.strictfp_()) {
               var4.extends_();
            }
         }
      }
   }

   public void break_(rrtN_2 var1) {
      ((List)this.class_[0]).add(var1);
   }

   public void break_(int var1, int var2, int var3) {
      for (rrtN_2 var5 : (List)this.class_[0]) {
         if (var5.aq_()) {
            var5.byte_(var1, var2, var3);

            for (rrtm_3 var7 : var5.strictfp_()) {
               var7.byte_(var1, var2, var3);
            }
         }
      }
   }

   public void throws_() {
      for (rrtN_2 var2 : (List)this.class_[0]) {
         var2.char_();
      }
   }

   private static void finally_() {
      protected_ = new short[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0};
   }

   public void catch_() {
      for (rrtN_2 var2 : (List)this.class_[0]) {
         if (var2.aq_()) {
            var2.private_();
            var2.short_().protected_();

            for (rrtm_3 var4 : var2.strictfp_()) {
               var4.case_();
            }
         }
      }
   }

   private static void extends_() {
      break_ = new boolean[]{
         true, false, true, true, true, true, true, false, true, false, false, true, false, true, false, true, false, false, false, true, true
      };
   }

   public boolean case_() {
      for (rrtN_2 var2 : (List)this.class_[0]) {
         if (var2 instanceof rrvj_1 && var2.short_().catch_()) {
            return true;
         }
      }

      return break_[9];
   }

   private static void implements_() {
      byte_ = new byte[]{2};
   }

   public static void protected_() {
      for (rrtu_3 var3 : byte_()) {
         for (rrtN_2 var5 : var3.class_()) {
            var5.instanceof_();
         }
      }
   }

   public void private_() {
      for (rrtN_2 var2 : (List)this.class_[0]) {
         if (var2.aq_()) {
            var2.void_();

            for (rrtm_3 var4 : var2.strictfp_()) {
               var4.else_();
            }
         }
      }
   }

   private void native_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }
}
