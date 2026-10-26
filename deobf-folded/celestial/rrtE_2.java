package celestial;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtE_2 implements rrTi_1 {
   private static boolean[] id_break;
   private static short[] id_byte;
   public Object[] id_class;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   public rrtE_2() {
      this.id_byte();
   }

   public rrtE_2(String var1) {
      this.id_byte();
      this.id_class[id_byte[0]] = var1;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1245007638;
   }

   @Override
   public void id_class(ByteBuf var1) throws IOException {
      ruu_3 var2 = new ruu_3(var1);
      var2.id_class((String)this.id_class[id_byte[1]]);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{41, -127, 107, -14, -72, 125, -62, -3}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6932505172077912646L;
   }

   public String id_class() {
      return (String)this.id_class[id_byte[3]];
   }

   @Override
   public void id_class(rrtr_3 var1, ChannelHandlerContext var2) {
   }

   @Override
   public void id_break(ByteBuf var1) throws IOException {
      ruu_3 var2 = new ruu_3(var1);
      String var7 = var2.id_native();
      this.id_class[id_byte[2]] = var7;
   }

   private static void id_break() {
      id_byte = new short[4];
   }

   private static void id_protected() {
      id_break = new boolean[]{true};
   }
}
