package celestial;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtM_2 implements rrTi_1 {
   private static boolean[] id_break;
   public Object[] id_class;
   private static short[] id_byte;
   private static byte[] id_protected;

   public int id_byte() {
      return (Integer)this.id_class[id_byte[15]];
   }

   public rrtM_2() {
      this.id_private();
   }

   public rrtM_2(rdn_3 var1, String var2, String var3, int var4) {
      this.id_private();
      this.id_class[id_byte[0]] = var1;
      this.id_class[id_byte[1]] = var3;
      this.id_class[id_byte[2]] = var2;
      Integer var12 = var4;
      this.id_class[id_byte[3]] = var12;
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(rrtr_3 var1, ChannelHandlerContext var2) {
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{44, -97, 55, 108, -88, 28, -12, -36}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_class(ByteBuf var1) throws IOException {
      ruu_3 var2 = new ruu_3(var1);
      var2.id_class((rdn_3)this.id_class[id_byte[4]]);
      var2.id_class((String)this.id_class[id_byte[5]]);
      var2.id_class((String)this.id_class[id_byte[6]]);
      var2.writeInt((Integer)this.id_class[id_byte[7]]);
   }

   public String id_class() {
      return (String)this.id_class[id_byte[13]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 841965896;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7264902911505791819L;
   }

   @Override
   public void id_break(ByteBuf var1) throws IOException {
      ruu_3 var2 = new ruu_3(var1);
      rdn_3 var7 = var2.id_extends();
      this.id_class[id_byte[8]] = var7;
      String var8 = var2.id_native();
      this.id_class[id_byte[9]] = var8;
      String var9 = var2.id_native();
      this.id_class[id_byte[10]] = var9;
      Integer var10 = var2.readInt();
      this.id_class[id_byte[11]] = var10;
   }

   public rdn_3 id_break() {
      return (rdn_3)this.id_class[id_byte[12]];
   }

   private static void id_throws() {
      id_protected = new byte[]{4, 3};
   }

   private static void id_catch() {
      id_break = new boolean[1];
   }

   private static void id_case() {
      id_byte = new short[]{0, 2, 1, 3, 0, 2, 1, 3, 0, 2, 1, 3, 0, 1, 2, 3};
   }

   public String id_protected() {
      return (String)this.id_class[id_byte[14]];
   }

   private void id_private() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[0]];
         Object[] var1 = this.id_class;
         var1[id_protected[1]] = Integer.valueOf(id_break[0]);
      }
   }
}
