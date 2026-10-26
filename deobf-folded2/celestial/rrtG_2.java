package celestial;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtG_2 implements rrTi_1 {
   private static short[] id_break;
   public Object[] id_class;
   private static byte[] id_byte;

   private static void id_byte() {
      id_byte = new byte[]{2};
   }

   public rrtG_2() {
      this.id_protected();
   }

   public rrtG_2(String var1, rrtb_3 var2) {
      this.id_protected();
      this.id_class[0] = var1;
      this.id_class[1] = var2;
   }

   static {
      ntfClinit();
   }

   public rrtb_3 id_class() {
      return (rrtb_3)this.id_class[1];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1101899049325358614L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-12, 78, -101, -66, -52, 84, 66, 47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -915668583;
   }

   @Override
   public void id_class(ByteBuf var1) throws IOException {
      ruu_3 var2 = new ruu_3(var1);
      var2.id_class((String)this.id_class[0]);
      var2.id_class((rrtb_3)this.id_class[1]);
   }

   @Override
   public void id_class(rrtr_3 var1, ChannelHandlerContext var2) {
   }

   @Override
   public void id_break(ByteBuf var1) throws IOException {
      ruu_3 var2 = new ruu_3(var1);
      String var7 = var2.id_native();
      this.id_class[0] = var7;
      rrtb_3 var8 = var2.id_class(rrtb_3.class);
      this.id_class[1] = var8;
   }

   public String id_break() {
      return (String)this.id_class[0];
   }

   private static void id_throws() {
      id_break = new short[]{0, 1, 0, 1, 0, 1, 0, 1};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }
}
