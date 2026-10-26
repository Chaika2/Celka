package celestial;

import java.nio.charset.StandardCharsets;
import java.util.EnumMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pg_1 extends Pv_1 implements PP {
   private static byte[] case_;
   private static boolean[] catch_;
   public Object[] break_;
   public static Object[] throws_;
   private static short[] private_;
   private static String[] implements_;

   private static void byte_() {
      implements_ = new String[]{new String("")};
   }

   public Pg_1(C_class var1) {
      super(var1);
      this.throws_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 810729399;
   }

   @Override
   public void class_(j_1 var1) {
      this.throws_();
      if (var1.class_() == (V)V.staticFields30e1cd8580ce39faa61be3646b7cc079[0]
         && (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[6]) {
         this.class_();

         try {
            rgP_2 var2 = ((cq_3)b_.class_[private_[3]]).implements_().protected_();
            if (var2 != null) {
               String var3 = var2.byte_();
               if (!rql_3.break_(var3)) {
                  Po_1 var4 = private_(var3);
                  if (var4 != null) {
                     this.break_[private_[4]] = var4;
                  }
               }
            }
         } catch (Exception var10) {
         }
      }
   }

   @Override
   public void class_(rrFK var1) {
      this.class_();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5696618919883330150L;
   }

   public void class_() {
      this.throws_();
      Object var5 = null;
      this.break_[0] = var5;
   }

   public Po_1 break_() {
      this.throws_();
      return (Po_1)this.break_[0];
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{112, -85, 12, -71, 84, 84, -84, 115}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void throws_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }

   private static void catch_() {
      case_ = new byte[]{2};
   }

   private static void case_() {
      catch_ = new boolean[]{true, false, true, true};
   }

   private static void protected_() {
      private_ = new short[]{0, 1, 6, 19, 0, 0, 0, 0, 0};
   }

   public static Po_1 private_(String var0) {
      if (rql_3.break_(var0)) {
         return null;
      } else {
         for (PK var2 : ((EnumMap)throws_[0]).keySet()) {
            Matcher var3 = ((Pattern)((EnumMap)throws_[0]).get(var2)).matcher(var0);
            if (var3.find()) {
               String var4 = var3.group(1);
               return new Po_1(var2, var4 != null ? var4 : implements_[0]);
            }
         }

         return null;
      }
   }

   private static void private_() {
      Object[] var0 = new Object[]{new PR(PK.class), new PY()};
      throws_ = var0;
   }
}
