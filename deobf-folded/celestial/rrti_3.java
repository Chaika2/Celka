package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrti_3 {
   private static byte[] id_break;
   private static short[] id_byte;
   public Object[] id_class;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         Object[] var1 = this.id_class;
      }
   }

   public rrti_3() {
      this.id_byte();
      rrta_3 var5 = (rrta_3)rrta_3.staticFields0b9ba99d5751335787deb45ab94d73c6[id_byte[0]];
      this.id_class[id_byte[1]] = var5;
      ArrayList var6 = new ArrayList();
      this.id_class[3] = var6;
   }

   static {
      ntfClinit();
   }

   public rrti_3 id_class(Pattern var1) {
      this.id_class[1] = var1;
      return this;
   }

   public rrti_3 id_class(rrta_3 var1) {
      this.id_class[id_byte[5]] = var1;
      return this;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8473863149215780958L;
   }

   public rrte_3 id_class() {
      return new rrte_3(this);
   }

   public rrti_3 id_class(rrwr_3... var1) {
      ((List)this.id_class[3]).addAll(List.of(var1));
      return this;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-90, 101, 75, -45, 11, 73, 55, -50}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1488094577;
   }

   private static void id_break() {
      id_break = new byte[]{4};
   }

   public rrti_3 id_break(String var1) {
      this.id_class[2] = var1;
      return this;
   }

   private static void id_protected() {
      id_byte = new short[]{0, 0, 3, 3, 1, 0, 2};
   }
}
