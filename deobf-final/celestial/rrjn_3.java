package celestial;

import com.viaversion.viaversion.ViaManagerImpl.ViaManagerBuilder;
import com.viaversion.viaversion.api.platform.providers.ViaProviders;
import com.viaversion.viaversion.libs.gson.JsonObject;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjn_3 {
   private static byte[] break_;
   public Object[] class_;
   private static short[] byte_;

   private static void byte_() {
      byte_ = new short[]{0, 0, 2, 0, 3, 0, 0, 1, 2, 3, 4, 5, 6, 7, 1, 2, 0, 1, 2, 3, 4, 5, 6, 7};
   }

   public rrjn_3 byte_(Consumer<rrjy_3> var1) {
      this.class_[7] = var1;
      return this;
   }

   public rrjn_3() {
      this.throws_();
      LinkedList var5 = new LinkedList();
      this.class_[0] = var5;
      ((LinkedList)this.class_[0]).add((rrjp_3)rrjA_2.break_[2]);
      ((LinkedList)this.class_[0]).add((rrjp_3)rrjA_2.break_[3]);
   }

   static {
      ntfClinit();
   }

   public rrjn_3 class_(rrjp_3 var1, int var2) {
      ((LinkedList)this.class_[0]).add(var2, var1);
      return this;
   }

   public void class_() {
      if (rrjA_2.protected_() == null) {
         if ((File)this.class_[1] != null && (Integer)this.class_[2] != null) {
            new rrjA_2(
               (LinkedList<rrjp_3>)this.class_[0],
               (File)this.class_[1],
               (Integer)this.class_[2],
               (BooleanSupplier)this.class_[3],
               (Supplier<JsonObject>)this.class_[4],
               (Consumer<ViaProviders>)this.class_[5],
               (Consumer<ViaManagerBuilder>)this.class_[6],
               (Consumer<rrjy_3>)this.class_[7]
            );
         }
      }
   }

   public rrjn_3 class_(Consumer<ViaProviders> var1) {
      this.class_[5] = var1;
      return this;
   }

   public rrjn_3 class_(Supplier<JsonObject> var1) {
      this.class_[4] = var1;
      return this;
   }

   public rrjn_3 class_(BooleanSupplier var1) {
      this.class_[3] = var1;
      return this;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8562656184232843067L;
   }

   public rrjn_3 class_(rrjp_3 var1) {
      ((LinkedList)this.class_[0]).add(var1);
      return this;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{111, 103, -36, 89, -71, -39, -86, -26}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrjn_3 class_(File var1) {
      this.class_[1] = var1;
      return this;
   }

   public rrjn_3 class_(int var1) {
      Integer var6 = var1;
      this.class_[2] = var6;
      return this;
   }

   public static rrjn_3 break_() {
      return new rrjn_3();
   }

   public rrjn_3 break_(Consumer<ViaManagerBuilder> var1) {
      this.class_[6] = var1;
      return this;
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1986053416;
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[8];
         Object[] var1 = this.class_;
      }
   }

   private static void protected_() {
      break_ = new byte[]{8};
   }
}
