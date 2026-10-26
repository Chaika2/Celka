package celestial;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import java.nio.charset.StandardCharsets;
import java.util.Queue;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTD extends SimpleChannelInboundHandler<BinaryWebSocketFrame> {
   private static short[] id_break;
   public Object[] id_class;
   private static boolean[] id_byte;

   private static void id_byte() {
      id_byte = new boolean[]{true, true, true};
   }

   public rrTD(rrTK var1) {
      this.id_class();
      this.id_class[id_break[0]] = var1;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1296973875;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6909958134031585047L;
   }

   private void id_class() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[2]];
         Object[] var1 = this.id_class;
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-66, 126, 81, -29, -76, -31, -5, -104}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(ChannelHandlerContext var1, BinaryWebSocketFrame var2) throws Exception {
      rrtB_2 var3 = ((rrTo_1)((rrTK)this.id_class[id_break[15]]).id_class[id_break[16]]).id_case();
      var3.id_class((rrTo_1)((rrTK)this.id_class[id_break[17]]).id_class[id_break[18]], var2, var1, id_byte[1]);
   }

   private static void id_break() {
      id_break = new short[]{0, 0, 1, 2, 0, 1, 6, 0, 1, 2, 0, 1, 2, 0, 1, 0, 1, 0, 1};
   }

   public void channelReadComplete(ChannelHandlerContext var1) throws Exception {
      super.channelReadComplete(var1);

      while (!((Queue)((rrTo_1)((rrTK)this.id_class[id_break[7]]).id_class[id_break[8]]).id_class[id_break[9]]).isEmpty()) {
         rrTi_1 var2 = (rrTi_1)((Queue)((rrTo_1)((rrTK)this.id_class[id_break[10]]).id_class[id_break[11]]).id_class[id_break[12]]).poll();
         ((rrTo_1)((rrTK)this.id_class[id_break[13]]).id_class[id_break[14]]).id_class(var2, var1.channel(), id_byte[0]);
      }
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
      var2.printStackTrace();
      var1.close();
   }

   public void channelActive(ChannelHandlerContext var1) throws Exception {
      super.channelActive(var1);
      ((Queue)((rrTo_1)((rrTK)this.id_class[id_break[1]]).id_class[id_break[2]]).id_class[id_break[3]])
         .add(new rrtE_2((String)((rrTo_1)((rrTK)this.id_class[id_break[4]]).id_class[id_break[5]]).id_class[id_break[6]]));
   }
}
