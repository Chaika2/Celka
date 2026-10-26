package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfp_3 implements MinecraftAccessor {
   private static boolean[] break_;
   private static short[] byte_;
   public static Object[] class_;
   private static String[] protected_;
   private static byte[] throws_;

   public static int byte_() {
      Aq_1 var0 = import_.void_();
      return (cb_3)import_.class_[57] != null && var0 != null && var0.class_(((cb_3)import_.class_[57]).ro()) != null
         ? var0.class_(((cb_3)import_.class_[57]).ro()).byte_()
         : break_[6];
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1922804324;
   }

   public static boolean class_(String... var0) {
      String var1 = import_.S() == null ? null : import_.S().break_;
      if (var1 == null) {
         return false;
      } else if (import_.finally_()) {
         return false;
      } else {
         for (String var5 : var0) {
            if (var1.contains(var5)) {
               return true;
            }
         }

         return break_[5];
      }
   }

   public static boolean class_(Aw_1 var0) {
      for (Aw_1 var2 : import_.void_().throws_()) {
         if (var2.class_().getName().equals(var0.class_().getName())) {
            return true;
         }
      }

      return break_[8];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -9178386518646645743L;
   }

   public static void class_(rrfq_3 var0, rud_3 var1) {
   }

   public static Aw_1 class_(String var0) {
      for (Aw_1 var2 : ((Aq_1)((cb_3)import_.class_[57]).break_[0]).throws_()) {
         if (var2.class_().getName().equalsIgnoreCase(var0)) {
            return var2;
         }
      }

      return null;
   }

   public static boolean class_() {
      return ((gm_3)import_.class_[56]).E().class_().break_().equals("world_spawn");
   }

   public static void break_(rrfq_3 var0, rud_3 var1) {
      if ((rrfq_3)class_[1] != var0) {
         class_[1] = var0;
         if ((rrfq_3)class_[1] != null) {
            class_(var0, var1);
         }
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{22, -122, -82, -82, 125, 68, -114, -114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrfq_3 break_() {
      for (rrfq_3 var3 : rrfq_3.values()) {
         if (class_(var3.class_())) {
            return var3;
         }
      }

      return null;
   }

   public static String throws_() {
      if (import_.finally_()) {
         return "localhost";
      } else {
         Ak_1 var0 = import_.S();
         return var0 == null ? null : var0.break_;
      }
   }

   private static void finally_() {
      byte_ = new short[]{57, 57, 57, 57, 0, 0, 57, 0, 56, 1, 1, 1, 2, 4};
   }

   private static void catch_() {
      Object[] var0 = new Object[2];
      class_ = var0;
   }

   private static void extends_() {
      protected_ = new String[]{
         new String("world_spawn"),
         new String("localhost"),
         new String("Via Version"),
         new String("Пожалуйста, используйте версию 1.16 для подключения к этому серверу")
      };
   }

   public static List<rrZk_1> case_() {
      Map var0 = ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).class_();
      if (var0.isEmpty()) {
         return Collections.emptyList();
      } else {
         ArrayList var1 = new ArrayList();

         for (Aw_1 var3 : ((Aq_1)((cb_3)import_.class_[57]).break_[0]).throws_()) {
            String var4 = var3.class_().getName().toLowerCase();
            rrZk_1 var5 = (rrZk_1)var0.get(var4);
            if (var5 != null) {
               var1.add(var5);
            }
         }

         return var1;
      }
   }

   private static void implements_() {
      throws_ = new byte[]{2};
   }

   public static String protected_() {
      return C_throws.byte_().continue_().byte_();
   }

   private static void private_() {
      break_ = new boolean[]{false, false, false, false, true, false, false, true, false};
   }
}
