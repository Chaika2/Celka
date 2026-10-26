package celestial;

import io.netty.channel.ChannelHandlerContext;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTY {
   private static short[] id_break;
   private static long[] id_byte;
   private static byte[] id_protected;
   public Object[] id_class;

   public String id_byte() {
      return (String)this.id_class[id_break[3]];
   }

   public rrTY(ChannelHandlerContext var1) {
      this.id_catch();
      rrtb_3 var6 = (rrtb_3)rrtb_3.staticFields37d12a728fd138a98f39979b8f11d1be[id_break[4]];
      this.id_class[id_break[5]] = var6;
      this.id_class[id_break[6]] = var1;
   }

   static {
      ntfClinit();
   }

   public rrtb_3 id_class() {
      return (rrtb_3)this.id_class[id_break[1]];
   }

   public void id_class(String var1) {
      this.id_class[id_break[9]] = var1;
   }

   public void id_class(rrtb_3 var1) {
      this.id_class[id_break[7]] = var1;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2022952189;
   }

   public void id_class(long var1) {
      Long var7 = var1;
      this.id_class[id_break[8]] = var7;
   }

   private static long id_break(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6575695543126808997L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{71, 72, -26, 120, 72, 71, 57, 30}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public long id_break() {
      return (Long)this.id_class[id_break[2]];
   }

   private static void id_throws() {
      id_byte = new long[1];
   }

   private void id_catch() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[0]];
         Object[] var1 = this.id_class;
         var1[id_protected[1]] = id_byte[0];
      }
   }

   private static void id_case() {
      id_protected = new byte[]{4, 2};
   }

   public ChannelHandlerContext id_protected() {
      return (ChannelHandlerContext)this.id_class[id_break[0]];
   }

   private static void id_private() {
      id_break = new short[]{0, 1, 2, 3, 0, 1, 0, 1, 2, 3};
   }
}
