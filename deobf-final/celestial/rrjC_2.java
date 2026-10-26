package celestial;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjC_2 {
   private static short[] byte_;
   private static String[] protected_;
   private static byte[] throws_;
   private static boolean[] case_;
   public static Object[] class_;
   public Object[] break_;

   public rrjH_2 byte_() {
      return (rrjH_2)this.break_[1];
   }

   public rrjC_2() {
      this.finally_();
      rrjn_3.break_().class_(new File("ViaVersion")).class_(754).class_();
      List var1 = ProtocolVersion.getProtocols()
         .stream()
         .filter(var0 -> var0.getVersion() != 47 && var0.getVersion() < 107 ? case_[2] : case_[1])
         .sorted((var0, var1x) -> Integer.compare(var1x.getVersion(), var0.getVersion()))
         .toList();
      ArrayList var6 = new ArrayList(var1.size() + 1);
      this.break_[0] = var6;
      ((List)this.break_[0]).addAll(var1);
   }

   static {
      ntfClinit();
   }

   public void class_(List<ProtocolVersion> var1) {
      this.class_(var1, 5, 5, 110, 20);
   }

   public void class_(List<ProtocolVersion> var1, int var2, int var3, int var4, int var5) {
      rrjH_2 var10 = new rrjH_2(var1, var2, var3, Math.max(var4, 110), var5);
      this.break_[1] = var10;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8816671734484610161L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-85, -124, -80, -52, 71, -114, -34, 96}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public List<ProtocolVersion> class_() {
      return (List<ProtocolVersion>)this.break_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2103792258;
   }

   public static void break_() {
      if ((rrjC_2)class_[1] == null) {
         rrjC_2 var4 = new rrjC_2();
         class_[1] = var4;
      }
   }

   private static void throws_() {
      throws_ = new byte[]{5, 5, 110, 20, 110, 47, 107, 2, 2};
   }

   private void finally_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }

   private static void catch_() {
      Object[] var0 = new Object[]{754, null};
      class_ = var0;
   }

   private static void case_() {
      case_ = new boolean[]{true, true, false, false};
   }

   private static void implements_() {
      protected_ = new String[]{new String("ViaVersion")};
   }

   public static rrjC_2 protected_() {
      return (rrjC_2)class_[1];
   }

   private static void private_() {
      byte_ = new short[]{754, 0, 0, 1, 1, 1, 1, 0, 1, 754};
   }
}
