package celestial;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvz_1 {
   private static byte[] id_break;
   private static short[] id_byte;
   public Object[] id_class;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{54, -53, -28, 95, -65, 115, -62, 105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String id_byte() {
      return (String)this.id_class[1];
   }

   public rrvz_1() {
      this.id_catch();
      ArrayList var5 = new ArrayList();
      this.id_class[5] = var5;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8372024027130035135L;
   }

   public void id_class(rrvN var1) {
      this.id_class[4] = var1;
   }

   public rrvz_1 id_class(Color var1) {
      this.id_class[3] = var1;
      return this;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1571304625;
   }

   public void id_class(List<rrvQ> var1) {
      this.id_class[5] = var1;
   }

   public rrvz_1 id_class(String var1, String var2, boolean var3) {
      ((List)this.id_class[5]).add(new rrvQ(var1, var2, var3));
      return this;
   }

   public Color id_class() {
      return (Color)this.id_class[3];
   }

   public rrvz_1 id_class(String var1) {
      this.id_class[2] = var1;
      return this;
   }

   public List<rrvQ> id_break() {
      return (List<rrvQ>)this.id_class[5];
   }

   public rrvz_1 id_break(String var1) {
      this.id_class[1] = var1;
      return this;
   }

   public String id_throws() {
      return (String)this.id_class[2];
   }

   public rrvz_1 id_throws(String var1) {
      this.id_class[0] = var1;
      return this;
   }

   private void id_catch() {
      if (this.id_class == null) {
         this.id_class = new Object[6];
         Object[] var1 = this.id_class;
      }
   }

   public String id_case() {
      return (String)this.id_class[0];
   }

   private static void id_implements() {
      id_break = new byte[]{6};
   }

   public rrvz_1 id_protected(String var1) {
      rrvN var6 = new rrvN(var1);
      this.id_class[4] = var6;
      return this;
   }

   public rrvN id_protected() {
      return (rrvN)this.id_class[4];
   }

   private static void id_private() {
      id_byte = new short[]{5, 4, 5, 0, 1, 2, 3, 4, 5, 5, 0, 1, 2, 3, 4};
   }
}
