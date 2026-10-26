package celestial;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtS_2 implements rrTi_1 {
   private static short[] id_break;
   public Object[] id_class;
   private static boolean[] id_byte;
   private static byte[] id_protected;

   public rdn_3 id_byte() {
      return (rdn_3)this.id_class[id_break[15]];
   }

   public rrtS_2(rdn_3 var1, String var2, int var3, String var4, rrts_3 var5) {
      this.id_implements();
      this.id_class[id_break[0]] = var1;
      this.id_class[id_break[1]] = var2;
      Integer var12 = var3;
      this.id_class[id_break[2]] = var12;
      this.id_class[id_break[3]] = var4;
      this.id_class[id_break[4]] = var5;
   }

   public rrtS_2() {
      this.id_implements();
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(rrtr_3 var1, ChannelHandlerContext var2) {
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{17, -41, 56, 31, -37, -101, 110, 19}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String id_class() {
      return (String)this.id_class[id_break[16]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7219585156719842765L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2107622072;
   }

   @Override
   public void id_class(ByteBuf var1) throws IOException {
      ruu_3 var2 = new ruu_3(var1);
      var2.id_class((rdn_3)this.id_class[id_break[5]]);
      var2.id_class((String)this.id_class[id_break[6]]);
      var2.writeInt((Integer)this.id_class[id_break[7]]);
      var2.id_class((String)this.id_class[id_break[8]]);
      var2.id_class((rrts_3)this.id_class[id_break[9]]);
   }

   @Override
   public void id_break(ByteBuf var1) throws IOException {
      ruu_3 var2 = new ruu_3(var1);
      rdn_3 var7 = var2.id_extends();
      this.id_class[id_break[10]] = var7;
      String var8 = var2.id_native();
      this.id_class[id_break[11]] = var8;
      Integer var9 = var2.readInt();
      this.id_class[id_break[12]] = var9;
      String var10 = var2.id_native();
      this.id_class[id_break[13]] = var10;
      rrts_3 var11 = var2.id_class(rrts_3.class);
      this.id_class[id_break[14]] = var11;
   }

   public String id_break() {
      return (String)this.id_class[id_break[17]];
   }

   public rrts_3 id_throws() {
      return (rrts_3)this.id_class[id_break[19]];
   }

   private static void id_catch() {
      id_protected = new byte[]{5, 3};
   }

   private static void id_case() {
      id_break = new short[]{0, 1, 3, 2, 4, 0, 1, 3, 2, 4, 0, 1, 3, 2, 4, 0, 1, 2, 3, 4};
   }

   private void id_implements() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[0]];
         Object[] var1 = this.id_class;
         var1[id_protected[1]] = Integer.valueOf(id_byte[0]);
      }
   }

   public int id_protected() {
      return (Integer)this.id_class[id_break[18]];
   }

   private static void id_private() {
      id_byte = new boolean[1];
   }
}
