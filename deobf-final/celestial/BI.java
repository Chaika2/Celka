package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BI extends Pv_1 {
   private static short[] byte_;
   private static boolean[] protected_;
   public Object[] break_;
   private static String[] throws_;
   private static byte[] case_;

   private static void byte_() {
      byte_ = new short[]{0, 1, 1, 2, 1, 4, 0, 1, 2, 3, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0};
   }

   private boolean byte_(String var1) {
      this.class_();
      Bt_1 var2 = ((Bw_1)this.break_[0]).class_(var1);
      if (var2 == null) {
         return false;
      } else {
         rja_3 var3 = null;
         if (var2 instanceof Bn_1 var4) {
            try {
               var3 = var4.break_(var1);
            } catch (Exception var6) {
               var6.printStackTrace();
               return false;
            }

            if (var3 == null) {
               return false;
            }

            var4.class_(var3);
         }

         var2.throws_(var1);
         if (var3 != null) {
            boolean var7 = ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).class_(var3);
            var2.protected_(this.class_(var2.throws_(), var7));
            if (((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).protected_(var2.throws_()) && var7) {
               return false;
            }
         }

         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0])
            .finally_()
            .class_(Bp_1.class_((Bq_1)Bq_1.staticFieldsc48d9c2a6a943f1684eec8a5f13e9034[1], var2, (BT)BT.staticFields10e8ecd1ac80321e9230ae9a938c7436[0]));
         return true;
      }
   }

   public BI(C_class var1) {
      super(var1);
      this.class_();
      Bf_1 var6 = new Bf_1();
      this.break_[0] = var6;
      ArrayList var7 = new ArrayList();
      this.break_[1] = var7;
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(q_1 var1) {
      this.class_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && !((List)this.break_[1]).isEmpty()) {
         for (String var3 : this.class_((List<String>)this.break_[1]).values()) {
            this.byte_(var3);
         }

         ((List)this.break_[1]).clear();
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1319939557;
   }

   static boolean class_(String var0, String[] var1) {
      for (String var5 : var1) {
         if (!var0.contains(var5)) {
            return false;
         }
      }

      return protected_[14];
   }

   private Map<Integer, String> class_(List<String> var1) {
      if (var1.size() == 1) {
         return Map.of(0, (String)var1.get(0));
      } else {
         HashMap var2 = new HashMap();
         int var3 = 0;

         for (String var5 : var1) {
            String var6;
            if (var2.get(var3) != null) {
               var6 = (String)var2.get(var3) + " " + var5;
            } else {
               var6 = var5;
            }

            if (var5.contains("Координаты:")) {
               var2.put(var3, var6);
               var3++;
            } else {
               var2.put(var3, var6);
            }
         }

         return var2;
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 765619834958450397L;
   }

   @Override
   public void class_(rrLO var1) {
      this.class_();
      if (var1.class_() == null
         && (
            (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
               || (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]
         )) {
         String var2 = var1.protected_();
         if (!this.byte_(var2)) {
            if (((Pattern)Bl_1.class_[0]).matcher(var2).find()
               || ((Pattern)Bl_1.class_[1]).matcher(var2).find()
               || ((Pattern)Bl_1.class_[2]).matcher(var2).find()
               || ((Pattern)Bl_1.class_[3]).matcher(var2).find()) {
               ((List)this.break_[1]).add(var2);
            }
         }
      }
   }

   private String class_(String var1, boolean var2) {
      String var3 = var1;
      int var4 = 1;

      while (((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).protected_(var3) && !var2) {
         var3 = String.format(var1 + " %d", ++var4);
      }

      return var3;
   }

   private void class_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-25, -83, 46, 23, -128, 57, 28, 17}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      case_ = new byte[]{2};
   }

   private static void throws_() {
      throws_ = new String[]{new String("Координаты:")};
   }

   private static void protected_() {
      protected_ = new boolean[]{false, false, false, false, true, true, true, false, true, false, false, false, false, false, true};
   }
}
