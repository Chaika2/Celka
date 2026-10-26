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
   private static String[] break_;
   private static boolean[] byte_;
   private static short[] protected_;
   public Object[] class_;
   private static int[] throws_;

   private static void byte_() {
      throws_ = new int[]{65536};
   }

   public rrTe_1(rrTU var1) {
      this.break_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1620567285;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5397594460012671745L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-101, 53, 121, 20, 82, -10, -83, -97}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      break_ = new String[]{new String("/websocket")};
   }

   public void class_(SocketChannel var1) {
      ChannelPipeline var2 = var1.pipeline();
      var2.addLast(new ChannelHandler[]{new HttpServerCodec()});
      var2.addLast(new ChannelHandler[]{new HttpObjectAggregator(65536)});
      var2.addLast(new ChannelHandler[]{new WebSocketServerProtocolHandler("/websocket")});
      var2.addLast(new ChannelHandler[]{new rrTa_1(this)});
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void throws_() {
      byte_ = new boolean[]{true, false, true, false, true, false, true, false, true};
   }

   private static void protected_() {
      protected_ = new short[1];
   }
}
