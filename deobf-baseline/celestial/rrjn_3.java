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
   private static byte[] id_break;
   public Object[] id_class;
   private static short[] id_byte;

   private static void id_byte() {
      id_byte = new short[]{0, 0, 2, 0, 3, 0, 0, 1, 2, 3, 4, 5, 6, 7, 1, 2, 0, 1, 2, 3, 4, 5, 6, 7};
   }

   public rrjn_3 id_byte(Consumer<rrjy_3> var1) {
      this.id_class[id_byte[13]] = var1;
      return this;
   }

   public rrjn_3() {
      this.id_throws();
      LinkedList var5 = new LinkedList();
      this.id_class[id_byte[0]] = var5;
      ((LinkedList)this.id_class[id_byte[1]]).add((rrjp_3)rrjA_2.id_break[id_byte[2]]);
      ((LinkedList)this.id_class[id_byte[3]]).add((rrjp_3)rrjA_2.id_break[id_byte[4]]);
   }

   static {
      ntfClinit();
   }

   public rrjn_3 id_class(rrjp_3 var1, int var2) {
      ((LinkedList)this.id_class[id_byte[6]]).add(var2, var1);
      return this;
   }

   public void id_class() {
      if (rrjA_2.id_protected() == null) {
         if ((File)this.id_class[id_byte[14]] != null && (Integer)this.id_class[id_byte[15]] != null) {
            new rrjA_2(
               (LinkedList<rrjp_3>)this.id_class[id_byte[16]],
               (File)this.id_class[id_byte[17]],
               (Integer)this.id_class[id_byte[18]],
               (BooleanSupplier)this.id_class[id_byte[19]],
               (Supplier<JsonObject>)this.id_class[id_byte[20]],
               (Consumer<ViaProviders>)this.id_class[id_byte[21]],
               (Consumer<ViaManagerBuilder>)this.id_class[id_byte[22]],
               (Consumer<rrjy_3>)this.id_class[id_byte[23]]
            );
         }
      }
   }

   public rrjn_3 id_class(Consumer<ViaProviders> var1) {
      this.id_class[id_byte[11]] = var1;
      return this;
   }

   public rrjn_3 id_class(Supplier<JsonObject> var1) {
      this.id_class[id_byte[10]] = var1;
      return this;
   }

   public rrjn_3 id_class(BooleanSupplier var1) {
      this.id_class[id_byte[9]] = var1;
      return this;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8562656184232843067L;
   }

   public rrjn_3 id_class(rrjp_3 var1) {
      ((LinkedList)this.id_class[id_byte[5]]).add(var1);
      return this;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{111, 103, -36, 89, -71, -39, -86, -26}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrjn_3 id_class(File var1) {
      this.id_class[id_byte[7]] = var1;
      return this;
   }

   public rrjn_3 id_class(int var1) {
      Integer var6 = var1;
      this.id_class[id_byte[8]] = var6;
      return this;
   }

   public static rrjn_3 id_break() {
      return new rrjn_3();
   }

   public rrjn_3 id_break(Consumer<ViaManagerBuilder> var1) {
      this.id_class[id_byte[12]] = var1;
      return this;
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1986053416;
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[id_break[0]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_protected() {
      id_break = new byte[]{8};
   }
}
