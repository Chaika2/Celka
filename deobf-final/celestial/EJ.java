package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EJ implements F {
   public Object[] class_;
   private static String[] break_;
   private static boolean[] byte_;
   private static short[] protected_;
   private static byte[] throws_;

   @Override
   public Stream<String> byte_(String var1) {
      rqj_3 var2 = class_(var1, true);
      String var3 = (String)var2.class_();
      List var4 = (List)var2.break_();
      return var4.isEmpty() ? new v_1().class_(((C_class)this.class_[1]).S()).class_(var3).protected_() : this.class_(var2);
   }

   private static void byte_() {
      byte_ = new boolean[]{true, false, true, false, false};
   }

   private Ex_1 byte_(rqj_3<String, List<C_import>> var1) {
      String var2 = (String)var1.class_();
      sS_2 var3 = new sS_2(this, (List<C_import>)var1.break_());
      C_interface var4 = this.break_(var2);
      return var4 == null ? null : new Ex_1(var4, var2, var3);
   }

   public EJ(C_class var1) {
      this.protected_();
      L var6 = new L();
      this.class_[0] = var6;
      this.class_[1] = var1;
      sz_3.class_(var1).forEach(((L)this.class_[0])::break_);
   }

   static {
      ntfClinit();
   }

   @Override
   public L<C_interface> class_() {
      return (L<C_interface>)this.class_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7227880040710539243L;
   }

   private static rqj_3<String, List<C_import>> class_(String var0, boolean var1) {
      String var2 = var0.split("\\s", 2)[0];
      List var3 = sG_2.class_(var0.substring(var2.length()), var1);
      return new rqj_3<>(var2, var3);
   }

   @Override
   public Stream<String> class_(rqj_3<String, List<C_import>> var1) {
      Ex_1 var2 = this.byte_(var1);
      return var2 == null ? Stream.empty() : var2.protected_();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1858070598;
   }

   @Override
   public boolean class_(String var1) {
      return this.break_(throws_(var1));
   }

   @Override
   public C_interface break_(String var1) {
      for (C_interface var3 : (Collection)((L)this.class_[0]).class_[2]) {
         if (var3.break_().contains(var1.toLowerCase(Locale.US))) {
            return var3;
         }
      }

      return null;
   }

   @Override
   public C_case break_() {
      return (C_class)this.class_[1];
   }

   @Override
   public boolean break_(rqj_3<String, List<C_import>> var1) {
      Ex_1 var2 = this.byte_(var1);
      if (var2 != null) {
         var2.case_();
      }

      return var2 != null ? true : byte_[1];
   }

   public static rqj_3<String, List<C_import>> throws_(String var0) {
      return class_(var0, false);
   }

   private static void throws_() {
      throws_ = new byte[]{2, 2};
   }

   private static void catch_() {
      protected_ = new short[]{0, 1, 0, 1, 0, 0, 2, 1};
   }

   private static void case_() {
      break_ = new String[]{new String("\\s")};
   }

   public static String protected_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-49, 42, 38, -83, 100, -78, 126, -13}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }
}
