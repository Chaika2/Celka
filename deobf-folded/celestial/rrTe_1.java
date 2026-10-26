package celestial;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTe_1 extends ChannelInitializer<SocketChannel> {
   private static String[] id_break;
   private static boolean[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;
   private static int[] id_throws;

   private static void id_byte() {
      id_throws = new int[]{65536};
   }

   public rrTe_1(rrTU var1) {
      this.id_break();
      this.id_class[id_protected[0]] = var1;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1620567285;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5397594460012671745L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-101, 53, 121, 20, 82, -10, -83, -97}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_break = new String[]{new String("/websocket")};
   }

   public void id_class(SocketChannel var1) {
      ChannelPipeline var2 = var1.pipeline();
      ChannelHandler[] var10001 = new ChannelHandler[1];
      var10001[id_byte[1]] = new HttpServerCodec();
      var2.addLast(var10001);
      var10001 = new ChannelHandler[1];
      var10001[id_byte[3]] = new HttpObjectAggregator(65536);
      var2.addLast(var10001);
      var10001 = new ChannelHandler[1];
      var10001[id_byte[5]] = new WebSocketServerProtocolHandler(id_break[0]);
      var2.addLast(var10001);
      var10001 = new ChannelHandler[1];
      var10001[id_byte[7]] = new rrTa_1(this);
      var2.addLast(var10001);
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_throws() {
      id_byte = new boolean[]{true, false, true, false, true, false, true, false, true};
   }

   private static void id_protected() {
      id_protected = new short[1];
   }
}
