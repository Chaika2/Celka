package celestial;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.DefaultHttpHeaders;
import io.netty.handler.codec.http.HttpClientCodec;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.websocketx.WebSocketClientHandshakerFactory;
import io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler;
import io.netty.handler.codec.http.websocketx.WebSocketVersion;
import io.netty.handler.codec.http.websocketx.extensions.compression.WebSocketClientCompressionHandler;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTK extends ChannelInitializer<SocketChannel> {
   public Object[] id_class;
   private static short[] id_break;
   private static boolean[] id_byte;
   private static int[] id_protected;
   private static byte[] id_throws;

   private static void id_byte() {
      id_throws = new byte[]{2};
   }

   public rrTK(rrTo_1 var1, int var2) {
      this.id_throws();
      this.id_class[id_break[0]] = var1;
      Integer var8 = var2;
      this.id_class[id_break[1]] = var8;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7385715914954103539L;
   }

   public void id_class(SocketChannel var1) {
      ChannelPipeline var2 = var1.pipeline();
      ChannelHandler[] var10001 = new ChannelHandler[id_byte[0]];
      var10001[id_byte[1]] = new HttpClientCodec();
      var2.addLast(var10001);
      var10001 = new ChannelHandler[id_byte[2]];
      var10001[id_byte[3]] = new HttpObjectAggregator(id_protected[0]);
      var2.addLast(var10001);
      var10001 = new ChannelHandler[id_byte[4]];
      var10001[id_byte[5]] = WebSocketClientCompressionHandler.INSTANCE;
      var2.addLast(var10001);
      var10001 = new ChannelHandler[id_byte[6]];
      var10001[id_byte[7]] = new WebSocketClientProtocolHandler(
         WebSocketClientHandshakerFactory.newHandshaker(
            URI.create("ws://" + (String)((rrTo_1)this.id_class[id_break[2]]).id_class[id_break[3]] + ":" + (Integer)this.id_class[id_break[4]] + "/websocket"),
            WebSocketVersion.V13,
            null,
            id_byte[8],
            new DefaultHttpHeaders()
         )
      );
      var2.addLast(var10001);
      var10001 = new ChannelHandler[id_byte[9]];
      var10001[id_byte[10]] = new rrTD(this);
      var2.addLast(var10001);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -396461479;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{41, 24, -119, -40, 50, -121, -26, 2}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_break = new short[]{1, 0, 1, 1, 0};
   }

   private static void id_break() {
      id_protected = new int[]{65536};
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[id_throws[0]];
         Object[] var1 = this.id_class;
         var1[id_byte[11]] = Integer.valueOf(id_byte[12]);
      }
   }

   private static void id_protected() {
      id_byte = new boolean[]{true, false, true, false, true, false, true, false, true, true, false, false, false};
   }
}
